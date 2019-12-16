package x;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class TemperatureCalculator extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private boolean a = false, b= false, c= false, d= false, ee= false,f = false;
	private ButtonGroup bg ;
	private JTextField txtt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TemperatureCalculator frame = new TemperatureCalculator();
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
	public TemperatureCalculator() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		setLocation((Toolkit.getDefaultToolkit().getScreenSize().width  - getSize().width) / 2, (Toolkit.getDefaultToolkit().getScreenSize().height - getSize().height) / 2);
		bg = new ButtonGroup();
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 408, 116);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JRadioButton rdbtnCelsiusToFahrenheit = new JRadioButton("Celsius to Fahrenheit");
		bg.add(rdbtnCelsiusToFahrenheit);
		rdbtnCelsiusToFahrenheit.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == ItemEvent.SELECTED) {
					a = true;
				}else {
					a = false;
				}
			}
		});
		rdbtnCelsiusToFahrenheit.setBounds(21, 22, 161, 23);
		panel.add(rdbtnCelsiusToFahrenheit);
		
		JRadioButton rdbtnCelsiusToKelvin = new JRadioButton("Celsius to Kelvin ");
		bg.add(rdbtnCelsiusToKelvin);
		rdbtnCelsiusToKelvin.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == ItemEvent.SELECTED) {
					b = true;
				}else {
					b = false;
				}
			}
		});
		rdbtnCelsiusToKelvin.setBounds(21, 48, 140, 23);
		panel.add(rdbtnCelsiusToKelvin);
		
		JRadioButton rdbtnFahrenheitToCelsius = new JRadioButton(" Fahrenheit to Celsius ");
		bg.add(rdbtnFahrenheitToCelsius);
		rdbtnFahrenheitToCelsius.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == ItemEvent.SELECTED) {
					c = true;
				}else {
					c = false;
				}
			}
		});
		rdbtnFahrenheitToCelsius.setBounds(21, 74, 140, 23);
		panel.add(rdbtnFahrenheitToCelsius);
		
		JRadioButton rdbtnFahrenheitToKelvin = new JRadioButton("Fahrenheit to Kelvin");
		bg.add(rdbtnFahrenheitToKelvin);
		rdbtnFahrenheitToKelvin.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == ItemEvent.SELECTED) {
					d = true;
				}else {
					d = false;
				}
			}
		});
		rdbtnFahrenheitToKelvin.setBounds(184, 22, 172, 23);
		panel.add(rdbtnFahrenheitToKelvin);
		
		JRadioButton rdbtnKelvinToCelsius = new JRadioButton(" Kelvin to Celsius ");
		bg.add(rdbtnKelvinToCelsius);
		rdbtnKelvinToCelsius.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == ItemEvent.SELECTED) {
					ee = true;
				}else {
					ee = false;
				}
			}
		});
		rdbtnKelvinToCelsius.setBounds(184, 48, 172, 23);
		panel.add(rdbtnKelvinToCelsius);
		
		JRadioButton rdbtnKelvinToFahrenheit = new JRadioButton("Kelvin to Fahrenheit ");
		bg.add(rdbtnKelvinToFahrenheit);
		rdbtnKelvinToFahrenheit.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == ItemEvent.SELECTED) {
					f = true;
				}else {
					f = false;
				}
			}
		});
		rdbtnKelvinToFahrenheit.setBounds(184, 74, 172, 23);
		panel.add(rdbtnKelvinToFahrenheit);
		
		
		JButton btnSolve = new JButton("Solve");
		btnSolve.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtt.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "no value entered");
				}
				else if(bg.getSelection()==null) {
					JOptionPane.showMessageDialog(null, "no operation has been selected");
				}
				else if(!txtt.getText().equals("")) {
					try {
						Double  CelToFah=new CelToFah().conversion(Double.parseDouble(txtt.getText())), CelToKel=new CelToKel().conversion(Double.parseDouble(txtt.getText())),
								FahToCel=new FahToCel().conversion(Double.parseDouble(txtt.getText())), FahToKel=new FahToKel().conversion(Double.parseDouble(txtt.getText())),
								KelToCel=new KelToCel().conversion(Double.parseDouble(txtt.getText())), KelToFah=new KelToFah().conversion(Double.parseDouble(txtt.getText()));
						
							if(a==true) {
								textField.setText(CelToFah.toString());
							}if(b==true) {
								textField.setText(CelToKel.toString());
							}if(c==true) {
								textField.setText(FahToCel.toString());
							}if(d==true) {
								textField.setText(FahToKel.toString());
							}if(ee==true) {
								textField.setText(KelToCel.toString());
							}if(f==true) {
								textField.setText(KelToFah.toString());
							}
						}catch(Exception e2) {
							JOptionPane.showMessageDialog(null, "incorrect value  entered");
						}
				}
			}
		});
		btnSolve.setBounds(141, 165, 142, 29);
		contentPane.add(btnSolve);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setEditable(false);
		textField.setBounds(82, 205, 269, 40);
		contentPane.add(textField);
		textField.setColumns(10);
		
		txtt = new JTextField();
		txtt.setBounds(141, 134, 148, 20);
		contentPane.add(txtt);
		txtt.setColumns(10);
	}
}
