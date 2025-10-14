package Interface_question;

	// Circle class implementing Drawable
public	class Circle implements Drawable {
	    public void draw() {
	        System.out.println("Drawing a Circle");
	    }

	    public static void main(String[] args) {
	        Drawable c = new Circle();
	        Drawable r = new Rectangle();
	        Drawable t = new Triangle();

	        c.draw();
	        r.draw();
	        t.draw();
	    
	}

}
