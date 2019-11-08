package sendinfo.design;

import java.util.Collection;
import java.util.HashMap;

/**
 * 父类
 *
 * @className: Father
 * @author: mxk
 * @date: 2019/6/18  8:47
 */
public class Father {
    public Collection dosomething(HashMap map){
        System.out.println("父类执行");
        return map.values();

    }
}
