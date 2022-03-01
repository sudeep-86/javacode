package corejava;

public class finallyBlockDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=4;
		int b=7;
		int c=0;
		
		try {
	//		 int k=b/c;
			 int[] j = new int[5];
						
			//				System.out.println(k);
							System.out.println(j[9]);
						
				}
		catch(ArithmeticException ae) {
			System.out.println("i catched the Arithmetic exception/error");
		}
		catch(IndexOutOfBoundsException ets) {
			System.out.println("i catched the Index out of Bounds exception/error");
			
		}
				catch(Exception e) {
					System.out.println("i catched the exception/error");
				}
	
		


	}
	
	
		
	


}
