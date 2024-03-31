package com.an.service;

import com.an.common.error.BusinessException;
import com.an.dto.Result;
import com.an.entity.Follow;
import com.baomidou.mybatisplus.extension.service.IService;


/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 虎哥
 * @since 2021-12-22
 */
public interface IFollowService extends IService<Follow> {

    Result follow(Long followUserId, Boolean isFollow) throws BusinessException;

    Result isFollow(Long followUserId) throws BusinessException;

    Result followCommons(Long id) throws BusinessException;
}
