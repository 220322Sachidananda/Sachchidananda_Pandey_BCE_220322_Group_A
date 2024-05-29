public class myinfo 
{
    private String Name = "Zake";
	private String Address = "kathmandu";
	private int Number = 123456789;
	
	public static void main(String[] args)
     {
		myinfo Info=new myinfo();
		String myName=Info.Name;
		String myAddress=Info.Address;
		int myPhone=Info.Number;
		System.out.println(myName +"\n" +myAddress + "\n"+myPhone);
		System.out.println("\nUpdated Variables:");
		Info.Name="Jolie";
		Info.Address="Lalitpur";
		Info.Number=987654321;
		System.out.println( Info.Name+"\n"+""+Info.Address+"\n"+""+Info.Number);
	
	}   
}
