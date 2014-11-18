package Utsende;



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;





public class Hovedmeny extends JMenuBar {

	public Hovedmeny() {
		//----------JMenuBar-----------\\
				JMenuBar mbar = new JMenuBar();
				
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
