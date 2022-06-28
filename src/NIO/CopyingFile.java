package NIO;

import java.io.IOException;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;
import static java.nio.file.StandardCopyOption.COPY_ATTRIBUTES;
public class CopyingFile {

    public static void main(String[] args) throws IOException {
        Path source = Paths.get("C:\\NIO\\input2.txt");
        Path Target = Paths.get("C:\\NIO\\Java\\input.txt");
        Files.copy(source,Target);
    }
}
