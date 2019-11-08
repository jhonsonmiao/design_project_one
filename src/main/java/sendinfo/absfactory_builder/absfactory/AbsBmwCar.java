package sendinfo.absfactory_builder.absfactory;

/**
 * 宝马车抽象类
 *
 * @className: AbsBmwCar
 * @author: mxk
 * @date: 2019/10/30  18:10
 */
public abstract class AbsBmwCar  implements ICar{

    private static  final  String BMW="宝马汽车";
    @Override
    public String getBrand() {
        return BMW;
    }

    @Override
    public abstract String getModel() ;
}
