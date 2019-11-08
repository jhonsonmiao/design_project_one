package sendinfo.factory_builder.factory;

/**
 * 工厂接口类方法
 *
 * @className: IFactoryMethod
 * @author: mxk
 * @date: 2019/10/30  9:43
 */
public interface IFactoryMethod {

    <T extends ISuperMan> T  createSuperMan(Class<T> clazz);
}
