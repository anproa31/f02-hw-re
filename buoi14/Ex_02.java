package buoi14;

public class Ex_02 {
    public static <T> void swap(T[] array, int i, int j) {
        if (i < 0 || i >= array.length || j < 0 || j >= array.length) {
            throw new IndexOutOfBoundsException("Invalid indices for array swap");
        }
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}