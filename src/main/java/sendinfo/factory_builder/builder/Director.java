package sendinfo.factory_builder.builder;

/**
 * 建造者导演类
 *
 * @className: Director
 * @author: mxk
 * @date: 2019/10/30  16:40
 */
public class Director {

    private static  AudltSuperManBuilder audltSuperManBuilder=new AudltSuperManBuilder();
    private static  ChildSuperManBuilder childSuperManBuilder=new ChildSuperManBuilder();


    public static  SuperMan createChildSuperMan(){
        return childSuperManBuilder.getSuperMan();
    }
    public static  SuperMan createAudltSuperMan(){
        return audltSuperManBuilder.getSuperMan();
    }

}
