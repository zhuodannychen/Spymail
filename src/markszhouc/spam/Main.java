package markszhouc.spam;

import javafx.embed.swing.SwingFXUtils;
import javafx.scene.image.Image;
import markszhouc.spam.encoding.ByteDecoder;
import markszhouc.spam.encoding.ByteEncoder;
import markszhouc.spam.encoding.EmailController;
import markszhouc.spam.gui.GUIWindow;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        EmailController.initByteData();
        GUIWindow.launchGUI("Spymail");
        /*int[] byteData = new int[] {
                rgb(80,0,1),
                rgb(80,1,1),
                rgb(80,0,0),
                rgb(80,1,0),
                rgb(81,0,1),
                rgb(81,1,1),
                rgb(81,0,0),
                rgb(81,1,0),
                rgb(80,0,2),
                rgb(81,1,2),
                rgb(81,0,2),
                rgb(80,1,2),
                rgb(80,2,1),
                rgb( 81,2,0),
                rgb( 80,2,0),
                rgb(81,2,1),
                rgb(82,0,1)
        };


        String fileMessageIn = "D:\\Mark\\Testing\\SampleDataFiles\\data.zip";
        String initLogoIn = "D:\\Mark\\Testing\\SampleDataFiles\\tamu_logo1.png";
        String logoOut = "D:\\Mark\\Testing\\SampleDataFiles\\readable.png";
        EmailController.readInColorData("D:\\Mark\\Testing\\SampleDataFiles\\sampleColorData-TAMU.txt");
        String messageOutFolder = "D:\\Mark\\Testing";

        // output image
        Image img = ByteEncoder.encodeFile(initLogoIn, fileMessageIn, EmailController.byteData);
//        Image img = ByteEncoder.encodeFakeFile(initLogoIn, byteData);
        File outputImage = new File(logoOut);
        try {
            ImageIO.write(SwingFXUtils.fromFXImage(img, null), "png", outputImage);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // read image
 //       ByteDecoder.decode(logoOut, messageOutFolder, byteData);*/
    }

    private static int rgb(int r, int g, int b) {
        return (r << 16) + (g << 8) + b;
    }

}
