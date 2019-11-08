package sendinfo.design6;

import com.sun.org.apache.xalan.internal.xsltc.compiler.util.VoidType;

/**
 * 人类接口
 *
 * @className: Human
 * @author: yangzy
 * @date: 2019/6/27
 */
public interface Human {
    void getColor();
    void talk();

}

class BlackHuman implements  Human{

    @Override
    public void getColor() {
        System.out.println("黑人皮肤黑色");
    }

    @Override
    public void talk() {
        System.out.println("黑人讲杂语");
    }
}

class YellowHuman implements Human{

    @Override
    public void getColor() {
        System.out.println("黄种人是黄色");
    }

    @Override
    public void talk() {
        System.out.println("黄种人讲中文");
    }
}

class  WhiteHuman implements  Human{

    @Override
    public void getColor() {
        System.out.println("白种人是白色");
    }

    @Override
    public void talk() {
        System.out.println("白种人讲英语");
    }
}
