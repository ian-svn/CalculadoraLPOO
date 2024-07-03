package Vista;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Estandar {

	public void frameEstandar(JFrame frame) {
		frame.getContentPane().setBackground(Color.DARK_GRAY);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100, 100, 380, 425);
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setLayout(null);
	}
	
	public void atrasEstandar(JComponentOval atras) {
		atras.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		atras.setFont(new Font("Calibri", Font.BOLD, 17));
		atras.setContentAreaFilled(false);
		atras.setText("←");
		atras.setBounds(10, 11, 47, 32);
		atras.addHover();
	}
	
	public void labelTituloEstandar(JLabel label) {
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Calibri", Font.BOLD, 53));
	}
	
	public void labelEstandar(JLabel label) {
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Calibri", Font.BOLD, 16));
	}
	
	public void CompOvalColorEstandar(JComponentOval oval) {
		oval.setBackground(new Color(180, 46, 231));
		oval.addHover(new Color(194,85,236));
	}
	
	public void panelEstandar(JComponentOval panel) {
		panel.setContentAreaFilled(false);
		panel.setFont(new Font("Calibri", Font.BOLD, 17));
		panel.setForeground(new Color(255, 255, 255));
		panel.setBackground(Color.GRAY);
		panel.setFocusPainted(false);
		panel.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
    }
}
