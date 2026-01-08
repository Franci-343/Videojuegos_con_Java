package animacionBola;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class RebotaPantalla extends JFrame implements Runnable {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	final int WIDTH = 700, HEIGHT = 500;
	int bolaX = 100, bolaY = 150;
	Image imgBola = new ImageIcon("src/imagenes/eclipse.png").getImage();
	Thread hilo = new Thread(this);
	boolean izquierda , arriba;
	int velocidad = 1;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RebotaPantalla frame = new RebotaPantalla();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public RebotaPantalla() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 150, WIDTH, HEIGHT); // x, y, ancho, alto
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		hilo.start();
	}
	public void run() {
		while(true) {
			
			if(izquierda) {
				bolaX-=velocidad;
			}else {
				bolaX+=velocidad;
			}
			if(arriba) {
				bolaY-=velocidad;
				}else {
					bolaY+=velocidad;
				}
			
			if((bolaY + 75) > HEIGHT) {
				arriba = true;
			}
			if((bolaX +75) > WIDTH) {
				izquierda = true;
			}
			if((bolaX) < 0) {
				izquierda = false;
			}
			if((bolaY) < 0) {
				arriba = false;
			}
			try {
				hilo.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			repaint();
		}
	}
	
	@Override
	public void paint(Graphics g) {
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, WIDTH, HEIGHT);
		
		g.drawImage(imgBola, bolaX, bolaY, 100, 100, null);
	}
}
