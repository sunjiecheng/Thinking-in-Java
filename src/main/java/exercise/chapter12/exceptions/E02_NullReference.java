package exercise.chapter12.exceptions;

/**
 * @author jiecheng
 * @create 2019-09-21 上午10:49
 */
public class E02_NullReference {
    public static void main(String[] args) {
        try {
            E02_NullReference reference = null;
            System.out.println("调用一个null");
            reference.f();
        } catch (NullPointerException e) {
            System.out.println("caught NullPointerException from f");
            e.printStackTrace();
        }
    }
    void f() {

    }
}
