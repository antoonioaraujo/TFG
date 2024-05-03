package TFG;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.border.EmptyBorder;



import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.*;
import java.awt.*;
import java.sql.ResultSet;

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

		ContraseñaF = new JPasswordField();
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

		JButton ContinuarB = new JButton("Continuar");
		ContinuarB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				
				try {
					// Conexion
					ConexionMySQL conexion = new ConexionMySQL("freedb_Persian", "H!!$t822$tVdcEt", "freedb_Persian");
					conexion.conectar();
					System.out.println("Conectado");
					
					String consulta = "SELECT * FROM registro WHERE Usuario='" + UsuarioF.getText()
							+ "' AND contrasena='" + ContraseñaF.getText() + "'";
				
					ResultSet resultSet=conexion.ejecutarSelect(consulta);
					System.out.println("Despues de igualar ResultSet");
					if (resultSet.next()) {
System.out.println("Usuario atenticado");
                        // Usuario autenticado correctamente
						
							Usuario.setIdRegistro(resultSet.getInt("idregistro"));
							Usuario.setNombre(resultSet.getString("usuario"));
							Usuario.setContraseña(resultSet.getString("contrasena"));
							Usuario.setCorreo(resultSet.getString("correo"));
							
							// Vaciar campos
							UsuarioF.setText("");
							ContraseñaF.setText("");

							// Abrir la ventana principal
							Peliculas Peliculas = new Peliculas();
							Peliculas.setVisible(true);
							dispose();                       
							} else {
							// Usuario no encontrado en la base de datos
							
							JOptionPane.showMessageDialog(null, "Nombre de usuario o contraseña incorrectos.");
							}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					JOptionPane.showMessageDialog(null, "Error al conectarse a la base de datos");
					e1.printStackTrace();
				}


			} //Cierre action event
		});
		ContinuarB.setBounds(482, 370, 100, 27);
		contentPane.add(ContinuarB);

	}
}
