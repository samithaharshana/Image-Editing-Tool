/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package photopaint;

import java.awt.image.BufferedImage;

/**
 *
 * @author Samitha
 */
public class SetChanel {
    
      int Width;
    int Height;
    
    
     public BufferedImage getRedChannel(BufferedImage image){
        
        
        BufferedImage temp = new BufferedImage(image.getWidth(), image.getHeight(), image.getType());
        temp.setData(image.getData());
        
       
        Width = temp.getWidth();
        Height = temp.getHeight();
        

        for (int x = 0; x < Width; x++) {
            for (int y = 0; y < Height; y++) {
                
                int pixel = temp.getRGB(x, y);
                int alpha = (pixel >> 24) & 0xff;
                
              
                    int red = (pixel >> 16) & 0xff; 
                    pixel = (alpha << 24) | (red << 16) | (0 << 8) | 0;
                    
              
                
                //setting the new RGB values for the image
                temp.setRGB(x, y, pixel);
                
            }
        }
      
        return temp;
    }
    
     public BufferedImage getGreenChannel(BufferedImage image){
        
        
        BufferedImage temp = new BufferedImage(image.getWidth(), image.getHeight(), image.getType());
        temp.setData(image.getData());
        
       
        Width = temp.getWidth();
        Height = temp.getHeight();
        

        for (int x = 0; x < Width; x++) {
            for (int y = 0; y < Height; y++) {
                
                int pixel = temp.getRGB(x, y);
                int alpha = (pixel >> 24) & 0xff;
                
                                   
                    int green = (pixel >> 8) & 0xff;
                    pixel = (alpha << 24) | (0 << 16) | (green << 8) | 0;
                    
               
                //setting the new RGB values for the image
                temp.setRGB(x, y, pixel);
                
            }
        }
      
        return temp;
    }
    
     
       
     public BufferedImage getBlueChannel(BufferedImage image){
        
        
        BufferedImage temp = new BufferedImage(image.getWidth(), image.getHeight(), image.getType());
        temp.setData(image.getData());
        
       
        Width = temp.getWidth();
        Height = temp.getHeight();
        

        for (int x = 0; x < Width; x++) {
            for (int y = 0; y < Height; y++) {
                
                int pixel = temp.getRGB(x, y);
                int alpha = (pixel >> 24) & 0xff;
                
              
                    int blue = pixel & 0xff;
                    pixel = (alpha << 24) | (0 << 16) | (0 << 8) | (blue);
                    
              
                
                //setting the new RGB values for the image
                temp.setRGB(x, y, pixel);
                
            }
        }
      
        return temp;
    }
    
    
    
    
//
//    public BufferedImage getGreenChanel(BufferedImage img1) {
//          BufferedImage img = new BufferedImage(img1.getWidth(), img1.getHeight(), img1.getType());
//        img.setData(img.getData());
//
//        System.out.println("in green");
//        //getting width and height
//        int width = img.getWidth();
//        int height = img.getHeight();
//
//        //convet  to green
//        for (int i = 0; i < width; i++) {
//            for (int j = 0; j < height; j++) {
//                int pixel = img.getRGB(j, i);
//                int alpha = (pixel >> 24) & 0xff;
//                int green = (pixel >> 8) & 0xff;
//                //set new RGB
//                pixel = (alpha << 24) | (0 << 16) | (green << 8) | 0;
//                img.setRGB(i, j, pixel);
//
//            }
//        }
//        return img;
//    }

//    public BufferedImage getRedChanel(BufferedImage img1) {
//          BufferedImage img = new BufferedImage(img1.getWidth(), img1.getHeight(), img1.getType());
//        img.setData(img.getData());
//
//        //getting width and height
//        int width = img.getWidth();
//        int height = img.getHeight();
//
//        //convet  to red
//        for (int i = 0; i < width; i++) {
//            for (int j = 0; j < height; j++) {
//                int pixel = img.getRGB(j, i);
//                int alpha = (pixel >> 24) & 0xff;
//                int red = (pixel >> 16) & 0xff;
//                //set new RGB
//                pixel = (alpha << 24) | (red << 16) | (0 << 8) | 0;
//                img.setRGB(i, j, pixel);
//
//            }
//        }
//        return img;
//    }

//    public BufferedImage getBlueChanel(BufferedImage img1) {
//
//          BufferedImage img = new BufferedImage(img1.getWidth(), img1.getHeight(), img1.getType());
//        img.setData(img.getData());
//        //getting width and height
//        int width = img.getWidth();
//        int height = img.getHeight();
//
//        //convet  to red
//        for (int i = 0; i < width; i++) {
//            for (int j = 0; j < height; j++) {
//                int pixel = img.getRGB(j, i);
//                int alpha = (pixel >> 24) & 0xff;
//                int blue = pixel & 0xff;
//                //set new RGB
//                pixel = (alpha << 24) | (0 << 16) | (0 << 8) | (blue);
//                img.setRGB(i, j, pixel);
//
//            }
//        }
//        return img;
//    }

}
