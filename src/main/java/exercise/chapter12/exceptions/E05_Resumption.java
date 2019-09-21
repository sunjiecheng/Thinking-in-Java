package exercise.chapter12.exceptions;

/**
 * @author jiecheng
 * @create 2019-09-21 上午11:02
 */
public class E05_Resumption {
    private static int[] ia = new int[2];
    static int x = 5;

    public static void main(String[] args) {
        while (true) {
            try {
                ia[x] = 1;
                System.out.println(ia[x]);
                break;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.err.println("Caught ArrayIndexOutOfBoundsException");
                e.printStackTrace();
                x--;
            } finally {
                System.out.println("Are we done yet?");
            }
        }
        System.out.println("Now, we're done.");
    }
}
