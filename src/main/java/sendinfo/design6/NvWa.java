package sendinfo.design6;

/**
 * 女娲类（相当于客户端）
 *
 * @className: NvWa
 * @author: mxk
 * @date: 2019/6/27  14:19
 */
public class NvWa {
    public static void main(String[] args) {
        AbstractHumanFactor abstractHumanFactor = new HumanFactor();
        BlackHuman bhuman = abstractHumanFactor.createHuman(BlackHuman.class);
        bhuman.getColor();
        bhuman.talk();
    }
}
