
public class WhileLoops {

	public static void main(String[] args) {
		
		int fatih = 20;
		int elif = 50;
		
		while(fatih< elif) {
			fatih++;
			System.out.println(fatih);
			
			if(fatih == 30) {
				System.out.println("Fatihin yaşı 30");
				break;
				
			}else {
				
				continue;
			
			}
				
				
		
			
		}
		
		System.out.println("yaşlar eşit");
		
		
		System.out.println("Fatihin Yaşı "+fatih);
		System.out.println("Elifin Yaşı "+elif);
		
		
	   
	  }

}
