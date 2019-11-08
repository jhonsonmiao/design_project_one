package sendinfo.design2;

/**
 * 司机类实体
 *
 * @className: Driver
 * @author: mxk
 * @date: 2019/6/18  9:44
 */
public class Driver implements  IDriver {
    @Override
    public void drive(ICar car) {
        car.run();
    }
}
