package exercise.chapter12.exceptions;

/**
 * @author jiecheng
 * @create 2019-09-21 上午10:57
 */
public class E04_ExceptionClass {
    public static void main(String[] args) {
        try {
            f("f这里出错了");
        } catch (MyException e) {
            e.printMsg();
        }
    }

    public static void f(String msg) throws MyException {
        throw new MyException(msg);
    }
}



class MyException extends Exception {
    private String message;
    public MyException(String message) {
        this.message = message;
    }

    public void printMsg() {
        System.out.println(message);
    }
}
