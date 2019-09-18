package com.inphase.imccp.demo.utils;

import net.sf.json.JSONObject;

/**
 * @Description
 * @Author luojq <luojiaqiang@live.com>
 * @Version V1.0.0
 * @Since 1.0
 * @Date 2019/9/18 0018
 */
public class JsonUtils {

    public static String toJsonString(Object obj){
       return  JSONObject.fromObject(obj).toString();
    }

    public static Object json2Object(String json, Class beanClz) {
        return JSONObject.toBean(JSONObject.fromObject(json), beanClz);
    }

    public static Object json2Object(JSONObject json, Class beanClz) {
        return JSONObject.toBean(json, beanClz);
    }
}
