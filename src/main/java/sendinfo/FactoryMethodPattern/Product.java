package sendinfo.FactoryMethodPattern;

/**
 * 产品类
 *
 * @className: Product
 * @author: mxk
 * @date: 2019/10/24  9:06
 */
public abstract class Product {

    public void commonMethod(){
        System.out.println("公用方法");
    }
    public abstract  void privateMethod();

}
