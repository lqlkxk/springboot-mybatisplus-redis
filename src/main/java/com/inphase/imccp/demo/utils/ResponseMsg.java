package com.inphase.imccp.demo.utils;

import lombok.Data;

/**
 * @Description 响应消息类
 * @Author luojq <luojiaqiang@live.com>
 * @Version V1.0.0
 * @Since 1.0
 * @Date 2019/9/18 0018
 */
@Data
public class ResponseMsg {
    private int code;
    private String msg;
    private Object data;

    public static ResponseMsg error(){
        ResponseMsg  res= new ResponseMsg();
        res.setCode(400);
        res.setMsg("请求错误");
        res.setData(null);
        return res;
    }

    public static ResponseMsg success(Object obj){
        ResponseMsg  res= new ResponseMsg();
        res.setCode(200);
        res.setMsg("请求成功");
        res.setData(obj);
        return res;
    }

}
