package sendinfo.design7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 客户端类
 *
 * @className: Client
 * @author: mxk
 * @date: 2019/6/27  15:21
 */
public class Client {
    public static void main(String[] args) {
        // HummerModel hummerModel=new ConcurrentHummerModel();
        //hummerModel.run();
        System.out.println("-------H1型号悍马--------");
        System.out.println("H1型号的悍马是否需要喇叭声响？0-不需要 1-需要");
        String type= null;
        try {
            type = (new BufferedReader(new InputStreamReader(System.in))).readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        ConcurrentHummerModel concurrentHummerModel = new ConcurrentHummerModel();
        if(type.equals("0")){
            concurrentHummerModel.setAlarm(false);
        }
        concurrentHummerModel.run();
    }
}
