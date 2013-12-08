package test_02;

import java.io.IOException;

public class Test02 {
	public static void deal_string(MyString input_str){
		input_str.the_str = input_str.the_str.toUpperCase();
		//System.out.println(input_str);
	}
	
	public static void main(String args[]) throws IOException{
		MyString temp_str = new MyString("aaa");
		System.out.println(temp_str);
		deal_string(temp_str);
		System.out.println(temp_str);
		//input_char = (char) System.in.read();
		//System.out.println(input_char);
		System.out.println("HelloWorld");
	}
}
