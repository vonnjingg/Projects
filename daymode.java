package QuizGUI;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.awt.Font;

public class daymode {
	JButton btnAnswers;
	private JFrame frame;
	int score = 0;
	private final ButtonGroup Q1 = new ButtonGroup();
	private final ButtonGroup Q2 = new ButtonGroup();
	private final ButtonGroup Q3 = new ButtonGroup();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					daymode window = new daymode();
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
	public daymode() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {	
		frame = new JFrame("SECOND");
		frame.setBounds(750, 300, 538, 387);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setResizable(false);
		
		JButton btnBack = new JButton("Back to Main Menu");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			MAIN main = new MAIN();
			
			frame.dispose();
			
			main.setVisible(true);
			}
		});
		btnBack.setBounds(10, 11, 161, 23);
		frame.getContentPane().add(btnBack);
		
		JLabel scorecount = new JLabel();
		scorecount.setFont(new Font("Tahoma", Font.BOLD, 30));
		scorecount.setText("Your Score: " + score);
		scorecount.setForeground(new Color(0, 0, 0));
		scorecount.setBounds(135, 121, 317, 117);
		frame.getContentPane().add(scorecount);
		scorecount.setVisible(false);
		
		JLabel lblQ1 = new JLabel("1. What is the capital of the Philippines?");
		lblQ1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblQ1.setForeground(new Color(0, 0, 0));
		lblQ1.setBounds(103, 78, 317, 36);
		frame.getContentPane().add(lblQ1);
		
		JRadioButton rdbtnQ1A = new JRadioButton("Quezon City");
		rdbtnQ1A.setBackground(Color.WHITE);
		rdbtnQ1A.setForeground(new Color(0, 0, 0));
		Q1.add(rdbtnQ1A);
		rdbtnQ1A.setBounds(62, 121, 109, 23);
		frame.getContentPane().add(rdbtnQ1A);
		
		JRadioButton rdbtnQ1B = new JRadioButton("Cebu");
		rdbtnQ1B.setBackground(Color.WHITE);
		rdbtnQ1B.setForeground(new Color(0, 0, 0));
		Q1.add(rdbtnQ1B);
		rdbtnQ1B.setBounds(342, 121, 109, 23);
		frame.getContentPane().add(rdbtnQ1B);
		
		JRadioButton rdbtnQ1C = new JRadioButton("Davao ");
		rdbtnQ1C.setBackground(Color.WHITE);
		rdbtnQ1C.setForeground(new Color(0, 0, 0));
		Q1.add(rdbtnQ1C);
		rdbtnQ1C.setBounds(62, 176, 109, 23);
		frame.getContentPane().add(rdbtnQ1C);
		
		JRadioButton rdbtnQ1D = new JRadioButton("Manila");
		rdbtnQ1D.setBackground(Color.WHITE);
		rdbtnQ1D.setForeground(new Color(0, 0, 0));
		Q1.add(rdbtnQ1D);
		rdbtnQ1D.setBounds(342, 176, 109, 23);
		frame.getContentPane().add(rdbtnQ1D);
		
		///////////////////////////////////////////////////////////////////////////
		
		JLabel lblQ2 = new JLabel("2. Who is the National Hero of the Philippines?");
		lblQ2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblQ2.setForeground(new Color(0, 0, 0));
		lblQ2.setBounds(103, 78, 317, 32);
		frame.getContentPane().add(lblQ2);
		lblQ2.setVisible(false);
		
		JRadioButton rdbtnQ2A = new JRadioButton("Jose Rizal");
		rdbtnQ2A.setBackground(Color.WHITE);
		rdbtnQ2A.setForeground(new Color(0, 0, 0));
		Q2.add(rdbtnQ2A);
		rdbtnQ2A.setBounds(62, 121, 109, 23);
		frame.getContentPane().add(rdbtnQ2A);
		rdbtnQ2A.setVisible(false);
		
		JRadioButton rdbtnQ2B = new JRadioButton("Andres Bonifacio");
		rdbtnQ2B.setBackground(Color.WHITE);
		rdbtnQ2B.setForeground(new Color(0, 0, 0));
		Q2.add(rdbtnQ2B);
		rdbtnQ2B.setBounds(342, 121, 125, 23);
		frame.getContentPane().add(rdbtnQ2B);
		rdbtnQ2B.setVisible(false);
		
		JRadioButton rdbtnQ2C = new JRadioButton("Apolinario Mabini");
		rdbtnQ2C.setBackground(Color.WHITE);
		rdbtnQ2C.setForeground(new Color(0, 0, 0));
		Q2.add(rdbtnQ2C);
		rdbtnQ2C.setBounds(57, 176, 125, 23);
		frame.getContentPane().add(rdbtnQ2C);
		rdbtnQ2C.setVisible(false);
		
		JRadioButton rdbtnQ2D = new JRadioButton("Lapu-Lapu");
		rdbtnQ2D.setBackground(Color.WHITE);
		rdbtnQ2D.setForeground(new Color(0, 0, 0));
		Q2.add(rdbtnQ2D);
		rdbtnQ2D.setBounds(342, 176, 109, 23);
		frame.getContentPane().add(rdbtnQ2D);
		rdbtnQ2D.setVisible(false);
		
		///////////////////////////////////////////////////////////////////////////
		JLabel lblQ3 = new JLabel("3. In CALABARZON what does 'CA' stands for?");
		lblQ3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblQ3.setForeground(new Color(0, 0, 0));
		lblQ3.setBounds(103, 78, 317, 32);
		frame.getContentPane().add(lblQ3);
		lblQ3.setVisible(false);
		
		JRadioButton rdbtnQ3A = new JRadioButton("Cagayan");
		rdbtnQ3A.setBackground(Color.WHITE);
		rdbtnQ3A.setForeground(new Color(0, 0, 0));
		Q3.add(rdbtnQ3A);
		rdbtnQ3A.setBounds(62, 121, 109, 23);
		frame.getContentPane().add(rdbtnQ3A);
		rdbtnQ3A.setVisible(false);
		
		JRadioButton rdbtnQ3B = new JRadioButton("Catanduanes");
		rdbtnQ3B.setBackground(Color.WHITE);
		rdbtnQ3B.setForeground(new Color(0, 0, 0));
		Q3.add(rdbtnQ3B);
		rdbtnQ3B.setBounds(342, 121, 125, 23);
		frame.getContentPane().add(rdbtnQ3B);
		rdbtnQ3B.setVisible(false);
		
		JRadioButton rdbtnQ3C = new JRadioButton("Cavite");
		rdbtnQ3C.setBackground(Color.WHITE);
		rdbtnQ3C.setForeground(new Color(0, 0, 0));
		Q3.add(rdbtnQ3C);
		rdbtnQ3C.setBounds(57, 176, 125, 23);
		frame.getContentPane().add(rdbtnQ3C);
		rdbtnQ3C.setVisible(false);
		
		JRadioButton rdbtnQ3D = new JRadioButton("Capiz");
		rdbtnQ3D.setBackground(Color.WHITE);
		rdbtnQ3D.setForeground(new Color(0, 0, 0));
		Q3.add(rdbtnQ3D);
		rdbtnQ3D.setBounds(342, 176, 109, 23);
		frame.getContentPane().add(rdbtnQ3D);
		rdbtnQ3D.setVisible(false);
		
		JButton btnQ1 = new JButton("Next");
		btnQ1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean a = rdbtnQ1D.isSelected();
				
				if (a == true) {
					score++;
					scorecount.setText("Your Score: " + score);
					lblQ1.setVisible(false);
					rdbtnQ1A.setVisible(false);
					rdbtnQ1B.setVisible(false);
					rdbtnQ1C.setVisible(false);
					rdbtnQ1D.setVisible(false);
					btnQ1.setVisible(false);
					
					lblQ2.setVisible(true);
					rdbtnQ2A.setVisible(true);
					rdbtnQ2B.setVisible(true);
					rdbtnQ2C.setVisible(true);
					rdbtnQ2D.setVisible(true);
				}
				else if(Q1.isSelected(null)) {
					JOptionPane.showMessageDialog(btnQ1, "Select Answer!");
				}
				
				else {
					lblQ1.setVisible(false);
					rdbtnQ1A.setVisible(false);
					rdbtnQ1B.setVisible(false);
					rdbtnQ1C.setVisible(false);
					rdbtnQ1D.setVisible(false);
					btnQ1.setVisible(false);
					
					lblQ2.setVisible(true);
					rdbtnQ2A.setVisible(true);
					rdbtnQ2B.setVisible(true);
					rdbtnQ2C.setVisible(true);
					rdbtnQ2D.setVisible(true);
				}
				
			}
		});
		btnQ1.setBounds(365, 303, 147, 23);
		frame.getContentPane().add(btnQ1);
		
		//////////////////////////////////////////////////////////////////////////////
		
		JButton btnQ2 = new JButton("Next");
		btnQ2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean a = rdbtnQ2A.isSelected();
				
				if (a == true) {
					score++;
					scorecount.setText("Your Score: " + score);
					lblQ2.setVisible(false);
					rdbtnQ2A.setVisible(false);
					rdbtnQ2B.setVisible(false);
					rdbtnQ2C.setVisible(false);
					rdbtnQ2D.setVisible(false);
					btnQ2.setVisible(false);
					
					lblQ3.setVisible(true);
					rdbtnQ3A.setVisible(true);
					rdbtnQ3B.setVisible(true);
					rdbtnQ3C.setVisible(true);
					rdbtnQ3D.setVisible(true);
				}
				else if(Q2.isSelected(null)) {
					JOptionPane.showMessageDialog(btnQ2, "Select Answer!");
				}
				
				else {
					lblQ2.setVisible(false);
					rdbtnQ2A.setVisible(false);
					rdbtnQ2B.setVisible(false);
					rdbtnQ2C.setVisible(false);
					rdbtnQ2D.setVisible(false);
					btnQ2.setVisible(false);
					
					lblQ3.setVisible(true);
					rdbtnQ3A.setVisible(true);
					rdbtnQ3B.setVisible(true);
					rdbtnQ3C.setVisible(true);
					rdbtnQ3D.setVisible(true);
				}
				
			}
		});
		btnQ2.setBounds(365, 303, 147, 23);
		frame.getContentPane().add(btnQ2);
		
		//////////////////////////////////////////////////////////////////////////////
		
		JButton btnQ3 = new JButton("Submit");
		btnQ3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean a = rdbtnQ3C.isSelected();
				
				if (a == true) {
					score++;
					scorecount.setText("Your Score: " + score);
					lblQ3.setVisible(false);
					rdbtnQ3A.setVisible(false);
					rdbtnQ3B.setVisible(false);
					rdbtnQ3C.setVisible(false);
					rdbtnQ3D.setVisible(false);
					btnQ3.setVisible(false);
					
					
					/*lblQ3.setVisible(true);
					rdbtnQ3A.setVisible(true);
					rdbtnQ3B.setVisible(true);
					rdbtnQ3C.setVisible(true);
					rdbtnQ3D.setVisible(true);*/
					
					btnAnswers.setVisible(true);
					scorecount.setVisible(true);
				}
				else if(Q3.isSelected(null)) {
					JOptionPane.showMessageDialog(btnQ3, "Select Answer!");
				}
				
					else {
						lblQ3.setVisible(false);
					rdbtnQ3A.setVisible(false);
					rdbtnQ3B.setVisible(false);
					rdbtnQ3C.setVisible(false);
					rdbtnQ3D.setVisible(false);
					btnQ3.setVisible(false);
					
					/*lblQ3.setVisible(true);
					rdbtnQ3A.setVisible(true);
					rdbtnQ3B.setVisible(true);
					rdbtnQ3C.setVisible(true);
					rdbtnQ3D.setVisible(true);*/
					
					btnAnswers.setVisible(true);
					scorecount.setVisible(true);
				}
				
			}
		});
		btnQ3.setBounds(365, 303, 147, 23);
		frame.getContentPane().add(btnQ3);
		
		btnAnswers = new JButton("Show Correct Answer");
		btnAnswers.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblQ1.setVisible(true);
				rdbtnQ1D.setVisible(true);
				rdbtnQ1D.setSelected(true);
				rdbtnQ1D.setBounds(103, 100, 317, 32);
				
				lblQ2.setVisible(true);
				lblQ2.setBounds(103, 128, 317, 32);
				rdbtnQ2A.setVisible(true);
				rdbtnQ2A.setSelected(true);
				rdbtnQ2A.setBounds(103, 150, 317, 32);
				
				lblQ3.setVisible(true);
				lblQ3.setBounds(103, 178, 317, 32);
				rdbtnQ3C.setVisible(true);
				rdbtnQ3C.setSelected(true);
				rdbtnQ3C.setBounds(103, 200, 317, 32);
				
				scorecount.setVisible(false);
				btnAnswers.setVisible(false);
			}
		});
		btnAnswers.setBounds(168, 235, 177, 32);
		frame.getContentPane().add(btnAnswers);
		btnAnswers.setVisible(false);
	}

	public void setVisible(boolean a) {
		frame.setVisible(a);
	}
}
