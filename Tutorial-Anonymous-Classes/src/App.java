
public class App {
	 
	public static void main(String[] args) {
		 
		Machine machine1 = new Machine(){

			@Override
			public void start() {
				System.out.println("Starting machine from inner class ...");
			}
			
			
		};
		
		machine1.start();
		
		//Plant plant1 = new Plant();  // to nie zadzia�a
		
		Plant plant1 = new Plant(){

			@Override
			public void grow() {
				System.out.println("Plant growing ...");
			} 
		};
		
		plant1.grow();
 
	}
	
 
}

 