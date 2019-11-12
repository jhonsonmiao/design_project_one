package sendinfo.mediatorpattern;

/**
 * @program: design
 * @description: 具体同事类2
 * @author: mxk
 * @create: 2019-11-12 23:05
 **/
public class ConcreteColleague2 extends Colleaguer{

        //通过构造函数传递中介者
        public ConcreteColleague2(AbstractMediator _mediator){
            super(_mediator);
        }
        //自有方法 self-method
        public void selfMethod2(){
            //处理自己的业务逻辑
            System.out.println("调用同事类2自有方法");
        }
        //依赖方法 dep-method
        public void depMethod2(){
            //处理自己的业务逻辑
            //自己不能处理的业务逻辑，委托给中介者处理
            super.mediator.doSomething2();
        }
}


