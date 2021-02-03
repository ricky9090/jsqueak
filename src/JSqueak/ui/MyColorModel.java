package JSqueak.ui;

import java.awt.*;
import java.awt.color.ColorSpace;
import java.awt.image.ColorModel;
import java.awt.image.DataBuffer;
import java.awt.image.Raster;

public class MyColorModel extends ColorModel {

    private static final int[] BITS = { 8, 8, 8, 8,};

    public MyColorModel() {
        super(32, BITS, ColorSpace.getInstance(ColorSpace.CS_sRGB),
                true, false, Transparency.TRANSLUCENT,
                DataBuffer.TYPE_BYTE);
    }

    @Override
    public boolean isCompatibleRaster(Raster raster) {
        return true;
    }

    private int getPixel(Object inData) {
        byte[] data = (byte[]) inData;
        int value = data[0] & 0x00FF;
        value |= (data[1] & 0x00FF) << 8;
        value |= (data[2] & 0x00FF) << 16;
        value |= (data[3] & 0x00FF) << 24;

        return value;
    }

    @Override
    public int getAlpha(Object inData) {
        int pixel = getPixel(inData);
        return ((pixel >>> 24) & 0xff) ;
    }

    @Override
    public int getBlue(Object inData) {
        int pixel = getPixel(inData);
        return ((pixel >>> 16) & 0xff) ;
    }

    @Override
    public int getGreen(Object inData) {
        int pixel = getPixel(inData);
        return ((pixel >>> 8) & 0xff) ;
    }

    @Override
    public int getRed(Object inData) {
        int pixel = getPixel(inData);
        return ((pixel ) & 0xff) ;
    }

    @Override
    public int getRed(int pixel) {
        return 0;
    }

    @Override
    public int getGreen(int pixel) {
        return 0;
    }

    @Override
    public int getBlue(int pixel) {
        return 0;
    }

    @Override
    public int getAlpha(int pixel) {
        return 0;
    }
}
