package commands;

/**
 * @author chenxin
 * @since 2024/2/29 星期四 10:33
 */
public class Default implements Command{
    public static final Command INSTANCE = new Default();

    @Override
    public Object execute(String argCommand, String arg) {
        System.out.println("Unknown command: " + argCommand);
        return null;
    }

    @Override
    public String name() {
        return null;
    }
}
