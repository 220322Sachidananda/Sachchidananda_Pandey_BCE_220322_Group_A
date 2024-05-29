public class MyStudent {
	private String name = "Zake";
	private String address = "Kathmandu";
	private String phone = "123456789";

	public static void main(String[] args) {
		MyStudent Obj = new MyStudent();
		String myName = Obj.name;
		String myAddress = Obj.address;
		String myPhone = Obj.phone;

		System.out.println("Initial values:");
		System.out.println("Name:"+myName + "\n"+"Address:" +  myAddress + "\n"+"Phone" +  myPhone);

		Obj.name = " Sachin";
		Obj.address = " Kathmandu";
		Obj.phone = "9828807782";
		System.out.println("\nUpdated values:");
		System.out.println("Name: "+Obj.name + "\n" +"Address: " +  Obj.address + "\n" + "Phone: "+ Obj.phone);
		
	

	
	
	
	
	
	
	
	
	
	
	}
}