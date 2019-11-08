package sendinfo.CommandPattern;

/**
 * 灯开命令类
 *
 * @className: LightOnCommand
 * @author: mxk
 * @date: 2019/11/5  9:34
 */
public class LightOnCommand implements Command{


    private LightReceiver lightReceiver;

    public LightOnCommand(LightReceiver lightReceiver) {
        this.lightReceiver = lightReceiver;
    }

    @Override
    public void execute() {
        this.lightReceiver.on();
    }

    @Override
    public void undo() {
        this.lightReceiver.off();
    }
}
