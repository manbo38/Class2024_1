package p2024_07_09;

class FieldInitValue {
//	필드
	byte byteField;			// 0으로 초기화
	short shortField;
	int intField;
	long longField;
	
	boolean booleanField;	// false로 초기화
	char charField;			// 공백으로 초기화
	
	float floatField;		// 0.0으로 초기화
	double doubleField;
	
	int[] arrField;			// null로 초기화
	String referenceField;	// null로 초기화, null : 참조할 주소가 없다는 의미
}

public class FieldInitValueExample {
	
	public static void main(String[] args) {

		FieldInitValue f = new FieldInitValue();
		
		System.out.println("byteField:" + f.byteField);
		System.out.println("shortField:" + f.shortField);
		System.out.println("intField:" + f.intField);
		System.out.println("longField:" + f.longField);
		
		System.out.println("floatField:" + f.floatField);
		System.out.println("doubleField:" + f.doubleField);
		
		System.out.println("charField:" + f.charField);
		System.out.println("booleanField:" + f.booleanField);
		
		System.out.println("arrField:" + f.arrField);
		System.out.println("referenceField:" + f.referenceField);
	}

}
