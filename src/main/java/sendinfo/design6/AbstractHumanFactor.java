package sendinfo.design6;

/**
 * 人类工厂抽象类
 *
 * @className: AbstractHumanFactor
 * @author: mxk
 * @date: 2019/6/27  14:07
 */
public abstract class AbstractHumanFactor {
    public abstract   <T extends Human>  T createHuman(Class<T>  c);
}


class  HumanFactor extends  AbstractHumanFactor{

    @Override
    public <T extends Human> T createHuman(Class<T> c) {
        Human human=null;

        try {
            human=(T)Class.forName(c.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return (T)human;
    }
}