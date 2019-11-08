package sendinfo.expressionpattern;

import java.util.HashMap;

/**
 * 添加运算符号
 *
 * @className: AddExpression
 * @author: mxk
 * @date: 2019/10/23  14:13
 */
public class AddExpression extends SymbolExpression {

    public AddExpression(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return this.left.interpreter(var)+this.right.interpreter(var);
    }

}
