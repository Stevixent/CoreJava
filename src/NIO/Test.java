package NIO;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;


public class Test implements FileVisitor <Path> {

    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
        System.out.println("About to visit: " + dir);
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        System.out.println("Currently visiting: " + file);
        System.out.println("In this file: " + Files.isDirectory(file));
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
        System.out.println(exc.getMessage());
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
        System.out.println("Just visited: " + dir);
        return FileVisitResult.CONTINUE;
    }
    public static void main(String[] args) throws IOException {
        //Get file Path
//        Path run = Paths.get("C:\\NIO\\input.txt");
//        System.out.println(run.getFileName());
//        System.out.println(run.getParent());
//        System.out.println(run.getFileSystem());
//        System.out.println(run.getRoot());
//        System.out.println(run.getNameCount());
//        System.out.println(run.getName(0));

        Path path = Paths.get("C:\\NIO\\input.txt");
        path = Paths.get("C://NIO");

        Test test = new Test();
        Files.walkFileTree(path, test);

    }

}
