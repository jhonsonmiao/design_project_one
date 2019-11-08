package sendinfo.expressionpattern;

import java.util.HashMap;
import java.util.Stack;

/**
 * 解析器封装类
 *
 * @className: Calculate
 * @author: mxk
 * @date: 2019/10/23  14:21
 */
public class Calculate {

    private Expression expression;

    public  Calculate(String expreString){
        Stack<Expression> stack = new Stack<Expression>();
        char[] chars = expreString.toCharArray();
        Expression left=null;
        Expression right=null;
        for (int i = 0; i < chars.length; i++) {
            switch (chars[i]){
                case '+':
                    left=stack.pop();
                    right=new VarExpression(String.valueOf(chars[++i]));
                    stack.push(new AddExpression(left,right));
                    break;
                case '-':
                    left=stack.pop();
                    right=new VarExpression(String.valueOf(chars[++i]));
                    stack.push(new SubExpression(left,right));
                    break;
                default:
                    stack.push(new VarExpression(String.valueOf(chars[i])));
                    break;


            }
        }
        this.expression=stack.pop();


    }

    public int run(HashMap<String, Integer> var){
     return    this.expression.interpreter(var);
    }
}
