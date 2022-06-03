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
import javax.swing.JButton;

import java.awt.Font;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ButtonGroup;

import UIDatabaseConnector.UIDatabaseConnector;
import UIDatabaseConnector.DataStorage;

public class WakeAppUI {

	private JFrame frame;
	private JTextField txtUhrzeit;
	private JTextField txtZeitInMinuten;
	private JTextField txtAdresse;
	private JTextField txtAdresse_1;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField txtWeckzeit;
	UIDatabaseConnector uiDatabaseConnector = new UIDatabaseConnector();
	Datastorage dataStorage = new DataStorage();

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
		frame.setBounds(100, 100, 438, 550);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblAnkunftszeit = new JLabel("Ankunftszeit:");
		lblAnkunftszeit.setBounds(50, 51, 77, 36);
		frame.getContentPane().add(lblAnkunftszeit);
		
		JLabel lblBentigteZeitZum = new JLabel("Ben\u00F6tigte Zeit zum Fertigmachen:");
		lblBentigteZeitZum.setBounds(50, 111, 167, 36);
		frame.getContentPane().add(lblBentigteZeitZum);
		
		JLabel lblWohnort = new JLabel("Wohnort:");
		lblWohnort.setBounds(50, 169, 77, 36);
		frame.getContentPane().add(lblWohnort);
		
		JLabel lblZielort = new JLabel("Zielort:");
		lblZielort.setBounds(50, 232, 77, 36);
		frame.getContentPane().add(lblZielort);
		
		JRadioButton rdbtnOepnv = new JRadioButton("\u00D6PNV");
		buttonGroup.add(rdbtnOepnv);
		rdbtnOepnv.setBounds(50, 329, 109, 23);
		frame.getContentPane().add(rdbtnOepnv);
		
		JRadioButton rdbtnAuto = new JRadioButton("Auto");
		buttonGroup.add(rdbtnAuto);
		rdbtnAuto.setBounds(161, 329, 109, 23);
		frame.getContentPane().add(rdbtnAuto);
		
		JRadioButton rdbtnFahrrad = new JRadioButton("Fahrrad");
		buttonGroup.add(rdbtnFahrrad);
		rdbtnFahrrad.setBounds(272, 329, 109, 23);
		frame.getContentPane().add(rdbtnFahrrad);
		
		
		
		JLabel lblTransportmittel = new JLabel("Transportmittel:");
		lblTransportmittel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTransportmittel.setBounds(50, 299, 109, 23);
		frame.getContentPane().add(lblTransportmittel);
		
		txtUhrzeit = new JTextField();
		txtUhrzeit.setText("Uhrzeit");
		txtUhrzeit.setToolTipText("");
		txtUhrzeit.setForeground(new Color(0, 0, 0));
		txtUhrzeit.setBounds(260, 51, 109, 36);
		frame.getContentPane().add(txtUhrzeit);
		txtUhrzeit.setColumns(10);
		
		txtZeitInMinuten = new JTextField();
		txtZeitInMinuten.setText("Zeit in Minuten");
		txtZeitInMinuten.setForeground(new Color(0, 0, 0));
		txtZeitInMinuten.setColumns(10);
		txtZeitInMinuten.setBounds(260, 111, 109, 36);
		frame.getContentPane().add(txtZeitInMinuten);
		
		txtAdresse = new JTextField();
		txtAdresse.setText("Adresse");
		txtAdresse.setForeground(new Color(0, 0, 0));
		txtAdresse.setColumns(10);
		txtAdresse.setBounds(260, 177, 109, 36);
		frame.getContentPane().add(txtAdresse);
		
		txtAdresse_1 = new JTextField();
		txtAdresse_1.setText("Adresse");
		txtAdresse_1.setForeground(new Color(0, 0, 0));
		txtAdresse_1.setColumns(10);
		txtAdresse_1.setBounds(260, 240, 109, 36);
		frame.getContentPane().add(txtAdresse_1);
		
		JLabel lblWakeApp = new JLabel("WakeApp");
		lblWakeApp.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblWakeApp.setBounds(161, 11, 71, 23);
		frame.getContentPane().add(lblWakeApp);
		
		JButton btnBerechnen = new JButton("Berechnen");
		btnBerechnen.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				uiDatabaseConnector.setAnkunftszeit(txtUhrzeit.getText());
				uiDatabaseConnector.setFertigmachZeit(txtZeitInMinuten.getText());
				uiDatabaseConnector.setWohnort(txtAdresse.getText());
				uiDatabaseConnector.setZielort(txtAdresse_1.getText());
				uiDatabaseConnector.setOepnv(rdbtnOepnv.isSelected());
				uiDatabaseConnector.setAuto(rdbtnAuto.isSelected());
				uiDatabaseConnector.setFahrrad(rdbtnFahrrad.isSelected());
				uiDatabaseConnector.setWeckzeit(txtWeckzeit.getText());
				dataStorage.speichern();
			}
		});
		btnBerechnen.setBounds(143, 389, 89, 23);
		frame.getContentPane().add(btnBerechnen);
		
		txtWeckzeit = new JTextField();
		txtWeckzeit.setBounds(143, 451, 86, 20);
		frame.getContentPane().add(txtWeckzeit);
		txtWeckzeit.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Stellen Sie Ihren Wecker auf die folgende Uhrzeit:");
		lblNewLabel_2.setBounds(50, 426, 315, 14);
		frame.getContentPane().add(lblNewLabel_2);
	}
}
