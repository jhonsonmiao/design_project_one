package sendinfo.flyweightpattern;

/**
 * 测试类
 *
 * @className: TestDemo
 * @author: mxk
 * @date: 2019/10/23  18:18
 */
public class TestDemo {
    public static void main(String[] args) {
        for (int i = 0; i <4 ; i++) {
            String subject = "科目" + i;
            for (int j = 0; j <30 ; j++) {
                String key = subject + "考试地点"+j;
                SignInfoFactory.getSignInfo(key);
            }
        }
        Signinfo signInfo = SignInfoFactory.getSignInfo("科目1考试地点1");
    }
}
