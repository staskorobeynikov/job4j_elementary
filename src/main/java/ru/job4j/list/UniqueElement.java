package ru.job4j.list;

import java.util.List;

public class UniqueElement {
    public static boolean checkList(List<String> list, String str) {
        if (!list.contains(str)) {
            return false;
        }
        int firstIndex = list.indexOf(str);
        int lastIndex = list.lastIndexOf(str);
        return firstIndex == lastIndex;
    }
}
