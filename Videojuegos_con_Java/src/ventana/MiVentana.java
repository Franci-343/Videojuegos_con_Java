package ventana;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class MiVentana extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		System.out.println("Hola Mundo");
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MiVentana frame = new MiVentana();
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
	//definimos ancho y alto de la ventana
	public MiVentana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(350, 200, 500, 500); // x , y , ancho , alto
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

	}
	public void pintar(Graphics g) {
		g.setColor(Color.RED);
		g.fillRect(150, 150, 200, 200); // x , y , ancho , alto
		g.setColor(Color.BLUE);
		g.fillOval(400, 400, 50, 50); // x , y , ancho , alto
		g.setColor(Color.GREEN);
		g.fillRoundRect(50, 400, 50, 50, 15, 15); // x , y , ancho , alto , arco ancho , arco alto
	}
	@Override
	public void paint(Graphics g) {
		super.paint(g); // Llama al método paint de la superclase para mantener el comportamiento predeterminado
		pintar(g); // Llama al método personalizado para dibujar
	}
	

}