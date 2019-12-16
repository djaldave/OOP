package x;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField usernameTxt;
	private JPasswordField passwordTxt;
	private JLabel lblUsername,lblPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocation((Toolkit.getDefaultToolkit().getScreenSize().width  - getSize().width) / 2, (Toolkit.getDefaultToolkit().getScreenSize().height - getSize().height) / 2);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 408, 234);
		contentPane.add(panel);
		panel.setLayout(null);
		
		lblUsername = new JLabel("Username: ");
		lblUsername.setHorizontalAlignment(SwingConstants.TRAILING);
		lblUsername.setBounds(83, 54, 83, 24);
		panel.add(lblUsername);
		
		lblPassword = new JLabel("Password: ");
		lblPassword.setHorizontalAlignment(SwingConstants.TRAILING);
		lblPassword.setBounds(83, 98, 83, 24);
		panel.add(lblPassword);
		
		usernameTxt = new JTextField();
		usernameTxt.setBounds(204, 54, 128, 24);
		panel.add(usernameTxt);
		usernameTxt.setColumns(10);
		
		passwordTxt = new JPasswordField();
		passwordTxt.setBounds(204, 99, 128, 22);
		panel.add(passwordTxt);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Credentials credentials = new Credentials();
				if(usernameTxt.getText().equals("") && !passwordTxt.getText().equals("") ) {
					JOptionPane.showMessageDialog(null, "no username has been entered");
				}
				else if(passwordTxt.getText().equals("") && !usernameTxt.getText().equals("") ) {
					JOptionPane.showMessageDialog(null, "no password has been entered");
				}
				else if(!passwordTxt.getText().equals(credentials.getPassword()) && !usernameTxt.getText().equals(credentials.getUsername()) ) {
					JOptionPane.showMessageDialog(null, "incorrect username and password");
				}
				else if(passwordTxt.getText().equals(credentials.getPassword()) && usernameTxt.getText().equals(credentials.getUsername()) ) {
					JOptionPane.showMessageDialog(null, "Successfully Login");
					setVisible(false);
					new TemperatureCalculator().setVisible(true);
				}
			}
		});
		btnLogin.setBounds(127, 143, 133, 24);
		panel.add(btnLogin);
	}
}
