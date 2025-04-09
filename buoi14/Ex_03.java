package buoi14;

import java.util.List;

public class Ex_03 {
    public static <T> int countOccurrences(List<T> list, T element) {
        int count = 0;
        for (T item : list) {
            if (item == null ? element == null : item.equals(element)) {
                count++;
            }
        }
        return count;
    }
}