package Assignment;
import java.util.Scanner;
public class Panagram {
	
	public static void panagram(char[] str) {
		int count = 0;
		for(int i=97;i<=122;i++) {
			for(char j:str) {
				if(i==j) {
					count++;
					break;
				}
			}
		}
		
		if(count == 26) {
			System.out.println("panagram");
		}
		else {
			System.out.println("Not panagram");
		}
	}
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a sentence");
		String str = scan.nextLine().toLowerCase();
		scan.close();
		char[] sentence = str.toCharArray();
		panagram(sentence);

	}

}
