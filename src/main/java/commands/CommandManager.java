package commands;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author chenxin
 * @since 2024/2/29 星期四 10:24
 */
public class CommandManager {

    private static final Map<String, Command> commandMap = new HashMap<>();

    public static void loadCommands() {

        commandMap.putAll(Stream.of(new Decode())
                                .collect(Collectors.toMap(Decode::name, Function.identity())));
    }

    public static Command commandOfInput(String input) {
        return commandMap.getOrDefault(input, Default.INSTANCE);
    }
}
