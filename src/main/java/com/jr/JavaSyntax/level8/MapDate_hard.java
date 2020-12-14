package com.jr.JavaSyntax.level8;

/*
        Требования:
        •	Программа не должна выводить текст на экран.
        •	Программа не должна считывать значения с клавиатуры.
        •	Метод createMap() должен создавать и возвращать словарь HashMap с типом элементов String, Date состоящий из 10 записей.
        •	Метод removeAllSummerPeople() должен удалять из словаря всех людей, родившихся летом.
 */

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class MapDate_hard {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
        map.put("Смирнов", dateFormat.parse("MAY 1 2011"));
        map.put("Иванов", dateFormat.parse("MAY 2 2010"));
        map.put("Сидоров", dateFormat.parse("MAY 3 2009"));
        map.put("Потапов", dateFormat.parse("MAY 4 2008"));
        map.put("Глушенков", dateFormat.parse("MAY 5 2007"));
        map.put("Глушаков", dateFormat.parse("MAY 6 2006"));
        map.put("Михеев", dateFormat.parse("MAY 7 2005"));
        map.put("Абрамов", dateFormat.parse("JULY 8 2004"));
        map.put("Манаенков", dateFormat.parse("MAY 9 2003"));
        map.put("Куликов", dateFormat.parse("JUNE 10 2002"));
        return map;
    }

    public static void removeAllSummerPeople(Map<String, Date> map) {
        // Запрашиваем у коллекции итератор
        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();

        // Проверяем, есть ли ещё объекты в последовательности
        while (iterator.hasNext()) {
            // Получаем следующий элемент последовательности вызовом метода next()
            Map.Entry<String, Date> entry = iterator.next();
            if (entry.getValue().toString().contains("Jun")||
                    entry.getValue().toString().contains("Jul") ||
                    entry.getValue().toString().contains("Aug")) {
                // Удаляем последний элемент из последовательности
                iterator.remove();
            }
        }
    }

    public static void main(String[] args) throws ParseException {
        removeAllSummerPeople(createMap());
    }
}
