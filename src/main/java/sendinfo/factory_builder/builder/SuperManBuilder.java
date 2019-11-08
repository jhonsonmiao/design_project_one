package sendinfo.factory_builder.builder;

/**
 * 超人创建者类
 *
 * @className: SuperManBuilder
 * @author: mxk
 * @date: 2019/10/30  16:22
 */
public abstract class SuperManBuilder  {

    protected  final SuperMan superMan=new SuperMan();

    public void setBody(String bodyString){
        this.superMan.setBody(bodyString);
    }
    public void setSpecialTalent(String specialTalent){
        this.superMan.setSpecialTalent(specialTalent);
    }
    public void setSpecialSymbol(String specialSymbol){
        this.superMan.setSpecialSymbol(specialSymbol);
    }

    public abstract  SuperMan getSuperMan();

}
