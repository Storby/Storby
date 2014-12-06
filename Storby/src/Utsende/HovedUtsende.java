package Utsende;
import java.awt.BorderLayout;

import javax.swing.*;

public class HovedUtsende extends JFrame {
		

	public HovedUtsende(){
		setLayout(new BorderLayout(20,10));
		add(new JPanel(),BorderLayout.WEST);
		add(new JPanel(),BorderLayout.EAST);
		setTitle("Vær oversikt over storbyer");
		setJMenuBar(new Hovedmeny());
		getContentPane().add(new Knappeoversikt(),BorderLayout.WEST);
		add(new Vaervisning(),BorderLayout.CENTER);
		setSize(900,600);
		setVisible(true);
		setLocationRelativeTo(null);
	}
}
