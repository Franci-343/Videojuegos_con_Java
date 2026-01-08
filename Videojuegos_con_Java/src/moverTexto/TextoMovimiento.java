package moverTexto;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class TextoMovimiento extends JFrame implements Runnable {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	Font titulo;
	int tituloX = 50;
	Image imagen;
	Graphics2D g2d;
	Thread hilo;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TextoMovimiento frame = new TextoMovimiento();
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
	public TextoMovimiento() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(350, 200, 500, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		titulo = new Font("Comic Sans MS", Font.BOLD, 30);
		hilo = new Thread(this);
		hilo.start();
	}
	
	@Override
	public void paint(java.awt.Graphics g) {
		if(imagen == null) {
			imagen = createImage(getWidth(), getHeight());
			g2d = (Graphics2D) imagen.getGraphics();
		}
		g2d.setColor(Color.BLACK);
		g2d.fillRect(0, 0, getWidth(), getHeight());
		
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g2d.setColor(Color.WHITE);
		g2d.setFont(titulo);
		g2d.drawString("Texto en Movimiento", tituloX, 200);
		
		g.drawImage(imagen, 0, 0, this);
	}
	
	@Override
	public void run() {
		while (true) {
			tituloX += 1;
			repaint();
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
