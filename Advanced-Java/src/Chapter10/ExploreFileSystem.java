package Chapter10;

import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;

public class ExploreFileSystem {
    public static void main(String[] args) {
        FileSystem fs = FileSystems.getDefault();
        Path path = fs.getPath("C:\\Users\\Tumelo Maphalla\\Downloads\\Java Adavanced B v5.pdf");
        System.out.println("File name: " + path.getFileName());
        System.out.println("Root: " + path.getRoot());
        System.out.println("Parent: " + path.getParent());
        System.out.println("Name Count: " + path.getNameCount());
        System.out.println("FS: " + path.getFileSystem());

        System.out.println("=================================");
        System.out.println(path.toAbsolutePath());
    }
}
