package com.an.service;

import com.an.pojo.Goods;

import java.util.List;

public interface ShopService {

    // 查询所有商品
    List<Goods> queryAll();

    // 根据名称模糊搜索
    List<Goods> queryByName(String name);

    // 添加商品
    int addGoods(Goods goods);

    // 根据ID删除商品
    int delGoods(int id);

    // 购买商品
    int shopping(int id);

    // 测试使用
    String hello(String name);
}

