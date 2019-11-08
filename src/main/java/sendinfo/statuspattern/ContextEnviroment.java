package sendinfo.statuspattern;

/**
 * 环境状态类
 *
 * @className: ContextEnviroment
 * @author: mxk
 * @date: 2019/10/22  17:45
 */
public class ContextEnviroment {

    public static final OpeningStatus openingStatus=new OpeningStatus();
    public static final ClosingingStatus closingStatus=new ClosingingStatus();
    public static final StopingStatus stopingStatus=new StopingStatus();
    public static final RuningStatus runingStatus=new RuningStatus();



    private LiftStatus liftStatus;

    public LiftStatus getLiftStatus() {
        return liftStatus;
    }

    public void setLiftStatus(LiftStatus liftStatus) {
        this.liftStatus = liftStatus;
        this.liftStatus.setContextEnviroment(this);
    }

//    public ContextEnviroment(LiftStatus liftStatus) {
//        this.liftStatus = liftStatus;
//        this.liftStatus.setContextEnviroment(this);
//    }

    public void open(){
        this.liftStatus.open();
    }

    public void close(){
        this.liftStatus.close();
    }
    public void run(){
        this.liftStatus.run();
    }
    public void stop(){
        this.liftStatus.stop();
    }

}
