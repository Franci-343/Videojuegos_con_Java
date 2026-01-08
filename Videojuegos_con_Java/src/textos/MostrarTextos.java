package textos;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class MostrarTextos extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private java.awt.Font font;
	Font font2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MostrarTextos frame = new MostrarTextos();
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
	public MostrarTextos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(350, 200, 500, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		font = new java.awt.Font("Comic Sans MS", java.awt.Font.BOLD, 24);
		
		font2 = new java.awt.Font("Arial", java.awt.Font.ITALIC, 30);
		

	}
	@Override
	public void paint(java.awt.Graphics g) {
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, getWidth(), getHeight());
		
		g.setColor(Color.WHITE);
		g.setFont(font);
		g.drawString("¡Hola, Mundo!", 180, 130);
		
		g.setColor(Color.CYAN);
		g.setFont(font2);
		g.drawString("¡Bienvenidos a Java!", 100, 200);
	}

}