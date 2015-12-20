import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

import sun.misc.CompoundEnumeration;
public class Data extends JPanel implements MouseListener{
	JButton exit;
	static JLabel need,count,ltime,score,maxnum,lv;
	static int time=90;
	public Data(){
		lv = new JLabel("Level : "+Sprite.level);
		maxnum = new JLabel("Max number : "+Sprite.maxnumber);
		ltime = new JLabel(""+time);
		score = new JLabel("Score : "+Sprite.score);
		count = new JLabel("Clicked : "+(Sprite.countclick));
		need = new JLabel(""+Sprite.equal);
		addComponent(lv,200,100,60,300,null,-1,30,Color.WHITE);
		addComponent(maxnum,400,100,60,250,null,-1,30,Color.WHITE);
		addComponent(ltime,200,100,120,470,null,-1,80,Color.WHITE);
		addComponent(score,500,100,20,40,null,-1,40,Color.BLACK);
		addComponent(count,200,100,60,350,null,-1,30,Color.WHITE);
		addComponent(need,100,100,77,155,null,-1,60,Color.WHITE);
		setLayout(null);
		exit = new JButton("ออกจากเกมส์");
		exit.addMouseListener(this);
		exit.setSize(120, 50);
		exit.setLocation(120, 550);
		//add(exit);
		setPreferredSize(new Dimension(300, 700));
		setBackground(new Color(87, 159, 203));
	}
	static void blink(){
		new Thread(){public void run(){
			try {
				while(time>0){
				ltime.setVisible(false);
				Thread.sleep(100);
				ltime.setVisible(true);
				Thread.sleep(100);
				}
			} catch (Exception e) {			}
		}}.start();
	}
	void addComponent(Component c,int sizea,int sizeb,int locatex,int locatey,String font,int style,int fontsize,Color color){
		c.setSize(sizea,sizeb);
		c.setLocation(locatex,locatey);
		c.setForeground(color);
		add(c);
		if(font==null&&style==-1)c.setFont(new Font("SansSerif",Font.BOLD,fontsize));
		else if(font==null&&style!=-1)c.setFont(new Font("SansSerif",style,fontsize));
		else if(font!=null&&style==-1)c.setFont(new Font(font,Font.BOLD,fontsize));
		else c.setFont(new Font(font,style,fontsize));
	}
	@Override
	public void mouseClicked(MouseEvent e){
		if(e.getSource()==exit)
			System.exit(0);
	}
	@Override
	public void mouseEntered(MouseEvent e) {}
	@Override
	public void mouseExited(MouseEvent e) {}
	@Override
	public void mousePressed(MouseEvent e) {}
	@Override
	public void mouseReleased(MouseEvent e) {}
	ImageIcon m = new ImageIcon("pic//m.jpg");
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		
		g.drawImage(m.getImage(), -5, 0, this);
		g.drawImage(new ImageIcon("pic//time.png").getImage(),60,500,this);
	}
}
