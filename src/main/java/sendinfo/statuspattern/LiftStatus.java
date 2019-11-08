package sendinfo.statuspattern;

/**
 * 电梯状态接口
 *
 * @className: LiftStatus
 * @author: yangzy
 * @date: 2019/10/22
 */
public abstract class LiftStatus {

    protected ContextEnviroment contextEnviroment;

    public void setContextEnviroment(ContextEnviroment contextEnviroment) {
        this.contextEnviroment = contextEnviroment;
    }

    public abstract  void close();

    public abstract void open();

    public  abstract void stop();

    public  abstract void run();




}
