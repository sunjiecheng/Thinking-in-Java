package interview;

/**
 * @author jiecheng
 * @create 2019-05-26 下午5:44
 */
public class StaticBlock {
    public StaticBlock() {//构造函数
        System.out.println("A的构造函数");
    }

    {//构造代码块
        System.out.println("A的构造代码块");
    }

    static {//静态代码块
        System.out.println("A的静态代码块");
    }

    public static void main(String[] args) {
    }
}
