import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
public class Playgame extends JPanel {
	static int n=90;
	static ArrayList<Sprite> sprite = new ArrayList<Sprite>();
	static int[] positionX = new int[n];
	static int[] positionY = new int[n];
	static int[] position = new int[n];
	static JLabel sum,lvup,over;
	public Playgame() {
		lvup = new JLabel("LEVEL UP!");
		add(lvup);
		lvup.setSize(2000,500);
		lvup.setLocation(50,70);
		lvup.setFont(new Font("SansSerif", Font.BOLD, 100));
		lvup.setForeground(Color.RED);
		lvup.setVisible(false);
		over = new JLabel("GAME OVER!");
		add(over);
		over.setSize(2000,500);
		over.setLocation(20,70);
		over.setFont(new Font("SansSerif", Font.BOLD, 90));
		over.setForeground(Color.RED);
		over.setVisible(false);
		sum = new JLabel(""+Sprite.sum);
		add(sum);
		sum.setSize(200,100);
		sum.setLocation(280,-10);
		sum.setFont(new Font("Slabo", Font.BOLD, 70));
		sum.setForeground(Color.white);
		setPreferredSize(new Dimension(750, 600));
		setBackground(new Color(231, 146, 179));
		setLayout(null);
		for(int i=0;i<n;i++){
			if(i%10==0);
			positionX[i] = (Sprite.size *(i%10))+7;
			if((i%10)%2==1)
			positionY[i] = ((i/10) * Sprite.size)+80;
			else positionY[i] = ((i/10) * Sprite.size)+105;
		}
		for(int i=0;i<n;i++){
			sprite.add(new Sprite());
			add(sprite.get(i));
			position[i]=1;
		}
	}
	static void setsum(int sum){
		Playgame.sum.setText(""+sum);
	}
	ImageIcon m = new ImageIcon("pic//bgWood-0.jpg");
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		g.drawImage(m.getImage(), 0, 0, this);
	}
}
