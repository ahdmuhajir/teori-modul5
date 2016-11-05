import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*; 
 
class AplikasiJProgresBar extends JFrame{
	Color c = new Color(243, 156, 18);
	JProgressBar Bar = new JProgressBar(); 
	JLabel text = new JLabel ("Please Wait....."); 
 
	AplikasiJProgresBar(){     
		super("Aplikasi_ProgresBar");     
		setLocation(0,0);     
		setSize(300,130);     
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	} 
 
	void KomponenVisual(){ 
		getContentPane().setLayout(null); 
		getContentPane().setBackground(c); 
 
		getContentPane().add(text); 
		text.setBounds(10,10,100,20); 
 
		getContentPane().add(Bar); 
		Bar.setBounds(10,30,250,30); 
		Bar.setValue(Bar.getMinimum()); 
		Bar.setStringPainted(true); 
 
		setVisible(true);     
		new Timer(200,display).start();   
	} 
 
	ActionListener display=new ActionListener(){     
		public void actionPerformed(ActionEvent e){       
			int max=Bar.getMaximum();       
			int min=Bar.getMinimum();       
			int val=Bar.getValue();       
			int total=max-min+1;       
			int procent = (int) ((double)val/total*100);       
			String str=" "+procent+"% ";       
			Bar.setString(str);       
			Bar.setValue(val+1);  
 
			}}; 
 
    public static void main(String args[]){ 
    	AplikasiJProgresBar ap = new AplikasiJProgresBar(); 
    	ap.KomponenVisual();   
    } 
 }