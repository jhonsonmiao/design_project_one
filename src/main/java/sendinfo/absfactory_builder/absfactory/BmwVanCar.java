package sendinfo.absfactory_builder.absfactory;

/**
 * 宝马商务车
 *
 * @className: BmwVanCar
 * @author: mxk
 * @date: 2019/10/30  18:17
 */
public class BmwVanCar extends AbsBmwCar {
    private static  final  String SEVEN_BRBENZ="七系列商务车";

    @Override
    public String getModel() {
        return SEVEN_BRBENZ;
    }
}
