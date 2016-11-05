import java.awt.*;
import javax.swing.*;
public class AplikasiJSplitPane extends JFrame{
	Color c = new Color(243, 156, 18);
	JLabel Lkiri= new JLabel("Split Kiri");
	JLabel Lkanan= new JLabel("Split Kanan");
	
	JLabel gbrKiri = new JLabel(new ImageIcon("img/a.jpg"));
	JScrollPane kiri = new JScrollPane(gbrKiri);
	
	JLabel gbrKanan= new JLabel(new ImageIcon("img/b.jpg"));
	JScrollPane kanan = new JScrollPane(gbrKanan);
	
	JSplitPane split = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,kiri,kanan);
	
	public AplikasiJSplitPane() {
		setTitle("Aplikasi JSplitPane");
		setLocation(0,0);
		setSize(530,450);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	void komponenVisual(){
		getContentPane().setLayout(null);
		getContentPane().setBackground(c);
		
		getContentPane().add(Lkiri);
		Lkiri.setBounds(100, 10, 100, 20);
		
		getContentPane().add(Lkanan);
		Lkanan.setBounds(350,10,100,20);
		
		getContentPane().add(split);
		split.setBounds(10,40,500,350);
		split.setDividerLocation(250);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		AplikasiJSplitPane aop = new AplikasiJSplitPane();
		aop.komponenVisual();
	}
}
