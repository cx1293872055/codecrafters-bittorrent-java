package commands;

import bcodes.Bcode;
import bcodes.BcodeManager;

/**
 * @author chenxin
 * @since 2024/2/29 星期四 10:23
 */
public class Decode implements Command {


    public Decode() {
        BcodeManager.loadBcode();
    }

    @Override
    public Object execute(String argCommand, String arg) {

        Bcode bcode = BcodeManager.bcodeOfPrefix(arg.charAt(0));

        Bcode.DecodeRes decode = bcode.decode(arg, 0);

        System.out.println(gson.toJson(decode.result()));
        return null;
    }

    @Override
    public String name() {
        return DECODE;
    }
}
