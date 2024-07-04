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

public class OperacionesConMatrices2x2 {

	private JFrame frame;
	private Estandar Est = new Estandar();
	private JComponentOvalTF textField;
	private JComponentOvalTF Input00 = new JComponentOvalTF(5);
	private JComponentOvalTF Input10 = new JComponentOvalTF(5);
	private JComponentOvalTF Input01 = new JComponentOvalTF(5);
	private JComponentOvalTF Input11 = new JComponentOvalTF(5);
	private JComponentOval Ac = new JComponentOval(10);
	private JComponentOvalTF Resultado = new JComponentOvalTF(0);
	private JComponentOvalTF Resultado2 = new JComponentOvalTF(0);
	private JComponentOval menos = new JComponentOval(10);
	private JComponentOval punto = new JComponentOval(10);
	private JComponentOval Del = new JComponentOval(10);
	private int cantVecesIgual = 0;
	private int count = 0;
	private int AcCount = 0;
	private int comaCount = 0;
	private int countPunto = 0;
	private int countMenos = 0;

	private JLabel LMatriz1 = new JLabel("Matriz 1");
    private JComponentOval devuelta = new JComponentOval(10);
	private JComponentOvalTF TFmatriz1_1 = new JComponentOvalTF(0);
	private JComponentOvalTF TFmatriz1_2 = new JComponentOvalTF(0);
	private JComponentOvalTF TFmatriz2_1 = new JComponentOvalTF(0);
	private JComponentOvalTF TFmatriz2_2 = new JComponentOvalTF(0);
	private JComponentOval Restablecer = new JComponentOval(10);
	private JComponentOval Inversa = new JComponentOval(5);
	private JComponentOval Inversa2 = new JComponentOval(5);
	private JComponentOval Determinante2 = new JComponentOval(5);
	private JComponentOval Determinante = new JComponentOval(5);
	private JComponentOval MultiEscalar2 = new JComponentOval(5);
	private JComponentOvalTF InputPE = new JComponentOvalTF(10);
	private JComponentOval igual = new JComponentOval(10);
	private JComponentOval igual2 = new JComponentOval(10);
	
	private JLabel LMatriz2 = new JLabel("Matriz 2");
	
	private int modo = 0;
	private double[][] matriz1;
	private double[][] matriz2;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OperacionesConMatrices2x2 window = new OperacionesConMatrices2x2();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public OperacionesConMatrices2x2() {
		initialize();
	}

	public void correr() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OperacionesConMatrices2x2 window = new OperacionesConMatrices2x2();
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
				reset();
				devuelta.setVisible(false);
				Input11.setVisible(true);
				Input10.setVisible(true);
				Input01.setVisible(true);
			}
		});
		devuelta.setOpaque(false);
		devuelta.setBounds(261, 91, 63, 29);
		devuelta.setVisible(false);
		frame.getContentPane().add(devuelta);
		
		frame.getContentPane().add(CalculoResuelto, BorderLayout.NORTH);
		Input00.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				Input00.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				devuelta.doClick();
			}
		});
		Input00.setBounds(80, 131, 83, 29);
		Input00.setFocusTraversalKeysEnabled(false);
		Input00.setHorizontalAlignment(SwingConstants.CENTER);
		Input00.addHover();
		Input00.setBackground(new Color(150,150,150));
		frame.getContentPane().add(Input00);
		
		Input01.setBounds(192, 131, 83, 29);
		Input01.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				modo=1;
				Input11.setVisible(false);
				Input10.setVisible(false);
				Input10.setText("");
				Input11.setText("");
				devuelta.setVisible(true);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				Input01.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			}
		});
		Input01.setHorizontalAlignment(SwingConstants.CENTER);
		Input01.addHover();
		frame.getContentPane().add(Input01);
		Input10.setBounds(80, 177, 83, 29);
		Input10.setHorizontalAlignment(SwingConstants.CENTER);
		Input10.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				modo=2;
				Input01.setVisible(false);
				Input01.setText("");
				Input11.setVisible(false);
				Input11.setText("");
				devuelta.setVisible(true);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				Input10.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			}
		});
		frame.getContentPane().add(Input10);
		Input11.setBounds(192, 177, 83, 29);
		Input11.setHorizontalAlignment(SwingConstants.CENTER);
		Input11.addHover();
		Input11.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				Input11.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			}
		});
		frame.getContentPane().add(Input11);


		
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
		Uno.setBounds(33, 241, 39, 29);
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
		Dos.setBounds(82, 241, 39, 29);
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
		Dos.addHover();
		frame.getContentPane().add(Dos);
		
		JComponentOval Tres = new JComponentOval(10);
		Tres.setBounds(131, 241, 39, 29);
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
		Cuatro.setBounds(33, 281, 39, 29);
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
		Cinco.setBounds(82, 281, 39, 29);
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
		Seis.setBounds(131, 281, 39, 29);
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
		Siete.setBounds(33, 321, 39, 29);
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
		Ocho.setBounds(82, 321, 39, 29);
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
		Nueve.setBounds(131, 321, 39, 29);
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
		Cero.setBounds(180, 321, 89, 29);
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
		punto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField = usarTextField();
				
				if(textField.getText().length()==0) {
					return;
				}
				if(textField.getText().contains(".")) {
					return;
				}
				int dim = textField.getText().length();
				if(textField.getText().charAt(dim-1)==' '||textField.getText().charAt(dim-1)=='.') {
					return;
				}
				if(comaCount!=0) {
					return;
				}
				comaCount++;
				textField.setText(textField.getText() + ".");
			}
		});
		punto.setText(".");
		punto.setForeground(Color.WHITE);
		punto.setFont(new Font("Calibri", Font.BOLD, 17));
		
		
		JLabel AvisoMatriz = new JLabel("Primera matriz:");
		AvisoMatriz.setForeground(Color.WHITE);
		AvisoMatriz.setFont(new Font("Calibri", Font.BOLD, 20));
		AvisoMatriz.setBounds(23, 78, 161, 20);
		frame.getContentPane().add(AvisoMatriz);
		
		
		
		Ac.setBounds(281, 241, 39, 29);
		Est.CompOvalColorEstandar(Ac);
		Ac.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		Ac.setFont(new Font("Calibri", Font.BOLD, 17));
		Ac.setContentAreaFilled(false);
		Ac.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AcHacer();
				textField = usarTextField();
				textField.setText("");
			}
		});		
		Ac.setText("AC");
		frame.getContentPane().add(Ac);
		
		Del.setBounds(230, 241, 39, 29);
		Est.CompOvalColorEstandar(Del);
		Del.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		Del.setFont(new Font("Calibri", Font.BOLD, 17));
		Del.setContentAreaFilled(false);
		Del.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resetAc();
				textField = usarTextField();
				if(textField.getText().endsWith("-")) {
					countMenos=0;
				} if(textField.getText().endsWith(".")) {
					countPunto=0;
				}
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
		siguiente.setBounds(281, 281, 39, 29);
		siguiente.setBackground(Color.GRAY);
		siguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resetAc();
				countMenos=0;
				countPunto=0;
				aviso_1.setVisible(false);
				aviso_2.setVisible(false);
				usarTextField().setBackground((Color.GRAY));
				focusMasUno();
				usarTextField().setBackground(new Color(150,150,150));
			}
		});
		siguiente.addHover();
		siguiente.setText("→");
		frame.getContentPane().add(siguiente);
		
		JComponentOval anterior = new JComponentOval(10);
		anterior.setBounds(230, 281, 39, 29);
		anterior.setBackground(Color.GRAY);
		anterior.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				countPunto=0;
				countMenos=0;
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
			}
		});
		Atras.addHover(new Color(194,85,236));

		JComponentOvalP PanelResultado = new JComponentOvalP(10);
		PanelResultado.setVisible(false);
		PanelResultado.setBounds(80, 112, 199, 94);
		frame.getContentPane().add(PanelResultado);
		PanelResultado.setLayout(null);
		Resultado.setFont(new Font("Calibri", Font.BOLD, 20));
		Resultado.setHorizontalAlignment(SwingConstants.CENTER);
		
		Resultado.setBounds(10, 11, 179, 38);
		PanelResultado.add(Resultado);

		Resultado2.setFont(new Font("Calibri", Font.BOLD, 20));
		Resultado2.setHorizontalAlignment(SwingConstants.CENTER);
		Resultado2.setBounds(10, 48, 179, 38);
		PanelResultado.add(Resultado2);
		
		JComponentOval Suma = new JComponentOval(5);
		Suma.setFont(new Font("Calibri", Font.BOLD, 16));
		Suma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(sumaMatrices(matriz1,matriz2)==null) {
					return;
				}
				double[][] matriz = sumaMatrices(matriz1,matriz2);
				mostrarResultados(matriz);
				
//				Resultado1.setText(String.valueOf(sumaMatrices(matriz1,matriz2)));;
			}
		});
		Suma.setVisible(false);
		Suma.setText("+");
		Suma.setBounds(23, 236, 40, 39);
		frame.getContentPane().add(Suma);
		
		JComponentOval Resta = new JComponentOval(5);
		Resta.setFont(new Font("Calibri", Font.BOLD, 16));
		Resta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(restaMatrices(matriz1,matriz2)==null) {
					return;
				}
				double[][] matriz = restaMatrices(matriz1,matriz2);
				mostrarResultados(matriz);
					
//					Resultado1.setText(String.valueOf(sumaMatrices(matriz1,matriz2)));;
			}
		});
		Resta.setVisible(false);
		Resta.setText("-");
		Resta.setBounds(73, 236, 40, 39);
		frame.getContentPane().add(Resta);
		
		JComponentOval Multiplicar = new JComponentOval(5);
		Multiplicar.setFont(new Font("Calibri", Font.BOLD, 16));
		Multiplicar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					if(multiplicacionDeMatrices(matriz1,matriz2)==null) {
						return;
					}
					mostrarResultados(multiplicacionDeMatrices(matriz1,matriz2));
				}
		});
		Multiplicar.setVisible(false);
		Multiplicar.setText("Multiplicar");
		Multiplicar.setBounds(23, 331, 90, 39);
		frame.getContentPane().add(Multiplicar);
		
		JComponentOval Division = new JComponentOval(5);
		Division.setFont(new Font("Calibri", Font.BOLD, 16));
		Division.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(dividirMatrices(matriz1,matriz2)==null) {
					return;
				}
				double[][] matriz = dividirMatrices(matriz1,matriz2);
				mostrarResultados(matriz);
			}
	});
		Division.setVisible(false);
		Division.setText("Division");
		Division.setBounds(23, 283, 90, 39);
		frame.getContentPane().add(Division);
		igual2.setBounds(278, 321, 46, 29);
		Est.CompOvalColorEstandar(igual2);

		JComponentOval MultiEscalar1 = new JComponentOval(5);
		
		igual2.setText("=");
		igual2.setFont(new Font("Calibri", Font.BOLD, 17));
		igual2.setContentAreaFilled(false);
		igual2.setVisible(false);
		igual2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(InputPE.getText().length()==0) {
					return;
				}
				int flag=0;
				if(InputPE.getText().contains(".")&&InputPE.getText().contains("-")) {
					
					for(int x=0;x<InputPE.getText().length()-1;x++) {
						int count = 0;
						if(InputPE.getText().charAt(x)=='.'||InputPE.getText().charAt(x)=='.') {
							count++;
						}
						if(InputPE.getText().charAt(x+1)=='-'||InputPE.getText().charAt(x)=='.') {
							count++;
						}
						if(count==2) {
							flag = 1;
						}
					}
				}
				if(flag==1) {
					return;
				}
				if(InputPE.getText().length()==0) {
					return;
				}
				double MatrizResultado[][] = multiplicacionEscalarMatriz(matriz2,Double.parseDouble(InputPE.getText()));
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
				Ac.setVisible(false);
				Del.setVisible(false);
				punto.setVisible(false);
				menos.setVisible(false);
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
				TFmatriz2_1.setVisible(true);
				TFmatriz2_2.setVisible(true);
				LMatriz1.setVisible(true);
				LMatriz2.setVisible(true);
				igual2.setVisible(false);
			}
		});
		frame.getContentPane().add(igual2);
		
		MultiEscalar1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				modo=6;
				
				InputPE.setVisible(true);
				
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
				punto.setVisible(true);
				menos.setVisible(true);
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
				TFmatriz2_1.setVisible(false);
				TFmatriz2_2.setVisible(false);
				LMatriz1.setVisible(false);
				LMatriz2.setVisible(false);
				igual2.setVisible(true);
			}
		});
		MultiEscalar1.setFont(new Font("Calibri", Font.BOLD, 16));
		MultiEscalar1.setText("MultiEscalar1");
		MultiEscalar1.setVisible(false);
		MultiEscalar1.setBounds(125, 283, 105, 39);
		frame.getContentPane().add(MultiEscalar1);
		
		MultiEscalar2.setFont(new Font("Calibri", Font.BOLD, 16));
		MultiEscalar2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				modo=6;
				
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
				punto.setVisible(true);
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
				TFmatriz2_1.setVisible(false);
				TFmatriz2_2.setVisible(false);
				LMatriz1.setVisible(false);
				LMatriz2.setVisible(false);
				
				igual2.setVisible(true);
			}
		});
		MultiEscalar2.setVisible(false);
		MultiEscalar2.setText("MultiEscalar2");
		MultiEscalar2.setBounds(240, 283, 105, 39);
		frame.getContentPane().add(MultiEscalar2);
		
		Determinante.setFont(new Font("Calibri", Font.BOLD, 16));
		Determinante.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(determinant2x2(matriz1)==null) {
					return;
				}
				Double determinante = determinant2x2(matriz1);
				
				Resultado.setText(String.valueOf(roundToDecimals(determinante)));
				Resultado2.setText("");
			}
		});
		Determinante.setVisible(false);
		Determinante.setText("Determinante2");
		Determinante.setBounds(240, 331, 105, 39);
		frame.getContentPane().add(Determinante);
		
		Determinante2.setFont(new Font("Calibri", Font.BOLD, 16));
		Determinante2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(determinant2x2(matriz2)==null) {
					return;
				}
				Double determinante = determinant2x2(matriz2);
				Resultado.setText(String.valueOf(roundToDecimals(determinante)));
				Resultado2.setText("");
			}
		});
		Determinante2.setVisible(false);
		Determinante2.setText("Determinante");
		Determinante2.setBounds(123, 331, 105, 39);
		frame.getContentPane().add(Determinante2);
		
		Inversa.setFont(new Font("Calibri", Font.BOLD, 16));
		Inversa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(inverse2x2(matriz1)==null) {
					return;
				}
				double[][] matriz = inverse2x2(matriz1);
				mostrarResultados(matriz);
			}
		});
		Inversa.setVisible(false);
		Inversa.setText("Inversa");
		Inversa.setBounds(123, 236, 105, 39);
		frame.getContentPane().add(Inversa);
		
		Inversa2.setFont(new Font("Calibri", Font.BOLD, 16));
		Inversa2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(inverse2x2(matriz2)==null) {
					return;
				}
				double[][] matriz = inverse2x2(matriz2);
				mostrarResultados(matriz);
			}
		});
		Inversa2.setVisible(false);
		Inversa2.setText("Inversa2");
		Inversa2.setBounds(240, 236, 105, 39);
		frame.getContentPane().add(Inversa2);

		Restablecer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				OperacionesConMatrices2x2 operaciones = new OperacionesConMatrices2x2();
				operaciones.correr();
			}
		});
		Restablecer.setVisible(false);
		Restablecer.setText("ENC");
		Est.CompOvalColorEstandar(Restablecer);
		Restablecer.setBounds(308, 11, 46, 29);
		frame.getContentPane().add(Restablecer);
		
		TFmatriz1_1.setHorizontalAlignment(SwingConstants.CENTER);
		TFmatriz1_1.setVisible(false);
		TFmatriz1_1.setBackground(Color.DARK_GRAY);
		TFmatriz1_1.setBounds(73, 28, 90, 15);
		frame.getContentPane().add(TFmatriz1_1);

		TFmatriz1_2.setHorizontalAlignment(SwingConstants.CENTER);
		TFmatriz1_2.setVisible(false);
		TFmatriz1_2.setBackground(Color.DARK_GRAY);
		TFmatriz1_2.setBounds(73, 46, 90, 15);
		frame.getContentPane().add(TFmatriz1_2);
		
		TFmatriz2_1.setHorizontalAlignment(SwingConstants.CENTER);
		TFmatriz2_1.setVisible(false);
		TFmatriz2_1.setBackground(Color.DARK_GRAY);
		TFmatriz2_1.setBounds(217, 28, 90, 15);
		frame.getContentPane().add(TFmatriz2_1);
		
		TFmatriz2_2.setHorizontalAlignment(SwingConstants.CENTER);
		TFmatriz2_2.setVisible(false);
		TFmatriz2_2.setBackground(Color.DARK_GRAY);
		TFmatriz2_2.setBounds(217, 46, 90, 13);
		frame.getContentPane().add(TFmatriz2_2);
		
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
		
		punto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(countPunto>0) {
					return;
				}
				textField = usarTextField();
				textField.setText(textField.getText() + ".");
				countPunto++;
			}
		});
		punto.setText(".");
		punto.setFont(new Font("Calibri", Font.BOLD, 17));
		punto.setContentAreaFilled(false);
		punto.setBounds(180, 241, 39, 29);
		frame.getContentPane().add(punto);
		
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
		menos.setBounds(180, 281, 39, 29);
		frame.getContentPane().add(menos);
		
		igual.setBounds(281, 321, 39, 29);
		Est.CompOvalColorEstandar(igual);
		igual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Input00.getText().endsWith("-")||Input10.getText().endsWith("-")||Input01.getText().endsWith("-")||Input11.getText().endsWith("-")) {
					return;
				}
				if(Input00.getText().equals(".")||Input10.getText().equals(".")||Input01.getText().equals(".")||Input11.getText().equals(".")) {
					return;
				}
				if(Input00.getText().length()!=0&&Input10.getText().length()!=0&&Input01.getText().length()==0&&Input11.getText().length()==0) {
					modo=1;
				}
				if(Input00.getText().length()!=0&&Input10.getText().length()==0&&Input01.getText().length()!=0&&Input11.getText().length()==0) {
					modo=2;
				}
				if(Input00.getText().length()!=0&&Input10.getText().length()!=0&&Input01.getText().length()!=0&&Input11.getText().length()==0) {
					return;
				}
				if((modo==0 || modo==3) && (Input00.getText().length()==0||Input10.getText().length()==0||Input01.getText().length()==0||Input11.getText().length()==0)) {
					return;
				}
				

				usarTextField().setBackground((Color.GRAY));
				count=0;
				usarTextField().setBackground(new Color(150,150,150));
				
				cantVecesIgual++;
				if(cantVecesIgual == 1) {
					if(modo==1) {
					
						matriz1 = new double[2][1];
						matriz1[0][0]=Double.parseDouble(Input00.getText());
						matriz1[1][0]=Double.parseDouble(Input10.getText());
						
						Input00.setText("");
						Input01.setText("");
						Input10.setText("");
						Input11.setText("");
						
					}
					else if(modo==2) {
						matriz1 = new double[1][2];
						matriz1[0][0]=Double.parseDouble(Input00.getText());
						matriz1[0][1]=Double.parseDouble(Input01.getText());

						Input00.setText("");
						Input01.setText("");
						Input10.setText("");
						Input11.setText("");
						
					} else {
						matriz1 = new double[2][2];
						matriz1[0][0]=Double.parseDouble(Input00.getText());
						matriz1[1][0]=Double.parseDouble(Input10.getText());
						matriz1[0][1]=Double.parseDouble(Input01.getText());
						matriz1[1][1]=Double.parseDouble(Input11.getText());		
					}
					
					Input00.setText("");
					Input01.setText("");
					Input10.setText("");
					Input11.setText("");
					
					devuelta.doClick();
					
					AvisoMatriz.setText("Segunda Matriz");
					
					return;
				}
				if(cantVecesIgual == 2) {
					
					if(modo==1) {
						matriz2 = new double[2][1];
						matriz2[0][0]=Double.parseDouble(Input00.getText());
						matriz2[1][0]=Double.parseDouble(Input10.getText());
					}
					else if(modo==2) {
						matriz2 = new double[1][2];
						matriz2[0][0]=Double.parseDouble(Input00.getText());
						matriz2[0][1]=Double.parseDouble(Input01.getText());
					} else {
						matriz2 = new double[2][2];
						matriz2[0][0]=Double.parseDouble(Input00.getText());
						matriz2[1][0]=Double.parseDouble(Input10.getText());
						matriz2[0][1]=Double.parseDouble(Input01.getText());
						matriz2[1][1]=Double.parseDouble(Input11.getText());	
					}
					
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
					Ac.setVisible(false);
					Del.setVisible(false);
					punto.setVisible(false);
					menos.setVisible(false);
					AvisoMatriz.setVisible(false);
					Input00.setVisible(false);
					Input01.setVisible(false);
					Input10.setVisible(false);
					Input11.setVisible(false);
					TFmatriz1_1.setVisible(false);
					TFmatriz1_2.setVisible(false);
					TFmatriz2_1.setVisible(false);
					TFmatriz2_2.setVisible(false);
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
					
					for (int i = 0; i < matriz1.length; i++) {          // Iterar sobre las filas
			            for (int j = 0; j < matriz1[i].length; j++) {   // Iterar sobre las columnas
			            	if(i>0) {
			            		TFmatriz1_2.setText(TFmatriz1_2.getText() + matriz1[i][j] + "   ");
			            	}
			            	else {
			            		TFmatriz1_1.setText(TFmatriz1_1.getText() + matriz1[i][j] + "   ");
			            	}
			            }
			        }
					
					
					TFmatriz2_1.setVisible(true);
					TFmatriz2_2.setVisible(true);
					for (int i = 0; i < matriz2.length; i++) {          // Iterar sobre las filas
			            for (int j = 0; j < matriz2[i].length; j++) {   // Iterar sobre las columnas
			            	if(i>0) {
			            		TFmatriz2_2.setText(TFmatriz2_2.getText() + matriz2[i][j] + "   ");
			            	}
			            	else {
			            		TFmatriz2_1.setText(TFmatriz2_1.getText() + matriz2[i][j] + "   ");
			            	}
			            }
			        }
					LMatriz1.setVisible(true);
					LMatriz2.setVisible(true);
					
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
		
		JComponentOval Seis_1 = new JComponentOval(10);
		Seis_1.setText("6");
		Seis_1.setFont(new Font("Calibri", Font.BOLD, 17));
		Seis_1.setContentAreaFilled(false);
		Seis_1.setBounds(180, 241, 39, 29);
		frame.getContentPane().add(Seis_1);
		
		
		
		
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
	}
	
	public void focusMasUno() {
		if(modo==1||modo==2) {
			if(count>=0&&count<2) {
				count++;
			}
			if(count==2) {
				count=0;
			}
			return;
		}
		if(count>=0&&count<3) {
			count++;
			return;
		}
		if(count>2) {
			count=0;
		}
	}
	
	public void focusMenosUno() {
		if(modo==1||modo==2) {
			if(count>0&&count<=2) {
				count--;
			}
			return;
		}
		if(count>=1&&count<=3) {
			count--;
		}
	}
	
	private JComponentOvalTF usarTextField() {
		if(modo==6) {
			return InputPE;
		}
		if(modo==1) {
			if(count==0) {
				return Input00;
			}
			if(count==1) {
				return Input01;
			}
			return Input00;
		}
		if(modo==2) {

			if(count==0) {
				return Input00;
			}
			if(count==1) {
				return Input10;
			}
			return Input00;
		}
		
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
	
	public void resetAc() {
		if(AcCount==1||AcCount>1) {
			Est.CompOvalColorEstandar(Ac);
			AcCount=0;//
		}
	}
	
	public double[][] sumaMatrices(double[][] a, double[][] b) {
	    if(a.length!=b.length) {
	    	Resultado.setText("Error: columnas y ");
	    	Resultado2.setText(" filas desiguales. ");
	    	return null;
	    }
		int rows = a.length;
	    int cols = a[0].length;
	    double[][] result = new double[rows][cols];
	    for (int i = 0; i < rows; i++) {
	        for (int j = 0; j < cols; j++) {
	            result[i][j] = a[i][j] + b[i][j];
	        }
	    }
	    return result;
	}
	
	public double[][] restaMatrices(double[][] a, double[][] b) {
		if(a.length!=b.length) {
	    	Resultado.setText("Error: columnas y ");
	    	Resultado2.setText(" filas desiguales. ");
	    	return null;
	    }
		int rows = a.length;
	    int cols = a[0].length;
	    double[][] result = new double[rows][cols];
	    for (int i = 0; i < rows; i++) {
	        for (int j = 0; j < cols; j++) {
	            result[i][j] = a[i][j] - b[i][j];
	        }
	    }
	    return result;
	}
	
	public static double[][] multiplicacionEscalarMatriz(double[][] matriz, double escalar) {
		int filas = matriz.length;
        int columnas = matriz[0].length;
        double[][] resultado = new double[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                resultado[i][j] = escalar * matriz[i][j];
            }
        }
        return resultado;
    }
	
    public double[][] multiplicacionDeMatrices(double[][] a, double[][] b) {
        int rowsA = a.length;
        int colsA = a[0].length;
        int rowsB = b.length;
        int colsB = b[0].length;

        if (colsA != rowsB) {
	        Resultado.setText("La matriz no se ");
	        Resultado2.setText("puede multiplicar");
            return null;
        }

        double[][] result = new double[rowsA][colsB];

        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        return result;
    }
	
	public double[][] inversa2x2(double[][] matrix) {
	    if (matrix.length != 2 || matrix[0].length != 2) {
	    	Resultado.setText("Error: columnas y ");
	    	Resultado2.setText(" filas desiguales. ");
	    }

	    double det = determinant2x2(matrix);
	    if (det == 0) {
	        Resultado.setText("La matriz no ");
	        Resultado2.setText("tiene inversa");
	    }

	    double[][] result = new double[2][2];
	    result[0][0] = matrix[1][1] / det;
	    result[0][1] = -matrix[0][1] / det;
	    result[1][0] = -matrix[1][0] / det;
	    result[1][1] = matrix[0][0] / det;

	    return result;
	}
	
	public Double determinant2x2(double[][] matrix) {
	    if (matrix.length != 2 || matrix[0].length != 2) {
	    	Resultado.setText("La matriz debe ");
            Resultado2.setText("ser de 2x2");
            return null;
	    }
	    return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
	}
	
    public double[][] dividirMatrices(double[][] A, double[][] B) {
    	if (B.length != 2 || B[0].length != 2) {
    		Resultado.setText("La matriz debe ");
            Resultado2.setText("ser de 2x2");
            return null;
        }
        double[][] B_inv = inverse2x2(B);
        if(B_inv==null) {
        	Resultado.setText("La matriz no ");
            Resultado2.setText("tiene division");
            return null;
        }
        return multiplicacionDeMatrices(A, B_inv);
    }

    public double[][] inverse2x2(double[][] matrix) {
        if (matrix.length != 2 || matrix[0].length != 2) {
        	Resultado.setText("La matriz debe ");
            Resultado2.setText("ser de 2x2");
        	return null;
        }
        double det = matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
        if (det == 0) {
        	Resultado.setText("No se puede hacer");
        	Resultado2.setText("Porque det es 0");
            return null;
        }
        double[][] inverse = {
            { matrix[1][1] / det, -matrix[0][1] / det },
            { -matrix[1][0] / det, matrix[0][0] / det }
        };
        return inverse;
    }
    
    public void mostrarResultados(double[][] matriz) {
    	vaciarResultados();
    	for (int i = 0; i < matriz.length; i++) {         
            for (int j = 0; j < matriz[i].length; j++) { 
            	if(i>0) {
            		Resultado2.setText(Resultado2.getText() + roundToDecimals(matriz[i][j]) + "  ");
            	}
            	else {
            		Resultado.setText(Resultado.getText() + roundToDecimals(matriz[i][j]) + "  ");
            	}
            }
        }
    }
    public void mostrarResultados(double resultado) {
    	Resultado.setText(String.valueOf(resultado));    		
    }
    
    public static double roundToDecimals(double value) {
    	int decimals = 2;
        double scale = Math.pow(10, decimals);
        return Math.round(value * scale) / scale;
    }
    
	public void reset() {
		Input00.setText("");
		Input00.setBackground(new Color(150,150,150));
		Input01.setText("");
		Input01.setBackground(Color.GRAY);
		
		Input10.setText("");
		Input10.setBackground(Color.GRAY);
		
		Input11.setText("");
		Input11.setBackground(Color.GRAY);
		
		count=0;
		modo=0;
		
		usarTextField();
	}
	
	public void vaciarResultados() {
    	Resultado.setText("");
    	Resultado2.setText("");
    }
}
