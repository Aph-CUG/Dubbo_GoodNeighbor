package com.an.interfaces;

import com.an.common.error.BusinessException;
import com.an.common.response.CommonReturnType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

public interface IOrderRpc {
    CommonReturnType generatetoken(Integer itemId,Integer promoId) throws BusinessException;


    CommonReturnType createOrder(Integer itemId,Integer amount,Integer promoId,String promoToken) throws BusinessException;


}
