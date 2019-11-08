package sendinfo.design5;

import sun.security.jca.GetInstance;

/**
 * 单例皇帝类 (恶汉式)
 *
 * @className: Emperor
 * @author: mxk
 * @date: 2019/6/27  13:39
 */
public class Emperor {

    private static  final Emperor  emperor=new Emperor();

    private Emperor(){

    }

    public static Emperor GetInstance(){
        return emperor;
    }

    static void toSay(){
        System.out.println("吾乃。。。。");
    }

}


