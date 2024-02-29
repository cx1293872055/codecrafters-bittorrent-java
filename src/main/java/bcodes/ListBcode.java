package bcodes;

import java.util.ArrayList;
import java.util.List;

/**
 * @author chenxin
 * @since 2024/2/29 星期四 10:44
 */
public class ListBcode implements Bcode {
    @Override
    public String encode(Object obj) {
        return null;
    }

    @Override
    public DecodeRes decode(String str, int offSet) {
        List<Object> result = new ArrayList<>();

        int nextOffSet = offSet + 1;

        while (nextOffSet < str.length()) {
            Bcode bcode = BcodeManager.bcodeOfPrefix(str.charAt(nextOffSet));
            DecodeRes res = bcode.decode(str, nextOffSet);
            result.add(res.result());
            nextOffSet = res.nextOffSet();
        }

        return new DecodeRes(result, nextOffSet);
    }

    @Override
    public boolean need(char prefix) {
        return 'l' == prefix;
    }
}
