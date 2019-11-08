package sendinfo.factory_builder.builder;

/**
 * 小超人建造者对象
 *
 * @className: ChildSuperManBuilder
 * @author: mxk
 * @date: 2019/10/30  16:34
 */
public class ChildSuperManBuilder extends SuperManBuilder {

    @Override
    public SuperMan getSuperMan() {
        super.setBody("小超人身躯");
        super.setBody("小超人特殊能力");
        super.setSpecialSymbol("小超人特殊标记");
        return super.superMan;
    }
}
