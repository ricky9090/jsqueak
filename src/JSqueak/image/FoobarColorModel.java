package JSqueak.image;

import java.awt.*;
import java.awt.color.ColorSpace;
import java.awt.image.ColorModel;
import java.awt.image.DataBuffer;
import java.awt.image.Raster;

public class FoobarColorModel extends ColorModel {

    private static final int[] BITS = {
            8, 8, 8, 8,
    };

    private final int alphaLength = 0;
    private final int alphaMask = 0;
    private final int alphaOffset = 0;
    private final int blueMask = 0;
    private final int blueLength = 0;
    private final int blueOffset = 0;
    private final int greenMask = 0;
    private final int greenLength = 0;
    private final int greenOffset = 0;
    private final int redMask = 0;
    private final int redLength = 0;
    private final int redOffset = 0;

    public FoobarColorModel(RawImage rawImage) {
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
        return ((pixel >>> alphaOffset) & alphaMask) << (8 - alphaLength);
    }

    @Override
    public int getBlue(Object inData) {
        int pixel = getPixel(inData);
        return ((pixel >>> blueOffset) & blueMask) << (8 - blueLength);
    }

    @Override
    public int getGreen(Object inData) {
        int pixel = getPixel(inData);
        return ((pixel >>> greenOffset) & greenMask) << (8 - greenLength);
    }

    @Override
    public int getRed(Object inData) {
        int pixel = getPixel(inData);
        return ((pixel >>> redOffset) & redMask) << (8 - redLength);
    }

    @Override
    public int getAlpha(int pixel) {
        throw new UnsupportedOperationException();
    }

    @Override
    public int getBlue(int pixel) {
        throw new UnsupportedOperationException();
    }

    @Override
    public int getGreen(int pixel) {
        throw new UnsupportedOperationException();
    }

    @Override
    public int getRed(int pixel) {
        throw new UnsupportedOperationException();
    }
}
