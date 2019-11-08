package sendinfo.factory_builder.factory;

/**
 * 工厂类
 *
 * @className: FactoryClient
 * @author: mxk
 * @date: 2019/10/30  9:52
 */
public class FactoryClient {
    public static void main(String[] args) {
        IFactoryMethod factoryMethod=new FactoryMethod();
        ChildSuperMan childSuperMan = factoryMethod.createSuperMan(ChildSuperMan.class);
        childSuperMan.specialTalent();
        AdultSuperMan adult = factoryMethod.createSuperMan(AdultSuperMan.class);
        adult.specialTalent();

    }

}
