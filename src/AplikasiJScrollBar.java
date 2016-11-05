import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class AplikasiJScrollBar extends JFrame{
	JScrollBar bar1 =new JScrollBar(JScrollBar.VERTICAL);
	JScrollBar bar2 = new JScrollBar(JScrollBar.HORIZONTAL);
	
	JLabel vertikal = new JLabel("JScrollBar Vertikal");
	JLabel horizontal= new JLabel("JcrollBar Horizontal");
	JTextField txvertikal = new JTextField();
	
	public AplikasiJScrollBar() {
		super("Aplikasi_ScrolBar");
		setLocation(0,0);
		setSize(300,220);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	void KomponenVisual(){
		getContentPane().setLayout(null);
		getContentPane().setBackground(Color.orange);
		getContentPane().add(vertikal);
		vertikal.setBounds(10,30,110,20);
		getContentPane().add(txvertikal);
		txvertikal.setBounds(10,60,150,20);
		getContentPane().add(bar1);
		bar1.setBounds(170,10,30,100);
		getContentPane().add(horizontal);
		horizontal.setBounds(10,130,130,20);
		getContentPane().add(bar2);
		bar2.setBounds(140,130,120,30);
		setVisible(true);
	}
	
	void aksiReaksi(){
		bar1.addAdjustmentListener(new AdjustmentListener() {
			
			
			public void adjustmentValueChanged(AdjustmentEvent e) {
				if(e.getSource()==bar1){
					txvertikal.setText("Lagi Scroll vertikal coy");
				}
				
			}
		});
		
		bar2.addAdjustmentListener(new AdjustmentListener() {
			
			
			public void adjustmentValueChanged(AdjustmentEvent e) {
				if(e.getSource()==bar2){
					txvertikal.setText("Lagi Scroll Horizontal coy");
				}
				
			}
		});
	}
	public static void main(String[] args) {
		AplikasiJScrollBar as = new AplikasiJScrollBar();
		as.KomponenVisual();
		as.aksiReaksi();
	}
}
