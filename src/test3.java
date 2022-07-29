import java.util.Scanner;

public class test3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Client jimin= new Client();
		
		System.out.print("당신의 이름을 입력해 주세요. : ");
		jimin.name = sc.nextLine();
		
		System.out.print("당신의 나이를 입력해 주세요. : ");
		jimin.age = sc.nextInt();
		
		//System.out.print("당신의 성별를 입력해 주세요. : (남성 :m / 여성 f)");
		//jimin.gender = gender.charAt(0);
		
		System.out.print("당신의 키를 입력해 주세요. : ");
		jimin.high = sc.nextDouble();
		
		System.out.print("당신의 몸무게를 입력해 주세요. : ");
		jimin.weight = sc.nextDouble();
		
		double bmi = jimin.weight / ((jimin.high * 0.01)*(jimin.high*0.01));
		jimin.bmi = bmi;
	
		if (bmi>=35) jimin.result = "고도비만";
		else if(bmi >=30 && bmi < 35)jimin.result = "중도비만(2단계)";
		else if(bmi >=25 && bmi < 30)jimin.result = "경도비만 (1단계)";
		else if(bmi >=23 && bmi < 25)jimin.result = "과체중";
		else if(bmi >=18.5 && bmi<23)jimin.result = "정상";
		else jimin.result="저체중";
		
		System.out.println("이름" + jimin.name);
		System.out.println("나이" + jimin.age);
		System.out.println("신장" + jimin.high);
		System.out.println("체중" + jimin.weight);
		System.out.println("Bmi지수" + jimin.result);
		System.out.println("Bmi지수" + jimin.bmi);
		
	}
}
