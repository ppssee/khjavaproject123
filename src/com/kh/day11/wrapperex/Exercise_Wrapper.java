package com.kh.day11.wrapperex;

public class Exercise_Wrapper {
//	public static void main(String[] args) {
//		
//	}
	
	public void paserExample() {
		String strNum = "221123";
		String strNum2 = "230502";
		// 두 값을 계산해서 출력하시오
		// 결과 : 
		
		int num2 = Integer.parseInt(strNum2);
		int num = Integer.parseInt(strNum);
		
		System.out.println(num2 - num);
	}

	public void dataParsingExample() {
		String strData = "221213";
		String strData2 = "23.502";
		String strData3 = "SPRING";
		// 1. strData를 byte, short, int, long으로 변환
		// 2. strData2를 float, double로 변환
		// 3. strData3을 char로 변환하시오
		
		byte byteData = Byte.parseByte(strData);
		short shortData = Short.parseShort(strData);
		int intData = Integer.parseInt(strData);
		
		float floatData2 = Float.parseFloat(strData2);
		double doubleData2 = Double.parseDouble(strData2);
		
		char[] charData3 = new char[strData.length()];
		for(int i=0; i<strData.length(); i++) {
			charData3[i] = strData3.charAt(i);
		}

		
	}
	
}
