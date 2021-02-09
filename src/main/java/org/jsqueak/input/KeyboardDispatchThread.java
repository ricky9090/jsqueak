package org.jsqueak.input;

import org.jsqueak.SqueakLogger;
import org.jsqueak.SqueakVM;

public class KeyboardDispatchThread extends Thread {

    private final SqueakVM squeakVM;

    public KeyboardDispatchThread(SqueakVM vm) {
        this.squeakVM = vm;
    }

    boolean dispating = true;

    @Override
    public void run() {
        while (dispating) {
            squeakVM.wakeVMFromKeyboardThread();
        }
        SqueakLogger.log_D("quit input dispatch thread");
    }

    public void setDispating(boolean dispating) {
        this.dispating = dispating;
    }
}
