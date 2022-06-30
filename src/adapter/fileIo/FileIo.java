package adapter.fileIo;

import java.io.IOException;

public interface FileIo {
    void readFromFile(String fileName) throws IOException;
    void writeToFile(String fileName) throws IOException;
    void setValue(String key, String value);
    String getValue(String key);
}
