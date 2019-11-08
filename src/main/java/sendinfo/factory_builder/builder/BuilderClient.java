package sendinfo.factory_builder.builder;

/**
 * 建造者客户端类
 *
 * @className: BuilderClient
 * @author: mxk
 * @date: 2019/10/30  16:48
 */
public class BuilderClient {
    public static void main(String[] args) {
        SuperMan audltSuperMan = Director.createAudltSuperMan();
        System.out.println(audltSuperMan.getSpecialSymbol());

    }
}
