package Com.Model;

import java.awt.Image;
import javax.swing.ImageIcon;

public class ImageWrapper {
    private byte[] imageBytes;
    private ImageIcon imageIcon;

    public ImageWrapper(byte[] imageBytes) {
        this.imageBytes = imageBytes;
        if (imageBytes != null) {
            this.imageIcon = new ImageIcon(new ImageIcon(imageBytes).getImage()
                    .getScaledInstance(80, 80, Image.SCALE_SMOOTH));
        }
    }

    public byte[] getImageBytes() {
        return imageBytes;
    }

    public ImageIcon getImageIcon() {
        return imageIcon;
    }
}