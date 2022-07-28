
public class 성적관리프로그램 {
	public static void main(String[] args) {
		Student jimin = new Student();
		
		jimin.hakbun = "2022001";
		jimin.name = "콩지민";
		jimin.kor = 100;
		jimin.eng = 89;
		jimin.mat = 78;
		
		jimin.tot = jimin.kor + jimin.eng + jimin.mat;
		jimin.avg = jimin.tot/3.;
		
		jimin.grade = (jimin.avg >= 90 && jimin.avg <=100) ? 'A' :
								(jimin.avg >= 80 ) ? 'B' :
									(jimin.avg >= 70 ) ? 'C' :
										(jimin.avg >= 60 ) ? 'D' : 'F';
	
	
				if(jimin.avg > 90 && jimin.avg <= 100) {
					jimin.grade = 'A';
				}else if (jimin.avg>=80) {
					jimin.grade = 'B';
				}else if (jimin.avg>=70) {
					jimin.grade = 'C';
				}else if (jimin.avg>=60) {
					jimin.grade = 'D';
				}else
					jimin.grade = 'F';
							
	
				switch( (int)(jimin.avg /10)) {
				case 5:
					jimin.grade = 'F';
					break;
				case 6:
					jimin.grade = 'D';
					break;
				case 7:
					jimin.grade = 'C';
					break;
				case 8:
					jimin.grade = 'B';
					break;
				case 9:
															//이것은 생략 가능 밑의
				case 10:
					jimin.grade = 'A';				// 여기서 A학점을 받아주기 때문.
				default :
					System.out.println("F");
				}
	}
}
