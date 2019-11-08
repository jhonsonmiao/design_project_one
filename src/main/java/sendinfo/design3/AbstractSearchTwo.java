package sendinfo.design3;

/**
 * 抽象星探类
 *
 * @className: AbstractSearch
 * @author: mxk
 * @date: 2019/6/26  14:30
 */
public abstract  class AbstractSearchTwo {
    protected IGreateBodyGril iGreateBodyGril;
    protected ItemperamnetGril itemperamnetGril;

    public AbstractSearchTwo(IGreateBodyGril iGreateBodyGril) {
        this.iGreateBodyGril = iGreateBodyGril;
    }

    public AbstractSearchTwo(ItemperamnetGril itemperamnetGril) {
        this.itemperamnetGril = itemperamnetGril;
    }

    public abstract void show();
}
