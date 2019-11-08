package sendinfo.design3;

/**
 * 具体实现类
 *
 * @className: PrettyGril
 * @author: mxk
 * @date: 2019/6/26  14:24
 */
public class PrettyGrilTwo implements IGreateBodyGril,ItemperamnetGril{
    private String name ;

    public PrettyGrilTwo(String name) {
        this.name = name;
    }

    @Override
    public void goodLook() {
        System.out.println(name+"有漂亮的脸蛋");
    }

    @Override
    public void niceFigure() {
        System.out.println(name+"有好身材");
    }

    @Override
    public void greatTemperament() {
        System.out.println(name+"有好的气质");
    }
}
