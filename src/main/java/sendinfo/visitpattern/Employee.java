package sendinfo.visitpattern;

/**
 * 员工抽象类
 *
 * @className: Employee
 * @author: mxk
 * @date: 2019/10/22  15:37
 */
public abstract  class Employee {

    public static final int FEMALE = 0;
    public static final int MALE = 1;
    private int salary;

    private String name;

    private int sex;


    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }


    public abstract void accept(IVisitor visitor);
}
