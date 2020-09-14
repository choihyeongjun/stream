package streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

import javafx.scene.shape.Path;

public class FromDirectoryExample {
	public static void main(String[] args) {
		Path path=(Path) Paths.get("c:/program files");
		try {
			Stream<Path> stream=Files.list(path);
			stream.forEach(t->System.out.println(t.getf));
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
