package bcodes;

/**
 * @author chenxin
 * @since 2024/2/29 星期四 11:43
 */
public class NumberBcode implements Bcode {
    @Override
    public boolean need(char prefix) {
        return 'i' == prefix;
    }

    @Override
    public String encode(Object obj) {
        return "i" + obj + "e";
    }

    @Override
    public DecodeRes decode(String str, int offSet) {

        assert str.charAt(offSet) == 'i';

        int firstColonIndex = offSet + 1;
        for (int i = firstColonIndex; i < str.length(); i++) {
            if (str.charAt(i) == 'e') {
                firstColonIndex = i;
                break;
            }
        }
        Long result = Long.parseLong(str.substring(offSet + 1, firstColonIndex));
        return new DecodeRes(result, firstColonIndex + 1);
    }
}
