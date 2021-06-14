
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import java.awt.SystemColor;

public class home extends JFrame {

	private JPanel contentPane;
	private JTextField txtnama;
	private JTextField txtttl;
	private JTextField txttb;
	private JTextField txtbb;
	private JTextField txtalamat;
	private JTextField txtemail;
	
	ArrayList<pendaftaran> pendaf = new ArrayList<pendaftaran>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					home frame = new home();
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
	public home() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 737, 518);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lbjudul = new JLabel("Pendaftaran Olahraga Basket");
		lbjudul.setFont(new Font("Times New Roman", Font.PLAIN, 26));
		
		JLabel lbby = new JLabel("by komunitas pecinta bola basket kota pontianak");
		lbby.setFont(new Font("Papyrus", Font.PLAIN, 12));
		
		JLabel lbdata = new JLabel("silahkan inputkan data diri anda!");
		lbdata.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		JLabel lbnama = new JLabel("Nama");
		lbnama.setForeground(Color.BLACK);
		lbnama.setFont(new Font("Papyrus", Font.PLAIN, 14));
		
		txtnama = new JTextField();
		txtnama.setColumns(10);
		
		JLabel lbttl = new JLabel("TTL");
		lbttl.setFont(new Font("Papyrus", Font.PLAIN, 14));
		
		txtttl = new JTextField();
		txtttl.setColumns(10);
		
		JLabel lbagama = new JLabel("Agama");
		lbagama.setFont(new Font("Papyrus", Font.PLAIN, 14));
		
		JComboBox cbagama = new JComboBox();
		cbagama.setModel(new DefaultComboBoxModel(new String[] {"Islam", "Kristen", "Katolik", "Hindu", "Buddha", "Konghucu"}));
		cbagama.setToolTipText("  ,Islam\r\nKristen\r\nKatolik\r\nHindu\r\nBuddha\r\nKonghucu");
		
		JLabel lbjk = new JLabel("Jenis Kelamin");
		lbjk.setFont(new Font("Papyrus", Font.PLAIN, 14));
		
		JComboBox cbjk = new JComboBox();
		cbjk.setModel(new DefaultComboBoxModel(new String[] {"Laki-Laki", "Perempuan"}));
		
		JLabel lbtb = new JLabel("TB(cm)");
		lbtb.setFont(new Font("Papyrus", Font.PLAIN, 14));
		
		txttb = new JTextField();
		txttb.setColumns(10);
		
		JLabel lbbb = new JLabel("BB(kg)");
		lbbb.setFont(new Font("Papyrus", Font.PLAIN, 14));
		
		txtbb = new JTextField();
		txtbb.setColumns(10);
		
		JLabel lbalamat = new JLabel("Alamat");
		lbalamat.setFont(new Font("Papyrus", Font.PLAIN, 14));
		
		txtalamat = new JTextField();
		txtalamat.setColumns(10);
		
		JLabel lbemail = new JLabel("Email");
		lbemail.setFont(new Font("Papyrus", Font.PLAIN, 14));
		
		txtemail = new JTextField();
		txtemail.setColumns(10);
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("DialogInput", Font.PLAIN, 11));
		textArea.setBackground(new Color(255, 250, 250));
		
		
		
		JButton btnsimpan = new JButton("simpan");
		btnsimpan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String lbnama = txtnama.getText();
				String lbttl= txtttl.getText();
				String lbtb= txttb.getText();
				String lbbb= txtbb.getText();
				String lbalamat =txtalamat.getText();
				String lbemail=txtemail.getText();
				pendaf.add(new pendaftaran(lbnama, lbttl, lbtb, lbbb, lbalamat, lbemail));
				

		                 if(lbnama.isEmpty()&& lbttl.isEmpty()&& lbtb.isEmpty()&& lbbb.isEmpty()&& lbalamat.isEmpty()&& lbemail.isEmpty()) {
				        	JOptionPane.showMessageDialog(null,"data tidak boleh ada yang kosong");
						} else {  
							if(lbnama.isEmpty()) {
							JOptionPane.showMessageDialog(null,"isi data nama!");	
						} else {
							if ( lbttl.isEmpty()) {
								JOptionPane.showMessageDialog(null,"isi data tanggal lahir!");
						} else {
							if( lbalamat.isEmpty()) {
								JOptionPane.showMessageDialog(null,"isi data alamat!");
						} else { 
							if(lbtb.isEmpty()){
								JOptionPane.showMessageDialog(null,"isi data tinggi badan!");
	                	} else {
	                		if( lbbb.isEmpty()) {
	                			JOptionPane.showMessageDialog(null,"isi berat badan!");
	                	} else {
	                		if(lbemail.isEmpty()) {
	                			JOptionPane.showMessageDialog(null,"isi data email!");
	                	} else {
	                		JOptionPane.showMessageDialog(null,"data berhasil tersimpan!");
	                		}}}}}} 
				
				for(int i=0;i<pendaf.size();i++) {
				textArea.setText("\nNama:"+pendaf.get(i).txtnama+"\nTTL:"+pendaf.get(i).txtttl+"\nTB:"+pendaf.get(i).txttb+" cm"+"\nBB:"+
				 pendaf.get(i).txtbb+" kg"+"\nAgama:"+cbagama.getSelectedItem()+"\nJenis Kelamin:"+cbjk.getSelectedItem().toString()+
			  "\nAlamat:"+pendaf.get(i).txtalamat+"\nEmail:"+pendaf.get(i).txtemail+"\n**********");				
				}}}});
		
		
		btnsimpan.setForeground(new Color(0, 0, 0));
		btnsimpan.setBackground(new Color(255, 235, 205));
		
		
		JButton btnkeluar = new JButton("keluar");
		btnkeluar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnkeluar.setBackground(new Color(255, 235, 205));
		
		JButton btnsyarat = new JButton("syarat");
		btnsyarat.setBackground(new Color(255, 235, 205));
		btnsyarat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				syarat sy= new syarat();
				sy.setVisible(true);
			}
		});
		
		JButton btnhapus = new JButton("Hapus Fields");
		btnhapus.setBackground(new Color(255, 235, 205));
		btnhapus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtnama.setText(" ");
				txtttl.setText(" ");
				txttb.setText(" ");
				txtbb.setText(" ");
				txtalamat.setText(" ");
				txtemail.setText(" ");
			}
		});
	
		JTextPane txtpnSilahkanBacaDahulu = new JTextPane();
		txtpnSilahkanBacaDahulu.setBackground(new Color(238, 232, 170));
		txtpnSilahkanBacaDahulu.setText("silahkan baca dahulu syarat dan ketentuan yang berlaku!");
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(117)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(92)
									.addComponent(lbjudul))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(lbttl)
										.addComponent(lbnama)
										.addGroup(gl_contentPane.createSequentialGroup()
											.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
												.addGroup(gl_contentPane.createSequentialGroup()
													.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
														.addComponent(lbtb)
														.addComponent(lbagama)
														.addComponent(lbbb)
														.addComponent(lbemail)
														.addComponent(btnsimpan, GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
														.addComponent(lbalamat)
														.addComponent(btnhapus, GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE))
													.addGap(10))
												.addGroup(gl_contentPane.createSequentialGroup()
													.addComponent(lbjk, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)
													.addPreferredGap(ComponentPlacement.RELATED)))
											.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
												.addComponent(txtalamat, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
												.addComponent(txttb, 137, 145, Short.MAX_VALUE)
												.addComponent(cbagama, 0, 145, Short.MAX_VALUE)
												.addComponent(txtbb, GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
												.addComponent(txtemail, GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
												.addComponent(cbjk, 0, 145, Short.MAX_VALUE)
												.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
													.addComponent(txtttl, Alignment.LEADING)
													.addComponent(txtnama, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE))
												.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
													.addComponent(btnkeluar, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
													.addComponent(btnsyarat, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)))))
									.addGap(320))))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(43)
							.addComponent(lbdata))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(109)
									.addComponent(lbby))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(127)
									.addComponent(txtpnSilahkanBacaDahulu, GroupLayout.PREFERRED_SIZE, 167, GroupLayout.PREFERRED_SIZE)))
							.addGap(34)
							.addComponent(textArea, GroupLayout.PREFERRED_SIZE, 273, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(7)
					.addComponent(lbjudul)
					.addGap(18)
					.addComponent(lbdata)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lbnama)
								.addComponent(txtnama, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lbttl)
								.addComponent(txtttl, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(cbjk, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lbjk))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(txtalamat, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lbalamat))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lbagama)
								.addComponent(cbagama, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lbtb)
								.addComponent(txttb, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(txtbb, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lbbb))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(txtemail, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lbemail))
							.addGap(6)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(btnsimpan)
								.addComponent(btnkeluar, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(btnhapus)
								.addComponent(btnsyarat, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(txtpnSilahkanBacaDahulu, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lbby))
						.addComponent(textArea))
					.addGap(12))
		);
		contentPane.setLayout(gl_contentPane);
		
	}
}
