package java8.dateTime;

import java.time.*;
import java.util.Date;

/**
 * @author weiyupeng
 * @create 2021/12/8 22:15
 */
public class DateTime {
    /**
     * 本地化日期时间
     */
    public static void testLocalDateTime() {
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        LocalDate localDate = now.toLocalDate();
        System.out.println(localDate);

        Month month = now.getMonth();
        int day = now.getDayOfMonth();
        System.out.println(month + "-" + day);

        LocalDateTime localDateTime = now.withDayOfMonth(10).withYear(2021);
        System.out.println(localDateTime);

        LocalDate localDate1 = LocalDate.of(2021, Month.DECEMBER, 8);
        System.out.println(localDate1);

        LocalTime localTime = LocalTime.of(22, 36);
        System.out.println(localTime);

        LocalTime localTime1 = LocalTime.parse("22:37:25");
        System.out.println(localTime1);
    }

    /**
     * 时区时期时间
     */
    public static void testZoneDateTime() {
        ZonedDateTime zonedDateTime = ZonedDateTime.parse("2021-12-08T22:45:30+05:30[Asia/Shanghai]");
        System.out.println(zonedDateTime);
        System.out.println(zonedDateTime.getZone());

        ZoneId zoneId = ZoneId.of("Asia/Shanghai");
        ZoneId zoneId1 = ZoneId.systemDefault();
        System.out.println(zoneId);
        System.out.println(zoneId1.getRules());
    }

    public static void main(String[] args) {
        testLocalDateTime();
        testZoneDateTime();
    }
}
