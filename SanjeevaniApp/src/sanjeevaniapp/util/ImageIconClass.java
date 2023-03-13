
package sanjeevaniapp.util;

import java.awt.Image;
import javax.swing.ImageIcon;

public class ImageIconClass {
    
    private final static ImageIcon favicon=new ImageIcon("E:\\Aryan\\SCA Project batch\\Project\\JavaProjectBatch\\SanjeevaniApp\\src\\sanjeevaniapp\\gui\\favicon.png");


    public static Image getFavicon() {
        return favicon.getImage();
    }
    
}
