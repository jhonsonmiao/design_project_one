package sendinfo.design5;

import sun.applet.Main;
import sun.security.jca.GetInstance;

/**
 * 单例恶汉式
 *
 * @className: SingletonHungerDemo
 * @author: mxk
 * @date: 2019/7/27  15:50
 */
public class SingletonHungerDemo {

//    public static void main(String[] args) {
//
//        Runtime runtime = Runtime.getRuntime();
//    }
        private static  SingletonHungerDemo single=new SingletonHungerDemo();

        private SingletonHungerDemo(){

        }

        public  static SingletonHungerDemo getInstance(){
            return single;
        }

}

class DoubleCheckSingle{
    //注意关键字volatile,快速刷入主存中
    private  static volatile DoubleCheckSingle single;
    private DoubleCheckSingle(){

    }

    public static  DoubleCheckSingle getInstance(){
        if(single==null){
            synchronized (DoubleCheckSingle.class) {
                if (single == null) {
                    single = new DoubleCheckSingle();
                }
            }
        }
        return single;
    }


}

class innerClassSingle{
    private static innerClassSingle single;
    //注意final
    static class TempleClass{
        private static final innerClassSingle inner=new innerClassSingle();
    }

    public static innerClassSingle getInstance(){
       return TempleClass.inner;
    }

}

