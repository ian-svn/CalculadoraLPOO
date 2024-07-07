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
import javax.swing.JToggleButton;
import javax.swing.JList;

public class OperacionesBasicas {

	private JFrame frame;
	private Estandar Est = new Estandar();
	private int countPunto=0;

	private JComponentOval Punto = new JComponentOval(10);
	private JComponentOval Del = new JComponentOval(10);
	private JComponentOval Por = new JComponentOval(10);
	private JComponentOval Ac = new JComponentOval(10);
	private JComponentOval Mas = new JComponentOval(10);
	private JComponentOval Resta = new JComponentOval(10);
	private JComponentOval Dividir = new JComponentOval(10);
	private JComponentOval Igual = new JComponentOval(10);
	private JTextField Calculo = new JTextField();
	private JComponentOval Atras = new JComponentOval(10);
	private JComponentOval Raiz = new JComponentOval(10);
	private JComponentOval Potencia = new JComponentOval(10);
	private List<String> registros = new ArrayList<>();
	private JComponentOval Registro = new JComponentOval(10);
	private int count=0;
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
		frame.getContentPane().setBackground(Color.DARK_GRAY);
		Est.frameEstandar(frame);

		Calculo.setBorder(null);
		Calculo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				return;
			}
		});
		frame.getContentPane().setLayout(null);
		Calculo.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		Calculo.setBackground(Color.GRAY);
		Calculo.setFont(new Font("Calibri", Font.BOLD, 20));
		Calculo.setBounds(52, 73, 270, 50);
		Calculo.setForeground(Color.white);
		Calculo.setFocusable(false);
		
		frame.getContentPane().add(Calculo);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JComponentOval PanelCalculo = new JComponentOval(10);
		PanelCalculo.setHorizontalAlignment(SwingConstants.LEADING);
		PanelCalculo.setFont(new Font("Calibri", Font.BOLD, 20));
		PanelCalculo.setContentAreaFilled(false);
		PanelCalculo.setText("");
		PanelCalculo.setBounds(39, 62, 294, 72);
		Est.panelEstandar(PanelCalculo);
		frame.getContentPane().add(PanelCalculo);
		
		
		JComponentOval Uno = new JComponentOval(10);
		Uno.setBackground(Color.GRAY);
		Uno.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		Uno.setFont(new Font("Calibri", Font.BOLD, 17));
		Uno.setContentAreaFilled(false);
		Uno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Calculo.setText(Calculo.getText() + "1");
				borrarError();
			}
		});
		Uno.setText("1");
		Uno.setBounds(58, 176, 43, 36);
		Uno.addHover();
		frame.getContentPane().add(Uno);
		
		JComponentOval Dos = new JComponentOval(10);
		Dos.setBackground(Color.GRAY);
		Dos.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		Dos.setFont(new Font("Calibri", Font.BOLD, 17));
		Dos.setContentAreaFilled(false);
		Dos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Calculo.setText(Calculo.getText() + "2");
				borrarError();
			}
		});		
		Dos.setText("2");
		Dos.setBounds(111, 176, 43, 36);
		Dos.addHover();
		frame.getContentPane().add(Dos);
		
		JComponentOval Tres = new JComponentOval(10);
		Tres.setBackground(Color.GRAY);
		Tres.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		Tres.setFont(new Font("Calibri", Font.BOLD, 17));
		Tres.setContentAreaFilled(false);
		Tres.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Calculo.setText(Calculo.getText() + "3");
				borrarError();
			}
		});		
		Tres.setText("3");
		Tres.setBounds(164, 176, 43, 36);
		Tres.addHover();
		frame.getContentPane().add(Tres);
		
		JComponentOval Cuatro = new JComponentOval(10);
		Cuatro.setBackground(Color.GRAY);
		Cuatro.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		Cuatro.setFont(new Font("Calibri", Font.BOLD, 17));
		Cuatro.setContentAreaFilled(false);
		Cuatro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Calculo.setText(Calculo.getText() + "4");
				borrarError();
			}
		});		
		Cuatro.setText("4");
		Cuatro.setBounds(58, 223, 43, 36);
		Cuatro.addHover();
		frame.getContentPane().add(Cuatro);	
		
		
		JComponentOval Cinco = new JComponentOval(10);
		Cinco.setBackground(Color.GRAY);
		Cinco.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		Cinco.setFont(new Font("Calibri", Font.BOLD, 17));
		Cinco.setContentAreaFilled(false);
		Cinco.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Calculo.setText(Calculo.getText() + "5");
				borrarError();
			}
		});		
		Cinco.setText("5");
		Cinco.setBounds(111, 223, 43, 36);
		Cinco.addHover();
		frame.getContentPane().add(Cinco);	
		
		
		JComponentOval Seis = new JComponentOval(10);
		Seis.setBackground(Color.GRAY);
		Seis.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		Seis.setFont(new Font("Calibri", Font.BOLD, 17));
		Seis.setContentAreaFilled(false);
		Seis.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Calculo.setText(Calculo.getText() + "6");
				borrarError();
			}
		});		
		Seis.setText("6");
		Seis.setBounds(164, 223, 43, 36);
		Seis.addHover();
		frame.getContentPane().add(Seis);
		
		JComponentOval Sieste = new JComponentOval(10);
		Sieste.setBackground(Color.GRAY);
		Sieste.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		Sieste.setFont(new Font("Calibri", Font.BOLD, 17));
		Sieste.setContentAreaFilled(false);
		Sieste.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Calculo.setText(Calculo.getText() + "7");
				borrarError();
			}
		});		
		Sieste.setText("7");
		Sieste.setBounds(58, 270, 43, 36);
		Sieste.addHover();
		frame.getContentPane().add(Sieste);
		
		JComponentOval Ocho = new JComponentOval(10);
		Ocho.setBackground(Color.GRAY);
		Ocho.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		Ocho.setFont(new Font("Calibri", Font.BOLD, 17));
		Ocho.setContentAreaFilled(false);
		Ocho.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Calculo.setText(Calculo.getText() + "8");
				borrarError();
			}
		});		
		Ocho.setText("8");
		Ocho.setBounds(111, 270, 43, 36);
		Ocho.addHover();
		frame.getContentPane().add(Ocho);
		
		JComponentOval Nueve = new JComponentOval(10);
		Nueve.setBackground(Color.GRAY);
		Nueve.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		Nueve.setFont(new Font("Calibri", Font.BOLD, 17));
		Nueve.setContentAreaFilled(false);
		Nueve.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Calculo.setText(Calculo.getText() + "9");
				borrarError();
			}
		});		
		Nueve.setText("9");
		Nueve.setBounds(164, 270, 43, 36);
		Nueve.addHover();
		frame.getContentPane().add(Nueve);

		JComponentOval Cero = new JComponentOval(10);
		Cero.setBackground(Color.GRAY);
		Cero.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		Cero.setFont(new Font("Calibri", Font.BOLD, 17));
		Cero.setContentAreaFilled(false);
		Cero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Calculo.setText(Calculo.getText() + "0");
				borrarError();
			}
		});		
		Cero.setText("0");
		Cero.setBounds(58, 317, 43, 36);
		Cero.addHover();
		frame.getContentPane().add(Cero);
		Ac.setBackground(Color.GRAY);
	
		

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
		Ac.setBounds(270, 176, 43, 36);
		frame.getContentPane().add(Ac);
		Por.setBackground(Color.GRAY);

		Por.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		Por.setFont(new Font("Calibri", Font.BOLD, 17));
		Por.setContentAreaFilled(false);
		Por.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				borrarError();
				if(noAntesDeOperador()) {
					return;
				}
				Calculo.setText(Calculo.getText() + "x");
			}
		});		
		Por.setText("x");
		Por.setBounds(217, 223, 43, 36);
		Por.addHover();
		frame.getContentPane().add(Por);
		Del.setBackground(Color.GRAY);

		Del.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		Est.CompOvalColorEstandar(Del);
		Del.setFont(new Font("Calibri", Font.BOLD, 17));
		Del.setContentAreaFilled(false);
		Del.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				borrarError();
				String txt = Calculo.getText();
				if(noAntesDeOperador()) {
					countPunto=1;
				}
				if(Calculo.getText().length()==0) {
					return;
				} else {
					Calculo.setText(txt.substring(0, txt.length() - 1));
				}
			}
		});	
		Del.setText("DEL");
		Del.setBounds(217, 176, 43, 36);
		frame.getContentPane().add(Del);
		Punto.setBackground(Color.GRAY);
		
		Punto.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		Punto.setFont(new Font("Calibri", Font.BOLD, 17));
		Punto.setContentAreaFilled(false);
		Punto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				borrarError();
				if(Calculo.getText().length()==0){
					Calculo.setText(Calculo.getText() + ".");
					countPunto++;
					return;
				}
				if(noAntesDeOperador()) {
					return;
				}
				if(countPunto!=0) {
					return;
				}
				Calculo.setText(Calculo.getText() + ".");
				countPunto++;
			}
		});		
		Punto.setText(".");
		Punto.setBounds(111, 317, 43, 36);
		Punto.addHover();
		frame.getContentPane().add(Punto);
		Mas.setBackground(Color.GRAY);

		Mas.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		Mas.setFont(new Font("Calibri", Font.BOLD, 17));
		Mas.setContentAreaFilled(false);
		Mas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				borrarError();
				if(noAntesDeOperador()) {
					return;
				}
				Calculo.setText(Calculo.getText() + "+");
				countPunto=0;
			}
		});		
		Mas.setText("+");
		Mas.setBounds(217, 269, 43, 36);
		Mas.addHover();
		frame.getContentPane().add(Mas);
		Resta.setBackground(Color.GRAY);
		

		Resta.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		Resta.setFont(new Font("Calibri", Font.BOLD, 17));
		Resta.setContentAreaFilled(false);
		Resta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				borrarError();
				if(Calculo.getText().length()==0){
					Calculo.setText(Calculo.getText() + "-");
					return;
				}
				if(noAntesDeOperador()) {
					return;
				}
				Calculo.setText(Calculo.getText() + "-");
			}
		});		
		Resta.setText("-");
		Resta.setBounds(270, 270, 43, 36);
		Resta.addHover();
		frame.getContentPane().add(Resta);
		Dividir.setBackground(Color.GRAY);
		

		Dividir.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		Dividir.setFont(new Font("Calibri", Font.BOLD, 17));
		Dividir.setContentAreaFilled(false);
		Dividir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				borrarError();
				if(noAntesDeOperador()) {
					return;
				}
				Calculo.setText(Calculo.getText() + "/");
				countPunto=0;
			}
		});		
		Dividir.setText("/");
		Dividir.setBounds(270, 224, 43, 36);
		Dividir.addHover();
		frame.getContentPane().add(Dividir);

		Potencia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				borrarError();
				if(noAntesDeOperador()) {
					return;
				}
				Calculo.setText(Calculo.getText() + "^");
			}
		});
		Potencia.setText("^");
		Potencia.setFont(new Font("Calibri", Font.BOLD, 17));
		Potencia.setContentAreaFilled(false);
		Potencia.setBackground(Color.GRAY);
		Potencia.setBounds(164, 317, 43, 36);
		frame.getContentPane().add(Potencia);
		
		
		Raiz.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				borrarError();
				if(noAntesDeOperador()) {
					return;
				}
				Calculo.setText(Calculo.getText() + "√");
			}
		});
		
		
		Raiz.setText("√");
		Raiz.setFont(new Font("Calibri", Font.BOLD, 17));
		Raiz.setContentAreaFilled(false);
		Raiz.setBackground(Color.GRAY);
		Raiz.setBounds(217, 317, 43, 36);
		frame.getContentPane().add(Raiz);
		
		Igual.setBackground(Color.GRAY);
		

		Igual.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		Igual.setFont(new Font("Calibri", Font.BOLD, 17));
		Est.CompOvalColorEstandar(Igual);
		Igual.setContentAreaFilled(false);
		Igual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				borrarError();

				
				if(Calculo.getText().length()==0) {
					return;
				}
				if(Calculo.getText().endsWith("/0")) {
					Calculo.setText("No se puede dividir por 0");
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
					if (termino.contains("x") || termino.contains("/") || termino.contains("^")|| termino.contains("√")) {
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
					Registro.setVisible(true);
					hacerRegistro(resultadoFinal);
						if(String.valueOf(resultadoFinal).endsWith(".0")) {
							String ResulTxt = String.valueOf(resultadoFinal);
							Calculo.setText(ResulTxt.substring(0,ResulTxt.length()-2));
							return;
						} else {
							Calculo.setText(String.valueOf(roundToDecimals(resultadoFinal)));
							return;
						}				
					
				} catch (NumberFormatException err) {
						count--;
						Calculo.setText("Error Sintactico: " + err.getMessage());
				}
			}
		});
		Igual.setText("=");
		Igual.setBounds(270, 317, 43, 36);
		frame.getContentPane().add(Igual);
		Atras.setBounds(10, 11, 47, 26);
		
		Atras.setBackground(Color.DARK_GRAY);
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
		frame.getContentPane().add(Atras);
		
		Registro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		Registro.setText("Resgistro");
		Registro.setVisible(false);
		Registro.setBounds(267, 11, 87, 28);
		frame.getContentPane().add(Registro);
		
		
	}
	

	public boolean noAntesDeOperador() {
		if(Calculo.getText().length()==0) {
			return true;
		}
		String text=Calculo.getText();
		int ultPos=Calculo.getText().length()-1;
		
		if(text.charAt(ultPos)=='.'||text.charAt(ultPos)=='+'||text.charAt(ultPos)=='-'
				||text.charAt(ultPos)=='/'||text.charAt(ultPos)=='x'||text.charAt(ultPos)=='^'
				||text.charAt(ultPos)=='√') {
			return true;					
		}
		return false;
	}
	
	public OperacionesBasicas() {
		initialize();
	}

	public double resolver(String calculo) {
		
		List<String> calculos = new ArrayList<>();
		List<Character> operaciones = new ArrayList<>();
		int terminoIndice = 0;
		
		for (int x = 0; x < calculo.length(); x++) {
			if (calculo.charAt(x) == 'x' || calculo.charAt(x) == '/'|| calculo.charAt(x) == '^'|| calculo.charAt(x) == '√') {
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
				} else if (operacion == '^') {
					resultado = Math.pow(resultado,siguienteNumero);
				} else if (operacion == '√') {
					resultado = sqrt(siguienteNumero,resultado);
				}
				
			}
		}
		catch(Exception e) {
			
		}
			
		return resultado;
	}
	
	public double sqrt(double number, double root) {
        if (number < 0 && root % 2 == 0) {
            Calculo.setText("No se puede hacer raiz de un numero negativo. ");
            return -1;
        }
        return Math.pow(number, 1.0 / root);
    }
	
	public static double roundToDecimals(double value) {
    	int decimals = 5;
        double scale = Math.pow(10, decimals);
        return Math.round(value * scale) / scale;
    }
	
	public void borrarError() {
		if(Calculo.getText().startsWith("Error Sintactico:")) {
			Calculo.setText("");
		}
		if(Calculo.getText().startsWith("No se puede dividir por 0")) {
			Calculo.setText("");
		}
	}
	
	public void hacerRegistro(double resultado) {
		registros.add(Calculo.getText() + " = " + resultado);
		// for(String txt : registros) {System.out.println(txt);}
		
	}
}
