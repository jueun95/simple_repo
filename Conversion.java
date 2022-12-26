package 시작;

public class Conversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//작은범위의 변수 -> 큰 범위의 변수
		byte byteValue = 10;
		int intValue = byteValue;
		System.out.println("intValue : " + intValue);
		
		//char -> int
		char charValue = 'A';
		intValue = charValue;
		System.out.println("가 : " + intValue);
		
		//byte -> char(65535)
		//char타입은 음수를 허용하지 않는데
		//byte타입에는 음수가 허용 가능하기 때문에 자동형변환 불가능
		//byteValue = 65;
		//charValue = byteValue;
		
		//int -> long
		intValue = 50;
		long longValue = intValue;
		System.out.println("longValue : " + longValue);
		
		
		//long -> float (8byte long 보다 4byte float의 표현 범위가 더 넓음)
		longValue = 100;
		float floatValue = longValue;
		System.out.println("floatValue : " + floatValue);
		
		//float -> double
		 floatValue = 100.5f;
		 double doubleValue = floatValue;
		 System.out.println("doubleValue : " + doubleValue);
		
	}//main  
	
}
