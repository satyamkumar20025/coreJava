package Interface_question;

public class FootBallPlayer implements Player {

	public void play()
	{
		System.out.println("Cricketplayer");
	}
public void getScore()
{
	System.out.println("Cricketplayer");

}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FootBallPlayer fff=new FootBallPlayer();
		fff.getScore();
		fff.play();
	}
		
}
