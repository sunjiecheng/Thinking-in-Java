package check.points;

/**
 * @author jiecheng
 * @create 2019-05-19 上午11:40
 */
public class ParameterPassing {
    public static void main(String[] args) {
        // 基本数据类型
        int num = 5;
        System.out.println(num);
        changeValue(num);
        System.out.println(num);
    }

    //定义了一个改变参数值的函数
    public static void changeValue(int x) {
        x = x *2;
    }
}
