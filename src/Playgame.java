import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
public class Playgame extends JPanel {
	static int n=90;
	static ArrayList<Sprite> sprite = new ArrayList<Sprite>();
	static int[] positionX = new int[n];
	static int[] positionY = new int[n];
	static int[] position = new int[n];
	static JLabel sum;
	public Playgame() {
		new Thread() {
			public void run() {
				while(true){
					//if(Data.time<=0)add(new GameOver());
					try{
						Thread.sleep(500);
					}catch (Exception e) {}
			}
			}
		}.start();
		sum = new JLabel(""+Sprite.sum);
		add(sum);
		sum.setSize(100,100);
		sum.setLocation(280,-20);
		sum.setFont(new Font("SansSerif", Font.BOLD, 70));
		sum.setForeground(Color.BLACK);
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
