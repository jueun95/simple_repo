package ����;

public class Conversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���������� ���� -> ū ������ ����
		byte byteValue = 10;
		int intValue = byteValue;
		System.out.println("intValue : " + intValue);
		
		//char -> int
		char charValue = 'A';
		intValue = charValue;
		System.out.println("�� : " + intValue);
		
		//byte -> char(65535)
		//charŸ���� ������ ������� �ʴµ�
		//byteŸ�Կ��� ������ ��� �����ϱ� ������ �ڵ�����ȯ �Ұ���
		//byteValue = 65;
		//charValue = byteValue;
		
		//int -> long
		intValue = 50;
		long longValue = intValue;
		System.out.println("longValue : " + longValue);
		
		
		//long -> float (8byte long ���� 4byte float�� ǥ�� ������ �� ����)
		longValue = 100;
		float floatValue = longValue;
		System.out.println("floatValue : " + floatValue);
		
		//float -> double
		 floatValue = 100.5f;
		 double doubleValue = floatValue;
		 System.out.println("doubleValue : " + doubleValue);
		
	}//main  
	
}
