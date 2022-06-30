package adapter.fileIo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        FileIo fileIo = new FileIOProperties();

        try {
            fileIo.readFromFile("/src/adapter/fileIo/file.txt");
            fileIo.setValue("width", "1024");
            fileIo.setValue("height", "512");
            fileIo.setValue("depth", "32");
            fileIo.writeToFile("/src/adapter/fileIo/newfile.txt");
            System.out.println("newfile.txt is created");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
