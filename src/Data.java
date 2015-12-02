import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

public class Data extends JPanel implements MouseListener{
	JButton exit;
	static JLabel need;
	static JLabel count;
	static JLabel score;
	static int time=3;
	static JLabel ltime;
	public Data(){
		new Thread() {
			public void run() {
				while(time>0){
					try{
						Thread.sleep(1000);
						time--;
						Data.ltime.setText(""+time);
					}catch (Exception e) {}
				}
			}
		}.start();
		ltime = new JLabel(""+time);
		add(ltime);
		ltime.setSize(200,100);
		ltime.setLocation(120, 470);
		ltime.setFont(new Font("SansSerif", Font.BOLD, 80));
		ltime.setForeground(Color.RED);
		
		score = new JLabel(""+Sprite.score);
		add(score);
		score.setSize(200,100);
		score.setLocation(80, 40);
		score.setFont(new Font("SansSerif", Font.BOLD, 70));
		score.setForeground(Color.black);
		
		count = new JLabel("Clicked : "+Sprite.countclick);
		add(count);
		count.setSize(200,100);
		count.setLocation(60, 350);
		count.setFont(new Font("SansSerif", Font.BOLD, 40));
		count.setForeground(Color.white);
		
		need = new JLabel(""+Sprite.equal);
		add(need);
		need.setLocation(77,155);
		need.setSize(100, 100);
		need.setFont(new Font("SansSerif", Font.BOLD, 60));
		need.setForeground(Color.white);
		
		setLayout(null);
		exit = new JButton("ออกจากเกมส์");
		exit.addMouseListener(this);
		exit.setLocation(120, 550);
		//add(exit);
		exit.setSize(120, 50);
		setPreferredSize(new Dimension(300, 700));
		setBackground(new Color(87, 159, 203));
		
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		if(e.getSource()==exit)
			System.exit(0);
	}
	@Override
	public void mouseEntered(MouseEvent e) {
	}
	@Override
	public void mouseExited(MouseEvent e) {
	}
	@Override
	public void mousePressed(MouseEvent e) {
	}
	@Override
	public void mouseReleased(MouseEvent e) {
	}
	ImageIcon m = new ImageIcon("pic//m.jpg");
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		
		g.drawImage(m.getImage(), -5, 0, this);
	}
}
