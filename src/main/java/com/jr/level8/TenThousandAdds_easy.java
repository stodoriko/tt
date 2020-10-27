package com.jr.level8;

/*
Требования:
•	Программа должна выводить числа на экран.
•	Метод main должен вызывать метод getInsertTimeInMs только два раза.
•	Метод insert10000(List list) должен вставлять 10 тысяч элементов в список.
•	Метод getInsertTimeInMs должен вызывать метод insert10000 только один раз.
•	Метод getInsertTimeInMs должен вернуть время в миллисекундах, которое занимает 10 тысяч вставок в список.
 */

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class TenThousandAdds_easy {
    public static void main(String[] args) {

        System.out.println(getInsertTimeInMs(new ArrayList()));
        System.out.println(getInsertTimeInMs(new LinkedList()));
    }

    public static long getInsertTimeInMs(List list) {
        Date startDate = new Date();

        insert10000(list);

        Date currentDate = new Date();

        long mls = currentDate.getTime() - startDate.getTime();

        return mls;

    }

    public static void insert10000(List list) {
        for (int i = 0; i < 10000; i++) {
            list.add(0, new Object());
        }
    }
}
