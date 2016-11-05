import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

public class AplikasiJtabbedPane extends JFrame{
	Color c = new Color(243, 156, 18);
	JTabbedPane tabby = new JTabbedPane();
	JLabel image = new JLabel(new ImageIcon("img/a.jpg"));
	JComponent picture = new JScrollPane(image);
	
	//untuk tabel
	JPanel tab1 = new JPanel();
	JLabel nim = new JLabel("NIM");
	JTextField txNim= new JTextField(20);
	JLabel nama = new JLabel("Nama");
	JTextField txNama= new JTextField(20);
	ImageIcon icon = new ImageIcon("img/save.png");
	JButton simpan = new JButton("Save",icon);
	
	AplikasiJtabbedPane() {
		setTitle("Aplikasi Tab");
		setLocation(10,10);
		setSize(300,250);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	void komponenVisual(){
		tab1.setLayout(null);
		tab1.setBackground(c);
		tab1.add(nim);
		nim.setBounds(10, 10, 50, 20);
		tab1.add(txNim);
		txNim.setBounds(60, 10, 100, 20);
		
		tab1.add(nama);
		nama.setBounds(10,40,660,20);
		tab1.add(txNama);
		txNama.setBounds(60, 40, 100, 20);
		
		tab1.add(simpan);
		simpan.setBounds(170, 10, 100, 30);
		simpan.setForeground(Color.red);
		
		add(tabby);
		tabby.add("Biodata",tab1);
		tabby.add("Picture", picture);
		
		setVisible(true);
	}
	public static void main(String[] args) {
		AplikasiJtabbedPane asd = new AplikasiJtabbedPane();
		asd.komponenVisual();
	}
}
