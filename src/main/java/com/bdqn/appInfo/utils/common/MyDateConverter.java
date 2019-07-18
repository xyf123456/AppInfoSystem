package com.bdqn.appInfo.utils.common;

import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ClassName: MyDateConverter
 * @Description: 日期转换器
 * @Author: xyf
 * @Date 2019/7/17 13:09
 */
public class MyDateConverter implements Converter<String,Date> {
    @Nullable
    @Override
    public Date convert(String source) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            return sdf.parse(source);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }
}
