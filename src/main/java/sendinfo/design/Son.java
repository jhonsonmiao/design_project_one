package sendinfo.design;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * 子类
 *
 * @className: Son
 * @author: mxk
 * @date: 2019/6/18  8:51
 */
public class Son extends Father {
    public Collection dosomething(Map map) {
        System.out.println("子类方法执行");
        return map.values();
    }
}
