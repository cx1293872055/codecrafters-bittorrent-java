import commands.CommandManager;
// import com.dampcake.bencode.Bencode; - available if you need it!

public class Main {

    public static void main(String[] args) {
        String argCommand = args[0];
        CommandManager.loadCommands();
        CommandManager.commandOfInput(args[0])
                      .execute(argCommand, args[1]);
    }
}
