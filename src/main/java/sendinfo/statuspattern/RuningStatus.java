package sendinfo.statuspattern;

/**
 * 开启状态
 *
 * @className: OpeningStatus
 * @author: mxk
 * @date: 2019/10/22  17:55
 */
public class RuningStatus extends  LiftStatus {



    @Override
    public void close() {

    }

    @Override
    public void open() {

    }

    @Override
    public void stop() {
        super.contextEnviroment.setLiftStatus(ContextEnviroment.stopingStatus);
        this.contextEnviroment.getLiftStatus().stop();
    }

    @Override
    public void run() {
        System.out.println("电梯开始运行了");
    }
}
