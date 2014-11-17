package Utsende;


import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

public class Knappeoversikt extends JPanel implements ActionListener {
	
	public Knappeoversikt() {
		String[] k = {"Bergen","Trondheim","Tønsberg","Kristiansand","Tromsø","Oslo","Stavanger"};
		JButton[] b = new JButton[k.length];
		setLayout(new GridLayout(7,0,0,10));
		for (int i=0;i<k.length;i++) {
			b[i] = new JButton(k[i]);
			b[i].addActionListener(this);
			add(b[i]);
	    }
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
