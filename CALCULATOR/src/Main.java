import javax.swing.*;
public class Main {
	public static void main(String[] args) {
		Interface i= new Interface();
		i.setSize(400, 400);
		i.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		i.setVisible(true);
		i.setResizable(false);
	}
}