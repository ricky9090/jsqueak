/*
 * Copyright (C) 2011 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jsqueak.display;

import java.awt.*;
import java.awt.color.ColorSpace;
import java.awt.image.ColorModel;
import java.awt.image.DataBuffer;
import java.awt.image.Raster;

/**
 * Copy from Android sdk source code
 */
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
