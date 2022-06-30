package adapter.fileIo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class FileIOProperties implements FileIo {
    Properties settings = new Properties();

    @Override
    public void readFromFile(String fileName) throws IOException {
        settings.load(new FileReader(System.getProperty("user.dir") + fileName));
    }

    @Override
    public void writeToFile(String fileName) throws IOException {
        settings.store(new FileOutputStream(System.getProperty("user.dir") + fileName), "witten by FileProperties");
    }

    @Override
    public void setValue(String key, String value) {
        settings.setProperty(key, value);
    }

    @Override
    public String getValue(String key) {
        return settings.getProperty(key);
    }
}
