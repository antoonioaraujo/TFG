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
import javax.swing.*;
import java.awt.*;

public class MenuInicioSesion extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField UsuarioF;
	private JTextField ContraseñaF;

	/**
	 * Launch the application.
	 */


	/**
	 * Create the frame.
	 */
	public MenuInicioSesion() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(MenuInicioSesion.class.getResource("/Imagenes/Logo.jpg")));
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(950, 600);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		UsuarioF = new JTextField();
		UsuarioF.setBounds(460, 170, 96, 19);
		contentPane.add(UsuarioF);
		UsuarioF.setColumns(10);
		
		JLabel LoginT = new JLabel("Inicio de Sesion");
		LoginT.setFont(new Font("Tahoma", Font.PLAIN, 27));
		LoginT.setHorizontalAlignment(SwingConstants.CENTER);
		LoginT.setBounds(375, 87, 200, 35);
		contentPane.add(LoginT);
		
		JLabel UsuarioT = new JLabel("Usuario");
		UsuarioT.setHorizontalAlignment(SwingConstants.CENTER);
		UsuarioT.setBounds(350, 170, 45, 13);
		contentPane.add(UsuarioT);
		
		JLabel ContraseñaT = new JLabel("Contraseña");
		ContraseñaT.setHorizontalAlignment(SwingConstants.CENTER);
		ContraseñaT.setBounds(350, 220, 69, 13);
		contentPane.add(ContraseñaT);
		
		ContraseñaF = new JTextField();
		ContraseñaF.setBounds(460, 220, 96, 19);
		contentPane.add(ContraseñaF);
		ContraseñaF.setColumns(10);
		
		JLabel ResgitroT = new JLabel("¿No tienes cuenta? Registrate");
		ResgitroT.setHorizontalAlignment(SwingConstants.CENTER);
		ResgitroT.setBounds(292, 300, 182, 46);
		contentPane.add(ResgitroT);
		
		JButton RegistroB = new JButton("Registrarte");
		RegistroB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MenuRegistro MenuRegistro = new MenuRegistro();
				MenuRegistro.setVisible(true);
				dispose();
				
			}
		});
		RegistroB.setBounds(327, 370, 100, 27);
		contentPane.add(RegistroB);
		
		JButton ContiuarB = new JButton("Continuar");
		ContiuarB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		ContiuarB.setBounds(482, 370, 100, 27);
		contentPane.add(ContiuarB);
		
		

	}
}
