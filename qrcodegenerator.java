package QR;

import net.glxn.qrgen.QRCode;
import net.glxn.qrgen.image.ImageType;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.net.URL;

public class qrcodegenerator  {

    public static void main(String[] args) throws Exception {
        String source = "https://www.instagram.com/aniket__sharma45/";
        URL myurl = new URL("https://www.google.com/");
        ByteArrayOutputStream out = QRCode.from(source).to(ImageType.JPG).stream();
        File file = new File("C:\\Users\\aniru\\OneDrive\\Pictures\\qrcodes\\qr.jpeg");
        FileOutputStream fout = new FileOutputStream(file);
        fout.write(out.toByteArray());
        fout.flush();
    }


}
