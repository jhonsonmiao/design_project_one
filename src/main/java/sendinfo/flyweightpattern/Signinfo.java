package sendinfo.flyweightpattern;

/**
 * 人员信息对象
 *
 * @className: Signinfo
 * @author: mxk
 * @date: 2019/10/23  18:01
 */
public class Signinfo {
    private Integer id;
    private String localtion;
    private String subject;
    private String postAddress;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLocaltion() {
        return localtion;
    }

    public void setLocaltion(String localtion) {
        this.localtion = localtion;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getPostAddress() {
        return postAddress;
    }

    public void setPostAddress(String postAddress) {
        this.postAddress = postAddress;
    }
}
