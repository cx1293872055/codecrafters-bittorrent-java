package bcodes;

/**
 * @author chenxin
 * @since 2024/2/29 星期四 10:42
 */
public class StringBcode implements Bcode{
    @Override
    public String encode(Object obj) {
        String s = String.valueOf(obj);
        return s.length() + ":" + s;
    }

    @Override
    public DecodeRes decode(String str, int offSet) {
        int firstColonIndex = offSet;
        for (int i = offSet; i < str.length(); i++) {
            if (str.charAt(i) == ':') {
                firstColonIndex = i;
                break;
            }
        }
        int length = Integer.parseInt(str.substring(offSet, firstColonIndex));
        int endIndex = firstColonIndex + 1 + length;
        return new DecodeRes(str.substring(firstColonIndex + 1, endIndex), endIndex);
    }

    @Override
    public boolean need(char prefix) {
        return Character.isDigit(prefix);
    }

}
