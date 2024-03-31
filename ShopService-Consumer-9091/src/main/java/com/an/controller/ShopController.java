package com.an.controller;

import com.an.pojo.Goods;
import com.an.service.ShopService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ShopController {

    @DubboReference
    private ShopService shopService;

    @GetMapping("/queryAll")
    public List<Goods> queryAllGoods() {
        return shopService.queryAll();
    }

    @GetMapping("/queryByName")
    public List<Goods> queryByName(String name) {
        return shopService.queryByName(name);
    }

    @GetMapping("/hi")
    public String hello(String name) {
        return shopService.hello(name);
    }
}
