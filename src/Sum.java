import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		String[] str = null;
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("**********************************************");
		System.out.println("(1) - Toplama İşlemi");
		System.out.println("(2) - Çıkarma İşlemi");
		System.out.println("(3) - Çarpma İşlemi");
		System.out.println("(4) - Bölme İşlemi");
		System.out.println("**********************************************");
		System.out.println("Bir İşlem Seçiniz Sayı olarak ?");
		int menuValue = scanner.nextInt();
		
		if(menuValue > 4) {
			System.out.println(System.lineSeparator().repeat(100));
			System.out.println("Hatalı İşlem!!!");
			main(str);//progamı baştan başlatıyor
			
		}else {

			System.out.print("Birinci Sayı : ");
			
			int firstValue = scanner.nextInt();
			
			
			System.out.print("İkinci Sayı : ");
			
			int secondValue = scanner.nextInt();
			
			if(menuValue == 1) {
				
				int mySumValue = firstValue + secondValue;
				System.out.println("Sonuç : "+mySumValue);
				
			}else if(menuValue == 2) {
				
				int mySumValue = firstValue - secondValue;
				System.out.println("Sonuç : "+mySumValue);
				
			}else if(menuValue == 3) {
				
				int mySumValue = firstValue * secondValue;
				System.out.println("Sonuç : "+mySumValue);
				
			}
			else if(menuValue == 4) {
				
				int mySumValue = firstValue / secondValue;
				System.out.println("Sonuç : "+mySumValue);
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}
	
	
	

}
