package Hierarchical_lnheritance;

public class Hockey extends Sports {

	public void play(int id,String name) {
		super.play(id,name);
		System.out.println("Hockey is plated with feet and ball");
	}

	public static void main (String[] args)
	{
		Hockey h=new Hockey();
		h.play(5, "satyam");
		Football f=new Football();
		f.play(4, "Satyam");
		Cricket c=new Cricket();
		c.play(5, "SAtyam");
		
	}
	
}
