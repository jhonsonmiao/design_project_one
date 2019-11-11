package sendinfo.observerpattern;

/**
 * @program: design
 * @description:
 * @author: mxk
 * @create: 2019-11-11 22:44
 **/
public interface Observer {


    public void update(Float temperature, Float humidity, Float airPressure);

}
