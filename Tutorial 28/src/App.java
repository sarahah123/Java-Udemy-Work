public class App {
	public static void main(String[] args) {

		byte byteValue = 20;
		short shortValue = 55;
		long longValue = 23355;
		int intValue = 888;

		float floatValue = 8834.8f;
		float floatValue2 = (float) 99.3;
		double doubleValue = 32.4;

		System.out.println(Byte.MAX_VALUE);

		intValue = (int) longValue;

		System.out.println(intValue);

		doubleValue = intValue;
		System.out.println(doubleValue);

		intValue = (int) floatValue;
		System.out.println(intValue);

		// The following won't work, will return lowest value byte can offer as
		// 128 is too big
		byteValue = (byte) 128;
		System.out.println(byteValue);
	}
}