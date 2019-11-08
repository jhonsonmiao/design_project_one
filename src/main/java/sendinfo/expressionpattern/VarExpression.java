package sendinfo.expressionpattern;

import java.util.HashMap;

/**
 * 终结符号
 *
 * @className: VarExpression
 * @author: mxk
 * @date: 2019/10/23  14:05
 */
public class VarExpression extends  Expression{

    private String key;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public VarExpression(String key) {
        this.key = key;
    }

    @Override
    public int interpreter(HashMap<String, Integer> var) {

        return var.get(key);
    }
}
