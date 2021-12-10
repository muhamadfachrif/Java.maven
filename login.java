import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

public class Login extends JFrame {
	private JFrame frmLoginPage;
	private JTextField textUsername;
	private JPasswordField textPassword;
	private JButton btnSignIn;
	
	public static void main(String[] args) {	
		// initialisasi object pada class Login sebagai bagian dari JFrame
		Login frmLoginPage = new Login();
		
		// set title pada window
		frmLoginPage.setTitle("Login Page");
		
		// membuat window tidak bisa melakukan resizable atau maximize window
		frmLoginPage.setResizable(false);
		
		// set ukuran window dengan format (x, y, width, height). Dimana x dan y mengatur tata letak posisi window ketika pertama kali dijalankan
		frmLoginPage.setBounds(100, 100, 500, 646);
		
		// action ketika menutup window untuk mengakhiri program
		frmLoginPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// fungsi untuk menentukan jenis layout apa yang bakal dipakai
		frmLoginPage.getContentPane().setLayout(null);

		// memanggil method initialize() dengan parameter yaitu frmLoginPage
		frmLoginPage.initialize(frmLoginPage);
		
		// memanggil method actionInitialize()
		frmLoginPage.actionInitialize();

		// fungsi untuk mengatur output agar dapat ditampilkan  
		frmLoginPage.setVisible(true);		
	}

	private void initialize(JFrame frmLoginPage) {
		// membuat object baru dari class JLabel dengan menampilkan "logo"
		JLabel labelLogo = new JLabel("logo");
		
		// mengatur background/latar belakang awal
		labelLogo.setBackground(Color.WHITE);
		
		// menambahkan icon logo IBI Kesatuan  
		labelLogo.setIcon(new ImageIcon("C:\\Users\\raiha\\Documents\\java\\src\\image\\logo-ibik-web.png"));
		
		// set ukuran window dengan format (x, y, width, height). Dimana x dan y mengatur tata letak posisi window ketika pertama kali dijalankan
		labelLogo.setBounds(183, 0, 110, 127);
		
		// menambahkan background, icon, dan posisi yang sudah diatur sebelumnya kedalam halaman konten
		frmLoginPage.getContentPane().add(labelLogo);
		
		// objek untuk menampilkan judul di dalam halaman konten yang dibuat
		JLabel labelTitle1 = new JLabel("Sistem Informasi Perpustakaan");
		
		// mengatur background/latar belakang title berwarna kuning 
		labelTitle1.setBackground(Color.YELLOW);
		
		// mengatur foreground/halaman depan title berwarna hitam
		labelTitle1.setForeground(Color.BLACK);
		
		// mengatur agar posisi title di tengah
		labelTitle1.setHorizontalAlignment(SwingConstants.CENTER);
		
		// mengatur jenis font yang digunakan
		labelTitle1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		
		// set ukuran window dengan format (x, y, width, height). Dimana x dan y mengatur tata letak posisi window ketika pertama kali dijalankan
		labelTitle1.setBounds(25, 138, 441, 25);
		
		// menambahkan background, icon, dan posisi yang sudah diatur sebelumnya kedalam halaman konten
		frmLoginPage.getContentPane().add(labelTitle1);
		
		// membuat object baru dari class JPanel
		JPanel panel = new JPanel();
		
		// mengatur tata letak pembatas/border
		panel.setBorder(new TitledBorder(null, "Login to you account", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		// set ukuran window dengan format (x, y, width, height). Dimana x dan y mengatur tata letak posisi window ketika pertama kali dijalankan
		panel.setBounds(25, 209, 441, 271);
		
		// menambahkan background, icon, dan posisi yang sudah diatur sebelumnya kedalam halaman konten
		frmLoginPage.getContentPane().add(panel);
		
		// fungsi untuk menentukan jenis layout apa yang bakal dipakai
		panel.setLayout(null);

		// object untuk menampilkan label inputan username
		JLabel LabelUsername = new JLabel("Username");
		
		// set ukuran window dengan format (x, y, width, height). Dimana x dan y mengatur tata letak posisi window ketika pertama kali dijalankan
		LabelUsername.setBounds(29, 38, 72, 14);
		
		// menambahkan background, icon, dan posisi yang sudah diatur sebelumnya kedalam halaman konten
		panel.add(LabelUsername);
		
		// object untuk mengisi inputan username
		textUsername = new JTextField();
		
		// set ukuran window dengan format (x, y, width, height). Dimana x dan y mengatur tata letak posisi window ketika pertama kali dijalankan
		textUsername.setBounds(29, 63, 363, 36);
		
		// set untuk membatasi panjang input
		textUsername.setDocument(new textLimit(10));
		
		// menambahkan background, icon, dan posisi yang sudah diatur sebelumnya kedalam halaman konten
		panel.add(textUsername);
		
		// mengatur agar kolom inputan user maksimal sampai dengan 10 
		textUsername.setColumns(10);

		// object untuk mengisi inputan password
		JLabel LabelPassword = new JLabel("Password");
		
		// set ukuran window dengan format (x, y, width, height). Dimana x dan y mengatur tata letak posisi window ketika pertama kali dijalankan
		LabelPassword.setBounds(29, 122, 363, 14);
		
		// menambahkan background, icon, dan posisi yang sudah diatur sebelumnya kedalam halaman konten
		panel.add(LabelPassword);

		// object untuk mengisi password
		textPassword = new JPasswordField();
		
		// set ukuran window dengan format (x, y, width, height). Dimana x dan y mengatur tata letak posisi window ketika pertama kali dijalankan
		textPassword.setBounds(29, 147, 363, 36);
		
		// menambahkan background, icon, dan posisi yang sudah diatur sebelumnya kedalam halaman konten
		panel.add(textPassword); 

		// object untuk menambahkan button/tombol klik 
		btnSignIn = new JButton("Sign In");
		
		// set ukuran window dengan format (x, y, width, height). Dimana x dan y mengatur tata letak posisi window ketika pertama kali dijalankan
		btnSignIn.setBounds(303, 208, 89, 36);
		
		// menambahkan background, icon, dan posisi yang sudah diatur sebelumnya kedalam halaman konten
		panel.add(btnSignIn);
		
		// action click pada button
		btnSignIn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// mengubah input username menjadi String
				String inUser = textUsername.getText();
				
				// mengubah input password menjadi String
				String inPass = String.valueOf(textPassword.getPassword());
				
				if (inUser.isEmpty() && inPass.isEmpty()) { // kondisi jika username dan password tidak diisi
					JOptionPane.showMessageDialog(null, "Mohon masukan username dan password anda.");
				} else if (isNumber(inUser) == false) { // kondisi jika username bukan angka
					JOptionPane.showMessageDialog(null, "Harap masukan angka.");
				} else if (inUser.equalsIgnoreCase("202310010") && inPass.equalsIgnoreCase("22052001")) { // kondisi jika username dan password benar
					JOptionPane.showMessageDialog(btnSignIn, "Selamat datang di aplikasi Perpustakaan IBIK.");
				} else { // kondisi jika username dan password tidak sesuai
					JOptionPane.showMessageDialog(btnSignIn, "Data yang anda masukan salah.");
				}
				
				// menampilkan output username dan password di console
				System.out.println("username: " + inUser);
				System.out.println("password: " + inPass);
			}
		});
		//end event click
	
		
		// mengatur font yang digunakan dan ukuran font
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		// set ukuran window dengan format (x, y, width, height). Dimana x dan y mengatur tata letak posisi window ketika pertama kali dijalankan
		lblNewLabel.setBounds(25, 582, 441, 14);
		
		// menambahkan background, icon, dan posisi yang sudah diatur sebelumnya kedalam halaman konten
		frmLoginPage.getContentPane().add(lblNewLabel);
		
	}

	// action untuk menyimpan inputan user dan menampilkan di console    
	private void actionInitialize() {	
		btnSignIn.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				// mengubah input username menjadi String
				String username = textUsername.getText();
				
				// mengubah input password menjadi String
				String password = String.valueOf(textPassword.getPassword());
				
				// menampilkan output username dan password di console
				System.out.println("username: " + username);
				System.out.println("password: " + password);
			}		
		});
	}

	// method untuk mengecek inputan user
	private boolean isNumber(String input) {
		// konversi dari String ke Integer
		try {
			Integer i = Integer.parseInt(input) ;
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
}

// class untuk menentukan batasan inputan username
class textLimit extends PlainDocument {
	
	private int limit;
	
	// method mengatur limit
	textLimit(int limit) {
		super();
		this.limit = limit;
	}

	// method untuk mengecek panjang limit
	textLimit(int limit, boolean upper) {
		super();
		this.limit = limit;
	}

	// method untuj mengecek panjang dan menampilkan pesan error 
	public void insertString(int offset, String str, AttributeSet attr) throws BadLocationException {

		// jika bernilai null
		if (str == null)
			return;
		
		// jika panjang kurang dari limit
		if ((getLength() + str.length()) <= limit) {
			super.insertString(offset, str, attr);
	    } else {
	    	JOptionPane.showMessageDialog(null, "Maximum inputan 10 digit"); // jika panjang lebih panjang dari 10 digit
	    }
	  
	}

}
