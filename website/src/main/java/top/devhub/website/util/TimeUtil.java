package top.devhub.website.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Adam.Zhang on 2017/7/10.
 */
public class TimeUtil {
    public static String formatDate(Date date) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
        return format.format(date);
    }
}
