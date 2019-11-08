package sendinfo.design3;

/**
 * 具体星探类
 *
 * @className: Search
 * @author: mxk
 * @date: 2019/6/26  14:33
 */
public class Search extends  AbstractSearch{

    public Search(IPrettyGril prettyGril) {
        super(prettyGril);
    }

    @Override
    public void show() {
        System.out.println("美女信息如下：----------------------");
        super.prettyGril.goodLook();
        super.prettyGril.niceFigure();
        super.prettyGril.greatTemperament();
    }
}
