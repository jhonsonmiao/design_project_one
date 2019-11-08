package sendinfo.visitpattern;

/**
 * 访问者类
 *
 * @className: Visitor
 * @author: mxk
 * @date: 2019/10/22  15:49
 */
public class Visitor implements IVisitor {
    @Override
    public void visit(Manage manage) {
        System.out.println(this.getManageInfo(manage));
    }

    private String getManageInfo(Manage manage) {
      String basicInfo=  this.getBasicInfo(manage);
      String performerInfo="绩效"+manage.getPerformer()+ "\t";
       return basicInfo+performerInfo;
    }

    @Override
    public void visit(CommonEmployee commonEmployee) {
        System.out.println(this.commonEmployeeInfo(commonEmployee));
    }

    private String commonEmployeeInfo(CommonEmployee commonEmployee) {
        String basicInfo=  this.getBasicInfo(commonEmployee);
        String jobInfo="工作"+commonEmployee.getJob();
        return basicInfo+jobInfo;
    }

    private String getBasicInfo(Employee employee) {
        String info = "姓名：" + employee.getName() + "\t";
        info = info + "性别：" + (employee.getSex() == Employee.FEMALE?"女":"男") + "\t";
        info = info + "薪水：" + employee.getSalary() + "\t";
        return info;
    }


}
