package sendinfo.design3;

/**
 * 客户端类
 *
 * @className: Client
 * @author: mxk
 * @date: 2019/6/26  14:36
 */
public class Client {
    public static void main(String[] args) {
        IPrettyGril  yanyan=new PrettyGril("Lucy");
        AbstractSearch xin=new Search(yanyan);
        xin.show();
    }
}
