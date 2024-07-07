package Vista;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JTextArea;

import java.awt.Color;
import java.awt.Cursor;

public class Historial {

	private JFrame frame;
	private Estandar Est = new Estandar();
	private JComponentOvalTA textArea = new JComponentOvalTA(10);
	private JComponentOval Atras = new JComponentOval(5);
	private JComponentOval Volver = new JComponentOval(10);
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Historial window = new Historial();
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
	public Historial() {
		initialize();
	}

	public void pasarHistorial(List<String> lista) {
		
	}
	
	public void correr() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Historial window = new Historial();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.DARK_GRAY);
		frame.setBounds(100, 100, 380, 425);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.getContentPane().add(Atras);
		Est.atrasEstandar(Atras);
		
        textArea.setLineWrap(true); // Hacer que el texto se ajuste automáticamente al tamaño del área
        textArea.setWrapStyleWord(true); // Hacer que el texto se ajuste por palabras
		frame.getContentPane().add(textArea);

		Volver.setBounds(87, 283, 39, 29);
		Volver.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		Volver.setFont(new Font("Calibri", Font.BOLD, 17));
		Volver.setContentAreaFilled(false);
		Volver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				
			}
		});		
		Volver.addHover();
		frame.getContentPane().add(Volver);
	}

}
