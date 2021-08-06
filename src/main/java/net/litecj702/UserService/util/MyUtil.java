package net.litecj702.UserService.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MyUtil {
    public String now() {
//        Date date = new Date();
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
//        String s = simpleDateFormat.format(date);
//        return s;
        return new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date());
    }

}