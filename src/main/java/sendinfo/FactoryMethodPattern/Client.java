package sendinfo.FactoryMethodPattern;

/**
 * 客户端类
 *
 * @className: Client
 * @author: mxk
 * @date: 2019/10/24  9:21
 */
public class Client {
    public static void main(String[] args) {
        ProductFactory productFactory = new ProductFactory();
        Product product = productFactory.createProduct(ConcreteProduct.class);
        product.privateMethod();


    }
}
