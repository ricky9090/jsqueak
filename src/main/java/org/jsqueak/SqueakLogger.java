package org.jsqueak;

public class SqueakLogger {

    public static void log(String msg) {
        if (SqueakConfig.DEBUG_LOGGING) {
            System.out.println(msg);
        }
    }
}
