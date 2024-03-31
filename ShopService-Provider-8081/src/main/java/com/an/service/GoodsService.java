package com.an.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.an.pojo.Goods;

public interface GoodsService extends IService<Goods> {

    int shopping(int id);

}
