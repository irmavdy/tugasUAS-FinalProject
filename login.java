import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class login implements ActionListener{
	
	private static JLabel judul;
	private static JLabel perintah;
	private static JLabel label1;
	private static JTextField NamaText;
	private static JLabel passwordlabel;
	private static JPasswordField passwordText;
	private static JButton button;
	private static JLabel fail;
	

	public static void main(String[] args) {
		
		JPanel panel = new JPanel();
		JFrame frame =new JFrame();
		frame.setSize( 434, 475);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.add(panel);
		panel.setLayout(null);
		
		judul = new JLabel("Pendaftaran Olahraga Basket");
		judul.setBounds(15,30,434,25);
		judul.setFont(new Font("Papyrus",Font.BOLD,25));
		panel.add(judul);
		
		perintah= new JLabel("silahkan masukan nama dan password");
		perintah.setBounds(15,140,434,25);
		panel.add(perintah);
		
	    label1 = new JLabel("User Name");
		label1.setBounds(15,180,80,25);
		label1.setFont(new Font("Papyrus", Font.PLAIN, 13));
		panel.add(label1);
		
	    NamaText=new JTextField();
		NamaText.setBounds(130,180,165,25);
		panel.add(NamaText);
				
	    passwordlabel=new JLabel("Password");
		passwordlabel.setBounds(15,220,100,25);
		passwordlabel.setFont(new Font("Papyrus", Font.PLAIN, 13));
		panel.add(passwordlabel);
		
	    passwordText=new JPasswordField();
		passwordText.setBounds(130,220,165,25);
		panel.add(passwordText);
		
		
		 button = new JButton("Login");
		button.setBounds(15,300,100,30);
		button.addActionListener(new login());
		panel.add(button);
		
		
		 fail = new JLabel();
		fail.setBounds(15,320,150,50);
		fail.setForeground(Color.RED);
		panel.add(fail);
		frame.setVisible(true);
			

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		String label1 = NamaText.getText();
		String passwordLabel = passwordText.getText();
		
		if(label1.equals("irma")&& passwordLabel.equals("analog12")) {
			JOptionPane.showMessageDialog(null, "ANDA BERHASIL LOGIN");
			home hm= new home();
			hm.setVisible(true);
		}
		else {
			fail.setText("inputkan data yang benar!");	
		}
		
	}
	}




