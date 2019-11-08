package sendinfo.CommandPattern;

/**
 * 灯关闭命令类
 *
 * @className: LightOffCommand
 * @author: mxk
 * @date: 2019/11/5  9:48
 */
public class LightOffCommand implements Command {

    private LightReceiver lightReceiver;


    public LightOffCommand(LightReceiver lightReceiver) {
        this.lightReceiver = lightReceiver;
    }

    @Override
    public void execute() {
       this.lightReceiver.off();
    }

    @Override
    public void undo() {
        this.lightReceiver.on();
    }
}
