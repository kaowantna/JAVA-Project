import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;
public class Home extends JPanel {
	static JButton start,multi,exit;
	public Home(){
		start = new JButton("START");
		multi = new JButton("MultiPlayer");
		exit = new JButton("EXIT");
		add(start);
		add(multi);
		add(exit);
		setSize(500, 500);
	}
	public void abc(Maingame maingame){
		start.addMouseListener(maingame);
		multi.addMouseListener(maingame);
		exit.addMouseListener(maingame);
	}
}
