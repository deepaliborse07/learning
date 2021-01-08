package com.demo.streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Stream;

public class java8StreamExtractDistinctWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		Stream<String> lines =Files.lines(Paths.get("C:\\Users\\Systems\\demo.txt")).
				map(line->line.split("[\\s]+"))
				.flatMap(Arrays::stream).distinct();
		
		lines.forEach(System.out::println);
		lines.close();
		
		}
		catch(IOException e) {
			e.printStackTrace();
		}

	}

}
