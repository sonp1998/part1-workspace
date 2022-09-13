/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import java.time.*;

class ConcertTimeTest {

    public static void main(String[] args) {
        //listAvailableZoneIds();
        testLiveConcert();
    }

    /*
     * Shows all defined ZoneIds, which will help with the concert problem.
     * You'll need to know the names of the ZoneIds for Toronto and Perth.
     */
    public static void listAvailableZoneIds() {
        Set<String> rawZoneIds = ZoneId.getAvailableZoneIds();  // unsorted, arbitrary order
        SortedSet<String> zoneIds = new TreeSet<>(rawZoneIds);  // sorted by String natural order

        for (String zoneId : zoneIds) {
            System.out.println(zoneId);
        }
    }

    /**
     * OPTIONAL: your favorite band is playing live in Toronto, Canada on June 18, 2020, at 7pm.
     * You live in Perth, Australia, and want to watch a live simulcast via the web.
     * When are you watching it?
     *       America/Toronto        Australia/Perth
     * RESULT: 
     */
    public static void testLiveConcert() {
        Calendar calendar =Calendar.getInstance();
        Date date = calendar.getTime();
        DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy hh:mm ");
        dateFormat.setTimeZone(TimeZone.getTimeZone("America/Toronto"));
        System.out.println(dateFormat.format(date));
        dateFormat.setTimeZone(TimeZone.getTimeZone("Australia/Perth"));
        System.out.println(date);
    }
}