import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Frame02 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame02 frame = new Frame02();
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
	public Frame02() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		ButtonListeners buttonHandler = new ButtonListeners();
		
		JButton btnNewButton = new JButton("Button01");
		btnNewButton.addActionListener(buttonHandler);
		btnNewButton.setName("btn00");
		
		btnNewButton.setBounds(17, 20, 117, 29);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Button02");
		btnNewButton_1.addActionListener(buttonHandler);
		btnNewButton_1.setName("btn01");
		
		btnNewButton_1.setBounds(27, 53, 117, 29);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Button03");

		btnNewButton_2.setBounds(198, 20, 117, 29);
		contentPane.add(btnNewButton_2);
		btnNewButton_2.addActionListener(buttonHandler);
		btnNewButton_2.setName("btn02");

		
		JButton btnNewButton_3 = new JButton("Button04");
		btnNewButton_3.addActionListener(buttonHandler);
		btnNewButton_3.setName("btn03");

		
		btnNewButton_3.setBounds(208, 61, 117, 29);
		contentPane.add(btnNewButton_3);
	}
	
	
	private class ButtonListeners implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent event) {
			// TODO Auto-generated method stub
			
			JButton botaoClicado = (JButton) event.getSource();
			
		
			if (botaoClicado.getName().contentEquals("btn02")) {
				System.out.println("Hello");
			}

			if (botaoClicado.getName().contentEquals("btn01")) {
				System.out.println("Oiii");
			}

		}
		
	}
	
	
}
