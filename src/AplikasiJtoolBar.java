import javax.swing.*;
import java.awt.*;
public class AplikasiJtoolBar extends JFrame{
	JMenuBar menu = new JMenuBar();
	JToolBar tool = new JToolBar();
	JMenu file = new JMenu ("FILE");
	JMenu edit = new JMenu ("EDIT") ;
	JMenu seting = new JMenu ("TOOLS");
	JMenu help = new JMenu ("HELP");
	ImageIcon icon1 = new ImageIcon ("img/21.png");
	ImageIcon icon2 = new ImageIcon ("img/22.png");
	ImageIcon icon3 = new ImageIcon ("img/23.png");
	ImageIcon icon4= new ImageIcon ("img/24.png");
	JButton newi = new JButton ("NEW",icon1);
	JButton open = new JButton ("OPEN",icon2);
	JButton cut = new JButton ("CUT",icon3);
	JButton copy = new JButton ("COPY",icon4);
	JTextArea area = new JTextArea ();
	
	AplikasiJtoolBar(){
		setTitle("Aplikasi JToolBar");
		setLocation(10,10);
		setSize(400, 300);
		setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
	}
	void KomponenVisual(){
		setJMenuBar (menu);
		menu.add(file);
		menu.add(edit);
		menu.add(seting);
		menu.add(help);
		getContentPane().setLayout(null);
		getContentPane().add(tool);
		tool.setBounds(0,0,400,40);
		tool.add(newi);
		tool.add(open);
		tool.add(cut);
		tool.add(copy);
		getContentPane().add(area);
		area.setBounds(0,40,380,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		AplikasiJtoolBar asd = new AplikasiJtoolBar();
		asd.KomponenVisual();
	}
}
