package Vista;


import java.util.ArrayList;
import java.util.List;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;
import java.math.RoundingMode;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.Cursor;


public class OperacionesConVectores {

	private JFrame frame;
	private Estandar Est = new Estandar();
	private int comaCount = 0;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OperacionesConVectores window = new OperacionesConVectores();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	int count=0;
	ArrayList<Double> vec1 = new ArrayList<>();
	ArrayList<Double> vec2 = new ArrayList<>();
	Double numEscalar;

	public void correr() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OperacionesConVectores window = new OperacionesConVectores();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public OperacionesConVectores() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.DARK_GRAY);
		Est.frameEstandar(frame);
		frame.getContentPane().setLayout(null);
		
		JComponentOvalP panel = new JComponentOvalP(10);
		panel.setBounds(28, 66, 310, 75);
		panel.setFont(new Font("Dialog", Font.BOLD, 20));
		panel.setForeground(new Color(0, 0, 0));
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		

		JComponentOvalTF Calculo = new JComponentOvalTF(0);
		Calculo.setBounds(16, 11, 280, 53);
		panel.add(Calculo);
		Calculo.setFont(new Font("Calibri", Font.BOLD, 18));
		Calculo.setForeground(Color.WHITE);
		
		JComponentOval cuatro = new JComponentOval(10);
		cuatro.setBounds(41, 213, 63, 40);
		cuatro.setText("4");
		cuatro.setFont(new Font("Calibri", Font.BOLD, 17));
		cuatro.setForeground(Color.WHITE);
		cuatro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Calculo.setText(Calculo.getText() + "4");
			}
		});
		cuatro.addHover();
		frame.getContentPane().add(cuatro);
		
		JComponentOval cinco = new JComponentOval(10);
		cinco.setBounds(114, 213, 63, 40);
		cinco.setText("5");
		cinco.setFont(new Font("Calibri", Font.BOLD, 17));
		cinco.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Calculo.setText(Calculo.getText() + "5");
			}
		});
		cinco.setForeground(Color.WHITE);
		cinco.addHover();
		frame.getContentPane().add(cinco);
		
		JComponentOval seis = new JComponentOval(10);
		seis.setBounds(187, 213, 63, 40);
		seis.setText("6");
		seis.setFont(new Font("Calibri", Font.BOLD, 17));
		seis.setForeground(Color.WHITE);
		seis.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Calculo.setText(Calculo.getText() + "6");
			}
		});
		seis.addHover();
		frame.getContentPane().add(seis);
		
		JComponentOval uno = new JComponentOval(10);
		uno.setBounds(41, 264, 63, 40);
		uno.setText("1");
		uno.setFont(new Font("Calibri", Font.BOLD, 17));
		uno.setForeground(Color.WHITE);
		uno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Calculo.setText(Calculo.getText() + "1");
			}
		});
		uno.addHover();
		frame.getContentPane().add(uno);
		
		JComponentOval dos = new JComponentOval(10);
		dos.setBounds(114, 264, 63, 40);
		dos.setText("2");
		dos.setFont(new Font("Calibri", Font.BOLD, 17));
		dos.setForeground(Color.WHITE);
		dos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Calculo.setText(Calculo.getText() + "2");
			}
		});
		frame.getContentPane().add(dos);
		
		JComponentOval tres = new JComponentOval(10);
		tres.setBounds(187, 264, 63, 40);
		tres.setText("3");
		tres.setFont(new Font("Calibri", Font.BOLD, 17));
		tres.setForeground(Color.WHITE);
		frame.getContentPane().add(tres);
		tres.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Calculo.setText(Calculo.getText() + "3");
			}
		});
		
		JComponentOval nueve = new JComponentOval(10);
		nueve.setBounds(187, 165, 65, 40);
		nueve.setText("9");
		nueve.setFont(new Font("Calibri", Font.BOLD, 17));
		
		nueve.setForeground(Color.WHITE);
		nueve.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Calculo.setText(Calculo.getText() + "9");
			}
		});
		frame.getContentPane().add(nueve);
		
		JComponentOval ocho = new JComponentOval(10);
		ocho.setBounds(114, 165, 63, 40);
		ocho.setText("8");
		ocho.setFont(new Font("Calibri", Font.BOLD, 17));
		ocho.setForeground(Color.WHITE);
		ocho.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Calculo.setText(Calculo.getText() + "8");
			}
		});
		frame.getContentPane().add(ocho);
		
		JComponentOval siete = new JComponentOval(10);
		siete.setBounds(41, 165, 63, 40);
		siete.setText("7");
		siete.setFont(new Font("Calibri", Font.BOLD, 17));
		siete.setForeground(Color.WHITE);
		siete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Calculo.setText(Calculo.getText() + "7");
			}
		});
		frame.getContentPane().add(siete);
		
		JComponentOval cero = new JComponentOval(10);
		cero.setBounds(41, 315, 63, 40);
		cero.setText("0");
		cero.setFont(new Font("Calibri", Font.BOLD, 17));
		cero.setForeground(Color.WHITE);
		cero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Calculo.setText(Calculo.getText() + "0");
			}
		});
		frame.getContentPane().add(cero);
		

		
		JLabel avisos = new JLabel("La flecha indicara la siguiente posicion del vector");
		avisos.setBounds(82, 19, 243, 29);
		avisos.setFont(new Font("Calibri", Font.PLAIN, 11));
		avisos.setForeground(new Color(255, 255, 255));
		frame.getContentPane().add(avisos);

		JLabel avisos_1 = new JLabel("");
		avisos_1.setBounds(82, 31, 243, 29);
		avisos_1.setVisible(false);
		avisos_1.setForeground(Color.WHITE);
		avisos_1.setFont(new Font("Calibri", Font.PLAIN, 11));
		frame.getContentPane().add(avisos_1);
		
		JComponentOval siguiente = new JComponentOval(10);
		siguiente.setBounds(260, 264, 63, 40);
		siguiente.setText("→");
		siguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Calculo.getText().length()==0) {
					return;
				}
				if(!(count>1)) {
					avisos.setVisible(false);
				}
				if(Calculo.getText().charAt(Calculo.getText().length()-1)!= ' ') {
					Calculo.setText(Calculo.getText() + ", ");
				}
				comaCount=0;
			}
		});
		siguiente.setForeground(Color.WHITE);
		siguiente.setFont(new Font("Calibri", Font.BOLD, 17));
		Est.CompOvalColorEstandar(siguiente);
		
		frame.getContentPane().add(siguiente);
		
		

		
		JComponentOval ac = new JComponentOval(10);
		ac.setBounds(260, 213, 65, 40);
		ac.setText("AC");
		ac.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Calculo.setText("");
			}
		});
		ac.setForeground(Color.WHITE);
		ac.setFont(new Font("Calibri", Font.BOLD, 17));
		Est.CompOvalColorEstandar(ac);
		frame.getContentPane().add(ac);
		

		
		JComponentOval del = new JComponentOval(10);
		del.setBounds(260, 165, 65, 40);
		del.setText("DEL");
		del.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Calculo.getText().length()!=0) {
					if(Calculo.getText().charAt(Calculo.getText().length()-1)==' ') {
						Calculo.setText(Calculo.getText().substring(0, Calculo.getText().length() - 2));
						return;
					}
					Calculo.setText(Calculo.getText().substring(0, Calculo.getText().length() - 1));
				}
			}
		});
		del.setForeground(Color.WHITE);
		del.setFont(new Font("Calibri", Font.BOLD, 17));
		Est.CompOvalColorEstandar(del);
		frame.getContentPane().add(del);
		

		JComponentOval sumar = new JComponentOval(10);
		sumar.setBounds(28, 202, 149, 46);
		sumar.setText("Sumar");
		sumar.setVisible(false);
		sumar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Calculo.setText(String.valueOf(sumaVectores(vec1, vec2)));
			}
		});
		sumar.setFont(new Font("Calibri", Font.BOLD, 15));
		frame.getContentPane().add(sumar);
		
		JComponentOval restar = new JComponentOval(10);
		restar.setBounds(187, 202, 151, 46);
		restar.setText("restar");
		restar.setVisible(false);
		restar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Calculo.setText(String.valueOf(restaVectores(vec1, vec2)));
			}
		});
		restar.setFont(new Font("Calibri", Font.BOLD, 15));
		frame.getContentPane().add(restar);
		
		JComponentOval multiplicacionEscalar = new JComponentOval(10);
		multiplicacionEscalar.setBounds(28, 315, 149, 46);
		multiplicacionEscalar.setText("multiplicacionEscalar");
		multiplicacionEscalar.setVisible(false);
		multiplicacionEscalar.setFont(new Font("Calibri", Font.BOLD, 15));
		frame.getContentPane().add(multiplicacionEscalar);
		
		JComponentOval ProductoEscalar = new JComponentOval(10);
		ProductoEscalar.setBounds(28, 259, 149, 43);
		ProductoEscalar.setText("Producto Escalar");
		ProductoEscalar.setVisible(false);
		ProductoEscalar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Calculo.setText(String.valueOf(productoEscalar(vec1, vec2)));
			}
		});
		ProductoEscalar.setFont(new Font("Calibri", Font.BOLD, 15));
		frame.getContentPane().add(ProductoEscalar);
		
		JComponentOval ProductoVectorial = new JComponentOval(10);
		ProductoVectorial.setBounds(187, 259, 151, 43);
		ProductoVectorial.setText("Producto Vectorial");
		ProductoVectorial.setVisible(false);
		ProductoVectorial.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(vec1.size()==3&&vec2.size()==3) {
					Calculo.setText(String.valueOf(productoVectorial(vec1, vec2)));
				} else {
					Calculo.setText("No se puede hacer el producto vectorial si ambos no tienen 3 de dimencion");
				}
			}
		});
		ProductoVectorial.setFont(new Font("Calibri", Font.BOLD, 15));
		frame.getContentPane().add(ProductoVectorial);
		

		
		JTextField labelVec1 = new JTextField("");
		labelVec1.setBackground(Color.DARK_GRAY);
		labelVec1.setBounds(28, 147, 300, 23);
		labelVec1.setForeground(Color.WHITE);
		labelVec1.setVisible(false);
		labelVec1.setFont(new Font("Calibri", Font.BOLD, 13));
		labelVec1.setBorder(null);
		labelVec1.setEditable(false);
		frame.getContentPane().add(labelVec1);
		
		JTextField labelVec2 =  new JTextField("");
		labelVec2.setBackground(Color.DARK_GRAY);
		labelVec2.setBounds(28, 165, 287, 25);
		labelVec2.setForeground(Color.WHITE);
		labelVec2.setVisible(false);
		labelVec2.setFont(new Font("Calibri", Font.BOLD, 13));
		labelVec2.setBorder(null);
		labelVec2.setEditable(false);
		frame.getContentPane().add(labelVec2);
		

		
		JComponentOval punto = new JComponentOval(10);
		punto.setBounds(114, 315, 136, 40);
		punto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Calculo.getText().length()==0) {
					return;
				}
				int dim = Calculo.getText().length();
				if(Calculo.getText().charAt(dim-1)==' '||Calculo.getText().charAt(dim-1)=='.') {
					return;
				}
				if(comaCount!=0) {
					return;
				}
				comaCount++;
				Calculo.setText(Calculo.getText() + ".");
			}
		});
		punto.setText(".");
		punto.setForeground(Color.WHITE);
		punto.setFont(new Font("Calibri", Font.BOLD, 17));
		
		JComponentOval Atras = new JComponentOval(10);
		Atras.setBounds(0, 0, 0, 0);
		Est.atrasEstandar(Atras);
		Est.CompOvalColorEstandar(Atras);
		frame.getContentPane().add(Atras);

		Atras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				Menu menu = new Menu();
				menu.correr();
			}
		});
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

		JComponentOval multEscalarVec2 = new JComponentOval(10);
		multEscalarVec2.setBounds(187, 313, 151, 46);
		multEscalarVec2.setText("MultiplicacionEsc2");
		multEscalarVec2.setFont(new Font("Calibri", Font.BOLD, 15));
		multEscalarVec2.setVisible(false);
		frame.getContentPane().add(multEscalarVec2);
		
		JComponentOval Restablecer = new JComponentOval(10);
		Restablecer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				OperacionesConVectores operaciones = new OperacionesConVectores();
				operaciones.correr();
			}
		});
		Restablecer.setVisible(false);
		Restablecer.setText("ENC");
		Est.CompOvalColorEstandar(Restablecer);
		Restablecer.setBounds(308, 11, 46, 29);
		frame.getContentPane().add(Restablecer);
		
		JComponentOval igual = new JComponentOval(10);
		igual.setBounds(260, 315, 65, 40);
		igual.setText("=");
		igual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(Calculo.getText().length()==0) {
					return;
				}
				
				if(Calculo.getText().charAt(Calculo.getText().length()-1)!=' ') {

				count++;
				
				if(count==1) {
					
					int terminoIndice=0;
				
					for(int x=0;x<Calculo.getText().length();x++) {
						if(Calculo.getText().charAt(x) == ',') {
							double value = 123.456789;

					        BigDecimal bd = new BigDecimal(Calculo.getText().substring(terminoIndice, x));
					        bd = bd.setScale(2, RoundingMode.HALF_UP);
					        double roundedValue = bd.doubleValue();
							vec1.add(roundedValue);
							terminoIndice = x+2;
						}
						if(x==Calculo.getText().length()-1) {
							BigDecimal bd = new BigDecimal(Calculo.getText().substring(terminoIndice, Calculo.getText().length()));
					        bd = bd.setScale(2, RoundingMode.HALF_UP);
					        double roundedValue = bd.doubleValue();
							vec1.add(roundedValue);
						}
					}
					
				} else if(count>1) {
					
					int contador=0;
					int contador2=0;
					
					for(int x=0;x<Calculo.getText().length();x++) {
						if(Calculo.getText().charAt(x)==',') {
							contador++;
						}
					}
					
					for(double i : vec1) {
						contador2++;
					}
				
					
					if(contador2!=contador+1) {
						avisos.setVisible(true);
						avisos.setText("Ingrese un vector con dimension "+contador2+", es");
						avisos_1.setText("decir, la misma dimension que el anterior");
						avisos_1.setVisible(true);;
						
						return;
					}
					
					int terminoIndice=0;
				
					for(int x=0;x<Calculo.getText().length();x++) {
						if(Calculo.getText().charAt(x) == ',') {
							vec2.add(Double.parseDouble(Calculo.getText().substring(terminoIndice, x)));
							terminoIndice = x+2;
						}
						if(x==Calculo.getText().length()-1) {
							vec2.add(Double.parseDouble(Calculo.getText().substring(terminoIndice, Calculo.getText().length())));
						}
					}
					
					punto.setVisible(false);
					igual.setVisible(false);
					uno.setVisible(false);
					dos.setVisible(false);
					tres.setVisible(false);
					cuatro.setVisible(false);
					cinco.setVisible(false);
					seis.setVisible(false);
					siete.setVisible(false);
					ocho.setVisible(false);
					nueve.setVisible(false);
					cero.setVisible(false);
					siguiente.setVisible(false);
					ac.setVisible(false);
					del.setVisible(false);
					avisos_1.setVisible(false);
					avisos.setVisible(false);
					sumar.setVisible(true);
					restar.setVisible(true);
					multiplicacionEscalar.setVisible(true);
					multEscalarVec2.setVisible(true);
					ProductoEscalar.setVisible(true);
					ProductoVectorial.setVisible(true);
					labelVec1.setVisible(true);
					labelVec2.setVisible(true);
					Restablecer.setVisible(true);
					labelVec1.setText("Primer vector: " + String.valueOf(vec1));
					labelVec2.setText("Segundo vector: " + String.valueOf(vec2));
				}

					Calculo.setText("");
				
				}
				
			}
		});
		igual.setForeground(Color.WHITE);
		igual.setFont(new Font("Calibri", Font.BOLD, 17));
		Est.CompOvalColorEstandar(igual);
		frame.getContentPane().add(igual);
		frame.getContentPane().add(punto);
		
		multEscalarVec2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {


				Calculo.setText("");
				punto.setVisible(true);
				igual.setVisible(true);
				uno.setVisible(true);
				dos.setVisible(true);
				tres.setVisible(true);
				cuatro.setVisible(true);
				cinco.setVisible(true);
				seis.setVisible(true);
				siete.setVisible(true);
				ocho.setVisible(true);
				nueve.setVisible(true);
				cero.setVisible(true);
				ac.setVisible(true);
				del.setVisible(true);
				sumar.setVisible(false);
				restar.setVisible(false);
				multiplicacionEscalar.setVisible(false);
				multEscalarVec2.setVisible(false);
				ProductoEscalar.setVisible(false);
				ProductoVectorial.setVisible(false);
				labelVec1.setVisible(false);
				labelVec2.setVisible(false);
				labelVec1.setText("Primer vector: " + String.valueOf(vec1));
				labelVec2.setText("Segundo vector: " + String.valueOf(vec2));
				igual.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if(Calculo.getText().length()==0) {
							return;
						}
						
							punto.setVisible(false);
							igual.setVisible(false);
							uno.setVisible(false);
							dos.setVisible(false);
							tres.setVisible(false);
							cuatro.setVisible(false);
							cinco.setVisible(false);
							seis.setVisible(false);
							siete.setVisible(false);
							ocho.setVisible(false);
							nueve.setVisible(false);
							cero.setVisible(false);
							siguiente.setVisible(false);
							ac.setVisible(false);
							del.setVisible(false);
							avisos_1.setVisible(false);
							avisos.setVisible(false);
							sumar.setVisible(true);
							restar.setVisible(true);
							multiplicacionEscalar.setVisible(true);
							multEscalarVec2.setVisible(true);
							ProductoEscalar.setVisible(true);
							ProductoVectorial.setVisible(true);
							labelVec1.setVisible(true);
							labelVec2.setVisible(true);

							numEscalar = Double.valueOf(Calculo.getText());
							
							Calculo.setText(String.valueOf(multiplicacionEscalar(vec2,numEscalar)));
						}
						
				});
			}
		});
		

		multiplicacionEscalar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Calculo.setText("");
				
				punto.setVisible(true);
				igual.setVisible(true);
				uno.setVisible(true);
				dos.setVisible(true);
				tres.setVisible(true);
				cuatro.setVisible(true);
				cinco.setVisible(true);
				seis.setVisible(true);
				siete.setVisible(true);
				ocho.setVisible(true);
				nueve.setVisible(true);
				cero.setVisible(true);
				ac.setVisible(true);
				del.setVisible(true);
				sumar.setVisible(false);
				restar.setVisible(false);
				multiplicacionEscalar.setVisible(false);
				multEscalarVec2.setVisible(false);
				ProductoEscalar.setVisible(false);
				ProductoVectorial.setVisible(false);
				labelVec1.setVisible(false);
				labelVec2.setVisible(false);
				labelVec1.setText("Primer vector: " + String.valueOf(vec1));
				labelVec2.setText("Segundo vector: " + String.valueOf(vec2));
				igual.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if(Calculo.getText().length()==0) {
							return;
						}
							punto.setVisible(false);
							igual.setVisible(false);
							uno.setVisible(false);
							dos.setVisible(false);
							tres.setVisible(false);
							cuatro.setVisible(false);
							cinco.setVisible(false);
							seis.setVisible(false);
							siete.setVisible(false);
							ocho.setVisible(false);
							nueve.setVisible(false);
							cero.setVisible(false);
							siguiente.setVisible(false);
							ac.setVisible(false);
							del.setVisible(false);
							avisos_1.setVisible(false);
							avisos.setVisible(false);
							sumar.setVisible(true);
							restar.setVisible(true);
							multiplicacionEscalar.setVisible(true);
							multEscalarVec2.setVisible(true);
							ProductoEscalar.setVisible(true);
							ProductoVectorial.setVisible(true);
							labelVec1.setVisible(true);
							labelVec2.setVisible(true);

							numEscalar = Double.valueOf(Calculo.getText());
							
							// no se que onda pero esto anda y no puedo evitar que tire exepción, bored
							
							Calculo.setText(String.valueOf(multiplicacionEscalar(vec1,numEscalar)));
							
							/*
							ArrayList<Double> lista = multiplicacionEscalar(vec1,numEscalar);
							String text = lista.toString();
							Calculo.setText(text);
							*/
							
							
						}
						
				});
			}
		});
	}
	
    public static ArrayList<Double> sumaVectores(ArrayList<Double> v1, ArrayList<Double> v2) {
        ArrayList<Double> resultado = new ArrayList<>(v1.size());
        for (int i = 0; i < v1.size(); i++) {
            resultado.add(v1.get(i) + v2.get(i));
        }
        return resultado;
    }

    public static ArrayList<Double> restaVectores(ArrayList<Double> v1, ArrayList<Double> v2) {
        ArrayList<Double> resultado = new ArrayList<>(v1.size());
        for (int i = 0; i < v1.size(); i++) {
            resultado.add(v1.get(i) - v2.get(i));
        }
        return resultado;
    }

    public static ArrayList<Double> multiplicacionEscalar(ArrayList<Double> v, double escalar) {
        ArrayList<Double> resultado = new ArrayList<>(v.size());
        for (int i = 0; i < v.size(); i++) {
            resultado.add(v.get(i) * escalar);
        }
        return resultado;
    }

    public static double productoEscalar(ArrayList<Double> v1, ArrayList<Double> v2) {
        double resultado = 0;
        for (int i = 0; i < v1.size(); i++) {
            resultado += v1.get(i) * v2.get(i);
        }
        return resultado;
    }
    
    

    public static ArrayList<Double> productoVectorial(ArrayList<Double> v1, ArrayList<Double> v2) {
    	ArrayList<Double> resultado = new ArrayList<>(3);
    	if (v1.size() == 3 && v2.size() == 3) {
            resultado.add(v1.get(1) * v2.get(2) - v1.get(2) * v2.get(1));
            resultado.add(v1.get(2) * v2.get(0) - v1.get(0) * v2.get(2));
            resultado.add(v1.get(0) * v2.get(1) - v1.get(1) * v2.get(0));
            return resultado;
        }
        return resultado;
    }
}
