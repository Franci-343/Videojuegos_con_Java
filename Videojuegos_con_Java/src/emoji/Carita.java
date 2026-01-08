package emoji;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Carita extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Carita frame = new Carita();
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
	public Carita() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(350, 200, 800, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

	}
	@Override
	public void paint(Graphics g) {
		g.setColor(Color.black);
		g.fillRect(0,0,getWidth(),getHeight());	
		g.setColor(Color.yellow);
		g.fillOval(250, 150, 200, 200); // Cara
		
		g.setColor(Color.black);
		g.fillOval(320, 200, 30, 30); // Ojo izquierdo
		g.fillOval(270, 200, 30, 30); // Ojo derecho
		
		g.setColor(Color.red);
		g.fillOval(290,280,60,20); // Boca
	}

}
