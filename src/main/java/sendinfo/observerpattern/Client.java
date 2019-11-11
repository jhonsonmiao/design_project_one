package sendinfo.observerpattern;

/**
 * @program: design
 * @description: 客户端
 * @author: mxk
 * @create: 2019-11-11 23:14
 **/
public class Client {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentObserver currentObserver = new CurrentObserver();
        weatherData.registerObservers(currentObserver);
        weatherData.registerObservers(new SohuObserver());
        weatherData.setData(30F,40F,50F);
        //Observable
    }
}
