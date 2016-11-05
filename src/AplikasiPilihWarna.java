import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*; 
 
class AplikasiPilihWarna extends JFrame  
{ 
	JButton tblUbah = new JButton ("Ubah Warna");
	Color warna = Color.LIGHT_GRAY; 
 
	AplikasiPilihWarna(){  
		setTitle ("Aplikasi JColorChooser");
		setSize (400,250);
		setLocation (0,0);
		setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);   
	} 
 
	void KomponenVisual(){ 
		getContentPane().setLayout(null); 
		getContentPane().add(tblUbah); 
		tblUbah.setBounds(100,10,150,30); 
 
		setVisible (true);
	}    
		void AksiReaksi(){ 
			tblUbah.addActionListener (new ActionListener(){ 
				public void actionPerformed (ActionEvent event){ 
					warna = JColorChooser.showDialog ( AplikasiPilihWarna.this, "Pilih Warna", warna); 
					
					if (warna == null) warna = Color.red; 
					getContentPane().setBackground (warna); 
 
				}  
			} ); 

		} 
 
		public static void main (String args[]){
			AplikasiPilihWarna apw = new AplikasiPilihWarna();   
			apw.KomponenVisual(); 
			apw.AksiReaksi();  
		} 
} 
 
 