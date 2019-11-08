package sendinfo.CommandPattern;

/**
 * 命令接受者
 *
 * @className: LightReceiver
 * @author: mxk
 * @date: 2019/11/5  9:26
 */
public class LightReceiver {

    public void on(){
        System.out.println("灯打开了");
    }
    public void off(){
        System.out.println("灯关闭了");
    }
}
