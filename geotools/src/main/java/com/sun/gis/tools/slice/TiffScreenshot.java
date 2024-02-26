package com.sun.gis.tools.slice;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

/**
 * 读取tiff影像并截取一部分
 */
public class TiffScreenshot {
    public static void main(String[] args) throws Exception {
        // 读取tiff影像
        BufferedImage image = ImageIO.read(new File("D:\\data\\梅园新村街道_卫图2_Level_17.tif"));

        // 截取影像的一部分
        int x = 1500; // 起始点的x坐标
        int y = 1500; // 起始点的y坐标
        int width = 256; // 截取的宽度
        int height = 256; // 截取的高度
        BufferedImage subImage = image.getSubimage(x, y, width, height);

        // 保存截图
        ImageIO.write(subImage, "png", new File("D:\\out\\image.png"));
    }
}
