package JSqueak;

import java.awt.image.ColorModel;

/**
 * Global config for JSqueak
 */
public class BuildConfig {

    public static final boolean DEBUG_LOGGING = true;

    public static final int LOGGING_MAX_LEN = 300;

    /**
     * Color model for the image file
     */
    public static final ColorModel IMAGE_COLOR_MODEL = ScreenUtils.getBlackWhiteModel();

    /**
     * The file name of the mini image.
     */
    public static final String MINI_IMAGE = "mini.image.gz";  // original image in JSqueak
    public static final String SQUEAK_IMAGE_V22 = "squeak22.image.gz";  // original image of full version Squeak 2.2

    public static String getImageName() {
        return MINI_IMAGE;
    }

    public static final int DISPLAY_POLICY = 1;
}
