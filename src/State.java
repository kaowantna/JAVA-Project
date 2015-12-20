import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.rmi.Remote;

import javax.swing.*;
import javax.swing.border.Border;
public class State extends JPanel{
	Data d ;Playgame playgame;
	static int time;
	public State(){
		time=90;
		new Thread() {
			public void run() {
				while(time>0){
					try{
						Thread.sleep(1000);
						time--;
						Data.ltime.setText(""+time);
						if(time<10){
							Data.ltime.setFont(new Font("SansSerif",Font.BOLD,100));
							Data.ltime.setForeground(Color.RED);
							Data.blink();
						}
					}catch (Exception e) {}
				}
				Playgame.over.setVisible(true);
				try {
					Thread.sleep(2000);
				} catch (Exception e) {
				}
				Over();
			}
		}.start();
		setLayout(new BorderLayout());
	d=new Data();
		playgame = new Playgame();
		add(d,BorderLayout.WEST);
		add(playgame,BorderLayout.CENTER);
	}
	public void Over(){
		add(new Over(),BorderLayout.CENTER);
		remove(playgame);
		remove(d);
		revalidate();
		validate();
	}
}
class Over extends JPanel{
	JLabel score,score2;
	public Over(){
		score = new JLabel("Your score");
		add(score);
		score.setLocation(330,150);
		score.setSize(2000,200);
		score.setForeground(Color.white);
		score.setFont(new Font("SansSerif",Font.BOLD,50));
		score2 = new JLabel(""+Sprite.score);
		add(score2);
		score2.setLocation(400,270);
		score2.setSize(2000,200);
		score2.setForeground(Color.RED);
		score2.setFont(new Font("SansSerif",Font.BOLD,90));
		setLayout(null);
		new Thread(){public void run(){
			try {
				Thread.sleep(2000);
				System.exit(0);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}}.start();
	}
	ImageIcon m = new ImageIcon("pic//over.jpg");
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		g.drawImage(m.getImage(),-40,-40, this);
	}
}
