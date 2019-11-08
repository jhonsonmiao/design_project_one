package sendinfo.expressionpattern;

/**
 * 抽象符号解析器
 *
 * @className: SymbolExpression
 * @author: mxk
 * @date: 2019/10/23  14:09
 */
public abstract class SymbolExpression extends Expression{
    protected  Expression left;
    protected Expression right;

    public SymbolExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }
}
