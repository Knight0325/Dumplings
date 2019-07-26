package com.zhiyou100.dumplings.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * ClassName: DateUtil
 * Description:
 * date: 2019/6/28 0028 下午 16:08
 *
 * @author stt
 * @since JDK 1.8
 */
public class DateUtil {

    private static SimpleDateFormat format = new SimpleDateFormat("/yyyy/MM/dd");

    /**
     * 返回当前日期
     * 年/月/日
     * @return
     */
    public static String getDate(){
        //获取当前时间
        Date date = new Date();
        //格式化
        return format.format(date);
    }











}
