package sendinfo.expressionpattern;

import java.io.*;
import java.util.HashMap;

/**
 * @className: TestDemo
 * @author: mxk
 * @date: 2019/10/23  16:25
 */
public class TestDemo {
    public static void main(String[] args) throws IOException {
        String expStr = getExpStr();
        //赋值
        HashMap<String,Integer> var = getValue(expStr);
        Calculate cal = new Calculate(expStr);
        System.out.println("运算结果为："+expStr +"="+cal.run(var));
    }

    private static HashMap<String,Integer> getValue(String expStr) throws IOException {
        HashMap<String, Integer> map = new HashMap<>();
        char[] chars = expStr.toCharArray();
        for (char aChar : chars) {
            if(aChar!='+'&&aChar!='-'){
                
                if(!map.containsKey(String.valueOf(aChar))){
                    System.out.println("请输入"+aChar+"值：");
                    String in = new BufferedReader(new InputStreamReader(System.in)).readLine();
                    map.put(String.valueOf(aChar),Integer.parseInt(in));
                }
            }
        }
        return map;


    }

    private static String getExpStr() throws IOException {
        System.out.println("请输入表达式：");
        return   new BufferedReader(new InputStreamReader(System.in)).readLine();

    }
}
