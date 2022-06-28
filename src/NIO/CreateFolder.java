package NIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CreateFolder  {
    public static void main(String[] args) throws IOException {
        Path run = Paths.get("C:\\NIO\\Java");
        Files.createDirectory(run);
    }
}
