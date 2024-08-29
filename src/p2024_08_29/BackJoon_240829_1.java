package p2024_08_29;

import java.util.Scanner;

public class BackJoon_240829_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int count = 0;
		
		
		for(int i=0; i<a; i++) {
			String s = sc.next();
			if(isGroupWord(s)) {
				count++;
			}
		}

        System.out.println(count);
    }

    public static boolean isGroupWord(String word) {
        boolean[] visited = new boolean[26];
        char prevChar = '\0';

        for (int i = 0; i < word.length(); i++) {
            char currentChar = word.charAt(i);
            
            if (currentChar != prevChar) {
                if (visited[currentChar - 'a']) {
                    return false;
                }
                visited[currentChar - 'a'] = true;
            }

            prevChar = currentChar;
        }
        return true;
    }
}
