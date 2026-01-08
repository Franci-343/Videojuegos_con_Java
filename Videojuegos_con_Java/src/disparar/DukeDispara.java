package disparar;

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

public class DukeDispara extends JFrame implements KeyListener,Runnable {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
    final int WIDTH = 700, HEIGHT = 500;
    Image duke = new ImageIcon("src/imagenes/Duke256.png").getImage();
    Image bola = new ImageIcon("src/imagenes/eclipse.png").getImage();
    boolean disparo;
    Thread hilo = new Thread(this);
    int bolaX = 225, bolaY = 200;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DukeDispara frame = new DukeDispara();
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
	public DukeDispara() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 200, WIDTH, HEIGHT);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		addKeyListener(this);
		hilo.start();
	}
	@Override
	public void paint(Graphics g) {
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, WIDTH, HEIGHT);
	   
		g.drawImage(bola, bolaX, 200, 50,50,null);
		g.drawImage(duke, 100, 120, 250,250,null);
	}
	
	public void run() {
		while(true) {
			if(disparo) {
				bolaX += 15;
			}
			try {
				hilo.sleep(20);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			repaint();
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		disparo = true;
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
