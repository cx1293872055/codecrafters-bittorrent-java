package bcodes;

import java.util.ArrayList;
import java.util.List;

/**
 * @author chenxin
 * @since 2024/2/29 星期四 10:50
 */
public class BcodeManager {

    private static final List<Bcode> bcodes = new ArrayList<>();

    public static void loadBcode() {
        bcodes.add(new StringBcode());
        bcodes.add(new NumberBcode());
        bcodes.add(new ListBcode());
    }

    public static Bcode bcodeOfPrefix(char prefix) {
        return bcodes.stream()
                     .filter(bcode -> bcode.need(prefix))
                     .findFirst()
                     .orElse(null);
    }
}
