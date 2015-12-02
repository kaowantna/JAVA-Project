import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.*;

public class State extends JPanel{
	public State(){
		setLayout(new BorderLayout());
		Data d =new Data();
		add(d,BorderLayout.WEST);
		add(new Playgame(),BorderLayout.CENTER);
	}
}
