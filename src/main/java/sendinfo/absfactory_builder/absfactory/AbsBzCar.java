package sendinfo.absfactory_builder.absfactory;

/**
 * 宝马车抽象类
 *
 * @className: AbsBmwCar
 * @author: mxk
 * @date: 2019/10/30  18:10
 */
public abstract class AbsBzCar implements ICar{
    private static  final  String BRBENZ="奔驰汽车";
    @Override
    public String getBrand() {
        return BRBENZ;
    }

    @Override
    public abstract String getModel() ;
}
