package sendinfo.design5;

/**
 * 测试单例模式
 *
 * @className: TestSngleton
 * @author: mxk
 * @date: 2019/6/27  9:54
 */
public class TestSingleton {

}
class Singleton {
    private  static final  Singleton singleton=new Singleton();

    private Singleton(){

    }

    public static Singleton  getSingleton(){
        return singleton;
    }



}
