package sendinfo.visitpattern;

/**
 * 访问者接口类
 *
 * @className: IVisitor
 * @author: yangzy
 * @date: 2019/10/22
 */
public interface IVisitor {

    public void visit(Manage manage);

    public void visit(CommonEmployee commonEmployee);


}
