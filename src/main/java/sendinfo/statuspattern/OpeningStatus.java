package sendinfo.statuspattern;

/**
 * 开启状态
 *
 * @className: OpeningStatus
 * @author: mxk
 * @date: 2019/10/22  17:55
 */
public class OpeningStatus extends  LiftStatus {




    @Override
    public void close() {
        super.contextEnviroment.setLiftStatus(ContextEnviroment.closingStatus);
        this.contextEnviroment.getLiftStatus().close();
    }

    @Override
    public void open() {
        System.out.println("门开了");
    }

    @Override
    public void stop() {

    }

    @Override
    public void run() {

    }
}
