import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*; 
 
class AplikasiJTimer extends JFrame implements ActionListener 
	{ 
		Color c = new Color(243, 156, 18);
		int jam=0; 
		int menit=0; 
		int detik=0; 
		int delay=500; //untuk kecepatan waktu 
		Timer timer = null; 
 
		JLabel label = new JLabel("00:00:00"); 
		JButton btnStart = new JButton("Start"); 
		JButton btnStop = new JButton("Stop"); 
 
		AplikasiJTimer(){     
			super("Aplikasi Timer");     
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);     
			setLocation(100,100);     
			setSize(250,150);     
		}     
		void KomponenVisual(){      
				getContentPane().setLayout(null);
				getContentPane().setBackground(c);
				
				getContentPane().add(label);      
				label.setBounds(50,10,100,30);      
				label.setFont(new Font("arial",Font.BOLD,25));        
				
				getContentPane().add(btnStart);      
				btnStart.setBounds(10,50,100,40);      
				btnStart.addActionListener(this); 
 
				getContentPane().add(btnStop);      
				btnStop.setBounds(120,50,100,40);     
				btnStop.addActionListener(this); 
 
				setVisible(true);     
				timer=new Timer(delay, display);   
			}        
			//untuk aksi tombol start dan stop   
			  public void actionPerformed(ActionEvent ae){     
				  if (ae.getSource()==btnStart){       
					  if (!timer.isRunning()) 
						  timer.start();    
				  }      
				  if (ae.getSource()==btnStop){        
					  if (timer.isRunning())           
						  timer.stop();      
				  }    
			  } 
			
 
			//untuk perubahan jam   private 
			  ActionListener display=new ActionListener(){     
				  public void actionPerformed(ActionEvent e){       
					  String str1=Integer.toString(jam);       
					  String str2=Integer.toString(menit);
					  String str3=Integer.toString(detik); 
 
					  if (jam<10) str1="0"+str1;       
					  if (menit<10) str2="0"+str2;  
					  if (detik<10) str3="0"+str3; 
 
					  label.setText(str1+":"+str2+":"+str3); 
					  detik++;  
					  
					  if (detik==60){         
						  detik=0;         
						  menit++;         
					  
					  if (menit==60){         
						  menit=0; 
						  jam++;        
					  
					  if (jam==24)            
						  jam=0;         
					  }  
					  }   
				}  
			}; 
			public static void main(String args[]){ 
				AplikasiJTimer ax = new AplikasiJTimer(); 
				ax.KomponenVisual();   
			} 
} 
 
 
