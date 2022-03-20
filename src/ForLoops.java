
public class ForLoops {

	public static void main(String[] args) {
		
		
		
		//for
		
		/*
		for(int değer; koşul; artırma veya eksiltme işletme){
		  
			//Koşul
		
		} 
		*/
		 
	
		
		for(int i = 0; i<20; i++){
			
			for(int j =0; j<i; j++) {
				System.out.print("elif \t");// ters slaş boşluk bırakıyor
			}
			
			System.out.print("\n");//alt satıra geçiş yapıyor
		}
		
		
		
						//10
		for(int i = 10; i<20; i++) {
			

			if(i == 16 || i == 17) {
				break;
			}else {
				System.out.println("İ eşittir = "+i);
			}
			
			
		}
		System.out.println("For loop stopped");
		
		
		

	}

}
