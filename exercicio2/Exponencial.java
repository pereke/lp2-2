public class Exponencial{
		
	public static void main (String [] Args){
		System.out.println (" #       Q       C  ");
		System.out.println (" ");
		for (int i = 0; i <= 10; i++){
			int q = i * i; 
			int c = i * i * i;
			System.out.printf(" %d\t %d\t %d\n", i, q, c);
		}
	}	
}
