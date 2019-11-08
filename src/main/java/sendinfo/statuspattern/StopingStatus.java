package sendinfo.statuspattern;

/**
 * 开启状态
 *
 * @className: OpeningStatus
 * @author: mxk
 * @date: 2019/10/22  17:55
 */
public class StopingStatus extends  LiftStatus {



    @Override
    public void close() {
        super.contextEnviroment.setLiftStatus(ContextEnviroment.closingStatus);
        this.contextEnviroment.getLiftStatus().close();
    }

    @Override
    public void open() {
        super.contextEnviroment.setLiftStatus(ContextEnviroment.openingStatus);
        this.contextEnviroment.getLiftStatus().open();
    }

    @Override
    public void stop() {
        System.out.println("电梯开始停了");
    }

    @Override
    public void run() {
        super.contextEnviroment.setLiftStatus(ContextEnviroment.runingStatus);
        this.contextEnviroment.getLiftStatus().run();
    }
}
