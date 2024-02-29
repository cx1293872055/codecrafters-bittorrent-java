package bcodes;

/**
 * @author chenxin
 * @since 2024/2/29 星期四 10:40
 */
public interface Bcode {

    boolean need(char prefix);

    String encode(Object obj);

    DecodeRes decode(String str, int offSet);

    record DecodeRes(
            Object result,
            int nextOffSet
    ) {}
}
