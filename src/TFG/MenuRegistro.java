package TFG;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MenuRegistro extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField UsuarioF;
	private JTextField CorreoF;
	private JTextField ContraseñaF;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuRegistro frame = new MenuRegistro();
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
	public MenuRegistro() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setSize(950, 600);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel RegistrateT = new JLabel("Registrate");
		RegistrateT.setBounds(441, 98, 69, 35);
		contentPane.add(RegistrateT);
		
		JLabel UsuarioT = new JLabel("Usuario");
		UsuarioT.setBounds(327, 168, 45, 13);
		contentPane.add(UsuarioT);
		
		UsuarioF = new JTextField();
		UsuarioF.setBounds(471, 165, 96, 19);
		contentPane.add(UsuarioF);
		UsuarioF.setColumns(10);
		
		JLabel CorreoT = new JLabel("Correo");
		CorreoT.setBounds(327, 225, 45, 13);
		contentPane.add(CorreoT);
		
		CorreoF = new JTextField();
		CorreoF.setBounds(471, 222, 96, 19);
		contentPane.add(CorreoF);
		CorreoF.setColumns(10);
		
		JLabel ContraseñaT = new JLabel("Contraseña");
		ContraseñaT.setBounds(327, 290, 69, 13);
		contentPane.add(ContraseñaT);
		
		ContraseñaF = new JTextField();
		ContraseñaF.setBounds(471, 287, 96, 19);
		contentPane.add(ContraseñaF);
		ContraseñaF.setColumns(10);
		
		JButton ConfirmarB = new JButton("Confirmar");
		ConfirmarB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		ConfirmarB.setBounds(482, 376, 85, 21);
		contentPane.add(ConfirmarB);
		
		JButton AtrasB = new JButton("Atras");
		AtrasB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MenuInicioSesion MenuInicioSesion = new MenuInicioSesion();
				MenuInicioSesion.setVisible(true);
				dispose();
			}
		});
		AtrasB.setBounds(327, 376, 85, 21);
		contentPane.add(AtrasB);
	}

}
