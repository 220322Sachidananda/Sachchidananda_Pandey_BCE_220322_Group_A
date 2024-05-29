public class MyClassOne 
{
	 String name = "John";
	 String address = "Kathmandu";
	 int phone = 123;

	public static void main(String[] args) 
    {
		MyClassOne Obj = new MyClassOne();
		Obj.address = "Lalitpur ";
	
		
		System.out.println("Name: " + Obj.name + "\n" + "Address: " + Obj.address + "\n" + "Phone: " + Obj.phone);
	}
}