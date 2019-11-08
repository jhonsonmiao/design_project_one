package sendinfo.statuspattern;

/**
 * 开启状态
 *
 * @className: OpeningStatus
 * @author: mxk
 * @date: 2019/10/22  17:55
 */
public class ClosingingStatus extends  LiftStatus {



    @Override
    public void close() {

        System.out.println("电梯开始关闭");
    }

    @Override
    public void open() {
        super.contextEnviroment.setLiftStatus(ContextEnviroment.openingStatus);
        this.contextEnviroment.getLiftStatus().open();
    }

    @Override
    public void stop() {
        super.contextEnviroment.setLiftStatus(ContextEnviroment.stopingStatus);
        this.contextEnviroment.getLiftStatus().stop();
    }

    @Override
    public void run() {
        super.contextEnviroment.setLiftStatus(ContextEnviroment.runingStatus);
        this.contextEnviroment.getLiftStatus().run();
    }
}
