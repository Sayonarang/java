# java
학교 자바 실습 
package test;

 

public class ParseTest {

 

	public static void main(String[] args) {

		//문자열 => 기본타입변환(byte1,short2,int4,long8,float4,double8,boolean)

		String str1 = "10";

		byte value = Byte.parseByte(str1);//문자열 -> byte 

		short value0 = Short.parseShort(str1); //문자열 -> short

		int value1 = Integer.parseInt(str1);//문자열 - > int

		int intVal = value1 + 10;

		String str2 = "4000000000"; 

		long value2 = Long.parseLong(str2);//문자열 -> long 

		float value3 = Float.parseFloat(str2);//문자열 -> float

		double value4 = Double.parseDouble(str2);

		String str3 = "true"; 

		boolean value5 = Boolean.parseBoolean(str3); 

		System.out.println(value5);

 

		String str4 = "류승민";

		int value6 = Integer.parseInt(str4);

		System.out.println(str4);

		

		// 기본타입 = > 문자열 String.valueof()

		
