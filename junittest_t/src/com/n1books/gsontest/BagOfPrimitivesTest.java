package com.n1books.gsontest;

import org.junit.Test;

import com.google.gson.Gson;

class BagOfPrimitives {
	private int value1 = 1;
	private String value2 = "abc";
	private transient int value3 = 3;
	@Override
	public String toString() {
		return "BagOfPrimitives [value1=" + value1 + ", value2=" + value2 + ", value3=" + value3 + "]";
	}
}

public class BagOfPrimitivesTest {
	@Test
	public void bop() {
		BagOfPrimitives obj = new BagOfPrimitives();
		Gson gson = new Gson();
		String json = gson.toJson(obj);  
		System.out.println(json);
		
		String json2 = "{\"value1\":100,\"value2\":\"200\",\"value3\":\"300\"}";
		BagOfPrimitives obj2 = gson.fromJson(json2, BagOfPrimitives.class);
		System.out.println(obj2);
	}
}
