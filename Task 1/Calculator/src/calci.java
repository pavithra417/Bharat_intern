import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JFormattedTextField;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.text.JTextComponent;

public class calci {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calci window = new calci();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public calci() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 275, 371);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JFormattedTextField formattedTextField = new JFormattedTextField();
		formattedTextField.setFont(new Font("Tahoma", Font.BOLD, 18));
		formattedTextField.setBounds(10, 11, 239, 65);
		frame.getContentPane().add(formattedTextField);
		
		JButton btnbckspace = new JButton("B");
		btnbckspace.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnbckspace.setBounds(10, 87, 58, 44);
		frame.getContentPane().add(btnbckspace);
		
		JButton btnclear = new JButton("C");
		btnclear.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnclear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnclear.setBounds(70, 87, 58, 44);
		frame.getContentPane().add(btnclear);
		
		JButton btn00 = new JButton("00");
		btn00.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn00.setBounds(130, 87, 58, 44);
		frame.getContentPane().add(btn00);
		
		JButton btnplus = new JButton("+");
		btnplus.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnplus.setBounds(191, 87, 58, 44);
		frame.getContentPane().add(btnplus);
		
		JButton btn7 = new JButton("7");
		btn7.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn7.setBounds(10, 134, 58, 44);
		frame.getContentPane().add(btn7);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn4.setBounds(10, 182, 58, 44);
		frame.getContentPane().add(btn4);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn1.setBounds(10, 230, 58, 44);
		frame.getContentPane().add(btn1);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn0.getText();
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn0.setBounds(10, 278, 58, 44);
		frame.getContentPane().add(btn0);
		
		JButton btn8 = new JButton("8");
		btn8.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn8.setBounds(70, 134, 58, 44);
		frame.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn9.setHorizontalAlignment(SwingConstants.LEFT);
		btn9.setBounds(130, 134, 58, 44);
		frame.getContentPane().add(btn9);
		
		JButton btnminus = new JButton("-");
		btnminus.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnminus.setBounds(191, 134, 58, 44);
		frame.getContentPane().add(btnminus);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn5.setBounds(70, 182, 58, 44);
		frame.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn6.setBounds(130, 182, 58, 44);
		frame.getContentPane().add(btn6);
		
		JButton btnmulti = new JButton("*");
		btnmulti.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnmulti.setBounds(191, 182, 58, 44);
		frame.getContentPane().add(btnmulti);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn2.setBounds(70, 230, 58, 44);
		frame.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn3.setBounds(130, 230, 58, 44);
		frame.getContentPane().add(btn3);
		
		JButton btndivision = new JButton("/");
		btndivision.setFont(new Font("Tahoma", Font.BOLD, 18));
		btndivision.setBounds(191, 230, 58, 44);
		frame.getContentPane().add(btndivision);
		
		JButton btndot = new JButton(".");
		btndot.setFont(new Font("Tahoma", Font.BOLD, 18));
		btndot.setBounds(70, 278, 58, 44);
		frame.getContentPane().add(btndot);
		
		JButton btnequal = new JButton("=");
		btnequal.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnequal.setBounds(130, 278, 58, 44);
		frame.getContentPane().add(btnequal);
		
		JButton btnmodul = new JButton("%");
		btnmodul.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnmodul.setBounds(191, 278, 58, 44);
		frame.getContentPane().add(btnmodul);
	}
}
