
interface Boy
{
	final int b=9;
	
	
	void display();
}
interface Girl
{
	final int c=7;
	void display1();
}
class value implements Boy,Girl
{
	public void show()
	{
		System.out.println("Boy value is:-"+b);
	}
	public void show1() 
	{
		System.out.println("Girl value is:-"+c);
	}
	
}

public class Interface {

	public static void main(String[] args) 
	{
        value v1=new value();
        v1.show();
        v1.show1();

	}

}
