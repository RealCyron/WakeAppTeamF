import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JRadioButton;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JInternalFrame;
import javax.swing.BoxLayout;
import java.awt.Component;
import javax.swing.JFormattedTextField;

public class WakeAppUI {

	private JFrame frame;
	private JTextField txtUhrzeit;
	private JTextField textField_1;
	private JTextField textField;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WakeAppUI window = new WakeAppUI();
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
	public WakeAppUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.SOUTH);
		
		JRadioButton ÖPNV = new JRadioButton("\u00D6PNV");
		panel.add(ÖPNV);
		
		JRadioButton Auto = new JRadioButton("Auto");
		panel.add(Auto);
		
		JRadioButton Fahrrad = new JRadioButton("Fahrrad");
		panel.add(Fahrrad);
		
		JPanel panel_1 = new JPanel();
		frame.getContentPane().add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new BoxLayout(panel_1, BoxLayout.X_AXIS));
		
		JLabel AnkuftszeitLabel = new JLabel("Ankuftszeit:");
		panel_1.add(AnkuftszeitLabel);
		
		txtUhrzeit = new JTextField();
		txtUhrzeit.setText("Uhrzeit");
		txtUhrzeit.setToolTipText("Uhrzeit");
		panel_1.add(txtUhrzeit);
		txtUhrzeit.setColumns(1);
		
		JLabel FertigmachenLabel = new JLabel("Ben\u00F6tigte Zeit zum Fertigmachen:");
		panel_1.add(FertigmachenLabel);
		
		textField_1 = new JTextField();
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel WohnortLabel = new JLabel("Wohnort:");
		panel_1.add(WohnortLabel);
		
		textField = new JTextField();
		textField.setText("");
		panel_1.add(textField);
		textField.setColumns(10);
		
		JLabel ZielortLabel = new JLabel("Zielort:");
		panel_1.add(ZielortLabel);
		
		textField_2 = new JTextField();
		panel_1.add(textField_2);
		textField_2.setColumns(10);
	}

}
