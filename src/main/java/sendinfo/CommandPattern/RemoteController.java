package sendinfo.CommandPattern;

/**
 * 遥控器类
 *
 * @className: RemoteController
 * @author: mxk
 * @date: 2019/11/5  9:52
 */
public class RemoteController {

    private Command[] onCommands;
    private Command[] offCommands;


    public RemoteController() {
        this.onCommands = new LightOnCommand[5];
        this.offCommands =new LightOffCommand[5];
        for (int i = 0; i <5 ; i++) {
            onCommands[i]=new NoCommand();
            offCommands[i]=new NoCommand();
        }
    }

    public void  setRemoteController(int no,Command onCommand,Command offCommand) {
        onCommands[no]=onCommand;
        offCommands[no]=offCommand;
    }


}
