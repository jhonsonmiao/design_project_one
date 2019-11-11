package sendinfo.observerpattern;

import java.util.List;

/**
 * @program: design
 * @description: 被观察者对象
 * @author: mxk
 * @create: 2019-11-11 22:39
 **/
public interface Subject {

    public void registerObservers(Observer Observer);

    public void removeObservers(Observer Observer);

    public void notifyObservers();

}
