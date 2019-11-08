package sendinfo.CommandPattern;

/**
 * 命令接口类
 *
 * @className: Command
 * @author: yangzy
 * @date: 2019/11/5
 */
public interface Command {

    public void execute();

    public void undo();
}
