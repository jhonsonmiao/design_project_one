package sendinfo.factory_builder.factory;

/**
 * 工厂方法类
 *
 * @className: FactoryMethod
 * @author: mxk
 * @date: 2019/10/30  9:48
 */
public class FactoryMethod implements IFactoryMethod {
    @Override
    public <T extends ISuperMan> T createSuperMan(Class<T> clazz) {
        ISuperMan superMan=null;
        try{
            superMan = (ISuperMan) Class.forName(clazz.getName()).newInstance();
        }catch (Exception e){

        }
        return (T)superMan;
    }
}
