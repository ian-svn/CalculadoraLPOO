package Vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import java.awt.Insets;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class OperacionesConMatrices3x3 {

	private JFrame frame;
	private Estandar Est = new Estandar();
	private JComponentOvalTF textField;
	private JComponentOval Ac = new JComponentOval(10);
	private JComponentOvalTF Resultado = new JComponentOvalTF(0);
	private JComponentOvalTF Resultado2 = new JComponentOvalTF(0);
	private JComponentOvalTF Resultado3 = new JComponentOvalTF(0);
	private int cantVecesIgual = 0;
	private int count = 0;
	private int AcCount = 0;
	private int modo = 0;
	
	private JComponentOval punto = new JComponentOval(10);
	private JComponentOval menos = new JComponentOval(10);
	
	private int countPunto = 0;
	private int countMenos = 0;
	
	private JComponentOvalTF Input00 = new JComponentOvalTF(5);
	private JComponentOvalTF Input01 = new JComponentOvalTF(5);
	private JComponentOvalTF Input02 = new JComponentOvalTF(5);
	
	private JComponentOvalTF Input10 = new JComponentOvalTF(5);
	private JComponentOvalTF Input11 = new JComponentOvalTF(5);
	private JComponentOvalTF Input12 = new JComponentOvalTF(5);
	
	private JComponentOvalTF Input20 = new JComponentOvalTF(5);
	private JComponentOvalTF Input21 = new JComponentOvalTF(5);
	private JComponentOvalTF Input22 = new JComponentOvalTF(5);
	
	private JLabel LMatriz1 = new JLabel("Matriz 1");
    private JComponentOval devuelta = new JComponentOval(10);
	private JComponentOvalTF TFmatriz1_1 = new JComponentOvalTF(0);
	private JComponentOvalTF TFmatriz1_2 = new JComponentOvalTF(0);
	private JComponentOvalTF TFmatriz1_3 = new JComponentOvalTF(0);
	private JComponentOvalTF TFmatriz2_1 = new JComponentOvalTF(0);
	private JComponentOvalTF TFmatriz2_2 = new JComponentOvalTF(0);
	private JComponentOvalTF TFmatriz2_3 = new JComponentOvalTF(0);
	private JComponentOval Restablecer = new JComponentOval(10);
	private JComponentOval Inversa = new JComponentOval(5);
	private JComponentOval Inversa2 = new JComponentOval(5);
	private JComponentOval Determinante2 = new JComponentOval(5);
	private JComponentOval Determinante = new JComponentOval(5);
	private JComponentOval MultiEscalar2 = new JComponentOval(5);
	private JComponentOvalTF InputPE = new JComponentOvalTF(10);
	private JComponentOval igual = new JComponentOval(10);
	private JLabel LMatriz2 = new JLabel("Matriz 2");
	private Double[][] matriz1;
	private Double[][] matriz2;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OperacionesConMatrices3x3 window = new OperacionesConMatrices3x3();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public OperacionesConMatrices3x3() {
		initialize();
	}

	public void correr() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OperacionesConMatrices3x3 window = new OperacionesConMatrices3x3();
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
		Est.frameEstandar(frame);
		frame.getContentPane().setLayout(null);
		
		
		JLabel CalculoResuelto = new JLabel("");
		CalculoResuelto.setBounds(0, 0, 364, 0);
		Est.labelEstandar(CalculoResuelto);
		frame.getContentPane().add(CalculoResuelto);
		devuelta.setFont(new Font("Calibri", Font.BOLD, 10));
		devuelta.setText("Restablecer");
		Est.CompOvalColorEstandar(devuelta);
		devuelta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Input01.setVisible(true);
				Input02.setVisible(true);
				Input10.setVisible(true);
				Input11.setVisible(true);
				Input12.setVisible(true);
				Input20.setVisible(true);
				Input21.setVisible(true);
				Input22.setVisible(true);
				reset();
				devuelta.setVisible(false);
			}
		});
		devuelta.setOpaque(false);
		devuelta.setBounds(282, 42, 63, 29);
		devuelta.setVisible(false);
		frame.getContentPane().add(devuelta);
		
		frame.getContentPane().add(CalculoResuelto, BorderLayout.NORTH);


		menos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField = usarTextField();
				if(countMenos>0) {
					return;
				}
				if(textField.getText().length()!=0) {
					return;
				}
				textField.setText(textField.getText() + "-");
				countMenos++;
			}
		});
		menos.setText("-");
		menos.setBackground(Color.GRAY);
		menos.setBounds(188, 285, 39, 29);
		frame.getContentPane().add(menos);
		punto.setBounds(188, 245, 39, 29);
		
		punto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField = usarTextField();
				
				if(textField.getText().length()==0) {
					return;
				}
				if(textField.getText().contains(".")) {
					return;
				}
				if(textField.getText().endsWith("-")) {
					return;
				}
				int dim = textField.getText().length();
				if(textField.getText().charAt(dim-1)==' '||textField.getText().charAt(dim-1)=='.') {
					return;
				}
				if(countPunto!=0) {
					return;
				}
				countPunto++;
				textField.setText(textField.getText() + ".");
			}
		});
		punto.setText(".");
		punto.setForeground(Color.WHITE);
		punto.setFont(new Font("Calibri", Font.BOLD, 17));
		frame.getContentPane().add(punto);
		
		
		JLabel aviso_1 = new JLabel("Aviso: Se aclara que para pasar a la siguiente posicion se debera tocar la flecha ");
		aviso_1.setForeground(Color.WHITE);
		aviso_1.setFont(new Font("Calibri", Font.BOLD, 9));
		aviso_1.setBounds(66, 11, 298, 20);
		frame.getContentPane().add(aviso_1);
		
		JLabel aviso_2 = new JLabel("para la derecha, si quiere ir a la anterior toque la que esta para la izquierda");
		aviso_2.setVisible(false);
		aviso_2.setForeground(Color.WHITE);
		aviso_2.setFont(new Font("Calibri", Font.BOLD, 9));
		aviso_2.setBounds(66, 28, 310, 27);
		frame.getContentPane().add(aviso_2);
		
		JLabel LabelA1 = new JLabel("x");
		LabelA1.setBounds(110, 59, 10, 17);
		LabelA1.setForeground(Color.WHITE);
		
		JComponentOval Atras = new JComponentOval(10);
		Atras.setBounds(10, 11, 46, 29);
		Atras.setText("←");
		Est.atrasEstandar(Atras);
		Est.CompOvalColorEstandar(Atras);
		frame.getContentPane().add(Atras);
		
		JComponentOval Uno = new JComponentOval(10);
		Uno.setBounds(41, 245, 39, 29);
		Uno.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		Uno.setFont(new Font("Calibri", Font.BOLD, 17));
		Uno.setContentAreaFilled(false);
		Uno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField = usarTextField();
				textField.setText(textField.getText() + "1");
				resetAc();
			}
		});
		Uno.setText("1");
		Uno.addHover();
		frame.getContentPane().add(Uno);
		
		JComponentOval Dos = new JComponentOval(10);
		Dos.setBounds(90, 245, 39, 29);
		frame.getContentPane().add(Dos);
		Dos.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		Dos.setFont(new Font("Calibri", Font.BOLD, 17));
		Dos.setContentAreaFilled(false);
		Dos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField = usarTextField();
				textField.setText(textField.getText() + "2");
				resetAc();
			}
		});		
		Dos.setText("2");
		
		JComponentOval Tres = new JComponentOval(10);
		Tres.setBounds(139, 245, 39, 29);
		Tres.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		Tres.setFont(new Font("Calibri", Font.BOLD, 17));
		Tres.setContentAreaFilled(false);
		Tres.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField = usarTextField();
				textField.setText(textField.getText() + "3");
				resetAc();
			}
		});		
		Tres.setText("3");
		Tres.addHover();
		frame.getContentPane().add(Tres);
		
		JComponentOval Cuatro = new JComponentOval(10);
		Cuatro.setBounds(41, 285, 39, 29);
		Cuatro.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		Cuatro.setFont(new Font("Calibri", Font.BOLD, 17));
		Cuatro.setContentAreaFilled(false);
		Cuatro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField = usarTextField();
				textField.setText(textField.getText() + "4");
				resetAc();
			}
		});		
		Cuatro.setText("4");
		Cuatro.addHover();
		frame.getContentPane().add(Cuatro);	
		
		
		JComponentOval Cinco = new JComponentOval(10);
		Cinco.setBounds(90, 285, 39, 29);
		Cinco.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		Cinco.setFont(new Font("Calibri", Font.BOLD, 17));
		Cinco.setContentAreaFilled(false);
		Cinco.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField = usarTextField();
				textField.setText(textField.getText() + "5");
				resetAc();
			}
		});		
		Cinco.setText("5");
		Cinco.addHover();
		frame.getContentPane().add(Cinco);	
		
		
		JComponentOval Seis = new JComponentOval(10);
		Seis.setBounds(139, 285, 39, 29);
		Seis.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		Seis.setFont(new Font("Calibri", Font.BOLD, 17));
		Seis.setContentAreaFilled(false);
		Seis.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField = usarTextField();
				textField.setText(textField.getText() + "6");
				resetAc();
			}
		});		
		Seis.setText("6");
		Seis.addHover();
		frame.getContentPane().add(Seis);
		
		JComponentOval Siete = new JComponentOval(10);
		Siete.setBounds(41, 325, 39, 29);
		Siete.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		Siete.setFont(new Font("Calibri", Font.BOLD, 17));
		Siete.setContentAreaFilled(false);
		Siete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField = usarTextField();
				textField.setText(textField.getText() + "7");
				resetAc();
			}
		});		
		Siete.setText("7");
		Siete.addHover();
		frame.getContentPane().add(Siete);
		
		JComponentOval Ocho = new JComponentOval(10);
		Ocho.setBounds(90, 325, 39, 29);
		Ocho.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		Ocho.setFont(new Font("Calibri", Font.BOLD, 17));
		Ocho.setContentAreaFilled(false);
		Ocho.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField = usarTextField();
				textField.setText(textField.getText() + "8");
				resetAc();
			}
		});		
		Ocho.setText("8");
		Ocho.addHover();
		frame.getContentPane().add(Ocho);
		
		JComponentOval Nueve = new JComponentOval(10);
		Nueve.setBounds(139, 325, 39, 29);
		Nueve.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		Nueve.setFont(new Font("Calibri", Font.BOLD, 17));
		Nueve.setContentAreaFilled(false);
		Nueve.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField = usarTextField();
				textField.setText(textField.getText() + "9");
				resetAc();
			}
		});		
		Nueve.setText("9");
		Nueve.addHover();
		frame.getContentPane().add(Nueve);
		
		JComponentOval Cero = new JComponentOval(10);
		Cero.setBounds(188, 325, 39, 29);
		Cero.setBackground(Color.GRAY);
		Cero.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		Cero.setFont(new Font("Calibri", Font.BOLD, 17));
		Cero.setContentAreaFilled(false);
		Cero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField = usarTextField();
				textField.setText(textField.getText() + "0");
				resetAc();
			}
		});		
		Cero.setText("0");
		Cero.addHover();
		frame.getContentPane().add(Cero);
		
		JLabel AvisoMatriz = new JLabel("Primera matriz:");
		AvisoMatriz.setForeground(Color.WHITE);
		AvisoMatriz.setFont(new Font("Calibri", Font.BOLD, 20));
		AvisoMatriz.setBounds(20, 60, 161, 20);
		frame.getContentPane().add(AvisoMatriz);
		
		Ac.setBounds(288, 245, 39, 29);
		Est.CompOvalColorEstandar(Ac);
		Ac.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		Ac.setFont(new Font("Calibri", Font.BOLD, 17));
		Ac.setContentAreaFilled(false);
		Ac.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AcHacer();
				if(textField.getText().endsWith("-")) {
					countMenos=0;
				} if(textField.getText().endsWith(".")) {
					countPunto=0;
				}
				textField = usarTextField();
				textField.setText("");
				countMenos=0;
				countPunto=0;
			}
		});		
		Ac.setText("AC");
		frame.getContentPane().add(Ac);
		
		JComponentOval Del = new JComponentOval(10);
		Del.setBounds(237, 245, 41, 29);
		Est.CompOvalColorEstandar(Del);
		Del.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		Del.setFont(new Font("Calibri", Font.BOLD, 17));
		Del.setContentAreaFilled(false);
		Del.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resetAc();
				if(textField.getText().endsWith("-")) {
					countMenos=0;
				} if(textField.getText().endsWith(".")) {
					countPunto=0;
				}
				textField = usarTextField();
				String txt = textField.getText();
				if(txt.length()==0) {
					return;
				} else {
					textField.setText(txt.substring(0, txt.length() - 1));
				}
			}
		});	
		Del.setText("DEL");
		frame.getContentPane().add(Del);
		
		JComponentOval siguiente = new JComponentOval(10);
		siguiente.setBounds(288, 285, 39, 29);
		siguiente.setBackground(Color.GRAY);
		siguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resetAc();
				aviso_1.setVisible(false);
				aviso_2.setVisible(false);
				usarTextField().setBackground((Color.GRAY));
				focusMasUno();
				usarTextField().setBackground(new Color(150,150,150));
				countMenos=0;
				countPunto=0;
			}
		});
		siguiente.addHover();
		siguiente.setText("→");
		frame.getContentPane().add(siguiente);
		
		JComponentOval anterior = new JComponentOval(10);
		anterior.setBounds(237, 285, 41, 29);
		anterior.setBackground(Color.GRAY);
		anterior.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				resetAc();
				aviso_1.setVisible(false);
				aviso_2.setVisible(false);
				usarTextField().setBackground((Color.GRAY));
				focusMenosUno();
				usarTextField().setBackground(new Color(150,150,150));
			}
		});
		anterior.addHover();
		anterior.setText("←");
		frame.getContentPane().add(anterior);
		
		Atras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				OperacionesConMatricesMenu menu = new OperacionesConMatricesMenu();
				menu.correr();
				countMenos=0;
				countPunto=0;
			}
		});
		Atras.addHover(new Color(194,85,236));

		JComponentOvalP PanelResultado = new JComponentOvalP(10);
		PanelResultado.setVisible(false);
		PanelResultado.setBounds(66, 91, 240, 132);
		frame.getContentPane().add(PanelResultado);
		PanelResultado.setLayout(null);
		Resultado.setFont(new Font("Calibri", Font.BOLD, 20));
		Resultado.setHorizontalAlignment(SwingConstants.CENTER);
		
		Resultado.setBounds(10, 11, 220, 38);
		PanelResultado.add(Resultado);

		Resultado2.setFont(new Font("Calibri", Font.BOLD, 20));
		Resultado2.setHorizontalAlignment(SwingConstants.CENTER);
		Resultado2.setBounds(10, 48, 220, 38);
		PanelResultado.add(Resultado2);
		
		Resultado3.setHorizontalAlignment(SwingConstants.CENTER);
		Resultado3.setFont(new Font("Calibri", Font.BOLD, 20));
		Resultado3.setBounds(10, 85, 220, 38);
		PanelResultado.add(Resultado3);
		
		
		JComponentOval Suma = new JComponentOval(5);
		Suma.setFont(new Font("Calibri", Font.BOLD, 16));
		Suma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(sumaMatrices(matriz1,matriz2)==null) {
					return;
				}
				Double[][] matriz = sumaMatrices(matriz1,matriz2);
				mostrarResultados(matriz);
				
//				Resultado1.setText(String.valueOf(sumaMatrices(matriz1,matriz2)));;
			}
		});
		Suma.setVisible(false);
		Suma.setText("+");
		Suma.setBounds(29, 241, 40, 39);
		frame.getContentPane().add(Suma);
		
		JComponentOval Resta = new JComponentOval(5);
		Resta.setFont(new Font("Calibri", Font.BOLD, 16));
		Resta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(restaMatrices(matriz1,matriz2)==null) {
					return;
				}
				Double[][] matriz = restaMatrices(matriz1,matriz2);
				mostrarResultados(matriz);
					
//					Resultado1.setText(String.valueOf(sumaMatrices(matriz1,matriz2)));;
			}
		});
		Resta.setVisible(false);
		Resta.setText("-");
		Resta.setBounds(80, 241, 40, 39);
		frame.getContentPane().add(Resta);
		
		JComponentOval Multiplicar = new JComponentOval(5);
		Multiplicar.setFont(new Font("Calibri", Font.BOLD, 16));
		Multiplicar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					if(multiplicacionMatrices(matriz1,matriz2)==null) {
						return;
					}
					mostrarResultados(multiplicacionMatrices(matriz1,matriz2));
				}
		});
		Multiplicar.setVisible(false);
		Multiplicar.setText("Multiplicar");
		Multiplicar.setBounds(29, 336, 90, 39);
		frame.getContentPane().add(Multiplicar);
		
		JComponentOval Division = new JComponentOval(5);
		Division.setFont(new Font("Calibri", Font.BOLD, 16));
		Division.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(divisionMatrices(matriz1,matriz2)==null) {
					return;
				}
				Double[][] matriz = divisionMatrices(matriz1,matriz2);
				mostrarResultados(matriz);
			}
	});
		Division.setVisible(false);
		Division.setText("Division");
		Division.setBounds(29, 288, 90, 39);
		frame.getContentPane().add(Division);
		
		JComponentOval MultiEscalar1 = new JComponentOval(5);
		MultiEscalar1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				modo=11;
				usarTextField();
				
				InputPE.setVisible(true);
				
				igual.setVisible(true);
				Uno.setVisible(true);
				Dos.setVisible(true);
				Tres.setVisible(true);
				Cuatro.setVisible(true);
				Cinco.setVisible(true);
				Seis.setVisible(true);
				Siete.setVisible(true);
				Ocho.setVisible(true);
				Nueve.setVisible(true);
				Cero.setVisible(true);
				menos.setVisible(true);
				punto.setVisible(true);
				Del.setVisible(true);
				Ac.setVisible(true);
				Suma.setVisible(false);
				Resta.setVisible(false);
				Multiplicar.setVisible(false);
				Division.setVisible(false);
				MultiEscalar1.setVisible(false);
				MultiEscalar2.setVisible(false);
				Determinante.setVisible(false);
				Determinante2.setVisible(false);
				Inversa.setVisible(false);
				Inversa2.setVisible(false);
				PanelResultado.setVisible(false);
				Restablecer.setVisible(false);
				TFmatriz1_1.setVisible(false);
				TFmatriz1_2.setVisible(false);
				TFmatriz1_3.setVisible(false);
				TFmatriz2_1.setVisible(false);
				TFmatriz2_2.setVisible(false);
				TFmatriz2_3.setVisible(false);
				LMatriz1.setVisible(false);
				LMatriz2.setVisible(false);
				
				igual.setVisible(true);
				
				
				igual.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						Double MatrizResultado[][] = multiplicacionEscalarMatriz(matriz1,Double.parseDouble(InputPE.getText()));
						InputPE.setText("");
						
						mostrarResultados(MatrizResultado);
						
						InputPE.setVisible(false);
						
						devuelta.setVisible(false);
						igual.setVisible(false);
						Uno.setVisible(false);
						Dos.setVisible(false);
						Tres.setVisible(false);
						Cuatro.setVisible(false);
						Cinco.setVisible(false);
						Seis.setVisible(false);
						Siete.setVisible(false);
						Ocho.setVisible(false);
						Nueve.setVisible(false);
						Cero.setVisible(false);
						punto.setVisible(false);
						menos.setVisible(false);
						siguiente.setVisible(false); 
						anterior.setVisible(false);
						Ac.setVisible(false);
						Del.setVisible(false);
						AvisoMatriz.setVisible(false);
						Input00.setVisible(false);
						Input01.setVisible(false);
						Input10.setVisible(false);
						Input11.setVisible(false);

						Suma.setVisible(true);
						Resta.setVisible(true);
						Multiplicar.setVisible(true);
						Division.setVisible(true);
						MultiEscalar1.setVisible(true);
						MultiEscalar2.setVisible(true);
						Determinante.setVisible(true);
						Determinante2.setVisible(true);
						Inversa.setVisible(true);
						Inversa2.setVisible(true);
						PanelResultado.setVisible(true);
						Restablecer.setVisible(true);
						Restablecer.setVisible(true);
						TFmatriz1_1.setVisible(true);
						TFmatriz1_2.setVisible(true);
						TFmatriz2_3.setVisible(true);
						TFmatriz2_1.setVisible(true);
						TFmatriz2_2.setVisible(true);
						TFmatriz2_3.setVisible(true);
						LMatriz1.setVisible(true);
						LMatriz2.setVisible(true);
					}
				});
			}
		});
		MultiEscalar1.setFont(new Font("Calibri", Font.BOLD, 16));
		MultiEscalar1.setText("MultiEscalar1");
		MultiEscalar1.setVisible(false);
		MultiEscalar1.setBounds(131, 288, 105, 39);
		frame.getContentPane().add(MultiEscalar1);
		
		MultiEscalar2.setFont(new Font("Calibri", Font.BOLD, 16));
		MultiEscalar2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				modo=11;
				usarTextField();
				
				InputPE.setVisible(true);
				
				igual.setVisible(true);
				Uno.setVisible(true);
				Dos.setVisible(true);
				Tres.setVisible(true);
				Cuatro.setVisible(true);
				Cinco.setVisible(true);
				Seis.setVisible(true);
				Siete.setVisible(true);
				Ocho.setVisible(true);
				Nueve.setVisible(true);
				Cero.setVisible(true);
				Del.setVisible(true);
				Ac.setVisible(true);
				punto.setVisible(true);
				menos.setVisible(true);
				Suma.setVisible(false);
				Resta.setVisible(false);
				Multiplicar.setVisible(false);
				Division.setVisible(false);
				MultiEscalar1.setVisible(false);
				MultiEscalar2.setVisible(false);
				Determinante.setVisible(false);
				Determinante2.setVisible(false);
				Inversa.setVisible(false);
				Inversa2.setVisible(false);
				PanelResultado.setVisible(false);
				Restablecer.setVisible(false);
				TFmatriz1_1.setVisible(false);
				TFmatriz1_2.setVisible(false);
				TFmatriz1_3.setVisible(false);
				TFmatriz2_1.setVisible(false);
				TFmatriz2_2.setVisible(false);
				TFmatriz2_3.setVisible(false);
				LMatriz1.setVisible(false);
				LMatriz2.setVisible(false);
				
				igual.setVisible(true);
				
				
				igual.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if(InputPE.getText().length()==0) {
							return;
						}
						Double MatrizResultado[][] = multiplicacionEscalarMatriz(matriz2,Double.parseDouble(InputPE.getText()));
						InputPE.setText("");
						
						mostrarResultados(MatrizResultado);
						
						InputPE.setVisible(false);
						
						devuelta.setVisible(false);
						igual.setVisible(false);
						Uno.setVisible(false);
						Dos.setVisible(false);
						Tres.setVisible(false);
						Cuatro.setVisible(false);
						Cinco.setVisible(false);
						Seis.setVisible(false);
						Siete.setVisible(false);
						Ocho.setVisible(false);
						Nueve.setVisible(false);
						Cero.setVisible(false);
						siguiente.setVisible(false); 
						anterior.setVisible(false);
						punto.setVisible(false);
						menos.setVisible(false);
						Ac.setVisible(false);
						Del.setVisible(false);
						AvisoMatriz.setVisible(false);
						Input00.setVisible(false);
						Input01.setVisible(false);
						Input10.setVisible(false);
						Input11.setVisible(false);

						Suma.setVisible(true);
						Resta.setVisible(true);
						Multiplicar.setVisible(true);
						Division.setVisible(true);
						MultiEscalar1.setVisible(true);
						MultiEscalar2.setVisible(true);
						Determinante.setVisible(true);
						Determinante2.setVisible(true);
						Inversa.setVisible(true);
						Inversa2.setVisible(true);
						PanelResultado.setVisible(true);
						Restablecer.setVisible(true);
						Restablecer.setVisible(true);
						TFmatriz1_1.setVisible(true);
						TFmatriz1_2.setVisible(true);
						TFmatriz1_3.setVisible(true);
						TFmatriz2_1.setVisible(true);
						TFmatriz2_2.setVisible(true);
						TFmatriz2_3.setVisible(true);
						LMatriz1.setVisible(true);
						LMatriz2.setVisible(true);
					}
				});
			}
		});
		MultiEscalar2.setVisible(false);
		MultiEscalar2.setText("MultiEscalar2");
		MultiEscalar2.setBounds(246, 288, 105, 39);
		frame.getContentPane().add(MultiEscalar2);
		
		Determinante.setFont(new Font("Calibri", Font.BOLD, 16));
		Determinante.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Double determinante = determinanteMatriz(matriz1);
				if(determinante==null) {
					return;
				}
				Resultado.setText(String.valueOf(roundToDecimals(determinante)));
				Resultado2.setText("");
				Resultado3.setText("");
			}
		});
		Determinante.setVisible(false);
		Determinante.setText("Determinante2");
		Determinante.setBounds(246, 336, 105, 39);
		frame.getContentPane().add(Determinante);
		
		Determinante2.setFont(new Font("Calibri", Font.BOLD, 16));
		Determinante2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(determinanteMatriz(matriz2)==null) {
					return;
				}
				Double determinante = determinanteMatriz(matriz2);
				Resultado.setText(String.valueOf(roundToDecimals(determinante)));
				Resultado2.setText("");
				Resultado3.setText("");
			}
		});
		Determinante2.setVisible(false);
		Determinante2.setText("Determinante");
		Determinante2.setBounds(129, 336, 105, 39);
		frame.getContentPane().add(Determinante2);
		
		Inversa.setFont(new Font("Calibri", Font.BOLD, 16));
		Inversa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(inversaMatriz(matriz1)==null) {
					return;
				}
				Double[][] matriz = inversaMatriz(matriz1);
				mostrarResultados(matriz);
			}
		});
		Inversa.setVisible(false);
		Inversa.setText("Inversa");
		Inversa.setBounds(129, 241, 105, 39);
		frame.getContentPane().add(Inversa);
		
		Inversa2.setFont(new Font("Calibri", Font.BOLD, 16));
		Inversa2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(inversaMatriz(matriz2)==null) {
					return;
				}
				Double[][] matriz = inversaMatriz(matriz2);
				mostrarResultados(matriz);
			}
		});
		Inversa2.setVisible(false);
		Inversa2.setText("Inversa2");
		Inversa2.setBounds(246, 241, 105, 39);
		frame.getContentPane().add(Inversa2);

		Restablecer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				OperacionesConMatrices3x3 operaciones = new OperacionesConMatrices3x3();
				operaciones.correr();
			}
		});
		Restablecer.setVisible(false);
		Restablecer.setText("ENC");
		Est.CompOvalColorEstandar(Restablecer);
		Restablecer.setBounds(308, 11, 46, 29);
		frame.getContentPane().add(Restablecer);
		TFmatriz1_1.setVisible(false);
		TFmatriz1_1.setBackground(Color.DARK_GRAY);
		TFmatriz1_1.setBounds(86, 11, 90, 15);
		frame.getContentPane().add(TFmatriz1_1);
		TFmatriz1_2.setVisible(false);
		TFmatriz1_2.setBackground(Color.DARK_GRAY);
		TFmatriz1_2.setBounds(86, 29, 90, 15);
		frame.getContentPane().add(TFmatriz1_2);
		TFmatriz1_3.setVisible(false);
		TFmatriz1_3.setBackground(Color.DARK_GRAY);
		TFmatriz1_3.setBounds(86, 50, 90, 13);
		frame.getContentPane().add(TFmatriz1_3);
		TFmatriz2_1.setVisible(false);
		TFmatriz2_1.setBackground(Color.DARK_GRAY);
		TFmatriz2_1.setBounds(217, 11, 89, 15);
		frame.getContentPane().add(TFmatriz2_1);
		TFmatriz2_2.setVisible(false);
		TFmatriz2_2.setBackground(Color.DARK_GRAY);
		TFmatriz2_2.setBounds(217, 29, 89, 13);
		frame.getContentPane().add(TFmatriz2_2);
		TFmatriz2_3.setVisible(false);
		TFmatriz2_3.setBackground(Color.DARK_GRAY);
		TFmatriz2_3.setBounds(217, 50, 89, 13);
		frame.getContentPane().add(TFmatriz2_3);
		
		LMatriz1.setHorizontalAlignment(SwingConstants.CENTER);
		LMatriz1.setFont(new Font("Calibri", Font.BOLD, 14));
		LMatriz1.setVisible(false);
		LMatriz1.setBounds(66, 66, 90, 25);
		Est.labelEstandar(LMatriz1);
		frame.getContentPane().add(LMatriz1);
		
		LMatriz2.setHorizontalAlignment(SwingConstants.CENTER);
		LMatriz2.setFont(new Font("Calibri", Font.BOLD, 14));
		LMatriz2.setVisible(false);
		LMatriz2.setBounds(217, 66, 92, 25);
		Est.labelEstandar(LMatriz2);
		frame.getContentPane().add(LMatriz2);
		
		
		
		igual.setBounds(237, 325, 90, 29);
		Est.CompOvalColorEstandar(igual);
		igual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Input00.getText().endsWith("-")||Input01.getText().endsWith("-")||Input02.getText().endsWith("-")||
						Input10.getText().endsWith("-")||Input11.getText().endsWith("-")||Input12.getText().endsWith("-")||
						Input20.getText().endsWith("-")||Input21.getText().endsWith("-")||Input22.getText().endsWith("-")) {
					return;
				}
				if(Input00.getText().endsWith(".")||Input01.getText().endsWith(".")||Input02.getText().endsWith(".")||
						Input10.getText().endsWith(".")||Input11.getText().endsWith(".")||Input12.getText().endsWith(".") ||
						Input20.getText().endsWith(".")||Input21.getText().endsWith(".")||Input22.getText().endsWith(".")) {
					return;
				}
				if(			Input00.getText().length()!=0&&Input01.getText().length()!=0&&Input02.getText().length()!=0&&
							Input10.getText().length()==0&&Input11.getText().length()==0&&Input12.getText().length()==0&&
							Input20.getText().length()==0&&Input21.getText().length()==0&&Input22.getText().length()==0) {		
						modo=1;
					}
				
				else if(	Input00.getText().length()!=0&&Input01.getText().length()!=0&&Input02.getText().length()!=0&&
							Input10.getText().length()!=0&&Input11.getText().length()!=0&&Input12.getText().length()!=0&&
							Input20.getText().length()==0&&Input21.getText().length()==0&&Input22.getText().length()==0) {
						modo=2;
					}
				
				else if( 	Input00.getText().length()!=0 && Input01.getText().length()==0 && Input02.getText().length()==0&&
						 	Input10.getText().length()!=0 && Input11.getText().length()==0 && Input12.getText().length()==0&&
						 	Input20.getText().length()!=0 && Input21.getText().length()==0 && Input22.getText().length()==0) {	
						modo=3;
					}
				
				else if( 	Input00.getText().length()!=0 && Input01.getText().length()!=0 && Input02.getText().length()==0&&
						 	Input10.getText().length()!=0 && Input11.getText().length()!=0 && Input12.getText().length()==0&&
						 	Input20.getText().length()!=0 && Input21.getText().length()!=0 && Input22.getText().length()==0) {	
						modo=4;
					}
				else if(	Input00.getText().length()!=0&&Input01.getText().length()!=0&&Input02.getText().length()!=0&&
							Input10.getText().length()!=0&&Input11.getText().length()!=0&&Input12.getText().length()!=0&&
							Input20.getText().length()!=0&&Input21.getText().length()!=0&&Input22.getText().length()!=0) {		
						modo=5;
					}
				else {
					return;
				}
				
				cantVecesIgual++;
				
				if(cantVecesIgual == 1) {
			    	
			    	if(modo==1) {
			    		matriz1 = new Double[1][3];
					}
					else if(modo==2) {
						matriz1 = new Double[2][3];
						
					} else if(modo==3) {
						matriz1 = new Double[3][1];
						
					} else if(modo==4) {
						matriz1 = new Double[3][2];
					}
					else {
						matriz1 = new Double[3][3];
					}
					
					matrizAsignacion(matriz1);
					
					devuelta.doClick();

					reset();
					
					AvisoMatriz.setText("Segunda Matriz");
					
					return;
				}
				if(cantVecesIgual == 2) {
					if(modo==1) {
			    		matriz2 = new Double[1][3];
					}
					else if(modo==2) {
						matriz2 = new Double[2][3];
						
					} else if(modo==3) {
						matriz2 = new Double[3][1];
						
					} else if(modo==4) {
						matriz2 = new Double[3][2];
					}
					else {
						matriz2 = new Double[3][3];
					}
					
					matrizAsignacion(matriz2);
					
					devuelta.setVisible(false);
					igual.setVisible(false);
					Uno.setVisible(false);
					Dos.setVisible(false);
					Tres.setVisible(false);
					Cuatro.setVisible(false);
					Cinco.setVisible(false);
					Seis.setVisible(false);
					Siete.setVisible(false);
					Ocho.setVisible(false);
					Nueve.setVisible(false);
					Cero.setVisible(false);
					siguiente.setVisible(false); 
					anterior.setVisible(false);
					punto.setVisible(false);
					menos.setVisible(false);
					Ac.setVisible(false);
					Del.setVisible(false);
					AvisoMatriz.setVisible(false);
					Input00.setVisible(false);
					Input01.setVisible(false);
					Input02.setVisible(false);
					Input10.setVisible(false);
					Input11.setVisible(false);
					Input12.setVisible(false);
					Input20.setVisible(false);
					Input21.setVisible(false);
					Input22.setVisible(false);
					
					Suma.setVisible(true);
					Resta.setVisible(true);
					Multiplicar.setVisible(true);
					Division.setVisible(true);
					MultiEscalar1.setVisible(true);
					MultiEscalar2.setVisible(true);
					Determinante.setVisible(true);
					Determinante2.setVisible(true);
					Inversa.setVisible(true);
					Inversa2.setVisible(true);
					PanelResultado.setVisible(true);
					Restablecer.setVisible(true);
					
					TFmatriz1_1.setVisible(true);
					TFmatriz1_2.setVisible(true);
					TFmatriz1_3.setVisible(true);
					
					for (int i = 0; i < matriz1.length; i++) {          
					    for (int j = 0; j < matriz1[i].length; j++) {   
					        if (i == 0) {
					            TFmatriz1_1.setText(TFmatriz1_1.getText() + matriz1[i][j] + "   ");
					        } else if (i == 1) {
					            TFmatriz1_2.setText(TFmatriz1_2.getText() + matriz1[i][j] + "   ");
					        } else if (i==2){
					            TFmatriz1_3.setText(TFmatriz1_3.getText() + matriz1[i][j] + "   ");
					        }
					    }
					}
					
					
					TFmatriz2_1.setVisible(true);
					TFmatriz2_2.setVisible(true);
					TFmatriz2_3.setVisible(true);
					
					for (int i = 0; i < matriz2.length; i++) {          
					    for (int j = 0; j < matriz2[i].length; j++) {   
					        if (i == 0) {
					            TFmatriz2_1.setText(TFmatriz2_1.getText() + matriz2[i][j] + "   ");
					        } else if (i == 1) {
					            TFmatriz2_2.setText(TFmatriz2_2.getText() + matriz2[i][j] + "   ");
					        }else if(i==2) {
					        	TFmatriz2_3.setText(TFmatriz2_3.getText() + matriz2[i][j] + "   ");
					        }
					    }
					}

					LMatriz1.setVisible(true);
					LMatriz2.setVisible(true);
					/*
					for (int i = 0; i < matriz1.length; i++) {          
			            for (int j = 0; j < matriz1[i].length; j++) {   
			                System.out.print(matriz1[i][j] + " ");      
			            }
			            System.out.println();                          
			        }
					System.out.println("");
					System.out.println("");
					
					for (int i = 0; i < matriz2.length; i++) {          
			            for (int j = 0; j < matriz2[i].length; j++) {   
			                System.out.print(matriz2[i][j] + " ");      
			            }
			            System.out.println();                          
			        }
					
					System.out.println(matriz2.length + " x= "+matriz2[0].length); 
					System.out.println(matriz1.length + " x= "+matriz1[0].length); 
					*/
					return;
					
					
				}
			}
		});
		igual.setText("=");
		igual.setFont(new Font("Calibri", Font.BOLD, 17));
		igual.setContentAreaFilled(false);
		frame.getContentPane().add(igual);
		InputPE.setHorizontalAlignment(SwingConstants.CENTER);
		
		InputPE.setBounds(66, 120, 219, 51);
		InputPE.setVisible(false);
		frame.getContentPane().add(InputPE);
		
		JLabel AvisoEscalar = new JLabel("Ingrese el escalar por el que multiplicara la matriz 1");
		AvisoEscalar.setBounds(46, 91, 184, 25);
		Est.labelEstandar(AvisoEscalar);
		AvisoEscalar.setVisible(false);
		frame.getContentPane().add(AvisoEscalar);
		Input00.setBounds(30, 99, 83, 29);
		frame.getContentPane().add(Input00);
		Input00.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				devuelta.doClick();
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				Input00.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			}
		});
		Input00.setFocusTraversalKeysEnabled(false);
		Input00.setHorizontalAlignment(SwingConstants.CENTER);
		Input00.addHover();
		Input00.setBackground(new Color(150,150,150));
		Input01.setBounds(141, 99, 83, 29);
		frame.getContentPane().add(Input01);
		Input01.setHorizontalAlignment(SwingConstants.CENTER);
		Input02.setBounds(250, 99, 83, 29);
		frame.getContentPane().add(Input02);
		Input02.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				modo=1;
				Input10.setVisible(false);
				Input10.setText("");
				
				Input11.setVisible(false);
				Input11.setText("");
				
				Input12.setVisible(false);
				Input12.setText("");
				
				Input20.setVisible(false);
				Input20.setText("");
				
				Input21.setVisible(false);
				Input21.setText("");
				
				Input22.setVisible(false);
				Input22.setText("");
				
				devuelta.setVisible(true);
			}
		});
		Input02.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		

		Input02.setHorizontalAlignment(SwingConstants.CENTER);
		Input12.setBounds(250, 141, 83, 29);
		frame.getContentPane().add(Input12);
		
		Input12.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				modo=2;
				Input20.setVisible(false);
				Input20.setText("");
				
				Input21.setVisible(false);
				Input21.setText("");
				
				Input22.setVisible(false);
				Input22.setText("");
				
				devuelta.setVisible(true);
			}
		});
		Input12.setHorizontalAlignment(SwingConstants.CENTER);
		Input12.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		Input11.setBounds(141, 141, 83, 29);
		frame.getContentPane().add(Input11);
		
		Input11.setHorizontalAlignment(SwingConstants.CENTER);
		Input10.setBounds(30, 141, 83, 29);
		frame.getContentPane().add(Input10);
		
		Input10.setHorizontalAlignment(SwingConstants.CENTER);
		Input10.setFocusTraversalKeysEnabled(false);
		Input10.setBackground(Color.GRAY);
		Input22.setBounds(250, 183, 83, 29);
		frame.getContentPane().add(Input22);
		
		Input22.setHorizontalAlignment(SwingConstants.CENTER);
		Input21.setBounds(141, 183, 83, 29);
		frame.getContentPane().add(Input21);
		Input21.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				modo=4;
				Input02.setVisible(false);
				Input02.setText("");
				
				Input12.setVisible(false);
				Input12.setText("");
				
				Input22.setVisible(false);
				Input22.setText("");
				
				devuelta.setVisible(true);
			}
		});
		Input21.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		Input21.setHorizontalAlignment(SwingConstants.CENTER);
		Input20.setBounds(30, 183, 83, 29);
		frame.getContentPane().add(Input20);
		
		
		
		Input20.setHorizontalAlignment(SwingConstants.CENTER);
		Input20.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				modo=3;
				Input01.setVisible(false);
				Input01.setText("");
				
				Input02.setVisible(false);
				Input02.setText("");
				
				Input11.setVisible(false);
				Input11.setText("");
				
				Input12.setVisible(false);
				Input12.setText("");
				
				Input21.setVisible(false);
				Input21.setText("");
				
				Input22.setVisible(false);
				Input22.setText("");
				
				devuelta.setVisible(true);
			}
		});
		Input20.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		Input20.setFocusTraversalKeysEnabled(false);
		Input20.setBackground(Color.GRAY);
		
		
		Input01.addHover();
		
		
		
		
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
	}
	
	public void focusMasUno() {
		if(modo==1||modo==3) {
			if(count>=0&&count<3) {
				count++;
			}
			if(count==3) {
				count=0;
			}
			return;
		}
		if(modo==2||modo==4){
			if(count<6) {
				count++;
			}
			if(count==6) {
				count=0;
			}
			return;
		}
		if(count>=0&&count<9) {
			count++;
			return;
		}
	}
	
	public void focusMenosUno() {
		if(modo==1||modo==3) {
			if(count>=1&&count<=2) {
				count--;
			}
			return;
		}
		if(modo==2||modo==4){
			if(count<=6) {
				count--;
			}
			return;
		}
		if(count>=1&&count<=9) {
			count--;
			return;
		}
	}
	
	private JComponentOvalTF usarTextField() {
		if(modo==11) {
			return InputPE;
		}
		if(modo==1) {
			if(count==0) {
				return Input00;
			}
			if(count==1) {
				return Input01;
			}
			if(count==2) {
				return Input02;
			}
		}
		if(modo==2) {

			if(count==0) {
				return Input00;
			}
			if(count==1) {
				return Input01;
			}
			if(count==2) {
				return Input02;
			}
			if(count==3) {
				return Input10;
			}
			if(count==4) {
				return Input11;
			}
			if(count==5) {
				return Input12;
			}
		}
		if(modo==3) {
			if(count==0) {
				return Input00;
			}
			if(count==1) {
				return Input10;
			}
			if(count==2) {
				return Input20;
			}
		}
		if(modo==4) {

			if(count==0) {
				return Input00;
			}
			if(count==1) {
				return Input01;
			}
			if(count==2) {
				return Input10;
			}
			if(count==3) {
				return Input11;
			}
			if(count==4) {
				return Input20;
			}
			if(count==5) {
				return Input21;
			}
		}
		
		if(count==0) {
			return Input00;
		}
		if(count==1) {
			return Input01;
		}
		if(count==2) {
			return Input02;
		}
		if(count==3) {
			return Input10;
		}
		if(count==4) {
			return Input11;
		}
		if(count==5) {
			return Input12;
		}
		if(count==6) {
			return Input20;
		}
		if(count==7) {
			return Input21;
		}
		if(count==8) {
			return Input22;
		}
		if(count>8) {
			count=0;
		}
		
		return Input00;
	}
	
	public void AcHacer() {
		if(AcCount==0) {
			AcCount++;
		} else if(AcCount==1){
			AcCount++;
			Ac.setBackground(new Color(180,0,0));
			Ac.addHover(new Color(230,0,0));
		} else if(AcCount>1) {
			reset();
			Est.CompOvalColorEstandar(Ac);
		}
	}
	
	public void reset() {
		Input00.setText("");
		Input00.setBackground(new Color(150,150,150));
		Input01.setText("");
		Input01.setBackground(Color.GRAY);
		Input02.setText("");
		Input02.setBackground(Color.GRAY);
		
		Input10.setText("");
		Input10.setBackground(Color.GRAY);
		Input11.setText("");
		Input11.setBackground(Color.GRAY);
		Input12.setText("");
		Input12.setBackground(Color.GRAY);
		
		Input20.setText("");
		Input20.setBackground(Color.GRAY);
		Input21.setText("");
		Input21.setBackground(Color.GRAY);
		Input22.setText("");
		Input22.setBackground(Color.GRAY);
		
		count=0;
		modo=0;
	}
	
	public void vaciarResultados() {
    	Resultado.setText("");
    	Resultado2.setText("");
    	Resultado3.setText("");
    }
	
	public void resetAc() {
		if(AcCount==1||AcCount>1) {
			Est.CompOvalColorEstandar(Ac);
			AcCount=0;//
		}
	}
	
    
    public void mostrarResultados(Double[][] matriz) {
    	vaciarResultados();
    	for (int i = 0; i < matriz.length; i++) {         
            for (int j = 0; j < matriz[i].length; j++) { 
            	if(i==0) {
            		Resultado.setText(Resultado.getText() + roundToDecimals(matriz[i][j]) + "  ");
            	}
            	else if(i==1) {
            		Resultado2.setText(Resultado2.getText() + roundToDecimals(matriz[i][j]) + "  ");
            	}
            	else if(i==2){
            		Resultado3.setText(Resultado3.getText() + roundToDecimals(matriz[i][j]) + "  ");
            	}
            }
        }
    }
    public void mostrarResultados(Double resultado) {
    	Resultado.setText(String.valueOf(resultado));    		
    }
    
    public static Double roundToDecimals(Double value) {
    	int decimals = 2;
        Double scale = Math.pow(10, decimals);
        return Math.round(value * scale) / scale;
    }
    
    public void matrizAsignacion(Double[][] mat) {
    	if(modo==1) {
    		mat[0][0]=Double.parseDouble(Input00.getText());
    		mat[0][1]=Double.parseDouble(Input01.getText());
    		mat[0][2]=Double.parseDouble(Input02.getText());

		}
		else if(modo==2) {
			mat[0][0]=Double.parseDouble(Input00.getText());
			mat[0][1]=Double.parseDouble(Input01.getText());
			mat[0][2]=Double.parseDouble(Input02.getText());
			mat[1][0]=Double.parseDouble(Input10.getText());
			mat[1][1]=Double.parseDouble(Input11.getText());
			mat[1][2]=Double.parseDouble(Input12.getText());
		} else if(modo==3) {
			mat[0][0]=Double.parseDouble(Input00.getText());
			mat[1][0]=Double.parseDouble(Input10.getText());
			mat[2][0]=Double.parseDouble(Input20.getText());
			
		} else if(modo==4) {
			mat[0][0]=Double.parseDouble(Input00.getText());
			mat[0][1]=Double.parseDouble(Input01.getText());
			mat[1][0]=Double.parseDouble(Input10.getText());
			mat[1][1]=Double.parseDouble(Input11.getText());
			mat[2][0]=Double.parseDouble(Input20.getText());
			mat[2][1]=Double.parseDouble(Input21.getText());
		}
		else {
			mat[0][0]=Double.parseDouble(Input00.getText());
			mat[0][1]=Double.parseDouble(Input01.getText());
			mat[0][2]=Double.parseDouble(Input02.getText());
			mat[1][0]=Double.parseDouble(Input10.getText());	
			mat[1][1]=Double.parseDouble(Input11.getText());
			mat[1][2]=Double.parseDouble(Input12.getText());	
			mat[2][0]=Double.parseDouble(Input20.getText());
			mat[2][1]=Double.parseDouble(Input21.getText());		
			mat[2][2]=Double.parseDouble(Input22.getText());
		}
    }
    
    
    private Double[][] sumaMatrices(Double[][] matrizA, Double[][] matrizB) {
    	if (matrizA.length != 3 || matrizB[0].length != 3) {
        	Resultado.setText("Ambas matrices");
            Resultado2.setText("deben ser de 3x3");
        	return null;
        }
    	Double[][] resultado = new Double[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                resultado[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }
        return resultado;
    }

    private Double[][] restaMatrices(Double[][] matrizA, Double[][] matrizB) {
    	if (matrizA.length != 3 || matrizB[0].length != 3) {
        	Resultado.setText("Ambas matrices");
            Resultado2.setText("deben ser de 3x3");
        	return null;
        }
    	Double[][] resultado = new Double[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                resultado[i][j] = matrizA[i][j] - matrizB[i][j];
            }
        }
        return resultado;
    }
    
    public Double[][] multiplicacionEscalarMatriz(Double[][] matriz, Double escalar) {
        int filas = matriz.length;
        int columnas = matriz[0].length;
        Double[][] resultado = new Double[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                resultado[i][j] = escalar * matriz[i][j];
            }
        }
        return resultado;
    }
    
    private Double[][] multiplicacionMatrices(Double[][] matrizA, Double[][] matrizB) {
        int filasA = matrizA.length;
        int columnasA = matrizA[0].length;
        int filasB = matrizB.length;
        int columnasB = matrizB[0].length;

        if (columnasA != filasB) {
        	Resultado.setText("El numero de columnas");
            Resultado2.setText("de a deben ser iguales A ");
            Resultado3.setText("las cantidad de filas de B");
            return null;
        }

        Double[][] resultado = new Double[filasA][columnasB];
        for (int i = 0; i < filasA; i++) {
            for (int j = 0; j < columnasB; j++) {
                resultado[i][j] = (double) 0;
                for (int k = 0; k < columnasA; k++) {
                    resultado[i][j] += matrizA[i][k] * matrizB[k][j];
                }
            }
        }
        return resultado;
    }
    
    private Double[][] divisionMatrices(Double[][] matrizA, Double[][] matrizB) {
    	if (matrizA.length != 3 || matrizB[0].length != 3) {
        	Resultado.setText("Ambas matrices");
            Resultado2.setText("deben ser de 3x3");
        	return null;
        }
    	Double[][] inversaB = inversaMatriz(matrizB);
        if(inversaB==null) {
        	Resultado.setText("La matriz no ");
            Resultado2.setText("tiene division");
            return null;
        }
        return multiplicacionMatrices(matrizA, inversaB);
    }
    
    private static Double determinanteMatriz(Double[][] matriz) {
    	if(matriz.length != 3 || matriz[0].length != 3) {
    		return null;
    	}
    	Double determinante = matriz[0][0] * (matriz[1][1] * matriz[2][2] - matriz[1][2] * matriz[2][1]) -
                           matriz[0][1] * (matriz[1][0] * matriz[2][2] - matriz[1][2] * matriz[2][0]) +
                           matriz[0][2] * (matriz[1][0] * matriz[2][1] - matriz[1][1] * matriz[2][0]);
        return determinante;
    }
    
    private Double[][] inversaMatriz(Double[][] matriz) {
        Double determinante = determinanteMatriz(matriz);
        if (matriz.length != 3 || matriz[0].length != 3) {
        	Resultado.setText("La matriz");
            Resultado2.setText("debe ser de 3x3");
        	return null;
        }
        if (determinante == 0) {
            Resultado.setText("No se puede");
            Resultado2.setText("hacer porque");
            Resultado3.setText("el det es 0");
            return null;
        }

        Double[][] adjunta = matrizAdjunta(matriz);

        Double[][] inversa = new Double[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                inversa[i][j] = adjunta[i][j] / determinante;
            }
        }
        return inversa;
    }

    private Double[][] matrizAdjunta(Double[][] matriz) {
    	Double[][] adjunta = new Double[3][3];

        adjunta[0][0] = matriz[1][1] * matriz[2][2] - matriz[1][2] * matriz[2][1];
        adjunta[0][1] = -(matriz[1][0] * matriz[2][2] - matriz[1][2] * matriz[2][0]);
        adjunta[0][2] = matriz[1][0] * matriz[2][1] - matriz[1][1] * matriz[2][0];

        adjunta[1][0] = -(matriz[0][1] * matriz[2][2] - matriz[0][2] * matriz[2][1]);
        adjunta[1][1] = matriz[0][0] * matriz[2][2] - matriz[0][2] * matriz[2][0];
        adjunta[1][2] = -(matriz[0][0] * matriz[2][1] - matriz[0][1] * matriz[2][0]);

        adjunta[2][0] = matriz[0][1] * matriz[1][2] - matriz[0][2] * matriz[1][1];
        adjunta[2][1] = -(matriz[0][0] * matriz[1][2] - matriz[0][2] * matriz[1][0]);
        adjunta[2][2] = matriz[0][0] * matriz[1][1] - matriz[0][1] * matriz[1][0];

        return adjunta;
    }
}
