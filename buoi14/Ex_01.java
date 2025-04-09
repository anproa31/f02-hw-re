package buoi14;

import java.util.ArrayList;
import java.util.List;

public class Ex_01 {
    public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list) {
        ArrayList<E> result = new ArrayList<>();
        for (E item : list) {
            if (!result.contains(item)) {
                result.add(item);
            }
        }
        return result;
    }
}