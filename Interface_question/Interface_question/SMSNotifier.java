package Interface_question;

public class SMSNotifier implements Notification {

	
	
public	void sendNotification(String message)
{
	System.out.println("EmailNotifier");
}
public static void main(String[] args)
{
	SMSNotifier s=new SMSNotifier();
	s.sendNotification("Don");
	EmailNotifier w=new EmailNotifier();
	w.sendNotification("satyam");
	
}

}
