public class TestStatic 
{
    public static void main(String[] args) {

		
		TestStatic.myStaticMethod();
		TestStatic.allFreeMethod();

	}

	private static void allFreeMethod() {
		System.out.println("i am another method");
	}

	private static void myStaticMethod() {
		System.out.println("I am static method");

	}

}
