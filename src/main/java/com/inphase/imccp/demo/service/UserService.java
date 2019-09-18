package com.inphase.imccp.demo.service;

import com.baomidou.mybatisplus.service.IService;
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
public interface UserService  extends IService<TbUser> {

    /**
     * 查询用户列表
     * @return  用户集合
     */
    List<TbUser> selectUserList();
}
