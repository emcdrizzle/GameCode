import javax.swing.JFrame;

public class Myscreen extends JFrame {

	public Myscreen() {
		this.setSize(600,400);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setTitle("Jay is cool");
		this.setVisible(true);
	}

	public static void main(String[] args) {
		Myscreen screen = new Myscreen();
		Mycanvas drawboard = new Mycanvas();
		screen.getContentPane().add(drawboard);

	}

}
