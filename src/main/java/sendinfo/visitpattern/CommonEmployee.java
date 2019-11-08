package sendinfo.visitpattern;

/**
 * 基础员工类
 *
 * @className: CommonEmployee
 * @author: mxk
 * @date: 2019/10/22  15:42
 */
public class CommonEmployee extends Employee {

    public String job;

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
