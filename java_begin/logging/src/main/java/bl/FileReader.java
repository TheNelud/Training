package bl;

import org.apache.log4j.Logger;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileReader implements Reader{

    final static Logger logger = Logger.getLogger(java.io.FileReader.class);

    @Override
    public String read() {
        String message = "";
        try{
            URI url = ClassLoader.getSystemResource("message.txt").toURI();
            logger.info("File URI have been gotten");

            byte[] fileBytes = Files.readAllBytes(Paths.get(url));
            logger.info("Byte array from file have been gotton");

            message = new String(fileBytes);
            logger.info("Messege from file have been gotton");
        }catch (URISyntaxException | NullPointerException | IOException e){
            logger.error(e);
        }
        return message;
    }
}
