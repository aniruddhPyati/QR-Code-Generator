package QR;

import net.glxn.qrgen.QRCode;
import net.glxn.qrgen.image.ImageType;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.net.URL;

public class qrcodegenerator  {

    public static void main(String[] args) throws Exception {
        String source = "     ";  //custom text or url to be provided by user within " " 
        ByteArrayOutputStream out = QRCode.from(source).to(ImageType.JPG).stream();
        File file = new File("  ");// provide path to destination file where generated qr code will be stored 
        FileOutputStream fout = new FileOutputStream(file);
        fout.write(out.toByteArray());
        fout.flush();
    }


}
