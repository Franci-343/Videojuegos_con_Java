package movimientoTeclado;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class dukeMovimiento extends JFrame implements KeyListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	final int WIDTH = 700;
	final int HEIGHT = 500;
	Image duke = new ImageIcon("src/imagenes/Duke256.png").getImage();
	int dukeX = WIDTH/2 - 75/2;
	int dukeY = 150;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					dukeMovimiento frame = new dukeMovimiento();
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
	public dukeMovimiento() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 100, WIDTH, HEIGHT);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		addKeyListener(this);
	}
	
	@Override
	public void paint(Graphics g) {
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, WIDTH, HEIGHT);
		
		g.drawImage(duke, dukeX, dukeY, 75,75,null);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// Movimiento basico con las flechas
		if(e.getKeyCode() == KeyEvent.VK_LEFT) {
			dukeX -= 5;
		}
		if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
			dukeX += 5;
		}
		if(e.getKeyCode() == KeyEvent.VK_UP) {
			dukeY -= 5;
		}
		if(e.getKeyCode() == KeyEvent.VK_DOWN) {
			dukeY += 5;
		}
		repaint();
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
