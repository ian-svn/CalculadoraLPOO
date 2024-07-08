package Vista;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JScrollPane;

public class hISTORIAL {

	private JFrame frame;

	/**
	 * Launch the application.
	 */

	private static List<Double> registros;
	private Estandar Est = new Estandar();
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					hISTORIAL window = new hISTORIAL(registros);
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
	public hISTORIAL(List<Double> registros) {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
	JFrame mainFrame = new JFrame();
    mainFrame.setSize(400, 400);
    mainFrame.getContentPane().setBackground(Color.DARK_GRAY);
    mainFrame.setBounds(100, 100, 380, 425);
    mainFrame.setLocationRelativeTo(null);
    mainFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    // Crear el JTextArea con 10 filas y 30 columnas
    JComponentOvalTA textArea = new JComponentOvalTA(30);
    textArea.setBackground(Color.gray);
    textArea.setRows(10);
    textArea.setColumns(20);
    String texto = "";
	for(int x=0;x<registros.size();x++) {
		texto = texto + "(" + (x+1) + ")- " + registros.get(x) + "\n";
	}
	textArea.setFocusable(false);
	textArea.setText(texto);
    textArea.setLineWrap(true); // Habilitar el ajuste de línea
    textArea.setWrapStyleWord(true); // Ajustar la línea por palabras

    // Agregar el JTextArea a un JScrollPane para permitir el desplazamiento
    JComponentOvalSP scrollPane = new JComponentOvalSP(30);
    scrollPane.setBackground(Color.DARK_GRAY);
    scrollPane.setViewportView(textArea);
    scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
    scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);


    // Crear un panel y agregar el JScrollPane y el botón al panel
    JComponentOvalP panel = new JComponentOvalP(30);
    panel.add(scrollPane);
    
    panel.setBackground(Color.DARK_GRAY);

    // Agregar el panel al JFrame
    mainFrame.add(panel);

    // Hacer visible la ventana principal
    mainFrame.setVisible(true);
    
    JComponentOval atras = new JComponentOval(10);
	Est.atrasEstandar(atras);
	Est.CompOvalColorEstandar(atras);
	atras.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			mainFrame.dispose();
		}
	});
	atras.setBounds(10, 11, 47, 32);
	mainFrame.getContentPane().add(atras);
	}

}
