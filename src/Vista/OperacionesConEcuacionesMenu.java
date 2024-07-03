package Vista;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Cursor;

public class OperacionesConEcuacionesMenu {

	private JFrame frame;
	private Estandar Est = new Estandar();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OperacionesConEcuacionesMenu window = new OperacionesConEcuacionesMenu();
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
	public OperacionesConEcuacionesMenu() {
		initialize();
	}
	
	public void correr() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OperacionesConEcuacionesMenu window = new OperacionesConEcuacionesMenu();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.DARK_GRAY);
		Est.frameEstandar(frame);
		frame.getContentPane().setLayout(null);
		

		JLabel titulo2 = new JLabel("Ecuaciones");
		titulo2.setBounds(63, 74, 370, 68);
		Est.labelTituloEstandar(titulo2);
		frame.getContentPane().add(titulo2);
		
		JComponentOval Atras = new JComponentOval(10);
		Atras.setBounds(10, 11, 35, 21);
		Atras.setText("←");
		Est.atrasEstandar(Atras);
		frame.getContentPane().add(Atras);
		
		JComponentOval Operaciones2x2 = new JComponentOval(10);
		Operaciones2x2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				OperacionesConEcuaciones2x2 ecua = new OperacionesConEcuaciones2x2();
				frame.setVisible(false);
				ecua.correr();
			}
		});
		Operaciones2x2.setText("Operaciones 2x2");
		Operaciones2x2.setBounds(60, 177, 251, 58);
		Operaciones2x2.addHover();
		frame.getContentPane().add(Operaciones2x2);
		
		JComponentOval Operaciones3x3 = new JComponentOval(10);
		Operaciones3x3.setText("Operaciones 3x3");
		Operaciones3x3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				OperacionesConEcuaciones3x3 ecua = new OperacionesConEcuaciones3x3();
				frame.setVisible(false);
				ecua.correr();
			}
		});
		Operaciones3x3.setBounds(60, 262, 251, 58);
		Operaciones3x3.addHover();
		frame.getContentPane().add(Operaciones3x3);

		Atras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				Menu menu = new Menu();
				menu.correr();
			}
		});
		Est.CompOvalColorEstandar(Atras);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
