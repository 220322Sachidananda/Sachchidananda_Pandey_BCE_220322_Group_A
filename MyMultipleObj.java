public class MyMultipleObj 
{
    int x = 100;

	public static void main(String[] args)
     {
		MyMultipleObj myObjectOne = new MyMultipleObj();
		int x1 = myObjectOne.x;
		
		MyMultipleObj myObjectTwo = new MyMultipleObj();
		myObjectTwo.x = 111;
		int x2 = myObjectTwo.x;
		
		
		System.out.println("initial variable: " + x1);
		System.out.println("second variable: " + x2);
   
    }
}
