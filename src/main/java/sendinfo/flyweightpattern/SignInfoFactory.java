package sendinfo.flyweightpattern;

import java.util.HashMap;

/**
 * 工厂类
 *
 * @className: SignInfoFactory
 * @author: mxk
 * @date: 2019/10/23  18:07
 */
public class SignInfoFactory {

    private static  HashMap<String,Signinfo> pool=new HashMap<String,Signinfo>();

    public static  Signinfo getSignInfo(String key){
        Signinfo result=null;
        if(pool.containsKey(key)){
            System.out.println("直接从池中获取"+key+"对象");
            result=pool.get(key);
            return result;
        }else{
            System.out.println(key + "----建立对象，并放置到池中");
            result=new SignInfo4Pool(key);
            pool.put(key,result);
            return result;
        }
    }

}
