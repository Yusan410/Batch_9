package day23_javaReview;

public class AutoBoxig {
	public static void main(String[] args) {
		
		// convert prmitive to object
		int a = 10;
		
		Integer obja = a;
		
		double d = obja.doubleValue();
		
		byte valueb = obja.byteValue();
		
		float f = obja.floatValue();
		System.out.println(a);
		System.out.println(obja);
		System.out.println(valueb);
		System.out.println(f);
		
		String str = "true";
		
		boolean condition = Boolean.parseBoolean(str);
		
		
		if ( condition ) {
			
	
		}
		
		String value = "80";
		
		int valueInt = Integer.parseInt(value);
		
		int aa = Integer.parseInt(value);
		
		double bb = Double.parseDouble(value);
		
		float ff = Float.parseFloat(value);
		
		byte cc= Byte.parseByte(value);
		
		
		System.out.println(bb);
		
		
		
		
		
		
	}

}
