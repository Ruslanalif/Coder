package com.xsis.roeslan.javacoder.errorHandling;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MyClass {

	public void index(){
		System.out.println("Masukkan");
		String[] data = new String[3];
		data[0] = "Hallo";
		data[1]	= "World";
		data[2]	= "xsis";
		try{
			data[3]	= "xsis";
			data[4]	= "xsis";
		}catch(Exception e){
			e.printStackTrace();
		}
		System.out.println(Arrays.toString(data));
	}
	public void index2(){
		String name = null;
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String data[] = new String[1];
		try{
			name = br.readLine();
			int angka = Integer.parseInt(name);
			data[0]= "hallo";
			data[1]= "hallo2";
		}catch(NumberFormatException e){
			System.err.println("Error " + e.getMessage());
		}catch(IndexOutOfBoundsException e){
			System.err.println("Error di Index Array" );
		}catch(Exception e){
			e.printStackTrace();
		}
		System.out.println("Name " + name);
	}
	public static void main(String[] args) {
		MyClass s = new MyClass();
		System.out.println("ASas");
		s.index2();
	}
}
