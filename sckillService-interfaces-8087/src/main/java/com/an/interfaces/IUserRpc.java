package com.an.interfaces;

import com.an.common.error.BusinessException;
import com.an.common.response.CommonReturnType;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

public interface IUserRpc {
    public CommonReturnType register(String telphone,String otpCode,String name,Integer gender,
                                     Integer age,String password) throws BusinessException, UnsupportedEncodingException, NoSuchAlgorithmException;

    public CommonReturnType getOtp(String telphone);

    public CommonReturnType getUser(Integer id) throws BusinessException;

    public CommonReturnType login(String telphone,String password) throws BusinessException, UnsupportedEncodingException, NoSuchAlgorithmException;
}
