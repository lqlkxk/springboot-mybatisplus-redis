package com.inphase.imccp.demo.controller;

import com.inphase.imccp.demo.entity.TbUser;
import com.inphase.imccp.demo.service.UserService;
import com.inphase.imccp.demo.utils.JsonUtils;
import com.inphase.imccp.demo.utils.ResponseMsg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Description 用户controller层
 * @Author luojq <luojiaqiang@live.com>
 * @Version V1.0.0
 * @Since 1.0
 * @Date 2019/9/18 0018
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;
    @Autowired
    RedisTemplate<String, String> redisTemplate;

    @GetMapping("findUserList")
    public ResponseMsg findUserList() {
        return ResponseMsg.success(userService.selectUserList());
    }

    @GetMapping("findAll")
    public ResponseMsg findAll() {
        return ResponseMsg.success(userService.selectList(null));
    }

    @GetMapping("writeToRedis")
    public ResponseMsg writeToRedis() {
        List<TbUser> users = userService.selectUserList();
        for (TbUser user : users) {
            redisTemplate.opsForValue().set("user_" + user.getId() + "", JsonUtils.toJsonString(user));
        }
        return ResponseMsg.success(null);
    }


    @GetMapping("getUserFromRedis")
    public ResponseMsg getUserFromRedis(int userId) {
        String userStr = redisTemplate.opsForValue().get("user_" + userId);
        TbUser tbUser = (TbUser) JsonUtils.json2Object(userStr, TbUser.class);
        return ResponseMsg.success(tbUser);
    }
}
