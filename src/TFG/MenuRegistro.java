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
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Toolkit;

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
		setIconImage(Toolkit.getDefaultToolkit().getImage(MenuRegistro.class.getResource("/Imagenes/Logo.jpg")));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setSize(950, 600);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel RegistrateT = new JLabel("Registrate");
		RegistrateT.setFont(new Font("Tahoma", Font.PLAIN, 27));
		RegistrateT.setBounds(408, 87, 134, 35);
		contentPane.add(RegistrateT);
		
		JLabel UsuarioT = new JLabel("Usuario");
		UsuarioT.setBounds(350, 170, 45, 13);
		contentPane.add(UsuarioT);
		
		UsuarioF = new JTextField();
		UsuarioF.setBounds(460, 170, 96, 19);
		contentPane.add(UsuarioF);
		UsuarioF.setColumns(10);
		
		JLabel CorreoT = new JLabel("Correo");
		CorreoT.setBounds(350, 220, 45, 13);
		contentPane.add(CorreoT);
		
		CorreoF = new JTextField();
		CorreoF.setBounds(460, 220, 96, 19);
		contentPane.add(CorreoF);
		CorreoF.setColumns(10);
		
		JLabel ContraseñaT = new JLabel("Contraseña");
		ContraseñaT.setBounds(350, 270, 69, 13);
		contentPane.add(ContraseñaT);
		
		ContraseñaF = new JTextField();
		ContraseñaF.setBounds(460, 270, 96, 19);
		contentPane.add(ContraseñaF);
		ContraseñaF.setColumns(10);
		
		JButton ConfirmarB = new JButton("Confirmar");
		ConfirmarB.setIcon(null);
		ConfirmarB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		ConfirmarB.setBounds(482, 370, 100, 27);
		contentPane.add(ConfirmarB);
		
		JButton AtrasB = new JButton("Atras");
		AtrasB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MenuInicioSesion MenuInicioSesion = new MenuInicioSesion();
				MenuInicioSesion.setVisible(true);
				dispose();
			}
		});
		AtrasB.setBounds(327, 370, 100, 27);
		contentPane.add(AtrasB);
	}

}
