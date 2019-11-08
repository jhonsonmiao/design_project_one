package sendinfo.visitpattern;

/**
 * 经理类
 *
 * @className: Manage
 * @author: mxk
 * @date: 2019/10/22  15:43
 */
public class Manage  extends  Employee{
    public String performer;

    public String getPerformer() {
        return performer;
    }

    public void setPerformer(String performer) {
        this.performer = performer;
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }


}
