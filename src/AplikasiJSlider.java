import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;

public class AplikasiJSlider extends JFrame{
	Color c = new Color(243, 156, 18);
	JSlider slider = new JSlider(1,50);
	JLabel value = new JLabel("Value : ");
	JTextField txValue= new JTextField();
	
	AplikasiJSlider() {
		super("Aplikasi Slider");
		setLocation(10, 10);
		setSize(400, 150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	void komponenVisual(){
		getContentPane().setLayout(null);
		getContentPane().setBackground(c);
		
		getContentPane().add(value);
		value.setBounds(30, 10, 100, 20);
		value.setFont(new Font("Arial", Font.BOLD, 15));;
		
		getContentPane().add(txValue);
		txValue.setBounds(120, 10, 100, 20);
		txValue.setText(""+slider.getValue());
		
		getContentPane().add(slider);
		slider.setBounds(10, 40, 360, 40);
		
		slider.setPaintTicks(true);
		slider.setMinorTickSpacing(1);
		slider.setMajorTickSpacing(5);
		slider.setPaintLabels(true);
		slider.setOpaque(false);
		setVisible(true);
	}
	void aksiReaksi(){
		slider.addChangeListener(new ChangeListener() {
			
			
			public void stateChanged(ChangeEvent e) {
				txValue.setText(""+slider.getValue());
				
			}
		});
	}
	public static void main(String[] args) {
		AplikasiJSlider anu = new AplikasiJSlider();
		anu.komponenVisual();
		anu.aksiReaksi();
	}
}
