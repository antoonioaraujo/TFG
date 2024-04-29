package TFG;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class EstadoPeliculas extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EstadoPeliculas frame = new EstadoPeliculas();
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
	public EstadoPeliculas() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(EstadoPeliculas.class.getResource("/Imagenes/Logo.jpg")));
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(712, 450);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(EstadoPeliculas.class.getResource("/Imagenes/Logo.jpg")));
		lblNewLabel.setBounds(46, 37, 210, 312);
		contentPane.add(lblNewLabel);
		
		JButton ReservarB = new JButton("Reservar");
		ReservarB.setBounds(363, 264, 85, 21);
		contentPane.add(ReservarB);
		
		JButton DevolverB = new JButton("Devolver");
		DevolverB.setBounds(502, 264, 85, 21);
		contentPane.add(DevolverB);
		
		JLabel EstadoTrueL = new JLabel("Estado: Disponible");
		EstadoTrueL.setBounds(389, 141, 104, 13);
		contentPane.add(EstadoTrueL);
		
		JLabel EstadoFalseL = new JLabel("Estado: No Disponible");
		EstadoFalseL.setBounds(389, 141, 104, 13);
		contentPane.add(EstadoFalseL);
	}
}
