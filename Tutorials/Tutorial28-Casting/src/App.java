public class App {

	public static void main(String[] args) {

		byte byteValue = 20;
		short shortValue = 55;
		int intValue = 885;
		long longValue = 23345;

		float floatValue = 8834.5f;
		float floatValue2 = (float)99.3;

		double doubleValue = 32.4;
		System.out.println(Byte.MAX_VALUE);
		
		intValue = (int)longValue;
		System.out.println(intValue);
		
		doubleValue = intValue;
		
		System.out.println(doubleValue);
		
		intValue = (int)floatValue;
		
		System.out.println(intValue);
		
		//The following wont work as we expect it to!
		//128 is too bug for a byte.
		
		byteValue=(byte)128;
		System.out.println(byteValue);
		
	
		
		
	}
}
