package TFG;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;



import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class EstadoPeliculas extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private static IconosPeliculas iconos;
	private JLabel EstadoL;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				
				try {
					IconosPeliculas iconos = new IconosPeliculas(); // Crea una instancia de IconosPeliculas
	                EstadoPeliculas frame = new EstadoPeliculas(iconos); // Pasa la instancia de IconosPeliculas al constructor de EstadoPelicula
					
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
	public EstadoPeliculas(IconosPeliculas Iconos) {
		iconos= Iconos;
		setIconImage(Toolkit.getDefaultToolkit().getImage(EstadoPeliculas.class.getResource("/Imagenes/Logo.jpg")));
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setSize(712, 450);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel LogoL = new JLabel("");
		
		EstadoL = new JLabel("Estado:");
		
		EstadoL.setBounds(389, 141, 140, 13);
		contentPane.add(EstadoL);
		
	
		LogoL.setIcon(new ImageIcon(EstadoPeliculas.class.getResource(iconos.getIconoPelicula())));
		LogoL.setBounds(46, 37, 210, 312);
		contentPane.add(LogoL);
		JButton DevolverB = new JButton("Devolver");
		JButton ReservarB = new JButton("Reservar");
			
		Integer idregistro= null;
		String EstadoPelicula = "Disponible";
		  int nombrePelicula = iconos.getNumeroPelicula();
		  String consultaidregistro = "SELECT idregistro FROM peliculas WHERE idpeliculas =" + nombrePelicula+ "";
		  String consultaestado = "SELECT estado FROM peliculas WHERE idpeliculas =" + nombrePelicula+"";
		  
		  ConexionMySQL conexion = new ConexionMySQL("freedb_Persian", "H!!$t822$tVdcEt", "freedb_Persian");
	        try {
	            // Estableces la conexión a la base de datos
	            conexion.conectar();

	            // Ejecutas la consulta de actualización
	          
	            ResultSet resultSetIdRegistro = conexion.ejecutarSelect(consultaidregistro);
	            
	            if (resultSetIdRegistro.next()) {
	                idregistro = resultSetIdRegistro.getInt("idregistro");
	              
	            } else {
	                // Si el resultado es null, asigna null a idregistro
	                idregistro = null;
	            }
	            conexion.ejecutarSelect(consultaestado);
	            ResultSet resultSetEstado = conexion.ejecutarSelect(consultaestado);
	            if (resultSetEstado.next()) {
	                EstadoPelicula = resultSetEstado.getString("estado");
	                System.out.println(EstadoPelicula);
	            } else {
	                // Maneja el caso donde no se encontró ningún estado
	                System.out.println("No se encontró ningún estado para la película.");
	            }
	            
	            
	            // Muestras un mensaje indicando que la película ha sido reservada
	          

	            // Desconectas de la base de datos
	            conexion.desconectar();
	        } catch (SQLException ex) {
	            // Manejas cualquier excepción que pueda ocurrir durante la conexión o la consulta
	            ex.printStackTrace();
	        }
	       System.out.println(idregistro);
	       System.out.println(EstadoPelicula);
		
		if (EstadoPelicula.equals("No disponible")) {
			ReservarB.setEnabled(false);
			EstadoL.setText("Estado: En propiedad");
		}
		if (idregistro == 0) {
			ReservarB.setEnabled(true);
			EstadoL.setText("Estado: Disponible")
;		}
		else if (idregistro != Usuario.getIdRegistro()) {
			ReservarB.setEnabled(false);
			DevolverB.setEnabled(false);
			EstadoL.setText("Estado: No disponible");
		}

		ReservarB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EstadoL.setText("Estado: En propiedad");
				System.out.println(iconos.getNumeroPelicula());

		        int nombrePelicula = iconos.getNumeroPelicula();

				// Construyes la consulta SQL de actualización
		        String consulta = "UPDATE peliculas SET estado='No disponible', idregistro=" + Usuario.getIdRegistro() + " WHERE idpeliculas='" + nombrePelicula + "'";


		        // Creas una instancia de ConexionMySQL para ejecutar la consulta
		        ConexionMySQL conexion = new ConexionMySQL("freedb_Persian", "H!!$t822$tVdcEt", "freedb_Persian");
		        try {
		            // Estableces la conexión a la base de datos
		            conexion.conectar();

		            // Ejecutas la consulta de actualización
		            conexion.ejecutarUpdate(consulta);
		            // Muestras un mensaje indicando que la película ha sido reservada
		            System.out.println("Película reservada con éxito");

		            // Desconectas de la base de datos
		            conexion.desconectar();
		        } catch (SQLException ex) {
		            // Manejas cualquier excepción que pueda ocurrir durante la conexión o la consulta
		            ex.printStackTrace();
		        }
		        
		        // Deshabilitas el botón de reserva después de que la película haya sido reservada
		        ReservarB.setEnabled(false);
		        DevolverB.setEnabled(true);
		        System.out.println("Esta pelicula ha sido reservada por el usuario " + Usuario.getNombre());
			}
		});
		ReservarB.setBounds(363, 264, 85, 21);
		contentPane.add(ReservarB);
		
	
		DevolverB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EstadoL.setText("Estado: Disponible");
				  // función para obtener el nombre de la película que estamos devolviendo
                int nombrePelicula = iconos.getNumeroPelicula(); // Si ya tienes una forma de obtener el nombre de la película, úsala aquí

                // Construyes la consulta SQL de actualización
                String consulta = "UPDATE peliculas SET estado='Disponible', idregistro=null WHERE idpeliculas='" + nombrePelicula + "'";
 

                // Creas una instancia de ConexionMySQL para ejecutar la consulta
                ConexionMySQL conexion = new ConexionMySQL("freedb_Persian", "H!!$t822$tVdcEt", "freedb_Persian");
                try {
                    // Estableces la conexión a la base de datos
                    conexion.conectar();

                    // Ejecutas la consulta de actualización
                    conexion.ejecutarUpdate(consulta);

                    // Muestras un mensaje indicando que la película ha sido devuelta
                    System.out.println("Película devuelta con éxito");

                    // Desconectas de la base de datos
                    conexion.desconectar();
                } catch (SQLException ex) {
                    // Manejas cualquier excepción que pueda ocurrir durante la conexión o la consulta
                    ex.printStackTrace();
                }
                
                // Deshabilitas el botón de devolución después de que la película haya sido devuelta
                DevolverB.setEnabled(false);
                ReservarB.setEnabled(true);
         
			}
		});
		DevolverB.setBounds(502, 264, 85, 21);
		contentPane.add(DevolverB);
		
	

	}
}
