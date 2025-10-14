package Interface_question;

public class ACRemote implements RemoteControl {

	public void turnOn()
	{
		System.out.println("AC remote");
	}
public void turnOff()
{
	System.out.println("AC remote");

}
public static void main(String[] args)
{
	ACRemote zzz=new ACRemote();
	zzz.turnOff();
	zzz.turnOn();
	TVRemote ttt=new TVRemote();
	ttt.turnOff();
	ttt.turnOn();
	
}

}
