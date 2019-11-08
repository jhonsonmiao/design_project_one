package sendinfo.expressionpattern;

import java.util.HashMap;

/**
 * 解释器接口
 *
 * @className: Expression
 * @author: mxk
 * @date: 2019/10/23  11:39
 */
public abstract  class Expression {

    public abstract int interpreter(HashMap<String, Integer> var);
}