package sendinfo.observerpattern;

/**
 * @program: design
 * @description: 具体观察者
 * @author: mxk
 * @create: 2019-11-11 23:10
 **/
public class SohuObserver implements Observer {

    private Float temperature;

    private Float  humidity;

    private Float  airPressure;

    @Override
    public void update(Float temperature, Float humidity, Float airPressure) {
        this.temperature=temperature;
        this.humidity=humidity;
        this.airPressure=airPressure;
        this.display();
    }

    public void display() {
        System.out.println("搜狐网站气温=" + temperature +
                ", 搜狐网站湿度=" + humidity +
                ", 搜狐网站气压=" + airPressure);
    }
}
