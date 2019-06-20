package com.adorgroup.babycar.mqtt.util;

import org.apache.commons.lang.time.DateFormatUtils;
import org.apache.commons.lang.time.DurationFormatUtils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @ClassName DateUtils
 * @Description 时间类
 * @Author 熊俊堡
 * @Date 2018/11/23 0023 下午 6:48
 **/
public class DateUtils {
    private final static Logger log = LoggerFactory.getLogger(DateUtils.class);

    private final static String PATTERN_YMD = "yyyy-MM-dd";
    private final static long DAY_MILLISECOND = 86400000;
    private final static long HOUR_MILLISECOND = 3600000;
    private final static long MINUTE_MILLISECOND = 60000;

    /**
     * 判断时间是否在时间段内  时间戳
     * @param startTime 开始时间
     * @param endTime 结束时间
     * @param millis 当前时间
     * @return
     */
    public static boolean timeComparison(Long startTime, Long endTime, long millis) {
        if (startTime == null || endTime == null) {
            return true;
        }
        if (millis>= startTime && millis<=endTime) {
            return false;
        }
        return true;
    }

    /**
     * 时间偏移 日
     * @param date
     * @param term
     * @return
     */
    public static String timeOffset(Date date, int term) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.DATE, term);
        return DateFormatUtils.format(cal.getTime(), PATTERN_YMD);
    }



    /**
     * 时间比较大小
     * true 结束时间大于开始时间
     * false 结束时间小于开始时间
     * @return
     */
    public static boolean compareTo(String startTime, String endTime) {
        SimpleDateFormat sdf=new SimpleDateFormat(PATTERN_YMD);
        try {
            Date start = sdf.parse(startTime);
            Date end = sdf.parse(endTime);
            long l = end.getTime() - start.getTime();
            if(l > 0) {
                return true;
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return false;
    }


    /**
     * 格式化时间 天 小时 分钟
     * @param startTime
     * @param endTime
     * @return
     */
    public static String dateDiff(Date startTime, Date endTime){
        long diff = endTime.getTime() - startTime.getTime();
        long day = diff / DAY_MILLISECOND;
        long hour = diff % DAY_MILLISECOND / HOUR_MILLISECOND;
        long min = diff % DAY_MILLISECOND % HOUR_MILLISECOND / MINUTE_MILLISECOND;

        StringBuilder builder = new StringBuilder();
        if (day != 0) {
            builder.append(day);
            builder.append("天");
        }
        if (hour != 0) {
            builder.append(hour);
            builder.append("小时");
        }
        if (min != 0) {
            builder.append(min);
            builder.append("分钟");
        }
        return builder.toString();
    }

    /**
     * 时间相差几分钟
     * @param startTime
     * @param endTime
     * @return
     */
    public static long timeDifferenceMin(Date startTime, Date endTime) {
        long difference = endTime.getTime() - startTime.getTime();
        return (long) Math.ceil(difference / 60000.0);
    }

    /**
     * 设定时间 加上小时数
     * @param date
     * @param hour
     * @return
     */
    public static Date addDateMinut(Date date, Integer hour) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.HOUR, hour);
        return cal.getTime();
    }

    public static void main(String[] args){
        try {
            long min = timeDifferenceMin(new Date(System.currentTimeMillis() - 120000), new Date());
            System.out.println(min);
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date minut = addDateMinut(new Date(), 16);
            System.out.println("after:" + format.format(minut));  //显示更新后的日期
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
