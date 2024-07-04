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

	public class OperacionesConEcuaciones2x2 {

		private JFrame frame;
		private Estandar Est = new Estandar();
		private JComponentOvalTF textField;
		private JComponentOvalTF InputA1 = new JComponentOvalTF(5);
		private JComponentOvalTF InputB1 = new JComponentOvalTF(5);
		private JComponentOvalTF InputTI1 = new JComponentOvalTF(5);
		private JComponentOvalTF InputA2 = new JComponentOvalTF(5);
		private JComponentOvalTF InputB2 = new JComponentOvalTF(5);
		private JComponentOvalTF InputTI2 = new JComponentOvalTF(5);
		private JComponentOvalTF CalculoResolver = new JComponentOvalTF(5);
		private JComponentOval Ac = new JComponentOval(10);
		private int countPunto = 0;
		private int countMenos = 0;
		private int count = 0;
		private int AcCount = 0;

		public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						OperacionesConEcuaciones2x2 window = new OperacionesConEcuaciones2x2();
						window.frame.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		}

		public OperacionesConEcuaciones2x2() {
			initialize();
		}

		public void correr() {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						OperacionesConEcuaciones2x2 window = new OperacionesConEcuaciones2x2();
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
			InputA1.setBounds(59, 79, 58, 20);
			InputA1.setFocusTraversalKeysEnabled(false);
			InputA1.setHorizontalAlignment(SwingConstants.CENTER);
			frame.getContentPane().add(InputA1);
			
			InputA1.setBackground(new Color(150,150,150));
			InputB1.setBounds(152, 79, 58, 20);
			InputB1.setHorizontalAlignment(SwingConstants.CENTER);
			frame.getContentPane().add(InputB1);
			InputTI1.setBounds(245, 79, 58, 20);
			InputTI1.setHorizontalAlignment(SwingConstants.CENTER);
			frame.getContentPane().add(InputTI1);
			InputTI2.setBounds(245, 125, 58, 20);
			InputTI2.setHorizontalAlignment(SwingConstants.CENTER);
			frame.getContentPane().add(InputTI2);
			InputA2.setBounds(59, 125, 58, 20);
			InputA2.setHorizontalAlignment(SwingConstants.CENTER);
			frame.getContentPane().add(InputA2);
			InputB2.setBounds(152, 125, 58, 20);
			InputB2.setHorizontalAlignment(SwingConstants.CENTER);
			
			frame.getContentPane().add(InputB2);

			
			
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
			lblA.setBounds(119, 130, 10, 17);
			lblA.setBackground(Color.GRAY);
			lblA.setFont(new Font("Calibri", Font.PLAIN, 12));
			lblA.setForeground(Color.LIGHT_GRAY);
			frame.getContentPane().add(lblA);
			
			JLabel lblB = new JLabel("+");
			lblB.setBounds(132, 129, 19, 19);
			lblB.setFont(new Font("Calibri", Font.PLAIN, 22));
			lblB.setForeground(Color.WHITE);
			frame.getContentPane().add(lblB);
			
			JLabel lblB_1 = new JLabel("+");
			lblB_1.setBounds(132, 79, 19, 19);
			lblB_1.setFont(new Font("Calibri", Font.PLAIN, 22));
			lblB_1.setForeground(Color.WHITE);
			frame.getContentPane().add(lblB_1);
			
			JLabel lblB_2 = new JLabel("y");
			lblB_2.setBounds(213, 131, 10, 14);
			lblB_2.setBackground(Color.GRAY);
			lblB_2.setFont(new Font("Calibri", Font.PLAIN, 11));
			lblB_2.setForeground(Color.LIGHT_GRAY);
			frame.getContentPane().add(lblB_2);
			
			JLabel lblB_3 = new JLabel("y");
			lblB_3.setBounds(213, 83, 10, 14);
			lblB_3.setBackground(Color.GRAY);
			lblB_3.setFont(new Font("Calibri", Font.PLAIN, 11));
			lblB_3.setForeground(Color.LIGHT_GRAY);
			frame.getContentPane().add(lblB_3);
			
			JLabel lblB_5 = new JLabel("Ter. Ind. 1");
			lblB_5.setBounds(251, 61, 58, 20);
			lblB_5.setFont(new Font("Calibri", Font.PLAIN, 11));
			lblB_5.setForeground(Color.WHITE);
			frame.getContentPane().add(lblB_5);
			
			JLabel lblB_6 = new JLabel("Ter. Ind. 2");
			lblB_6.setBounds(251, 108, 46, 20);
			lblB_6.setFont(new Font("Calibri", Font.PLAIN, 11));
			lblB_6.setForeground(Color.WHITE);
			frame.getContentPane().add(lblB_6);
			
			JComponentOval Uno = new JComponentOval(10);
			Uno.setBounds(37, 180, 39, 29);
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
			Dos.setBounds(86, 180, 39, 29);
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
			Tres.setBounds(135, 180, 39, 29);
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
			Cuatro.setBounds(37, 220, 39, 29);
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
			Cinco.setBounds(86, 220, 39, 29);
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
			Seis.setBounds(135, 220, 39, 29);
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
			Sieste.setBounds(37, 260, 39, 29);
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
			Ocho.setBounds(86, 260, 39, 29);
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
			Nueve.setBounds(135, 260, 39, 29);
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
			Cero.setBounds(184, 260, 46, 29);
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
		

			
			JComponentOval punto = new JComponentOval(10);
			punto.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					textField = usarTextField();
					if(textField.getText().contains(".")) {
						return;
					}
					if(countPunto>0) {
						return;
					}
					
					textField.setText(textField.getText() + ".");
					countPunto++;
				}
			});
			punto.setText(".");
			punto.setFont(new Font("Calibri", Font.BOLD, 17));
			punto.setContentAreaFilled(false);
			punto.setBounds(184, 180, 46, 29);
			frame.getContentPane().add(punto);
			
			JComponentOval menos = new JComponentOval(10);
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
			menos.setBounds(184, 220, 46, 29);
			frame.getContentPane().add(menos);
			
			
			Ac.setBounds(299, 180, 46, 29);
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
			Del.setBounds(240, 180, 46, 29);
			Est.CompOvalColorEstandar(Del);
			Del.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			Del.setFont(new Font("Calibri", Font.BOLD, 17));
			Del.setContentAreaFilled(false);
			Del.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					resetAc();
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
			
			JLabel Resultado = new JLabel("");
			Resultado.setBounds(134, 337, 209, 29);
			Est.labelEstandar(Resultado);
			
			JLabel aviso_1 = new JLabel("Aviso: Se aclara que para pasar a la siguiente posicion se debera tocar la flecha ");
			aviso_1.setForeground(Color.WHITE);
			aviso_1.setFont(new Font("Calibri", Font.BOLD, 9));
			aviso_1.setBounds(75, 11, 298, 20);
			frame.getContentPane().add(aviso_1);
			
			JLabel aviso_2 = new JLabel("para la derecha, si quiere ir a la anterior toque la que esta para la izquierda");
			aviso_2.setForeground(Color.WHITE);
			aviso_2.setFont(new Font("Calibri", Font.BOLD, 9));
			aviso_2.setBounds(75, 21, 310, 27);
			frame.getContentPane().add(aviso_2);
			
			JLabel lblB_5_1 = new JLabel("=");
			lblB_5_1.setBounds(222, 123, 19, 29);
			lblB_5_1.setFont(new Font("Calibri", Font.PLAIN, 22));
			lblB_5_1.setForeground(Color.WHITE);
			frame.getContentPane().add(lblB_5_1);
			
			JComponentOval siguiente = new JComponentOval(10);
			siguiente.setBounds(296, 220, 49, 29);
			siguiente.setBackground(Color.GRAY);
			siguiente.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					resetAc();
					if(count==0) {
						aviso_1.setVisible(false);
						aviso_2.setVisible(false);
					}
					usarTextField().setBackground((Color.GRAY));
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
			anterior.setBounds(240, 220, 46, 29);
			anterior.setBackground(Color.GRAY);
			anterior.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					resetAc();
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
			
			
			JLabel lblB_5_2 = new JLabel("=");
			lblB_5_2.setBounds(222, 78, 19, 29);
			lblB_5_2.setFont(new Font("Calibri", Font.PLAIN, 22));
			lblB_5_2.setForeground(Color.WHITE);
			frame.getContentPane().add(lblB_5_2);
			
			JLabel lblA_2 = new JLabel("x");
			lblA_2.setBounds(120, 83, 10, 17);
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

			JComponentOvalP componentOvalP = new JComponentOvalP(10);
			componentOvalP.setForeground(Color.WHITE);
			componentOvalP.setBounds(18, 326, 328, 47);
			frame.getContentPane().add(componentOvalP);
			componentOvalP.setLayout(null);
			
			CalculoResolver.setHorizontalAlignment(SwingConstants.CENTER);
			CalculoResolver.setForeground(Color.WHITE);
			CalculoResolver.setFont(new Font("Calibri", Font.BOLD, 12));
			CalculoResolver.setBackground(Color.GRAY);
			CalculoResolver.setBounds(10, 11, 308, 25);
			componentOvalP.add(CalculoResolver);
			CalculoResolver.setColumns(10);
			CalculoResolver.setFocusable(false);
			CalculoResolver.setBorder(null);
			CalculoResolver.setCursor(null);
			
			JComponentOval igual = new JComponentOval(10);
			igual.setBounds(240, 260, 106, 29);
			Est.CompOvalColorEstandar(igual);
			igual.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					resetAc();
					if(InputA1.getText().length()==0||InputB1.getText().length()==0||InputA2.getText().length()==0||
							InputB2.getText().length()==0||InputTI1.getText().length()==0||InputTI2.getText().length()==0) {
						CalculoResolver.setText("Rellene todos los espacios de la ecuacion. ");
						return;
					}
					
			        double a1 = Double.parseDouble(InputA1.getText());
			        double b1 = Double.parseDouble(InputB1.getText());
			        double c1 = Double.parseDouble(InputTI1.getText());

			        double a2 = Double.parseDouble(InputA2.getText());
			        double b2 = Double.parseDouble(InputB2.getText());
			        double c2 = Double.parseDouble(InputTI2.getText());

			        double[][] A = { {a1, b1}, {a2, b2} };
			        double[] B = { c1, c2 };

			        String result = resolverSistema(A, B);
			        CalculoResolver.setText(result);
			    }

			    public static String resolverSistema(double[][] A, double[] B) {
			        double a1 = A[0][0];
			        double b1 = A[0][1];
			        double a2 = A[1][0];
			        double b2 = A[1][1];
			        double c1 = B[0];
			        double c2 = B[1];

			        double det = a1 * b2 - a2 * b1;

			        if (det == 0) {
			            if (a1 / a2 == b1 / b2 && a1 / a2 == c1 / c2) {
			                return "El sistema de ecuaciones tiene infinitas soluciones.";
			            } else {
			                return "El sistema de ecuaciones no tiene solución.";
			            }
			        } else {
			            double x = (c1 * b2 - c2 * b1) / det;
			            double y = (a1 * c2 - a2 * c1) / det;
			            return "x = " + String.format("%.2f", x) + "    y = " + String.format("%.2f", y);
			        }
			    }
				
			});
			igual.setText("=");
			igual.setFont(new Font("Calibri", Font.BOLD, 17));
			igual.setContentAreaFilled(false);
			frame.getContentPane().add(igual);
			
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
				AcCount=0;
				Est.CompOvalColorEstandar(Ac);
			}
		}
		
		public void resetAc() {
			if(AcCount==1||AcCount>1) {
				Est.CompOvalColorEstandar(Ac);
				AcCount=0;
			}
		}
		
		public void focusMasUno() {
			if(count>=0&&count<5) {
				count++;
				return;
			}
			if(count>4) {
				count=0;
			}
		}
		
		public void focusMenosUno() {
			if(count>=1&&count<=5) {
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
				return InputTI1;
			}
			if(count==3) {
				return InputA2;
			}
			if(count==4) {
				return InputB2;
			}
			if(count==5) {
				return InputTI2;
			}
			return InputA1;
		}
	
	public static double[] resolverSistema(double[][] A, double[] B) {
        double a1 = A[0][0], b1 = A[0][1], c1 = B[0];
        double a2 = A[1][0], b2 = A[1][1], c2 = B[1];

        double determinant = a1 * b2 - a2 * b1;

        if (determinant == 0) {
            return null;
        }

        double x = (c1 * b2 - c2 * b1) / determinant;
        double y = (a1 * c2 - a2 * c1) / determinant;

        return new double[] { x, y };
    }
	
	public void reset() {

		InputA1.setText("");
		InputB1.setText("");
		InputTI1.setText("");
		InputA2.setText("");
		InputB2.setText("");
		InputTI2.setText("");
		

		InputA1.setBackground(new Color(150,150,150));
		InputB1.setBackground(Color.GRAY);
		InputTI1.setBackground(Color.GRAY);
		InputA2.setBackground(Color.GRAY);
		InputB2.setBackground(Color.GRAY);
		InputTI2.setBackground(Color.GRAY);
		count=0;
		
		
		usarTextField();
	}
}
	
