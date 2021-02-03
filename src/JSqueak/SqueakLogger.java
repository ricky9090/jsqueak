package JSqueak;

public class SqueakLogger {

    public static void log(String msg) {
        if (BuildConfig.DEBUG_LOGGING) {
            System.out.println(msg);
        }
    }
}
