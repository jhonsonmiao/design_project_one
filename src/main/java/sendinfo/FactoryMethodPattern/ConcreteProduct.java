package sendinfo.FactoryMethodPattern;

/**
 * 具体的方法
 *
 * @className: ConcreteProduct
 * @author: mxk
 * @date: 2019/10/24  9:09
 */
public class ConcreteProduct extends Product {

    @Override
    public void privateMethod() {
        System.out.println("具体产品私有方法");
    }
}
