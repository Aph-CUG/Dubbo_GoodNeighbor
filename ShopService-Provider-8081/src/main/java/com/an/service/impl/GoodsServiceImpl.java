package com.an.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.an.mapper.GoodsMapper;
import com.an.pojo.Goods;
import com.an.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GoodsServiceImpl extends ServiceImpl<GoodsMapper, Goods> implements GoodsService {

    @Autowired
    private GoodsMapper goodsMapper;

    @Override
    public int shopping(int id) {
        return goodsMapper.shopping(id);
    }
}
