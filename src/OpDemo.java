import java.util.Scanner;
import java.util.GregorianCalendar;

public class OpDemo {
public static void main(String[] args) {
		//나머지 연산자
//		System.out.println(5 / 2);
//		System.out.println(5 % 2);
		
//	shift operator
//	System.out.println(256 << 4);
//	System.out.println(-265 >>> 4);
//	System.out.println(true && true);
//	System.out.println(true&true);
//	System.out.println(true && false);
//	System.out.println(true&false);
	
//	int a = 5;		 int b = 10;		 int x = 15;
//	if( a > x && ++b < x) {									//	&를 하나쓰면 뒤에 ++을 하지 않는다 앞이 이미 틀렸으니 뒤를 할 필요가 없으므로
//		System.out.println("참");
//	}else {
//		System.out.println("거짓");
//		}
//	
//System.out.println("b =" +b);
//int a = 5;		 int b = 10;		 int x = 15;
//if( a < x || ++b < x) {									//	|를 하나쓰면 뒤에 ++을 하지 않는다 앞이 이미 틀렸으니 뒤를 할 필요가 없으므로
//	System.out.println("참");
//}else {
//	System.out.println("거짓");
//}
//
//System.out.println("b =" +b);
//	if(4>5) {
//		System.out.println("참");
//	}else {
//		System.out.println("거짓");
//	}
	
//	System.out.println(	( 4 > 5 ) ? "참" : "거짓" 	);
	
//		Scanner sc = new Scanner(System.in);
//		System.out.println("년도 하나를 입력하세요 : ");
//		int year = sc.nextInt();
		
//		if(su % 2 == 0) System.out.println(" 짝수이군요. ");
//		if(su % 2 == 1) System.out.println(" 홀수이군요. ");

//		System.out.println(    (su % 2 == 0) ? "짝수 이군요" : "홀수 이군요.");
//		if( (year % 400 == 0) || (year % 4 ==0 && year % 100 != 0)) {
//			System.out.println("입력한 " + year + "은 윤년입니다.");
//		}else {
//			System.out.println("입력한 " + year + "은 윤년이 아닙니다.");
//		}
//		System.out.print("당신이 입력하신" + year + "는");
//		System.out.println((year % 400==0 ) || (year % 4 ==0 && year % 100 !=0 ) ? "윤년입니다.  " : "윤년이 아닙니다.");	
		
//		GregorianCalendar gc = new GregorianCalendar();
//		boolean flag = gc.isLeapYear(year);
//		System.out.println("당신이 입력한" + year + "년은 " + ((flag) ? "윤년 입니다." : "윤년이 아닙니다."));
		
		//할당 연산자
//		int age = 26;
//		age++;							//age = age +1
//		age = age + 5;
//		// 복합연산자
//		age += 5;
//		
//		int a=5, int b= 10, int x=5;
	
		
		double year = (true) ? 2022 : 3.14;
			
	}
}
