import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*; 
import java.io.*; 
 
class AplikasiPilihFile extends JFrame{ 
		Color c = new Color(243, 156, 18);
		JLabel judul = new JLabel("TEMPAT LETAK FOTO"); 
		JLabel tempat = new JLabel (); 
		JButton buka = new JButton  ("OPEN"); 
 
		JFileChooser fc = new JFileChooser();   //untuk ambil file 
 
		AplikasiPilihFile(){ 
			setTitle("Aplikasi JFileChoiser"); 
			setLocation (300,100); 
			setSize (300,400); 
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		} 
 
	void KomponenVisual(){ 
			getContentPane().setLayout(null); 
			getContentPane().setBackground(c); 
 
			getContentPane().add(buka); 
			buka.setBounds(10,10,260,50); 
			buka.setIcon(new ImageIcon ("buka.png")); 
 
			getContentPane().add(judul);
			judul.setBounds(80,70,130,20); 
 
			getContentPane().add(tempat); 
			tempat.setBounds(10,100,260,250); 
			tempat.setBackground(Color.white);
			tempat.setBorder(BorderFactory.createEtchedBorder()); 
 
			setVisible(true);
		} 
 
		void AksiReaksi(){ 
			buka.addActionListener(new ActionListener(){ 
				public void actionPerformed(ActionEvent e){
					int ambil = fc.showOpenDialog(tempat); 
					if(ambil == JFileChooser.APPROVE_OPTION){ 
					String sumber = fc.getSelectedFile().getPath(); 
					tempat.setIcon(new ImageIcon(sumber));
					File file = new File(sumber); 
 
					try { 
						FileInputStream fis = new FileInputStream(sumber);
					} 
					
					catch(Exception ex)	{  
						System.out.print(ex);  
					} 
				} 
			} } );
		} 
 
		public static void main (String args[])	{ 
			AplikasiPilihFile APF=new AplikasiPilihFile();
			APF.KomponenVisual(); 
			APF.AksiReaksi();
		}
}