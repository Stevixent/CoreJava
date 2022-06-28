package NIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;

public class MovingFile {
    public static void main(String[] args) throws IOException {
        Path source = Paths.get("C:\\NIO\\input.txt");
        Path Target = Paths.get("C:\\Java\\input3.txt");
        Files.move(source,Target);


    }
}
