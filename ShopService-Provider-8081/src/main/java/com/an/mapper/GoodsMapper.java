package com.an.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.an.pojo.Goods;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface GoodsMapper extends BaseMapper<Goods> {

    int shopping(@Param("id") int id);
}
