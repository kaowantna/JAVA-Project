import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
public class Maingame extends JFrame implements MouseListener{
	Home home ;
	Maingame(){
		setTitle("The Genius Edition War of Plus Minus Multiple and Divide for equal ten in everyday");
//		home = new Home();
//		home.abc(this);
//		add(home);
//		home.setBackground(Color.RED);
		add(new State());
	}
	public static void main(String[]args){
		JFrame frame = new Maingame();
		frame.setResizable(false);
		frame.setSize(940,690);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
	}
	public void paintComponent(Graphics g) {
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		if(e.getSource()==home.start){add(new State());remove(home); }
		if(e.getSource()==home.multi);
		if(e.getSource()==home.exit) System.exit(0);
		validate();
	}
	@Override
	public void mouseEntered(MouseEvent e) {}
	@Override
	public void mouseExited(MouseEvent e) {}
	@Override
	public void mousePressed(MouseEvent e) {}
	@Override
	public void mouseReleased(MouseEvent e) {}
}
