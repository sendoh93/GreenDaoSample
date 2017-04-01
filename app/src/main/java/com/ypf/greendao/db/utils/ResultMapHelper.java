package com.ypf.greendao.db.utils;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

/**
 * ResultMap映射类
 * Created by pingfan.yang on 2016/11/7.
 */
public final class ResultMapHelper {

    /**
     * 获取ResultMap
     *
     * @param target 获取类的Class
     */
    public static Map<String, String> getResultMap(Class<? extends Serializable> target) {
        Map<String, String> resultMap = new HashMap<>();
        Field[] fields = target.getDeclaredFields();
        for (Field field : fields) {
            Annotation annotation = field.getAnnotation(Alias.class);
            if (annotation != null) {
                Alias alias = (Alias) annotation;
                resultMap.put(alias.column(), field.getName());
            }
        }
        return resultMap;
    }
}
