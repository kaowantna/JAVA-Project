import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
public class Maingame extends JFrame implements MouseListener{
	Home home ;
	Maingame(){
		setTitle("The Genius Edition War of Plus Minus Multiple and Divide for equal ten in everyday");
		home = new Home();
		home.abc(this);
		add(home);
		home.setBackground(Color.RED);
	}
	public static void main(String[]args){
		JFrame frame = new Maingame();
		frame.setIconImage(new ImageIcon("pic//icon.png").getImage());
		frame.setResizable(false);
		frame.setSize(940,690);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void mouseClicked(MouseEvent e) {
		if(e.getSource()==home.start){add(new State());remove(home); }
		if(e.getSource()==home.exit) System.exit(0);
		validate();
	}
	public void mouseEntered(MouseEvent e) {
		if(e.getSource()==home.start)home.start.setLocation(315,255);
		if(e.getSource()==home.exit)home.exit.setLocation(17,17);
		validate();
	}
	public void mouseExited(MouseEvent e) {
		if(e.getSource()==home.start)home.start.setLocation(320,260);
		if(e.getSource()==home.exit)home.exit.setLocation(20,20);
		validate();
	}
	public void mousePressed(MouseEvent e) {
		if(e.getSource()==home.start)home.start.setLocation(315,260);
		if(e.getSource()==home.exit)home.exit.setLocation(17,20);
		validate();
	}
	public void mouseReleased(MouseEvent arg0) {
	}
}
