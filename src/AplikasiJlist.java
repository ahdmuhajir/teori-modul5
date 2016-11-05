import javax.swing.*;
import java.awt.*;

public class AplikasiJlist extends JFrame{
	Color c = new Color(243, 156, 18);
	JLabel nama = new JLabel ("Nama - nama Buah :");
	String[] items=	{"Jeruk","Apel","Mangga","Jambu","Semangka","Duku","Pepaya","Nenas"};
	JList list=new JList(items);
	
	AplikasiJlist(){
		super("Aplikasi_List");
		setLocation(0,0);
		setSize(230,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	void KomponenVisual(){
		getContentPane().setLayout(null);
		getContentPane().setBackground(c);
		getContentPane().add(nama);
		nama.setBounds(10,10,200,20);
		getContentPane().add(list);
		list.setBounds(10,40,150,100);
		list.setBorder(BorderFactory.createEtchedBorder());
		list.setVisibleRowCount(5); //untuk mengatur jumlah item 
		JScrollPane pane=new JScrollPane(list);
		getContentPane().add(pane);
		pane.setBounds(10,40,150,90);
		setVisible(true);
	}
	public static void main(String[] args) {
		AplikasiJlist ask= new AplikasiJlist();
		ask.KomponenVisual();
	}
}
