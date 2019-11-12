package sendinfo.mediatorpattern;

/**
 * @program: design
 * @description: 抽象同事类
 * @author: mxk
 * @create: 2019-11-12 22:56
 **/
public abstract class Colleaguer {

    protected  AbstractMediator mediator;

    public Colleaguer(AbstractMediator abstractMediator) {
        this.mediator = abstractMediator;
    }



}
