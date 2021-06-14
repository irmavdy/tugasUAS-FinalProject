import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextPane;
import java.awt.SystemColor;

public class syarat extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					syarat frame = new syarat();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public syarat() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 737, 518);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton btnok = new JButton("OK");
		btnok.setBackground(new Color(255, 250, 240));
		btnok.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				home lg= new home();
				lg.setVisible(true);
				
			}
		});
		
		JLabel lblNewLabel = new JLabel("Syarat dan Ketentuan Pendaftaran");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		
		JTextPane txtpnPesertaBisa = new JTextPane();
		txtpnPesertaBisa.setBackground(new Color(255, 228, 196));
		txtpnPesertaBisa.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		txtpnPesertaBisa.setText
		("1. peserta bisa mendaftar dengan cara login terlebih dahulu dengan user name dan password yang dimiliki,jika belum memiliki dapat mendaftar dahulu lewat link https://basketptk.com\r\n2. peserta wajib mendata diri dengan informasi yang benar jika terbukti salah maka akan dikenakan sanksi.\r\n3. tidak ada batasan umur,tinggi badan maupun berat badan.\r\n4. latihan akan dilaksanakan setiap hari sabtu pukul 16.00-17.00 dilapangan podomoro\r\n5. setelah mendaftar,silahkan tunggu informasi selanjutnya yang akan kami kirimkan lewat email.");
		
		JLabel lblNewLabel_1 = new JLabel("By Komunitas Pecinta Bola Basket kota Pontianak");
		lblNewLabel_1.setFont(new Font("Lucida Calligraphy", Font.PLAIN, 12));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(btnok, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
									.addGap(48))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblNewLabel_1)
									.addContainerGap(373, Short.MAX_VALUE)))
							.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
								.addComponent(lblNewLabel)
								.addGap(177)))
						.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
							.addComponent(txtpnPesertaBisa, GroupLayout.PREFERRED_SIZE, 566, GroupLayout.PREFERRED_SIZE)
							.addGap(68))))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(26)
					.addComponent(lblNewLabel)
					.addGap(55)
					.addComponent(txtpnPesertaBisa, GroupLayout.PREFERRED_SIZE, 154, GroupLayout.PREFERRED_SIZE)
					.addGap(101)
					.addComponent(btnok)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblNewLabel_1)
					.addGap(53))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
