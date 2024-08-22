package p2024_07_05;

public class ParkJongChan3 {
    public static void main(String[] args) {

    	for (int dan=2; dan<=9; dan++) {
            System.out.print("["+dan+"단]\t");
        }
        System.out.println();

        for (int i=1; i<=9; i++) {
            for (int dan=2; dan<= 9; dan++) {
                System.out.print(dan+"*"+i+"="+dan*i+"\t");
            }
            System.out.println();
        }
    }
}
