/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project.Backend.Interface;

import java.awt.Image;
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;

/**
 *
 * @author gokpraz
 */
public interface Upload {
   
   public BufferedImage resize(Image img, int height, int width);
   public ImageIcon ResizeImage(String ImagePath);
   
}
