package org.jsqueak;

import java.awt.*;
import java.awt.image.ColorModel;
import java.awt.image.DataBuffer;
import java.awt.image.IndexColorModel;

public class ScreenUtils {

    // cf. http://doc.novsu.ac.ru/oreilly/java/awt/ch12_02.htm
    private final static byte kComponents[] =
            new byte[]{(byte) 255, 0, (byte) 240, (byte) 230,
                    (byte) 220, (byte) 210, (byte) 200, (byte) 190, (byte) 180, (byte) 170,
                    (byte) 160, (byte) 150, 110, 70, 30, 10};

    private final static byte fComponents[] =
            new byte[]{(byte) 255, (byte) 240, (byte) 230,
                    (byte) 220, (byte) 210, (byte) 200, (byte) 190, (byte) 180, (byte) 170,
                    (byte) 160, (byte) 150, 110, 70, 30, 10};

    private final static byte sComponentsR[] = new byte[256];
    private final static byte sComponentsG[] = new byte[256];
    private final static byte sComponentsB[] = new byte[256];
    private final static byte sComponentsA[] = new byte[256];

    private final static int[] palette = {
            0x00ff0000,       // Red
            0x0000ff00,       // Green
            0x000000ff,       // Blue
            0xff000000,        // Alpha
    };

    static {
        for (int i = 0; i < 256; i++) {
            sComponentsR[i] = (byte) (i);
            sComponentsG[i] = (byte) (i);
            sComponentsB[i] = (byte) (i);
            sComponentsA[i] = (byte) (Transparency.TRANSLUCENT);
        }
    }

    public static ColorModel getBlackWhiteModel() {
        return new IndexColorModel(1, 2, kComponents, kComponents, kComponents);
    }

    public static ColorModel getColorfulModelV0() {
        return new IndexColorModel(8, fComponents.length, fComponents, fComponents, fComponents);
    }

    public static ColorModel getColorfulModelV2() {
        return new IndexColorModel(8, 256, sComponentsR, sComponentsG, sComponentsB, sComponentsA);
    }

    public static ColorModel getColorfulModel() {
        Color colorArray[] = {Color.red, Color.orange, Color.yellow,
                Color.green, Color.blue, Color.magenta};
        byte reds[] = new byte[colorArray.length];
        byte greens[] = new byte[colorArray.length];
        byte blues[] = new byte[colorArray.length];
        for (int i = 0; i < colorArray.length; i++) {
            reds[i] = (byte) colorArray[i].getRed();
            greens[i] = (byte) colorArray[i].getGreen();
            blues[i] = (byte) colorArray[i].getBlue();
        }

        ColorModel colorModel = new IndexColorModel(8, colorArray.length, reds, greens, blues);
        return colorModel;
    }

    public static ColorModel getColorfulModelV3() {
        return new IndexColorModel(8,         // bits per pixel
                4,         // size of color component array
                palette,   // color map
                0,         // offset in the map
                false,      // has alpha
                3,         // the pixel value that should be transparent
                DataBuffer.TYPE_BYTE);
    }

    public static ColorModel get256ColorModel() {
        byte[] r = new byte[256];
        byte[] g = new byte[256];
        byte[] b = new byte[256];

        int[] red = {0, 51, 85, 119, 153, 187, 221, 255};
        int[] green = {0, 51, 85, 119, 153, 187, 221, 255};
        int[] blue = {0, 119, 187, 255};

        for (int i = 0; i < 256; i++) {
            r[i] = (byte) red[(i & 0xE0) >> 5];
            g[i] = (byte) green[(i & 0x1C) >> 2];
            b[i] = (byte) blue[i & 0x03];
        }
        return new IndexColorModel(8, 256, r, g, b, 255);
    }
}
