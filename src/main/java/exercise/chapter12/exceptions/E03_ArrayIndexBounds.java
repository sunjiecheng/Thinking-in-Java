package exercise.chapter12.exceptions;

/**
 * @author jiecheng
 * @create 2019-09-21 上午10:54
 */
public class E03_ArrayIndexBounds {
    public static void main(String[] args) {
        try {
            int[] a = new int[1];
            System.out.println(a[2]);
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }

    }
}
