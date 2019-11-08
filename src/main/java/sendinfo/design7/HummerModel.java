package sendinfo.design7;

/**
 * 悍马模型类(模板模式)
 *
 * @className: HummerModel
 * @author: mxk
 * @date: 2019/6/27  15:15
 */
public  abstract class HummerModel {
    public abstract void start();
    public abstract void stop();
    public abstract void alarm();
    public abstract void engineBoom();

    public final  void run(){//被final修饰能继承不能被复写
        this.start();
        this.engineBoom();
        if(this.isAlarm()) {
            this.alarm();
        }
        this.stop();
    }

    protected Boolean isAlarm(){
        return true;
    }
}

    final class  ConcurrentHummerModel extends HummerModel{//类被final修饰不能被继承
    private Boolean isAlarm=true;
    @Override
    public void start() {
        System.out.println("悍马启动");
    }

    @Override
    public void stop() {
        System.out.println("悍马停止");
    }

    @Override
    public void alarm() {
        System.out.println("悍马鸣笛");
    }

    @Override
    public void engineBoom() {
        System.out.println("启动发动机");
    }

    @Override
    protected Boolean isAlarm() {
        return this.isAlarm;
    }

    public  void setAlarm(Boolean isAlarm){
        this.isAlarm=isAlarm;
     }
  }

