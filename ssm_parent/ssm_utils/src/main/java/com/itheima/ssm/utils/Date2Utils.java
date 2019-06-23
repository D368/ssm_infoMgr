package com.itheima.ssm.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Date2Utils {

    public static String Date2String(Date date, String patt){
        SimpleDateFormat sdf = new SimpleDateFormat(patt);
        String dateTime = sdf.format(date);
        return dateTime;
    }

    public static Date String2Date(String date,String patt) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat(patt);
        Date parse = sdf.parse(date);
        return parse;
    }
}
