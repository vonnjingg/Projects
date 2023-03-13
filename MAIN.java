package QuizGUI;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;

public class MAIN {
	private JFrame frame;
	private final ButtonGroup Mode = new ButtonGroup();
	JRadioButton rdbtnDay;
	JRadioButton rdbtnNight;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MAIN window = new MAIN();
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
	public MAIN() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("MAIN");
		frame.setBounds(750, 300, 538, 387);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setBackground(Color.WHITE);
		frame.getContentPane().setLayout(null);
		
		JButton btnStart = new JButton("START QUIZ");
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean night = rdbtnNight.isSelected();
				boolean day = rdbtnDay.isSelected();
				
				if(night == true) {
					frame.dispose();
					nightmode nightFrame = new nightmode();
					nightFrame.setVisible(true);
				}
				else if(day == true) {
					frame.dispose();
					daymode dayFrame = new daymode();
					dayFrame.setVisible(true);
				}
				else {
					daymode dayFrame = new daymode();
					dayFrame.setVisible(true);
					frame.dispose();

				}
				
				}
		});
		btnStart.setBounds(165, 208, 181, 65);
		frame.getContentPane().add(btnStart);
		
		rdbtnNight = new JRadioButton("");
		rdbtnNight.setForeground(new Color(0, 64, 0));
		rdbtnNight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean night = rdbtnNight.isSelected();
				
				if(night == true) {
					frame.getContentPane().setBackground(Color.BLACK);
					rdbtnNight.setVisible(false);
					rdbtnDay.setVisible(true);
				}
			}
		});
		Mode.add(rdbtnNight);
		rdbtnNight.setBounds(6, 11, 37, 44);
		rdbtnNight.setBackground(null);
		rdbtnNight.setBorder(null);
		frame.getContentPane().add(rdbtnNight);
		
		ImageIcon nightmode = new ImageIcon("D:\\SWING PHOTOS\\moon.png");
		Image nightmodeimg = nightmode.getImage();
		Image modifiednightmode = nightmodeimg.getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH);
		nightmode = new ImageIcon(modifiednightmode);
		rdbtnNight.setIcon(nightmode);
		
		rdbtnDay = new JRadioButton("");
		rdbtnDay.setVisible(false);
		rdbtnDay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean day = rdbtnDay.isSelected();
				
				if(day == true) {
					frame.getContentPane().setBackground(Color.WHITE);
					rdbtnNight.setVisible(true);
					rdbtnDay.setVisible(false);
				}
			}
		});
		Mode.add(rdbtnDay);
		rdbtnDay.setBounds(6, 11, 43, 44);
		rdbtnDay.setBackground(null);
		rdbtnDay.setBorder(null);
		frame.getContentPane().add(rdbtnDay);
		
		ImageIcon daymode = new ImageIcon("D:\\SWING PHOTOS\\sun.png");
		Image daymodeimg = daymode.getImage();
		Image modifieddaymode = daymodeimg.getScaledInstance(40, 40, java.awt.Image.SCALE_SMOOTH);
		daymode = new ImageIcon(modifieddaymode);
		rdbtnDay.setIcon(daymode);
		
	}

	public void setVisible(boolean a) {
		frame.setVisible(a);
		
	}
}

