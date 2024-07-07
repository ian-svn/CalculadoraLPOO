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
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import java.awt.Insets;
import java.awt.Point;

public class OperacionesConEcuaciones3x3 {

	private JFrame frame;
	private Estandar Est = new Estandar();
	private JComponentOvalTF textField;
	private JComponentOval Ac = new JComponentOval(10);
	private JComponentOvalTF InputA1 = new JComponentOvalTF(5);
	private JComponentOvalTF InputB1 = new JComponentOvalTF(5);
	private JComponentOvalTF InputC1 = new JComponentOvalTF(5);
	private JComponentOvalTF InputTI1 = new JComponentOvalTF(5);
	private JComponentOvalTF InputA2 = new JComponentOvalTF(5);
	private JComponentOvalTF InputB2 = new JComponentOvalTF(5);
	private JComponentOvalTF InputC2 = new JComponentOvalTF(5);
	private JComponentOvalTF InputTI2 = new JComponentOvalTF(5);
	private JComponentOvalTF InputA3 = new JComponentOvalTF(5);
	private JComponentOvalTF InputB3 = new JComponentOvalTF(5);
	private JComponentOvalTF InputC3 = new JComponentOvalTF(5);
	private JComponentOvalTF InputTI3 = new JComponentOvalTF(5);
	private int countPunto = 0;
	private int countMenos = 0;
	private int count = 0;
	private int AcCount = 0;
	private JTextField CalculoResolver;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OperacionesConEcuaciones3x3 window = new OperacionesConEcuaciones3x3();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public OperacionesConEcuaciones3x3() {
		initialize();
	}

	public void correr() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OperacionesConEcuaciones3x3 window = new OperacionesConEcuaciones3x3();
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
        
		frame.getContentPane().add(CalculoResuelto, BorderLayout.NORTH);
		InputA1.setBounds(20, 66, 58, 20);
		InputA1.setFocusTraversalKeysEnabled(false);
		InputA1.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(InputA1);
		
		InputA1.setBackground(new Color(150,150,150));
		InputB1.setBounds(108, 66, 58, 20);
		InputB1.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(InputB1);
		InputTI1.setBounds(290, 66, 58, 20);
		InputTI1.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(InputTI1);
		InputTI2.setBounds(290, 112, 58, 20);
		InputTI2.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(InputTI2);
		InputA2.setBounds(20, 112, 58, 20);
		InputA2.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(InputA2);
		InputB2.setBounds(108, 112, 58, 20);
		InputB2.setHorizontalAlignment(SwingConstants.CENTER);
		
		frame.getContentPane().add(InputB2);
		InputA3.setBounds(20, 156, 58, 20);
		InputA3.setHorizontalAlignment(SwingConstants.CENTER);
		
		frame.getContentPane().add(InputA3);


		
		JLabel aviso_1 = new JLabel("Aviso: Se aclara que para pasar a la siguiente posicion se debera tocar la flecha ");
		aviso_1.setForeground(Color.WHITE);
		aviso_1.setFont(new Font("Calibri", Font.BOLD, 9));
		aviso_1.setBounds(66, 18, 298, 20);
		frame.getContentPane().add(aviso_1);
		
		JLabel aviso_2 = new JLabel("para la derecha, si quiere ir a la anterior toque la que esta para la izquierda");
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
		
		JLabel lblA = new JLabel("x");
		lblA.setBounds(80, 117, 10, 17);
		lblA.setBackground(Color.GRAY);
		lblA.setFont(new Font("Calibri", Font.PLAIN, 12));
		lblA.setForeground(Color.LIGHT_GRAY);
		frame.getContentPane().add(lblA);
		
		JLabel lblB = new JLabel("+");
		lblB.setBounds(88, 115, 19, 19);
		lblB.setFont(new Font("Calibri", Font.PLAIN, 22));
		lblB.setForeground(Color.WHITE);
		frame.getContentPane().add(lblB);
		
		JLabel lblB_1 = new JLabel("+");
		lblB_1.setBounds(88, 65, 19, 19);
		lblB_1.setFont(new Font("Calibri", Font.PLAIN, 22));
		lblB_1.setForeground(Color.WHITE);
		frame.getContentPane().add(lblB_1);
		
		JLabel lblB_2 = new JLabel("y");
		lblB_2.setBounds(169, 118, 10, 14);
		lblB_2.setBackground(Color.GRAY);
		lblB_2.setFont(new Font("Calibri", Font.PLAIN, 11));
		lblB_2.setForeground(Color.LIGHT_GRAY);
		frame.getContentPane().add(lblB_2);
		
		JLabel lblB_3 = new JLabel("y");
		lblB_3.setBounds(169, 70, 10, 14);
		lblB_3.setBackground(Color.GRAY);
		lblB_3.setFont(new Font("Calibri", Font.PLAIN, 11));
		lblB_3.setForeground(Color.LIGHT_GRAY);
		frame.getContentPane().add(lblB_3);
		
		JLabel lblB_5 = new JLabel("Ter. Ind. 1");
		lblB_5.setBounds(296, 48, 58, 20);
		lblB_5.setFont(new Font("Calibri", Font.PLAIN, 11));
		lblB_5.setForeground(Color.WHITE);
		frame.getContentPane().add(lblB_5);
		
		JLabel lblB_6 = new JLabel("Ter. Ind. 2");
		lblB_6.setBounds(296, 95, 46, 20);
		lblB_6.setFont(new Font("Calibri", Font.PLAIN, 11));
		lblB_6.setForeground(Color.WHITE);
		frame.getContentPane().add(lblB_6);
		
		JComponentOval Uno = new JComponentOval(10);
		Uno.setBounds(38, 203, 39, 29);
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
		Dos.setBounds(87, 203, 39, 29);
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
		Tres.setBounds(136, 203, 39, 29);
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
		Cuatro.setBounds(38, 243, 39, 29);
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
		Cinco.setBounds(87, 243, 39, 29);
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
		Seis.setBounds(136, 243, 39, 29);
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
		
		JComponentOval Sieste = new JComponentOval(10);
		Sieste.setBounds(38, 283, 39, 29);
		Sieste.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		Sieste.setFont(new Font("Calibri", Font.BOLD, 17));
		Sieste.setContentAreaFilled(false);
		Sieste.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField = usarTextField();
				textField.setText(textField.getText() + "7");
				resetAc();
			}
		});		
		Sieste.setText("7");
		Sieste.addHover();
		frame.getContentPane().add(Sieste);
		
		JComponentOval Ocho = new JComponentOval(10);
		Ocho.setBounds(87, 283, 39, 29);
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
		Nueve.setBounds(136, 283, 39, 29);
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
		Cero.setBounds(185, 283, 39, 29);
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
	
		
		
		Ac.setBounds(289, 203, 46, 29);
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
		
		JComponentOval Del = new JComponentOval(10);
		Del.setBounds(234, 203, 46, 29);
		Est.CompOvalColorEstandar(Del);
		Del.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		Del.setFont(new Font("Calibri", Font.BOLD, 17));
		Del.setContentAreaFilled(false);
		Del.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField = usarTextField();
				resetAc();
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
		
		JLabel Resultado = new JLabel("");
		Resultado.setBounds(134, 337, 209, 29);
		Est.labelEstandar(Resultado);
		
		
		
		JLabel lblB_5_1 = new JLabel("=");
		lblB_5_1.setBounds(267, 110, 19, 29);
		lblB_5_1.setFont(new Font("Calibri", Font.PLAIN, 22));
		lblB_5_1.setForeground(Color.WHITE);
		frame.getContentPane().add(lblB_5_1);
		
		JComponentOval siguiente = new JComponentOval(10);
		siguiente.setBounds(290, 243, 46, 29);
		siguiente.setBackground(Color.GRAY);
		siguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resetAc();
				aviso_1.setVisible(false);
				aviso_2.setVisible(false);
				usarTextField().setBackground((Color.GRAY));
				if(usarTextField().getText().endsWith(".")) {
					
				}
				focusMasUno();
				usarTextField().setBackground(new Color(150,150,150));
				countPunto=0;
				countMenos=0;
			}
		});
		siguiente.addHover();
		siguiente.setText("→");
		frame.getContentPane().add(siguiente);
		
		JComponentOval anterior = new JComponentOval(10);
		anterior.setBounds(234, 243, 46, 29);
		anterior.setBackground(Color.GRAY);
		anterior.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resetAc();
				aviso_1.setVisible(false);
				aviso_2.setVisible(false);
				usarTextField().setBackground((Color.GRAY));
				focusMenosUno();
				usarTextField().setBackground(new Color(150,150,150));
				countPunto=0;
				countMenos=0;
			}
		});
		anterior.addHover();
		anterior.setText("←");
		frame.getContentPane().add(anterior);
		
		JComponentOval punto = new JComponentOval(10);
		punto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(noAntesDeOperador()) {
					return;
				}
				
				if(countPunto>0) {
					return;
				}
				textField = usarTextField();
				if(textField.getText().contains(".")) {
					return;
				}
				textField.setText(textField.getText() + ".");
				countPunto++;
			}
		});
		punto.setText(".");
		punto.setFont(new Font("Calibri", Font.BOLD, 17));
		punto.setContentAreaFilled(false);
		punto.setBounds(185, 203, 39, 29);
		frame.getContentPane().add(punto);
		
		JComponentOval menos = new JComponentOval(10);
		menos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(noAntesDeOperador()) {
					return;
				}
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
		menos.setBounds(185, 243, 39, 29);
		frame.getContentPane().add(menos);
		
		JComponentOvalP componentOvalP = new JComponentOvalP(10);
		componentOvalP.setBounds(20, 328, 328, 47);
		frame.getContentPane().add(componentOvalP);
		componentOvalP.setLayout(null);
		
		CalculoResolver = new JTextField();
		CalculoResolver.setForeground(Color.WHITE);
		CalculoResolver.setHorizontalAlignment(SwingConstants.CENTER);
		CalculoResolver.setFont(new Font("Calibri", Font.BOLD, 12));
		CalculoResolver.setBackground(Color.GRAY);
		CalculoResolver.setBounds(10, 11, 308, 25);
		componentOvalP.add(CalculoResolver);
		CalculoResolver.setColumns(10);
		CalculoResolver.setFocusable(false);
		CalculoResolver.setBorder(null);
		CalculoResolver.setCursor(null);
		
		
		JLabel lblB_5_2 = new JLabel("=");
		lblB_5_2.setBounds(267, 65, 19, 29);
		lblB_5_2.setFont(new Font("Calibri", Font.PLAIN, 22));
		lblB_5_2.setForeground(Color.WHITE);
		frame.getContentPane().add(lblB_5_2);
		
		JLabel lblB_6_1 = new JLabel("Ter. Ind. 3");
		lblB_6_1.setBounds(296, 140, 53, 20);
		lblB_6_1.setFont(new Font("Calibri", Font.PLAIN, 11));
		lblB_6_1.setForeground(Color.WHITE);
		frame.getContentPane().add(lblB_6_1);
		
		JLabel lblA_1 = new JLabel("x");
		lblA_1.setBounds(80, 160, 10, 17);
		lblA_1.setBackground(Color.GRAY);
		lblA_1.setFont(new Font("Calibri", Font.PLAIN, 12));
		lblA_1.setForeground(Color.LIGHT_GRAY);
		frame.getContentPane().add(lblA_1);
		
		JLabel lblB_4 = new JLabel("+");
		lblB_4.setBounds(88, 156, 19, 19);
		lblB_4.setForeground(Color.WHITE);
		lblB_4.setFont(new Font("Calibri", Font.PLAIN, 22));
		frame.getContentPane().add(lblB_4);
		InputB3.setBounds(108, 156, 58, 20);
		InputB3.setHorizontalAlignment(SwingConstants.CENTER);
		

		frame.getContentPane().add(InputB3);
		InputTI3.setBounds(290, 156, 58, 20);
		InputTI3.setHorizontalAlignment(SwingConstants.CENTER);

		frame.getContentPane().add(InputTI3);
		
		JLabel lblB_2_1 = new JLabel("y");
		lblB_2_1.setBounds(169, 160, 10, 14);
		lblB_2_1.setBackground(Color.GRAY);
		lblB_2_1.setFont(new Font("Calibri", Font.PLAIN, 11));
		lblB_2_1.setForeground(Color.LIGHT_GRAY);
		frame.getContentPane().add(lblB_2_1);
		
		JLabel lblB_5_1_1 = new JLabel("=");
		lblB_5_1_1.setBounds(267, 153, 19, 29);
		lblB_5_1_1.setForeground(Color.WHITE);
		lblB_5_1_1.setFont(new Font("Calibri", Font.PLAIN, 22));
		frame.getContentPane().add(lblB_5_1_1);
		
		JLabel lblA_2 = new JLabel("x");
		lblA_2.setBounds(81, 70, 10, 17);
		lblA_2.setBackground(Color.GRAY);
		lblA_2.setFont(new Font("Calibri", Font.PLAIN, 12));
		lblA_2.setForeground(Color.LIGHT_GRAY);
		frame.getContentPane().add(lblA_2);
		
		Atras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				OperacionesConEcuacionesMenu menu = new OperacionesConEcuacionesMenu();
				menu.correr();
			}
		});
		Atras.addHover(new Color(194,85,236));

		JComponentOval igual = new JComponentOval(10);
		igual.setBounds(234, 283, 101, 29);
		Est.CompOvalColorEstandar(igual);
		igual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resetAc();
				try {
				    if(InputA1.getText().length()==0 || InputB1.getText().length()==0 || InputC1.getText().length()==0 ||
				       InputA2.getText().length()==0 || InputB2.getText().length()==0 || InputC2.getText().length()==0 ||
				       InputA3.getText().length()==0 || InputB3.getText().length()==0 || InputC3.getText().length()==0 ||
				       InputTI1.getText().length()==0 || InputTI2.getText().length()==0 || InputTI3.getText().length()==0) {
				       
				        CalculoResolver.setText("Error de entrada: Rellene todas las posisciones de la ecuacion.");
				        return;
				    }
				    
				    double a1 = Double.parseDouble(InputA1.getText());
				    double a2 = Double.parseDouble(InputA2.getText());
				    double a3 = Double.parseDouble(InputA3.getText());
				    double b1 = Double.parseDouble(InputB1.getText());
				    double b2 = Double.parseDouble(InputB2.getText());
				    double b3 = Double.parseDouble(InputB3.getText());
				    double c1 = Double.parseDouble(InputC1.getText());  // Corregido: usar InputC1.getText() para c1
				    double c2 = Double.parseDouble(InputC2.getText());  // Corregido: usar InputC2.getText() para c2
				    double c3 = Double.parseDouble(InputC3.getText());  // Corregido: usar InputC3.getText() para c3
				    double TI1 = Double.parseDouble(InputTI1.getText());
				    double TI2 = Double.parseDouble(InputTI2.getText());
				    double TI3 = Double.parseDouble(InputTI3.getText());

				    double determinante = a1 * (b2 * c3 - c2 * b3) - b1 * (a2 * c3 - c2 * a3) + c1 * (a2 * b3 - b2 * a3);

				    if (Math.abs(determinante) < 1e-10) {  // Si el determinante es aproximadamente cero (considerando tolerancia)
				        // Soluciones infinitas
				        CalculoResolver.setText("Infinitas soluciones");
				    } else {
				        double determinanteX = TI1 * (b2 * c3 - c2 * b3) - b1 * (TI2 * c3 - c2 * TI3) + c1 * (TI2 * b3 - b2 * TI3);
				        double determinanteY = a1 * (TI2 * c3 - c2 * TI3) - TI1 * (a2 * c3 - c2 * a3) + c1 * (a2 * TI3 - TI2 * a3);
				        double determinanteZ = a1 * (b2 * TI3 - TI2 * b3) - b1 * (a2 * TI3 - TI2 * a3) + TI1 * (a2 * b3 - b2 * a3);

				        double resultadoX = determinanteX / determinante;
				        double resultadoY = determinanteY / determinante;
				        double resultadoZ = determinanteZ / determinante;

				        CalculoResolver.setText(String.format("X = %.2f    Y = %.2f    Z = %.2f", resultadoX, resultadoY, resultadoZ));
				    }
				} catch (NumberFormatException ex) {
				    CalculoResolver.setText("Error en la entrada");
				} catch (Exception ex) {
				    CalculoResolver.setText("Ocurrio un error");
				}
			}
		});
		igual.setText("=");
		igual.setFont(new Font("Calibri", Font.BOLD, 17));
		igual.setContentAreaFilled(false);
		frame.getContentPane().add(igual);
		InputC2.setBounds(193, 112, 58, 20);
		
		InputC2.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(InputC2);
		
		JLabel lblB_7 = new JLabel("+");
		lblB_7.setBounds(176, 112, 19, 19);
		lblB_7.setForeground(Color.WHITE);
		lblB_7.setFont(new Font("Calibri", Font.PLAIN, 22));
		frame.getContentPane().add(lblB_7);
		
		JLabel lblB_8 = new JLabel("+");
		lblB_8.setBounds(176, 157, 19, 19);
		lblB_8.setForeground(Color.WHITE);
		lblB_8.setFont(new Font("Calibri", Font.PLAIN, 22));
		frame.getContentPane().add(lblB_8);
		
		JLabel lblB_9 = new JLabel("+");
		lblB_9.setBounds(176, 66, 19, 19);
		lblB_9.setForeground(Color.WHITE);
		lblB_9.setFont(new Font("Calibri", Font.PLAIN, 22));
		frame.getContentPane().add(lblB_9);
		InputC1.setBounds(193, 68, 58, 20);
		
		InputC1.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(InputC1);
		InputC3.setBounds(193, 156, 58, 20);
		
		InputC3.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(InputC3);
		
		JLabel lblB_2_2 = new JLabel("z");
		lblB_2_2.setBounds(255, 118, 10, 14);
		lblB_2_2.setBackground(Color.GRAY);
		lblB_2_2.setForeground(Color.LIGHT_GRAY);
		lblB_2_2.setFont(new Font("Calibri", Font.PLAIN, 12));
		frame.getContentPane().add(lblB_2_2);
		
		JLabel lblB_2_3 = new JLabel("z");
		lblB_2_3.setBounds(255, 70, 8, 14);
		lblB_2_3.setBackground(Color.GRAY);
		lblB_2_3.setForeground(Color.LIGHT_GRAY);
		lblB_2_3.setFont(new Font("Calibri", Font.PLAIN, 12));
		frame.getContentPane().add(lblB_2_3);
		
		JLabel lblB_2_4 = new JLabel("z");
		lblB_2_4.setBounds(255, 160, 10, 14);
		lblB_2_4.setBackground(Color.GRAY);
		lblB_2_4.setForeground(Color.LIGHT_GRAY);
		lblB_2_4.setFont(new Font("Calibri", Font.PLAIN, 12));
		frame.getContentPane().add(lblB_2_4);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
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
	
	public void focusMasUno() {
		if(count>=0&&count<11) {
			count++;
			return;
		}
		if(count>10) {
			count=0;
		}
	}
	
	public void focusMenosUno() {
		if(count>=1&&count<=11) {
			count--;
		}
	}
	
	private JComponentOvalTF usarTextField() {
		if(count==0) {
			return InputA1;
		}
		if(count==1) {
			return InputB1;
		}
		if(count==2) {
			return InputC1;
		}
		if(count==3) {
			return InputTI1;
		}
		if(count==4) {
			return InputA2;
		}
		if(count==5) {
			return InputB2;
		}
		if(count==6) {
			return InputC2;
		}
		if(count==7) {
			return InputTI2;
		}
		if(count==8) {
			return InputA3;
		}
		if(count==9) {
			return InputB3;
		}
		if(count==10) {
			return InputC3;
		}
		if(count==11) {
			return InputTI3;
		}
		return InputA1;
	}
	
	public void reset() {

		InputA1.setText("");
		InputB1.setText("");
		InputC1.setText("");
		InputTI1.setText("");
		InputA2.setText("");
		InputB2.setText("");
		InputC2.setText("");
		InputTI2.setText("");
		InputA3.setText("");
		InputB3.setText("");
		InputC3.setText("");
		InputTI3.setText("");

		InputA1.setBackground(new Color(150,150,150));
		InputB1.setBackground(Color.GRAY);
		InputB1.setBackground(Color.GRAY);
		InputC1.setBackground(Color.GRAY);
		InputTI1.setBackground(Color.GRAY);
		InputA2.setBackground(Color.GRAY);
		InputB2.setBackground(Color.GRAY);
		InputC2.setBackground(Color.GRAY);
		InputTI2.setBackground(Color.GRAY);
		InputA3.setBackground(Color.GRAY);
		InputB3.setBackground(Color.GRAY);
		InputC3.setBackground(Color.GRAY);
		InputTI3.setBackground(Color.GRAY);
		count=0;
		
		
		usarTextField();
	}
	
	public boolean noAntesDeOperador() {
		
		String text = usarTextField().getText();
		
		if(text.endsWith(".")||text.endsWith("-")) {
			return true;
		}
		return false;
	}
}