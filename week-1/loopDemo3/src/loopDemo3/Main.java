package loopDemo3;
//Do While
public class Main {

	public static void main(String[] args) {
		//While döngüsünden farklı olarak şart sağlanmasa bile ilk adımı yazdırır.
		int i = 100;
		
		do {
			System.out.println(i);
			 i+=2;
		} while(i<10);
		System.out.println("Do-While Döngüsü Bitti");
		
	}

}
