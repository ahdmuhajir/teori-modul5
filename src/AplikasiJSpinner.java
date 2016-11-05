import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
public class AplikasiJSpinner extends JFrame{
JTextField txSpin= new JTextField();
JLabel size= new JLabel("Size:");
String data[]= {"Small (S)","Medium(M)","Large(L)","Huge(XL)","Extra Large(XXL)"};
Color c = new Color(243, 156, 18);

SpinnerListModel model = new SpinnerListModel(data);
JSpinner spin = new JSpinner(model);
	public AplikasiJSpinner() {
		setTitle("Aplikasi JSpinner List");
		setLocation(20,20);
		setSize(270,110);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
	}
	
	void komponenVisual(){
		getContentPane().setLayout(null);
		getContentPane().setBackground(c);
		getContentPane().add(size);
		size.setBounds(10,10,50,20);
		
		getContentPane().add(txSpin);
		txSpin.setBounds(70, 10, 150, 50);
		txSpin.setEditable(false);
		
		getContentPane().add(spin);
		spin.setBounds(70, 10, 150, 50);
		spin.setEditor(txSpin);
		spin.setFont(new Font("Arial", Font.BOLD, 15));
		setVisible(true);
		
	}
	void AksiReaksi(){
		spin.addChangeListener(new ChangeListener()	{
			public void stateChanged(ChangeEvent e)	{
				Object obj = spin.getValue();
				txSpin.setText(obj.toString());
				}});	
		}
	
	public static void main(String args[]){
		AplikasiJSpinner SL = new AplikasiJSpinner();
		SL.komponenVisual();
		SL.AksiReaksi();
	}
}
