package mostrarImagen;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class MostrarImagen extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	Image imagen;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MostrarImagen frame = new MostrarImagen();
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
	public MostrarImagen() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(350, 200, 500, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
        try {
			imagen = ImageIO.read(new File("src/imagenes/Duke256.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
        if(imagen == null) {
        	repaint();
			System.out.println("No se ha podido cargar la imagen");
		}
	}
	@Override
	public void paint(java.awt.Graphics g) {
		g.setColor(Color.black);
		g.fillRect(0, 0, getWidth(), getHeight());
		g.drawImage(imagen, 50, 50,400,400, null);//imagen, x, y, observer
	}

}
