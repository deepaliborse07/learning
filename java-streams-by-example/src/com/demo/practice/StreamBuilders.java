package com.demo.practice;

import java.util.stream.Stream;

public class StreamBuilders {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stream<Integer> stream=Stream.of(1,2,3,4,5,6,7,8);
		stream.forEach(p->System.out.println(p));

	}

}
