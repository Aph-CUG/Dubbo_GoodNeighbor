package com.an.service.impl;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.an.pojo.Goods;
import com.an.service.GoodsService;
import com.an.service.ShopService;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@DubboService
@Service
public class ShopServiceImpl implements ShopService {

    @Autowired
    private GoodsService goodsService;

    @Value("${spring.application.name}")
    private String applicationName;

    @Override
    @SentinelResource(value = "queryAll", fallback = "tempMethod")   // @SentinelResource 注解用来标识资源是否被限流、降级。queryAll 表示资源名。
    public List<Goods> queryAll() {

        List<Goods> list = goodsService.list();
        if (list.size() == 0) {
            throw new RuntimeException();
        }
        int i = 1 / 0;
        return list;
    }

    public static List<Goods> tempMethod(Throwable  throwable) {
        ArrayList<Goods> list = new ArrayList<>();
        list.add(new Goods().setName("未知异常出现，请稍后使用").setPrice(-1.0).setNums(-1).setId(0));
        System.out.println("未知异常出现，请稍后使用，异常为：" + throwable.getMessage());
        return list;
    }

    @Override
    public List<Goods> queryByName(String name) {

        QueryWrapper<Goods> wrapper = new QueryWrapper<>();
        wrapper.like("name", name);

        return goodsService.list(wrapper); // eligible
    }

    @Override
    public int addGoods(Goods goods) {
        return goodsService.save(goods) ? 1 : 0;
    }

    @Override
    public int delGoods(int id) {
        return goodsService.removeById(id) ? 1 : 0;
    }

    @Override
    public int shopping(int id) {
        return goodsService.shopping(id);
    }

    @Override
    @SentinelResource(value = "hello", blockHandler = "limiting")
    public String hello(String name) {
        return "Hello: " + name + " From " + applicationName;
    }

    /**
     *实现限流功能，要配合sentinel-dashboard设置限流才能起作用
     * @param name  与原方法参数保持一直
     * @param blockException 必须带上该参数，否则不起作用
     * @return
     */
    public static String limiting(String name, BlockException blockException) {
        return name + " 被限制";
    }
}
