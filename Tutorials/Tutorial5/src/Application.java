
public class Application {

	public static void main(String[] args) {
		
		for(int i=0;i<5; i++){
			for(int j=0;j<i; j++){
				for(int k=0;k<j; k++){
					System.out.printf("*\n");	
				}
				System.out.printf("*");	
			}	
			System.out.printf("*");
			
		}		
	}
}
