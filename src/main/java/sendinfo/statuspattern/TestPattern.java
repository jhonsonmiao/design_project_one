package sendinfo.statuspattern;

/**
 * 测试模式类
 *
 * @className: TestPattern
 * @author: mxk
 * @date: 2019/10/22  18:38
 */
public class TestPattern {
    public static void main(String[] args) {
        ContextEnviroment context = new ContextEnviroment();
        context.setLiftStatus(new ClosingingStatus());
        context.open();
        context.close();
        context.run();
        context.stop();
    }
}
