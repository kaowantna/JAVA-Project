import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;
public class Home extends JPanel {
	static JLabel start,exit;
	public Home(){
		setLayout(null);
		start = new JLabel();
		start.setIcon(new ImageIcon("pic//playgame.png"));
		start.setLocation(320,260);
		start.setSize(263,66);
		exit = new JLabel();
		exit.setIcon(new ImageIcon("pic//exit.png"));
		exit.setLocation(20,20);
		exit.setSize(50,50);
		add(start);
		add(exit);
		setSize(500,500);
	}
	ImageIcon m = new ImageIcon("pic//bghome.jpg");
	int x=0,i;
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		g.drawImage(m.getImage(),x--,-40, this);
		repaint();
		try {
			Thread.sleep(100);
		} catch (Exception e) {
		}
		if(x<-100)x=0;
	}
	public void abc(Maingame maingame){
		start.addMouseListener(maingame);
		exit.addMouseListener(maingame);
	}
}
