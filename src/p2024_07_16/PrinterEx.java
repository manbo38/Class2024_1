package p2024_07_16;

class Printer {
		
	static void println(int Value) {
		System.out.println(Value);
	}
	
	static void println(boolean Value) {
		System.out.println(Value);
	}
		
	static void println(double Value) {
		System.out.println(Value);
	}
	
	static void println(String Value) {
		System.out.println(Value);
	}
}

public class PrinterEx {

	public static void main(String[] args) {
		Printer printer = new Printer();
		printer.println(10);
		printer.println(true);
		printer.println(5.7);
		printer.println("홍길동");
	}

}
