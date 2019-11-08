package sendinfo.FactoryMethodPattern;

/**
 * 产品工厂类
 *
 * @className: ProductFactory
 * @author: mxk
 * @date: 2019/10/24  9:13
 */
public class ProductFactory {

    public <T extends  Product> T createProduct(Class<T> clazz){
        Product product=null;
        try {
             product = (Product) Class.forName(clazz.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (T)product;
    }

}
