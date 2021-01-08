package com.demo.scene2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class TestMulti {

	private static final String regex=",";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Path folderPath=Paths.get("C:\\Users\\Systems\\streamdata");
		
		try(Stream<Path> pathstream=Files.walk(folderPath)){
			pathstream.forEach(filepath->System.out.println(filepath.getFileName()));
			
			Map<String, List<Person>> map=pathstream.map(lines->
			System.out.println();)
			
		}
		catch(IOException e) {
			System.out.println("exception occured while processing"
					+e.getMessage());
			
		}

	}

}
