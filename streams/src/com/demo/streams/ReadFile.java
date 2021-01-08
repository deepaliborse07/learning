package com.demo.streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class ReadFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Path filepath= Paths.get("C:\\Users\\Systems","sample.txt");
		
		try(Stream<String> lines=Files.lines(filepath)) 
		{
			lines.forEach(System.out::println);
		}
		catch(IOException e) {
			e.printStackTrace();
		}

	}

}
