package sendinfo.TestNerMethod;

/**
 * 测试方法
 *
 * @className: TestMethod
 * @author: mxk
 * @date: 2019/6/27  16:05
 */
public class TestMethod {
    public static void main(String[] args) {
        A a = new A();
        a.setNum(2);
        operate operate = new operate();
        A operate1 = operate.operate(a);
        System.out.println(operate1.getNum());

    }
}


class A{
    private Integer num;

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }
}
class operate{
    public A operate(A a){
        a.setNum(a.getNum()-1);
        return a;
    }
}
