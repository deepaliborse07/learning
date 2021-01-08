package com.demo.scene2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.demo.streams.Person;

public class TestMultiple {
	
	private static final String regex=",";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Path path=Paths.get("C:\\Users\\Systems\\streamdata");
		
		Path folderPath=Paths.get("C:\\Users\\Systems\\streamdata");
		
		try(Stream<Path> pathstream=Files.walk(folderPath)){
			pathstream.forEach(filepath->System.out.println(filepath.getFileName()));
			
			List<Person1> personlist= pathstream.map(line->{
				String[] personArr=line.split(regex);
				Person1 p=new Person1(personArr[0],personArr[1],Integer.valueOf(personArr[2]),personArr[3]);
				return p;
			})
					
		
			
			personlist.forEach(System.out::println);
			
			Map<String, List<Person1>> map=personlist.stream().collect(Collectors.groupingBy(Person1::getGender));
			
			map.forEach((gender,xyz)->System.out.println("Gender:"+gender+"---->"+xyz));
			
			
					
					
					
					
		}
			
		
	//try(Stream<String> lines =Files.walk(path);){
		
//	 List<Person1> personlist=(List<Person1>) lines.map(line->{
//				String[] personArr=line.split(regex);
//				Person1 p=new Person1(personArr[0],personArr[1],Integer.valueOf(personArr[2]),personArr[3]);
//			return p;
//		});
//
//		Map<String,List<Person1>> map=personlist.stream().collect(Collectors.groupingBy(Person1::getGender));
//		
//		map.forEach((gender,xyz)->System.out.println("Gender:"+gender+"---->"+xyz));
		
		
		catch(IOException e) {
			System.out.println("exception occured while processing"
					+e.getMessage());
			
		}

	}

}
