package TFG;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MenuInicioSesion extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */


	/**
	 * Create the frame.
	 */
	public MenuInicioSesion() {
		setDefaultCloseOperation(JFrame.dispose());
		setBounds(100, 100, 950, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(394, 185, 96, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel LoginT = new JLabel("Inicio de Sesion");
		LoginT.setBounds(394, 57, 96, 34);
		contentPane.add(LoginT);
		
		JLabel UsuarioT = new JLabel("Usuario");
		UsuarioT.setBounds(425, 141, 45, 13);
		contentPane.add(UsuarioT);
		
		JLabel ContraseñaT = new JLabel("Contraseña");
		ContraseñaT.setHorizontalAlignment(SwingConstants.TRAILING);
		ContraseñaT.setBounds(361, 214, 109, 19);
		contentPane.add(ContraseñaT);
		
		textField_1 = new JTextField();
		textField_1.setBounds(394, 243, 96, 19);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel ResgitroT = new JLabel("¿No tienes cuenta? Registrate");
		ResgitroT.setBounds(240, 340, 109, 31);
		contentPane.add(ResgitroT);
		
		JButton RegistroB = new JButton("Registrarte");
		RegistroB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		RegistroB.setBounds(240, 381, 85, 21);
		contentPane.add(RegistroB);
		
		JButton ContiuarB = new JButton("Continuar");
		ContiuarB.setBounds(592, 381, 85, 21);
		contentPane.add(ContiuarB);
	}
}
