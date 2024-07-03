package Vista;

import java.awt.EventQueue;

import java.util.List;
import java.util.ArrayList;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Cursor;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Panel;
import javax.swing.SwingConstants;

public class OperacionesBasicas {

	private JFrame frame;
	private Estandar Est = new Estandar();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OperacionesBasicas window = new OperacionesBasicas();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public void correr() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OperacionesBasicas window = new OperacionesBasicas();
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
	
	private void initialize() {
		frame = new JFrame();
		Est.frameEstandar(frame);

		JTextField Calculo = new JTextField();
		Calculo.setBorder(null);
		Calculo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				return;
			}
		});
		Calculo.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		Calculo.setBackground(Color.GRAY);
		Calculo.setFont(new Font("Calibri", Font.BOLD, 20));
		Calculo.setBounds(64, 73, 241, 50);
		Calculo.setForeground(Color.white);
		Calculo.setFocusable(false);
		
		frame.getContentPane().add(Calculo);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JComponentOval PanelCalculo = new JComponentOval(10);
		PanelCalculo.setHorizontalAlignment(SwingConstants.LEADING);
		PanelCalculo.setFont(new Font("Calibri", Font.BOLD, 20));
		PanelCalculo.setContentAreaFilled(false);
		PanelCalculo.setText("");
		PanelCalculo.setBounds(49, 62, 272, 72);
		Est.panelEstandar(PanelCalculo);
		frame.getContentPane().add(PanelCalculo);
		
		
		JComponentOval Uno = new JComponentOval(10);
		Uno.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		Uno.setFont(new Font("Calibri", Font.BOLD, 17));
		Uno.setContentAreaFilled(false);
		Uno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Calculo.setText(Calculo.getText() + "1");
			}
		});
		Uno.setText("1");
		Uno.setBounds(49, 162, 47, 40);
		Uno.addHover();
		frame.getContentPane().add(Uno);
		
		JComponentOval Dos = new JComponentOval(10);
		Dos.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		Dos.setFont(new Font("Calibri", Font.BOLD, 17));
		Dos.setContentAreaFilled(false);
		Dos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Calculo.setText(Calculo.getText() + "2");
			}
		});		
		Dos.setText("2");
		Dos.setBounds(106, 162, 47, 40);
		Dos.addHover();
		frame.getContentPane().add(Dos);
		
		JComponentOval Tres = new JComponentOval(10);
		Tres.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		Tres.setFont(new Font("Calibri", Font.BOLD, 17));
		Tres.setContentAreaFilled(false);
		Tres.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Calculo.setText(Calculo.getText() + "3");
			}
		});		
		Tres.setText("3");
		Tres.setBounds(162, 162, 47, 40);
		Tres.addHover();
		frame.getContentPane().add(Tres);
		
		JComponentOval Cuatro = new JComponentOval(10);
		Cuatro.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		Cuatro.setFont(new Font("Calibri", Font.BOLD, 17));
		Cuatro.setContentAreaFilled(false);
		Cuatro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Calculo.setText(Calculo.getText() + "4");
			}
		});		
		Cuatro.setText("4");
		Cuatro.setBounds(49, 211, 47, 40);
		Cuatro.addHover();
		frame.getContentPane().add(Cuatro);	
		
		
		JComponentOval Cinco = new JComponentOval(10);
		Cinco.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		Cinco.setFont(new Font("Calibri", Font.BOLD, 17));
		Cinco.setContentAreaFilled(false);
		Cinco.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Calculo.setText(Calculo.getText() + "5");
			}
		});		
		Cinco.setText("5");
		Cinco.setBounds(106, 211, 47, 40);
		Cinco.addHover();
		frame.getContentPane().add(Cinco);	
		
		
		JComponentOval Seis = new JComponentOval(10);
		Seis.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		Seis.setFont(new Font("Calibri", Font.BOLD, 17));
		Seis.setContentAreaFilled(false);
		Seis.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Calculo.setText(Calculo.getText() + "6");
			}
		});		
		Seis.setText("6");
		Seis.setBounds(162, 213, 47, 40);
		Seis.addHover();
		frame.getContentPane().add(Seis);
		
		JComponentOval Sieste = new JComponentOval(10);
		Sieste.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		Sieste.setFont(new Font("Calibri", Font.BOLD, 17));
		Sieste.setContentAreaFilled(false);
		Sieste.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Calculo.setText(Calculo.getText() + "7");
			}
		});		
		Sieste.setText("7");
		Sieste.setBounds(49, 262, 47, 40);
		Sieste.addHover();
		frame.getContentPane().add(Sieste);
		
		JComponentOval Ocho = new JComponentOval(10);
		Ocho.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		Ocho.setFont(new Font("Calibri", Font.BOLD, 17));
		Ocho.setContentAreaFilled(false);
		Ocho.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Calculo.setText(Calculo.getText() + "8");
			}
		});		
		Ocho.setText("8");
		Ocho.setBounds(106, 262, 47, 40);
		Ocho.addHover();
		frame.getContentPane().add(Ocho);
		
		JComponentOval Nueve = new JComponentOval(10);
		Nueve.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		Nueve.setFont(new Font("Calibri", Font.BOLD, 17));
		Nueve.setContentAreaFilled(false);
		Nueve.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Calculo.setText(Calculo.getText() + "9");
			}
		});		
		Nueve.setText("9");
		Nueve.setBounds(162, 262, 47, 40);
		Nueve.addHover();
		frame.getContentPane().add(Nueve);
		
		JComponentOval Cero = new JComponentOval(10);
		Cero.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		Cero.setFont(new Font("Calibri", Font.BOLD, 17));
		Cero.setContentAreaFilled(false);
		Cero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Calculo.setText(Calculo.getText() + "0");
			}
		});		
		Cero.setText("0");
		Cero.setBounds(49, 313, 104, 40);
		Cero.addHover();
		frame.getContentPane().add(Cero);
	
		
		
		JComponentOval Ac = new JComponentOval(10);
		Ac.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		Ac.setFont(new Font("Calibri", Font.BOLD, 17));
		Ac.setContentAreaFilled(false);
		Est.CompOvalColorEstandar(Ac);
		Ac.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Calculo.setText("");
			}
		});		
		Ac.setText("AC");
		Ac.setBounds(274, 162, 47, 40);
		frame.getContentPane().add(Ac);
		
		JComponentOval Por = new JComponentOval(10);
		Por.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		Por.setFont(new Font("Calibri", Font.BOLD, 17));
		Por.setContentAreaFilled(false);
		Por.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Calculo.setText(Calculo.getText() + "x");
			}
		});		
		Por.setText("x");
		Por.setBounds(217, 213, 47, 40);
		Por.addHover();
		frame.getContentPane().add(Por);
		
		JComponentOval Del = new JComponentOval(10);
		Del.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		Est.CompOvalColorEstandar(Del);
		Del.setFont(new Font("Calibri", Font.BOLD, 17));
		Del.setContentAreaFilled(false);
		Del.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String txt = Calculo.getText();
				if(Calculo.getText().length()==0) {
					return;
				} else {
					Calculo.setText(txt.substring(0, txt.length() - 1));
				}
			}
		});	
		Del.setText("DEL");
		Del.setBounds(217, 162, 47, 40);
		frame.getContentPane().add(Del);
		
		JComponentOval Punto = new JComponentOval(10);
		Punto.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		Punto.setFont(new Font("Calibri", Font.BOLD, 17));
		Punto.setContentAreaFilled(false);
		Punto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Calculo.setText(Calculo.getText() + ".");
			}
		});		
		Punto.setText(".");
		Punto.setBounds(162, 313, 47, 40);
		Punto.addHover();
		frame.getContentPane().add(Punto);
		
		JComponentOval Mas = new JComponentOval(10);
		Mas.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		Mas.setFont(new Font("Calibri", Font.BOLD, 17));
		Mas.setContentAreaFilled(false);
		Mas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Calculo.setText(Calculo.getText() + "+");
			}
		});		
		Mas.setText("+");
		Mas.setBounds(217, 262, 47, 40);
		Mas.addHover();
		frame.getContentPane().add(Mas);
		
		
		JComponentOval Resta = new JComponentOval(10);
		Resta.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		Resta.setFont(new Font("Calibri", Font.BOLD, 17));
		Resta.setContentAreaFilled(false);
		Resta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Calculo.setText(Calculo.getText() + "-");
			}
		});		
		Resta.setText("-");
		Resta.setBounds(274, 262, 47, 40);
		Resta.addHover();
		frame.getContentPane().add(Resta);
		
		
		JComponentOval Dividir = new JComponentOval(10);
		Dividir.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		Dividir.setFont(new Font("Calibri", Font.BOLD, 17));
		Dividir.setContentAreaFilled(false);
		Dividir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Calculo.setText(Calculo.getText() + "/");
			}
		});		
		Dividir.setText("/");
		Dividir.setBounds(274, 213, 47, 40);
		Dividir.addHover();
		frame.getContentPane().add(Dividir);
		
		
		JComponentOval Igual = new JComponentOval(10);
		Igual.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		Igual.setFont(new Font("Calibri", Font.BOLD, 17));
		Est.CompOvalColorEstandar(Igual);
		Igual.setContentAreaFilled(false);
		Igual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(Calculo.getText().contains(".")||Calculo.getText().contains("/")) {
					
				}
				
				if(Calculo.getText().length()==0) {
					return;
				}

				List<String> calculos = new ArrayList<>();
				List<Character> operaciones = new ArrayList<>();
				
				String calculo = Calculo.getText();
				
				int terminoIndice = 0;
				for (int x = 0; x < calculo.length(); x++) {
				
					if (calculo.charAt(x) == '+' || calculo.charAt(x) == '-') {
						String calculito = calculo.substring(terminoIndice, x);
						terminoIndice = x + 1;
						calculos.add(calculito);
						operaciones.add(calculo.charAt(x));
					}
					if (x + 1 == calculo.length()) {
						calculos.add(calculo.substring(terminoIndice, x + 1));
					}	
				}

				for (int i = 0; i < calculos.size(); i++) {
					String termino = calculos.get(i);
					if (termino.contains("x") || termino.contains("/")) {
						double resultado = resolver(termino);
						calculos.set(i, String.valueOf(resultado));
					}
				}

				double resultadoFinal = 0;
				
				try {
					if (!calculos.isEmpty()) {
						resultadoFinal = Double.parseDouble(calculos.get(0));
					}
				
					for (int i = 0; i < operaciones.size(); i++) {
						
						double siguienteNumero = Double.parseDouble(calculos.get(i + 1));
						char operacion = operaciones.get(i);
						
						if (operacion == '+') {
							resultadoFinal += siguienteNumero;
						} else if (operacion == '-') {
							resultadoFinal -= siguienteNumero;
						}

					}
					
					try {
						if(String.valueOf(resultadoFinal).substring(Calculo.getText().length()-1,Calculo.getText().length()+1).equals(".0")) {
							Calculo.setText(String.valueOf(resultadoFinal).substring(0,Calculo.getText().length()-1));
							return;
						}
					}
					catch(StringIndexOutOfBoundsException ee) {
						Calculo.setText(String.valueOf(roundToDecimals(resultadoFinal)));
						return;
					}
					
					Calculo.setText(String.valueOf(roundToDecimals(resultadoFinal)));
					
				} catch (NumberFormatException err) {
						Calculo.setText("Error Sintactico: " + err.getMessage());
				}
			}
		});
		Igual.setText("=");
		Igual.setBounds(217, 313, 104, 40);
		frame.getContentPane().add(Igual);
		
		JComponentOval Atras = new JComponentOval(10);
		Atras.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		Atras.setFont(new Font("Calibri", Font.BOLD, 17));
		Atras.setContentAreaFilled(false);
		Atras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				Menu menu = new Menu();
				menu.correr();
			}
		});
		Est.CompOvalColorEstandar(Atras);
		Atras.setText("←");
		Atras.setBounds(10, 11, 47, 32);
		frame.getContentPane().add(Atras);
	}
	
	public OperacionesBasicas() {
		initialize();
	}

	public static double resolver(String calculo) {
		
		List<String> calculos = new ArrayList<>();
		List<Character> operaciones = new ArrayList<>();
		int terminoIndice = 0;
		
		for (int x = 0; x < calculo.length(); x++) {
			if (calculo.charAt(x) == 'x' || calculo.charAt(x) == '/') {
				String calculito = calculo.substring(terminoIndice, x);
				terminoIndice = x + 1;
				calculos.add(calculito);
				operaciones.add(calculo.charAt(x));
			}
			
			if (x + 1 == calculo.length()) {
				calculos.add(calculo.substring(terminoIndice, x + 1));
			}
		}
	
		double resultado = 0;
		
		try {
			
			if (!calculos.isEmpty()) {
				resultado = Double.parseDouble(calculos.get(0));
			}
			
			for (int i = 0; i < operaciones.size(); i++) {
				
				double siguienteNumero = Double.parseDouble(calculos.get(i + 1));
				char operacion = operaciones.get(i);
				
				if (operacion == 'x') {
					resultado *= siguienteNumero;
				} else if (operacion == '/') {
					resultado /= siguienteNumero;
				}
				
			}
		}
		catch(Exception e) {
			
		}
			
		return resultado;
	}
	
	public static double roundToDecimals(double value) {
    	int decimals = 5;
        double scale = Math.pow(10, decimals);
        return Math.round(value * scale) / scale;
    }
}
