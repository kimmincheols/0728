
public class test1 {
	public static void main(String[] args) {
		
		int count = 0;
		int line = 1;
		for(char i = 65; i <= 90; i++) {
			if(line %2 ==0)
				System.out.print((char)(i+32) + "\t");
			else
				System.out.print(i + "\t");
			count++;
			if (count % 5 ==0) {
			System.out.println();
				line++;
			}
			
		}
	}
}
