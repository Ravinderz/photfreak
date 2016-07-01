package com.photofreak.web.utils;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.imgscalr.Scalr;
import org.imgscalr.Scalr.Method;
import org.imgscalr.Scalr.Mode;

public class ImgUtil {

	public static void createThumbnail(String imgPath){
		System.out.println("********** createThumbnail Method Started **************");
		try {
			File imgFile = new File(imgPath);
			BufferedImage image = ImageIO.read(imgFile);
			BufferedImage thumbnail = Scalr.resize(image,Method.ULTRA_QUALITY,Mode.AUTOMATIC,500,500,Scalr.OP_ANTIALIAS);
			String thumbnailImgPath = imgPath.substring(0,imgPath.lastIndexOf("\\"));
			String imgName = imgPath.substring(imgPath.lastIndexOf("\\")+1);
			imgName = imgName.substring(0,imgName.lastIndexOf("."));
			thumbnailImgPath = thumbnailImgPath +  "\\" + imgName + "_thumbnail.png";
			File thumbnailFile = new File(thumbnailImgPath);
			if(!thumbnailFile.exists()){
				thumbnailFile.createNewFile();
			}
			ImageIO.write(thumbnail, "PNG", thumbnailFile);
			System.out.println("img thumbnail "+thumbnailFile.getPath()+" saved");
			
			System.out.println("********** createThumbnail Method ended **************");	
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
