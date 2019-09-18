package com.inphase.imccp.demo.service.impl;

import com.inphase.imccp.demo.entity.TbUser;
import com.inphase.imccp.demo.mapper.UserMapper;
import com.inphase.imccp.demo.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Description 用户服务
 * @Author luojq <luojiaqiang@live.com>
 * @Version V1.0.0
 * @Since 1.0
 * @Date 2019/9/18 0018
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    UserMapper userMapper;

    /**
     * @return
     */
    @Override
    public List<TbUser> selectUserList() {
        return userMapper.selectUserList();
    }
}
