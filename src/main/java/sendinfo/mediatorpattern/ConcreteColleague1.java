package sendinfo.mediatorpattern;

/**
 * @program: design
 * @description: 具体同事类1
 * @author: mxk
 * @create: 2019-11-12 23:00
 **/
public class ConcreteColleague1 extends Colleaguer {

    public ConcreteColleague1(AbstractMediator abstractMediator) {
        super(abstractMediator);
    }

    public void selfMethod1(){
        System.out.println("调用同事类1自有方法");
    }

    public void dependcyMethod2(){
        super.mediator.doSomething1();
    }
}
