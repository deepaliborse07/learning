package com.demo.streams;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Stream;

public class FileWordCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long wordcount=0;
		Path textfilepath=Paths.get("C:\\Users\\Systems\\wordcount.txt");
		
		try{
			Stream<String> fileLines=Files.lines(textfilepath,Charset.defaultCharset());
			wordcount=fileLines.flatMap(line->Arrays.stream(line.split(" "))).count();
		}catch(IOException ioexception) {
			ioexception.printStackTrace();
		}
		System.out.println("Number of words in sample"+ wordcount);
		//System.out.println("Number of words in WordCount.txt: "+ wordcount);

	}

}
