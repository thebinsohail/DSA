package core;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileType {

    public static void main(String[] args) {

        try {

            List<String> files=findFiles(Paths.get("C:\\Users\\anasb\\OneDrive\\Pictures\\nfts\\"),"png");
            files.forEach(f-> System.out.println(f));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static List<String> findFiles(Path path, String extension) throws IOException {
        if (!Files.isDirectory(path)) {
            throw new IllegalArgumentException("Path must be a directory!");
        }

        List<String> result;

        try(Stream<Path> walk=Files.walk(path)){

            result=walk
                    .filter(p->!Files.isDirectory(p))
                    .map(p -> p.toString().toLowerCase())
                    .filter(f -> f.endsWith(extension))
                    .collect(Collectors.toList());



        }
        return result;
    }

}
