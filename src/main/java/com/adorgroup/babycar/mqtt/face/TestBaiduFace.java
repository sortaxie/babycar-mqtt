package com.adorgroup.babycar.mqtt.face;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public class TestBaiduFace {

    public static void main(String[] args) throws IOException {
       // FaceDetect.detect();  //人脸检测
//        long startTime = System.currentTimeMillis();
//        for(int i=0;i<100;i++) {
//            FaceMatch.match();
//        }
//        long end = System.currentTimeMillis();
//
//        System.out.println(end-startTime);
      //  FaceAdd.add();
       FaceSearch.search();
//        InputStream inputStream = new FileInputStream(new File("E:/m.jpg"));
//        cropImage(inputStream,345,102,142,138,"jpg",new File("E:/z2.jpg"));
    }

   static boolean cropImage(InputStream inputStream, int x, int y, int w, int h, String sufix, File file) throws IOException {
        BufferedImage bufferedImage = ImageIO.read(inputStream);
        bufferedImage = bufferedImage.getSubimage(x,y,w,h);
        return ImageIO.write(bufferedImage,sufix,file);
    }

}
