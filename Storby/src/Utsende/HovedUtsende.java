package Utsende;
import java.awt.BorderLayout;
import java.awt.event.*;
import javax.swing.*;


public class HovedUtsende extends JFrame {
		
	public HovedUtsende(){
		setLayout(new BorderLayout(20,10));
		add(new JPanel(),BorderLayout.WEST);
		add(new JPanel(),BorderLayout.EAST);
		setTitle("Vær oversikt over storbyer");
		setJMenuBar(new Hovedmeny());
		getContentPane().add(new Knappeoversikt(),BorderLayout.WEST);
		add (new Vaervisning(),BorderLayout.CENTER);
		setSize(900,600);
		setVisible(true);
		
		//----------JMenuBar-----------\\
		JMenuBar mbar = new JMenuBar();
		setJMenuBar(mbar);
		
		JMenu file = new JMenu("File");
		mbar.add(file);
		
		JMenuItem exit = new JMenuItem("Exit");
		file.add(exit);
		
		JMenu help = new JMenu("Help");
		mbar.add(help);
		
		JMenuItem about = new JMenuItem("About");
		help.add(about);
		
		class exitaction implements ActionListener{
			public void actionPerformed (ActionEvent e ){
				System.exit(0);
			}
		}
		exit.addActionListener(new exitaction());
		//------------------------------\\
	}
}
