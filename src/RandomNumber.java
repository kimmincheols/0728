
public class RandomNumber {
		public static void main(String[] args) {
		int rand = (int)(Math.random() *10+1);
	
	switch(rand) {

	case 1 :
		System.out.println("Bananas");
	    break;
	case 2 :
		System.out.println("Oranges");
	    break;
	case 3 :
		System.out.println("peach");
	case 4  :
		System.out.println("Apples");
	case 5  :
		System.out.println("Plums");
    	break;
	case 6  :
		System.out.println("Pineapples");
    	break;
	case 7  :
		System.out.println("igbore this case");
		break;
	default :
		System.out.println("Nuts");
	}
	System.out.println("Rand = " +rand);
		
		}
}
