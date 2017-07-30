package data.structures.examples;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.TimeZone;

/**
 * @author ilariacorda on 29/07/2017.
 * @project Java-Code-Experiments
 * This program prints out the ZoneDateTime together with short time zone id
 */


public class TimeZoneExample1 {

    public static void main(String[] args) {


        ZoneId zoneTokyo = ZoneId.of("Asia/Tokyo");
        ZonedDateTime nowTokyo = ZonedDateTime.now(zoneTokyo);

        String timeZoneToStrTokyo = nowTokyo.toString();

        timeZoneToStrTokyo = TimeZone.getTimeZone(zoneTokyo).getDisplayName(false, TimeZone.SHORT);

        System.out.println("Tokyo " + nowTokyo + " " + timeZoneToStrTokyo);

    }

}
