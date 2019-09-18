package com.inphase.imccp.demo.mapper;

import com.inphase.imccp.demo.entity.TbUser;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Description
 * @Author luojq <luojiaqiang@live.com>
 * @Version V1.0.0
 * @Since 1.0
 * @Date 2019/9/18 0018
 */
@Repository
public interface UserMapper  {
    List<TbUser> selectUserList() ;
}
