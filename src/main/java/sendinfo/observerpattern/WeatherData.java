package sendinfo.observerpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: design
 * @description: 具体数剧对象
 * @author: mxk
 * @create: 2019-11-11 22:51
 **/
public class WeatherData  implements  Subject{
    //Temperature, humidity, air pressure
    private Float temperature;

    private Float  humidity;

    private Float  airPressure;


    public Float getTemperature() {
        return temperature;
    }

    public Float getHumidity() {
        return humidity;
    }

    public Float getAirPressure() {
        return airPressure;
    }

    public void setData(Float temperature,Float humidity,Float airPressure){
        this.temperature=temperature;
        this.humidity=humidity;
        this.airPressure=airPressure;
        this.notifyObservers();
    }


    private List<Observer> observers;

    public WeatherData() {
        this.observers = new ArrayList<Observer>();
    }

    @Override
    public void registerObservers(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObservers(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer obj : observers) {
            obj.update(this.temperature,this.humidity,this.airPressure);
        }
    }
}
