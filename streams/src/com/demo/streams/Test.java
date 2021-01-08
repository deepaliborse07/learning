package com.demo.streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
	
	private static final String regex=",";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Path path=Paths.get("C:\\Users\\Systems\\sample.txt");
		
		try(Stream<String> lines=Files.lines(path);){
			
			List<Person> personlistbyage=lines.map(line->{
				String[] personArr=line.split(regex);
				Person p=new Person(personArr[0],personArr[1],Integer.valueOf(personArr[2]));
				return p;
			}).filter(person->person.getAge()>20)
					.collect(Collectors.toList());
			
			personlistbyage.forEach(System.out::println);
		}
		catch(IOException e) {
			//e.printStackTrace();
			System.out.println("exception occured while processing"
					+e.getMessage());
		}

	}

}
