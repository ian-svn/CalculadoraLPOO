package Vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.UIManager;
import javax.swing.border.Border;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.geom.RoundRectangle2D;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Menu {

private JFrame frame;
private Estandar Est = new Estandar();

public static void main(String[] args) {
	EventQueue.invokeLater(new Runnable() {
		public void run() {
			try 	{
				Menu window = new Menu();
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

public void correr() {
	EventQueue.invokeLater(new Runnable() {
		public void run() {
			try {
				Menu window = new Menu();
				window.frame.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	});
}

public Menu() {
	initialize();
}

/**
* Initialize the contents of the frame.  380 x 425
*/
private void initialize() {
	frame = new JFrame();
	frameCarac(frame);
	
	JComponentOval OperacionesBasicas = new JComponentOval(10);
	OperacionesBasicas.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			OperacionesBasicas operaciones = new OperacionesBasicas();
			frame.setVisible(false);
			operaciones.correr();
		}
	});
	OperacionesBasicas.addHover();
	OperacionesBasicas.setText("Operaciones Basicas");
	OperacionesBasicas.setBounds(62, 113, 246, 48);
	frame.getContentPane().add(OperacionesBasicas);	
	
	
	JComponentOval OperacionesVectores= new JComponentOval(10);
	OperacionesVectores.setFont(new Font("Calibri", Font.BOLD, 17));
	OperacionesVectores.setContentAreaFilled(false);
	OperacionesVectores.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			OperacionesConVectores operaciones = new OperacionesConVectores();
			frame.setVisible(false);
			operaciones.correr();
		}
	});
	OperacionesVectores.addHover();
	OperacionesVectores.setText("Operaciones con Vectores");
	OperacionesVectores.setBounds(62, 242, 246, 57);
	frame.getContentPane().add(OperacionesVectores);	
	
	JComponentOval OperacionesEcuaciones = new JComponentOval(10);
	OperacionesEcuaciones.setFont(new Font("Calibri", Font.BOLD, 17));
	OperacionesEcuaciones.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			OperacionesConEcuacionesMenu operaciones = new OperacionesConEcuacionesMenu();
			frame.setVisible(false);
			operaciones.correr();
		}
	});
	OperacionesEcuaciones.addHover();
	OperacionesEcuaciones.setText("Operaciones con Ecuaciones");
	OperacionesEcuaciones.setBounds(62, 172, 246, 57);
	frame.getContentPane().add(OperacionesEcuaciones);
	
	JComponentOval OperacionesMatrices = new JComponentOval(10);
	OperacionesMatrices.setFont(new Font("Calibri", Font.BOLD, 17));
	OperacionesMatrices.setContentAreaFilled(false);
	OperacionesMatrices.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			OperacionesConMatricesMenu operaciones = new OperacionesConMatricesMenu();
			frame.setVisible(false);
			operaciones.correr();
		}
	});
	OperacionesMatrices.addHover();
	OperacionesMatrices.setText("Operaciones con Matrices");
	OperacionesMatrices.setBounds(62, 310, 246, 48);
	frame.getContentPane().add(OperacionesMatrices);	
	
	JLabel Titulo = new JLabel("Calculadoras");
	Est.labelTituloEstandar(Titulo);
	Titulo.setBounds(44, 33, 344, 69);
	frame.getContentPane().add(Titulo);
	}

	public static void frameCarac(JFrame frame) {
		frame.getContentPane().setBackground(Color.DARK_GRAY);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100, 100, 380, 425);
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setLayout(null);
	}
}