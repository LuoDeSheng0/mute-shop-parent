package com.mute.utils;

import java.util.List;
import java.util.Map;

/**
 * @program: mute-shop-demo
 * @description:
 * @author: mute_luo
 * @create: 2019-09-23 16:36
 */
public class ListUtils {
    //判断list集合是否为空
    public List<?> emptyList(List<?> list) {
        if (list == null || list.size() <= 0) {
            return null;
        }
        return list;
    }
    //判断map集合是否为空
    public Map<?,?> emptyMap(Map<?,?> map) {
        if (map == null || map.size() <= 0) {
            return null;
        }
        return map;
    }

}
