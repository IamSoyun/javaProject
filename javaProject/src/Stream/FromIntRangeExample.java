package Stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FromIntRangeExample {
	public static void main(String[] args) {
		
		IntStream is = IntStream.rangeClosed(15, 35);
		System.out.println(is.sum());
		
		Path path = Paths.get("list.txt");
		try {
			Stream<String> stream = Files.lines(path);
			stream.forEach(file -> System.out.println(file));
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		try {
			Stream<Path> stream = Files.list(Paths.get("c:/Program Files"));
			stream.forEach(f -> System.out.println(f.getFileName()) );
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
