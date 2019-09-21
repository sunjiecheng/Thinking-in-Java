package exercise.chapter12.exceptions;

public class E01_SimpleException {
    public static void main(String[] args) {
        try {
            System.out.println("Main中抛出了一个异常");
            throw new Exception("抛出一个异常");
        } catch (Exception e) {
            System.err.println("Caught Exception1");
            e.printStackTrace();
        } finally {
            System.out.println("finally这里确实执行了");
        }
    }
}
