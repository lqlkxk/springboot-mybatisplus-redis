package com.inphase.imccp.demo.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.inphase.imccp.demo.entity.TbUser;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Description
 * @Author luojq <luojiaqiang@live.com>
 * @Version V1.0.0
 * @Since 1.0
 * @Date 2019/9/18 0018
 */
@Mapper
public interface UserMapper extends BaseMapper<TbUser> {
    List<TbUser> selectUserList() ;
}
