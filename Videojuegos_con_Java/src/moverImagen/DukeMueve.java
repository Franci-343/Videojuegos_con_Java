package moverImagen;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Image;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class DukeMueve extends JFrame implements Runnable {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
    Image duke;
    int dukeX = 50;
    int dukeY = 50;
    Thread hilo;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DukeMueve frame = new DukeMueve();
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
	public DukeMueve() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(350, 200, 500, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		try {
			duke = javax.imageio.ImageIO.read(new java.io.File("src/imagenes/Duke256.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		if(duke == null) {
			repaint();
			System.out.println("No se ha podido cargar la imagen");
		}
		hilo = new Thread(this);
		hilo.start();
	}
	
	@Override
	public void paint(java.awt.Graphics g) {
		g.setColor(Color.black);
		g.fillRect(0, 0, getWidth(), getHeight());
		g.drawImage(duke, dukeX, dukeY,400,400, null);//imagen, x, y, observer
	}
	
	@Override
	public void run() {
		while(true) {
			dukeX += 2;
			dukeY -= 1;
			repaint();
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	//en java el plano cartesiano esta al reves , y negativo nos va hacia arriba 
	//y positivo hacia abajo , similar con el eje x
	//x nos lleva a la derecha y -x a la izquierda

}
