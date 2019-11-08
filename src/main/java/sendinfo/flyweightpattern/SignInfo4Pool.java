package sendinfo.flyweightpattern;

/**
 * 池对象
 *
 * @className: SignInfo4Pool
 * @author: mxk
 * @date: 2019/10/23  18:05
 */
public class SignInfo4Pool extends Signinfo {
    private String key;


    public SignInfo4Pool(String key) {
        this.key = key;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
