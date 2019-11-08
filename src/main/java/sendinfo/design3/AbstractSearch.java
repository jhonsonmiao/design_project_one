package sendinfo.design3;

/**
 * 抽象星探类
 *
 * @className: AbstractSearch
 * @author: mxk
 * @date: 2019/6/26  14:30
 */
public abstract  class AbstractSearch {

    protected IPrettyGril prettyGril;

    public AbstractSearch(IPrettyGril prettyGril) {
        this.prettyGril = prettyGril;
    }

    public abstract void show();
}
