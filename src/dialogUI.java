import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class dialogUI extends JDialog {

	private final JPanel contentPanel = new JPanel();
	public int count;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			dialogUI dialog = new dialogUI();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public dialogUI() {
		setBounds(100, 100, 418, 110);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setLayout(new FlowLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		
		JLabel lblCount = new JLabel("VOU MUDAR");
		contentPanel.add(lblCount);
		{
			count = 0;
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			
				JButton okButton = new JButton("Cancel");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
				
				
				okButton.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						count ++;
						lblCount.setText(count + "");
					}
					
				});
			
			
				JButton cancelButton = new JButton("Ok");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						System.out.println("Apertou o Botão!");
					
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			
		}
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenuItem mntmMenuItem = new JMenuItem("menu item");
		menuBar.add(mntmMenuItem);
	}
	

}
