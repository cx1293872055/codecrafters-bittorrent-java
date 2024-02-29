package commands;

import com.google.gson.Gson;

/**
 * @author chenxin
 * @since 2024/2/29 星期四 10:23
 */
public interface Command {

    Gson gson = new Gson();

    String DECODE = "decode";

    Object execute(String argCommand, String arg);

    String name();
}
