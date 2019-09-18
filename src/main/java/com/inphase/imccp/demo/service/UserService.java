package com.inphase.imccp.demo.service;

import com.inphase.imccp.demo.entity.TbUser;

import java.util.List;

/**
 * 　　* @description: TODO
 * 　　* @param
 * 　　* @return
 * 　　* @throws
 * 　　* @author Administrator
 * 　　* @date $ $
 *
 */
public interface UserService {

    /**
     * 查询用户列表
     * @return  用户集合
     */
    List<TbUser> selectUserList();
}
