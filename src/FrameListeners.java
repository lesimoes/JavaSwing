import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrameListeners extends JFrame {

	private JPanel contentPane;
	private JButton btnBotao_1;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameListeners frame = new FrameListeners();
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
	public FrameListeners() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		
		setContentPane(contentPane);
		ButtonListener buttonHandler = new ButtonListener();
		
		
		JButton btnBotao = new JButton("Botao 01");
		btnBotao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("BOTAO 01");
			}
		});
		contentPane.add(btnBotao, BorderLayout.WEST);
		
		JButton btnBotao_1 = new JButton("Botao 02");
		btnBotao_1.setName("button01");
		btnBotao_1.addActionListener(buttonHandler);
		
		contentPane.add(btnBotao_1, BorderLayout.CENTER);
		
		
		JButton btnBotao_2 = new JButton("Botao 03");
		contentPane.add(btnBotao_2, BorderLayout.EAST);
	}
	
	private class ButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			JButton click = (JButton) e.getSource();
			System.out.println(click.getName());
			// TODO Auto-generated method stub
			if (click.getName() == "button01") {
				System.out.print("DDD");
			}
			
			
		}
		
	}

}
