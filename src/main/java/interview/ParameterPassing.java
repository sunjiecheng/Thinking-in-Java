package check.points;

/**
 * @author jiecheng
 * @create 2019-05-19 上午11:40
 */
public class ParameterPassing {

    private static Person person = null;

    public static void main(String[] args) {
        // 1、传入基本数据类型
        int num = 5;
        System.out.println(num);
        changeValue(num);
        System.out.println(num);

        String name  = ParameterPassing.person.name;

        System.out.println(name);

        // 2、传入引用数据类型
        Person person = new Person();
        //先显示这个对象的name属性
        System.out.println(person.name);

        /*changeNameByObject(person);
        //再显示这个对象的name属性，看是否发生了变化
        System.out.println(person.name);*/

        changeName(person);
        //再显示这个对象的name属性，看是否发生了变化
        System.out.println(person.name);



    }

    //定义了一个改变参数值的函数
    public static void changeValue(int x) {
        x = x * 2;
    }

    //定义一个改变对象属性的方法
    public static void changeNameByObject(Person p) {
        p.name = "Rose";
    }

    //定义一个改变对象属性的方法
    public static void changeName(Person p) {
        p = new Person();
        p.name = "Rose";
    }
}

class Person {
    public String name = "Jack";
}
