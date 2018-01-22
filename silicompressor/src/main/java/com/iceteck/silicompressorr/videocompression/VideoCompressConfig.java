package com.iceteck.silicompressorr.videocompression;

/**
 * Created by raymond on 5/9/2017.
 */

public final class VideoCompressConfig {
    private static final int DEFAULT_BIT_RATE = 450000;
    public final int outWidth, outHeight, bitrate;
    public final String inDest, outDest;

    private VideoCompressConfig(int outWidth, int outHeight, String inDest, String outDest) {
        this(outWidth, outHeight, DEFAULT_BIT_RATE, inDest, outDest);
    }

    private VideoCompressConfig(int outWidth, int outHeight, int bitrate, String inDest, String outDest) {
        this.outWidth = outWidth;
        this.outHeight = outHeight;
        this.bitrate = bitrate;
        this.inDest = inDest;
        this.outDest = outDest;
    }

    public static VideoCompressConfig newConfig(int outWidth, int outHeight, String inDest, String outDest) {
        return new VideoCompressConfig(outWidth, outHeight, inDest, outDest);
    }

    public static VideoCompressConfig newConfig(int outWidth, int outHeight, int bitrate, String inDest, String outDest) {
        return new VideoCompressConfig(outWidth, outHeight, bitrate, inDest, outDest);
    }
}
