import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class UI extends JFrame {
	public JTextField txtDateIn;
	public  JTextField txtDateOut;
	public  JTextField txtPax;
	public  JTextField txtAdults;
	public  JTextField txtChildrens;
	public UI() {
		
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);
		
		JLabel lblDateIn = new JLabel("Date in:");
		panel.add(lblDateIn);
		
		txtDateIn = new JTextField();
		panel.add(txtDateIn);
		txtDateIn.setColumns(10);
		
		JLabel lblDateOut = new JLabel("Date Out:");
		panel.add(lblDateOut);
		
		txtDateOut = new JTextField();
		panel.add(txtDateOut);
		txtDateOut.setColumns(10);
		
		JLabel lblPax = new JLabel("Pax:");
		panel.add(lblPax);
		
		txtPax = new JTextField();
		txtPax.setEnabled(false);
		panel.add(txtPax);
		txtPax.setColumns(10);
		
		JLabel lblAdults = new JLabel("Adults:");
		panel.add(lblAdults);
		
		txtAdults = new JTextField();
		panel.add(txtAdults);
		txtAdults.setColumns(10);
		
		JLabel lblChildrens = new JLabel("Childrens:");
		panel.add(lblChildrens);
		
		txtChildrens = new JTextField();
		panel.add(txtChildrens);
		txtChildrens.setColumns(10);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
	}

}
