package Vista;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Area;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;

import javax.swing.JTextArea;

public class JComponentOvalTA extends JTextArea{
	private static final long serialVersionUID = 1L;
	private int valorEsquinaOvalSI;
	private int valorEsquinaOvalSD;
	private int valorEsquinaOvalII;
	private int valorEsquinaOvalID;
	private String text = "";
	
	public JComponentOvalTA(int valorEsquinaOvalSI, int valorEsquinaOvalSD, int valorEsquinaOvalII, int valorEsquinaOvalID){
		this.setOpaque(false);
		this.setBorder(null);
		this.setFont(new Font("Calibri", Font.BOLD, 17));
		this.setForeground(new Color(255, 255, 255));
		this.setBackground(Color.GRAY);
    	this.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		setValorEsquinaOvalSI(valorEsquinaOvalSI);
		setValorEsquinaOvalSD(valorEsquinaOvalSD);
		setValorEsquinaOvalII(valorEsquinaOvalII);
		setValorEsquinaOvalID(valorEsquinaOvalID);
	}
	public JComponentOvalTA(int valorOval){
		this.setOpaque(false);
		this.setBorder(null);
		this.setFont(new Font("Calibri", Font.BOLD, 17));
		this.setForeground(new Color(255, 255, 255));
		this.setBackground(Color.GRAY);
    	this.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		this.setOpaque(false);
		this.setBorder(null);
		setValorEsquinaOvalSI(valorOval);
		setValorEsquinaOvalSD(valorOval);
		setValorEsquinaOvalII(valorOval);
		setValorEsquinaOvalID(valorOval);
	}
	public JComponentOvalTA(int valorOval, String text){
		this.setOpaque(false);
		this.setBorder(null);
		this.setFont(new Font("Calibri", Font.BOLD, 17));
		this.setForeground(new Color(255, 255, 255));
		this.setBackground(Color.GRAY);
    	this.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		this.setOpaque(false);
		this.setBorder(null);
		setValorEsquinaOvalSI(valorOval);
		setValorEsquinaOvalSD(valorOval);
		setValorEsquinaOvalII(valorOval);
		setValorEsquinaOvalID(valorOval);
		text = this.getText();
	}
	
	public void validarValorOval(int valorOval){
		if(valorOval<0)
			throw new IllegalArgumentException();
	}
	public int getValorEsquinaOvalSI() {
		return valorEsquinaOvalSI;
	}
	public void setValorEsquinaOvalSI(int valorEsquinaOvalSI) {
		validarValorOval(valorEsquinaOvalSI);
		this.valorEsquinaOvalSI = valorEsquinaOvalSI;
	}
	public int getValorEsquinaOvalSD() {
		return valorEsquinaOvalSD;
	}
	public void setValorEsquinaOvalSD(int valorEsquinaOvalSD) {
		validarValorOval(valorEsquinaOvalSD);
		this.valorEsquinaOvalSD = valorEsquinaOvalSD;
	}
	public int getValorEsquinaOvalII() {
		return valorEsquinaOvalII;
	}
	public void setValorEsquinaOvalII(int valorEsquinaOvalII) {
		validarValorOval(valorEsquinaOvalII);
		this.valorEsquinaOvalII = valorEsquinaOvalII;
	}
	public int getValorEsquinaOvalID() {
		return valorEsquinaOvalID;
	}
	public void setValorEsquinaOvalID(int valorEsquinaOvalID) {
		validarValorOval(valorEsquinaOvalID);
		this.valorEsquinaOvalID = valorEsquinaOvalID;
	}
	
	@Override
	protected void paintComponent(Graphics gr){
		Graphics2D g2 = (Graphics2D)gr.create();
		g2.setColor(this.getBackground());
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		
		Area a = crearEsquinasOvales(0);
		a.intersect(crearEsquinasOvales(1));
		a.intersect(crearEsquinasOvales(2));
		a.intersect(crearEsquinasOvales(3));
		
		g2.fill(a);
		g2.dispose();
		
		super.paintComponent(gr);
	}
	
	public Area crearEsquinasOvales(int esquina) {
		//esquina>> 0:Superior-Derecha, 1:Superior-Izquierda, 2:Inferior-Derecha, 3:Inferior-Izquierda
		int anchoPanel = getWidth();
		int altoPanel = getHeight();
		int ovalX = 0;
		int ovalY = 0;	

		switch(esquina) {
		case 0:
			ovalX = Math.min(anchoPanel, this.valorEsquinaOvalSD);
			ovalY = Math.min(altoPanel, this.valorEsquinaOvalSD);	
			break;
		case 1:
			ovalX = Math.min(anchoPanel, this.valorEsquinaOvalSI);
			ovalY = Math.min(altoPanel, this.valorEsquinaOvalSI);	
			break;
		case 2:
			ovalX = Math.min(anchoPanel, this.valorEsquinaOvalID);
			ovalY = Math.min(altoPanel, this.valorEsquinaOvalID);	
			break;
		case 3:
			ovalX = Math.min(anchoPanel, this.valorEsquinaOvalII);
			ovalY = Math.min(altoPanel, this.valorEsquinaOvalII);	
			break;
		default:
			throw new IllegalArgumentException("Valor no válido de esquina");
		}

		Area area = new Area(new RoundRectangle2D.Double(0, 0, anchoPanel, altoPanel, ovalX, ovalY));

		switch(esquina) {
		case 0:
			area.add(new Area(new Rectangle2D.Double(0, 0, anchoPanel - ovalX / 2.0, altoPanel)));
			area.add(new Area(new Rectangle2D.Double(0, ovalY / 2.0, anchoPanel, altoPanel - ovalY / 2.0)));
			break;
		case 1:
			area.add(new Area(new Rectangle2D.Double(ovalX / 2.0, 0, anchoPanel - ovalX / 2.0, altoPanel)));
			area.add(new Area(new Rectangle2D.Double(0, ovalY / 2.0, anchoPanel, altoPanel - ovalY / 2.0)));
			break;
		case 2:
			area.add(new Area(new Rectangle2D.Double(0, 0, anchoPanel - ovalX / 2.0, altoPanel)));
			area.add(new Area(new Rectangle2D.Double(0, 0, anchoPanel, altoPanel - ovalY / 2.0)));
			break;
		case 3:
			area.add(new Area(new Rectangle2D.Double(ovalX / 2.0, 0, anchoPanel - ovalX / 2.0, altoPanel)));
			area.add(new Area(new Rectangle2D.Double(0, 0, anchoPanel, altoPanel - ovalY / 2.0)));
			break;
		default:
			throw new IllegalArgumentException("Valor no válido de esquina");
		}

		return area;
	}
	
	public void addHover() {
    	this.addMouseListener(new MouseAdapter() {
    		@Override
    		public void mouseEntered(MouseEvent e) {
    			setBackground(new Color(140, 140, 140));
    		}
    		@Override
    		public void mouseExited(MouseEvent e) {
    			setBackground(Color.gray);
    		}
    	});
	}
}

