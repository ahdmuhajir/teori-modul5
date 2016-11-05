import java.awt.Color;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;

public class AplikasiJSpinnerTanggal extends JFrame{
	Color c = new Color(243, 156, 18);
	
	JLabel ltanggal = new JLabel("Tanggal : ");
	JSpinner spinTgl = new JSpinner(new SpinnerDateModel());
	JSpinner.DateEditor dateEdit= new JSpinner.DateEditor(spinTgl, "dd/MM/YY");
	
	JLabel lJam= new JLabel("JAM : ");
	JSpinner spinJam = new JSpinner(new SpinnerDateModel());
	JSpinner.DateEditor jamEdit = new JSpinner.DateEditor(spinJam, "HH:mm:ss");
	
	public AplikasiJSpinnerTanggal() {
		setTitle("Aplikasi Spinner Tanggal");
		setSize(300,120);
		setLocation(100,100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	void komponenVisual(){
		getContentPane().setLayout(null);
		getContentPane().setBackground(c);
		getContentPane().add(ltanggal);
		ltanggal.setBounds(12, 12, 70, 20);
		
		getContentPane().add(spinTgl);
		spinTgl.setBounds(100, 12, 70, 20);
		spinTgl.setEditor(dateEdit);
		spinTgl.setValue(new Date());
		
		getContentPane().add(lJam);
		lJam.setBounds(12, 40, 70, 20);
		
		getContentPane().add(spinJam);
		spinJam.setBounds(100, 40, 182, 20);
		spinJam.setEditor(jamEdit);
		spinJam.setValue(new Date());
		setVisible(true);
	}
	public static void main(String[] args) {
		AplikasiJSpinnerTanggal ast = new AplikasiJSpinnerTanggal();
		ast.komponenVisual();
	}
}
