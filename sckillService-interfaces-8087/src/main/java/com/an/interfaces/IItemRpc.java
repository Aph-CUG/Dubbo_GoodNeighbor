package com.an.interfaces;

import com.an.common.error.BusinessException;
import com.an.common.response.CommonReturnType;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

public interface IItemRpc {
    public CommonReturnType createItem(String title,String description, BigDecimal price,Integer stock,String imgUrl) throws BusinessException;
    public CommonReturnType publishpromo(Integer id);
    public CommonReturnType getItem(Integer id);
    public CommonReturnType listItem();



}
