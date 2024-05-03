package TFG;
import java.awt.event.ActionEvent;

import java.awt.*;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.*;
import javax.swing.border.EmptyBorder;


public class Peliculas extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Peliculas frame = new Peliculas();
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
    public Peliculas() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Peliculas.class.getResource("/Imagenes/Logo.jpg")));
		setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(950, 600);
        setLocationRelativeTo(null);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(100, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
		
		JLabel IconoL = new JLabel("New label");
		IconoL.setBounds(754, 14, 152, 64);
		contentPane.add(IconoL);
		
		
		
        // Creamos un JPanel que representará el contenido principal
        JPanel mainContentPanel = new JPanel();
        mainContentPanel.setLayout(new GridLayout(3, 3, 0, 50));
        
        // Creamos un JScrollPane y le agregamos el JPanel principal como contenido
        JScrollPane scrollPane = new JScrollPane(mainContentPanel);
        scrollPane.setLocation(5, 4);
        scrollPane.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));



         // Creamos un ActionListener para los botones de las películas
        ActionListener actionListener = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	JButton clickedButton = (JButton) e.getSource(); // Obtiene el botón que fue presionado

                // Obtener la ruta de la imagen correspondiente al botón presionado
                String imagePath = null;
                if (clickedButton.getText().equals("1")) {
                    imagePath = "src/Imagenes/SpiderMan3.jpeg";
                } 
                else if (clickedButton.getText().equals("2")) 
                {
                    imagePath = "src/Imagenes/AtrapameSiPuedes.jpeg";
                }
                else if (clickedButton.getText().equals("3")) 
                {
                    imagePath = "src/Imagenes/BeauTieneMiedojpeg.jpeg";
                }
                else if (clickedButton.getText().equals("4")) 
                {
                    imagePath = "src/Imagenes/CadenaPerpetua.jpeg";
                }
                else if (clickedButton.getText().equals("5")) 
                {
                    imagePath = "src/Imagenes/ElCisneNegro.jpeg";
                }
                else if (clickedButton.getText().equals("6")) 
                {
                    imagePath = "src/Imagenes/LosOdiosos8.jpeg";
                }
                else if (clickedButton.getText().equals("7")) 
                {
                    imagePath = "src/Imagenes/Venom.jpeg";
                }
                else if (clickedButton.getText().equals("8")) 
                {
                    imagePath = "src/Imagenes/Origen.jpeg";
                }
                else if (clickedButton.getText().equals("9")) 
                {
                    imagePath = "src/Imagenes/Sharknado6.jpeg";
                }
                
                //Creamos la ventana emergente
                JFrame movieDetailsFrame = new JFrame("Detalles de la Película");
                movieDetailsFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                movieDetailsFrame.setSize(600, 350);
                movieDetailsFrame.setLocationRelativeTo(null);

                // Panel principal con BorderLayout
                JPanel mainPanel = new JPanel(new BorderLayout());
                movieDetailsFrame.setContentPane(mainPanel);

                // Panel para la imagen (izquierda)
                JPanel imagePanel = new JPanel();
                mainPanel.add(imagePanel, BorderLayout.WEST);

                // Añadir la imagen a la izquierda
                JLabel movieImageLabel = new JLabel();
                ImageIcon movieIcon = new ImageIcon(imagePath); 
                movieImageLabel.setIcon(movieIcon);
                imagePanel.add(movieImageLabel);

                // Panel para los detalles (centro)
                JPanel detailsPanel = new JPanel(new GridLayout(0, 1));
                mainPanel.add(detailsPanel, BorderLayout.CENTER);

                // Creamos un JLabel para mostrar el estado de la película
                JLabel movieStatusLabel = new JLabel("Estado: Disponible");
                detailsPanel.add(movieStatusLabel);

                // Creamos un JLabel para mostrar la categoría de la película
                JLabel movieCategoryLabel = new JLabel("Categoría: Acción"); 
                detailsPanel.add(movieCategoryLabel);

                // Panel para el botón de reserva
                JPanel reservePanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
                mainPanel.add(reservePanel, BorderLayout.SOUTH);

                // Creamos un JButton para reservar la película
                JButton reserveButton = new JButton("Reservar");
                reserveButton.setEnabled(true); 
                reservePanel.add(reserveButton);
                movieDetailsFrame.setVisible(true);

                reserveButton.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        // funcion para obtener el nombre de la pelicula que estamos reservando

        String nombrePelicula = clickedButton.getText();

		// Construyes la consulta SQL de actualización
        String consulta = "UPDATE peliculas SET estado='reservado' WHERE idpeliculas='" + nombrePelicula + "'"; //AND usuario='" + nombreUsuario + "'";

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
        reserveButton.setEnabled(false);
    }
});
             // Creas un JButton para la devolución de la película
                JButton devolucionButton = new JButton("Devolver");
                devolucionButton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        // función para obtener el nombre de la película que estamos devolviendo
                        String nombrePelicula = clickedButton.getText(); // Si ya tienes una forma de obtener el nombre de la película, úsala aquí

                        // Construyes la consulta SQL de actualización
                        String consulta = "UPDATE peliculas SET estado='disponible' WHERE idpeliculas='" + nombrePelicula + "'"; // Ajusta la consulta según la estructura de tu base de datos

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
                        devolucionButton.setEnabled(false);
                    }
                });
                reservePanel.add(devolucionButton);

            }
        };

        
        JButton btnNewButton = new JButton("1");
        ImageIcon icon = new ImageIcon("src/Imagenes/SpiderMan3.jpeg");
        Image image = icon.getImage().getScaledInstance(333, 433, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(image);
        btnNewButton.setIcon(scaledIcon);
        btnNewButton.addActionListener(actionListener);
        mainContentPanel.add(btnNewButton);
        
        
        JButton btnNewButton_1 = new JButton("2");
        ImageIcon icon1 = new ImageIcon("src/Imagenes/AtrapameSiPuedes.jpeg");
        Image image1 = icon1.getImage().getScaledInstance(333, 433, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon1 = new ImageIcon(image1);
        btnNewButton_1.setIcon(scaledIcon1);
        btnNewButton_1.addActionListener(actionListener);
        mainContentPanel.add(btnNewButton_1);
        
        JButton btnNewButton_2 = new JButton("3");
        ImageIcon icon2 = new ImageIcon("src/Imagenes/BeauTieneMiedojpeg.jpeg");
        Image image2 = icon2.getImage().getScaledInstance(333, 433, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon2 = new ImageIcon(image2);
        btnNewButton_2.setIcon(scaledIcon2);
        btnNewButton_2.addActionListener(actionListener);
        mainContentPanel.add(btnNewButton_2);
        
        JLabel GeneroL = new JLabel("Genero");
        GeneroL.setBounds(20, 10, 57, 20);
        contentPane.add(GeneroL);
        GeneroL.setHorizontalAlignment(SwingConstants.CENTER);
        
        JLabel FechaL = new JLabel("Fecha de publicacion");
        FechaL.setBounds(190, 10, 150, 20);
        contentPane.add(FechaL);
        FechaL.setHorizontalAlignment(SwingConstants.CENTER);
        
        
      
        
        
        JButton btnNewButton_3 = new JButton("4");
        ImageIcon icon3 = new ImageIcon("src/Imagenes/CadenaPerpetua.jpeg");
        Image image3 = icon3.getImage().getScaledInstance(333, 433, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon3 = new ImageIcon(image3);
        btnNewButton_3.setIcon(scaledIcon3);
        btnNewButton_3.addActionListener(actionListener);
        mainContentPanel.add(btnNewButton_3);
        
        JButton btnNewButton_4 = new JButton("5");
        ImageIcon icon4 = new ImageIcon("src/Imagenes/ElCisneNegro.jpeg");
        Image image4 = icon4.getImage().getScaledInstance(333, 433, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon4 = new ImageIcon(image4);
        btnNewButton_4.setIcon(scaledIcon4);
        btnNewButton_4.addActionListener(actionListener);
        mainContentPanel.add(btnNewButton_4);
        
        JButton btnNewButton_5 = new JButton("6");
        ImageIcon icon5 = new ImageIcon("src/Imagenes/LosOdiosos8.jpeg");
        Image image5 = icon5.getImage().getScaledInstance(333, 433, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon5 = new ImageIcon(image5);
        btnNewButton_5.setIcon(scaledIcon5);
        btnNewButton_5.addActionListener(actionListener);
        mainContentPanel.add(btnNewButton_5);
        
        JButton btnNewButton_6 = new JButton("7");
        ImageIcon icon6 = new ImageIcon("src/Imagenes/Venom.jpeg");
        Image image6 = icon6.getImage().getScaledInstance(333, 433, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon6 = new ImageIcon(image6);
        btnNewButton_6.setIcon(scaledIcon6);
        btnNewButton_6.addActionListener(actionListener);
        mainContentPanel.add(btnNewButton_6);
        
        JButton btnNewButton_7 = new JButton("8");
        ImageIcon icon7 = new ImageIcon("src/Imagenes/Origen.jpeg");
        Image image7 = icon7.getImage().getScaledInstance(333, 433, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon7 = new ImageIcon(image7);
        btnNewButton_7.setIcon(scaledIcon7);
        btnNewButton_7.addActionListener(actionListener);
        mainContentPanel.add(btnNewButton_7);
        
        JButton btnNewButton_8 = new JButton("9");
        ImageIcon icon8 = new ImageIcon("src/Imagenes/Sharknado6.jpeg");
        Image image8 = icon8.getImage().getScaledInstance(333, 433, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon8 = new ImageIcon(image8);
        btnNewButton_8.setIcon(scaledIcon8);
        btnNewButton_8.addActionListener(actionListener);
        mainContentPanel.add(btnNewButton_8);
        
        JRadioButton AccionRB = new JRadioButton("Accion");
        AccionRB.setBounds(25, 30, 80, 20);
        contentPane.add(AccionRB);
        AccionRB.setHorizontalAlignment(SwingConstants.CENTER);
        
        JRadioButton DramaRB = new JRadioButton("Drama");
        DramaRB.setBounds(24, 50, 80, 20);
        contentPane.add(DramaRB);
        DramaRB.setHorizontalAlignment(SwingConstants.CENTER);
        
        JRadioButton ComediaRB = new JRadioButton("Comedia");
        ComediaRB.setBounds(29, 70, 80, 20);
        contentPane.add(ComediaRB);
        ComediaRB.setHorizontalAlignment(SwingConstants.CENTER);
        
        ButtonGroup Genero = new ButtonGroup();
        Genero.add(ComediaRB);
        Genero.add(AccionRB);
        Genero.add(DramaRB);
        
        JRadioButton FechaAlta = new JRadioButton("Por encima del 2010");
        FechaAlta.setBounds(199, 30, 150, 20);
        contentPane.add(FechaAlta);
        FechaAlta.setHorizontalAlignment(SwingConstants.CENTER);
        
        JRadioButton FechaBaja = new JRadioButton("Por debajo del 2010");
        FechaBaja.setBounds(200, 50, 150, 20);
        contentPane.add(FechaBaja);
        FechaBaja.setHorizontalAlignment(SwingConstants.CENTER);
        
        ButtonGroup Fecha = new ButtonGroup();
        Fecha.add(FechaBaja);
        Fecha.add(FechaAlta);
        JButton QuitarFiltrosB = new JButton("QuitarFiltros");
        QuitarFiltrosB.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		Genero.clearSelection();
        		Fecha.clearSelection();
        	}
        });
        QuitarFiltrosB.setBounds(600,30, 110, 25);
        contentPane.add(QuitarFiltrosB);
        QuitarFiltrosB.setHorizontalAlignment(SwingConstants.CENTER);
        
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

        // Agregamos el JScrollPane al contentPane sin reemplazar componentes existentes
        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(scrollPane, BorderLayout.CENTER);
        getContentPane().revalidate();
        mainContentPanel.setPreferredSize(new Dimension(850, 1400));
        contentPane.add(scrollPane);
        

		
	}
}