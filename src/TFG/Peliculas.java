package TFG;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class Peliculas extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;

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

        JLabel IconoL = new JLabel("Logo");
        IconoL.setIcon(new ImageIcon(Peliculas.class.getResource("/Imagenes/LogoPequeño.jpg")));
        IconoL.setBounds(810, 10, 83, 90);
        contentPane.add(IconoL);

        JPanel mainContentPanel = new JPanel();
        mainContentPanel.setLayout(new GridLayout(3, 3, 0, 50));
        
        JScrollPane scrollPane = new JScrollPane(mainContentPanel);
        scrollPane.setLocation(5, 4);
        scrollPane.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        ActionListener actionListener = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JButton clickedButton = (JButton) e.getSource();
               
                IconosPeliculas Iconos = new IconosPeliculas();
                String buttonText = clickedButton.getText();
               
                switch (buttonText) {
                case "1":
                    Iconos.setIconoPelicula("/Imagenes/SpiderMan3.jpeg");
                    Iconos.setNumeroPelicula(1);
                    break;
                case "2":
                    Iconos.setIconoPelicula("/Imagenes/AtrapameSiPuedes.jpeg");
                    Iconos.setNumeroPelicula(2);
                    break;
                case "3":
                    Iconos.setIconoPelicula("/Imagenes/BeauTieneMiedojpeg.jpeg");
                    Iconos.setNumeroPelicula(3);
                    break;
                case "4":
                    Iconos.setIconoPelicula("/Imagenes/CadenaPerpetua.jpeg");
                    Iconos.setNumeroPelicula(4);
                    break;
                case "5":
                    Iconos.setIconoPelicula("/Imagenes/ElCisneNegro.jpeg");
                    Iconos.setNumeroPelicula(5);
                    break;
                case "6":
                    Iconos.setIconoPelicula("/Imagenes/LosOdiosos8.jpeg");
                    Iconos.setNumeroPelicula(6);
                    break;
                case "7":
                    Iconos.setIconoPelicula("/Imagenes/Venom.jpeg");
                    Iconos.setNumeroPelicula(7);
                    break;
                case "8":
                    Iconos.setIconoPelicula("/Imagenes/Origen.jpeg");
                    Iconos.setNumeroPelicula(8);
                    break;
                case "9":
                    Iconos.setIconoPelicula("/Imagenes/Sharknado6.jpeg");
                    Iconos.setNumeroPelicula(9);
                    break;
                default:
                  
                    break;
            }

                EstadoPeliculas Estados = new EstadoPeliculas(Iconos);
                Estados.setVisible(true);
               
             
               
            }
        };

        
        JButton Spiderman3B = new JButton("1");
        ImageIcon icon = new ImageIcon("src/Imagenes/SpiderMan3.jpeg");
        Image image = icon.getImage().getScaledInstance(333, 433, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(image);
        Spiderman3B.setIcon(scaledIcon);
        Spiderman3B.addActionListener(actionListener);
        mainContentPanel.add(Spiderman3B);
        
        
        JButton AtrapameSiPuedesB = new JButton("2");
        ImageIcon icon1 = new ImageIcon("src/Imagenes/AtrapameSiPuedes.jpeg");
        Image image1 = icon1.getImage().getScaledInstance(333, 433, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon1 = new ImageIcon(image1);
        AtrapameSiPuedesB.setIcon(scaledIcon1);
        AtrapameSiPuedesB.addActionListener(actionListener);
        mainContentPanel.add(AtrapameSiPuedesB);
        
        JButton BeauTieneMiedoB = new JButton("3");
        ImageIcon icon2 = new ImageIcon("src/Imagenes/BeauTieneMiedojpeg.jpeg");
        Image image2 = icon2.getImage().getScaledInstance(333, 433, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon2 = new ImageIcon(image2);
        BeauTieneMiedoB.setIcon(scaledIcon2);
        BeauTieneMiedoB.addActionListener(actionListener);
        mainContentPanel.add(BeauTieneMiedoB);
        
        JLabel GeneroL = new JLabel("Genero");
        GeneroL.setBounds(20, 10, 57, 20);
        contentPane.add(GeneroL);
        GeneroL.setHorizontalAlignment(SwingConstants.CENTER);
        
        JLabel FechaL = new JLabel("Fecha de publicacion");
        FechaL.setBounds(190, 10, 150, 20);
        contentPane.add(FechaL);
        FechaL.setHorizontalAlignment(SwingConstants.CENTER);
        
        
      
        
        
        JButton CadenaPerpetuaB = new JButton("4");
        ImageIcon icon3 = new ImageIcon("src/Imagenes/CadenaPerpetua.jpeg");
        Image image3 = icon3.getImage().getScaledInstance(333, 433, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon3 = new ImageIcon(image3);
        CadenaPerpetuaB.setIcon(scaledIcon3);
        CadenaPerpetuaB.addActionListener(actionListener);
        mainContentPanel.add(CadenaPerpetuaB);
        
        JButton ElCisneNegroB = new JButton("5");
        ImageIcon icon4 = new ImageIcon("src/Imagenes/ElCisneNegro.jpeg");
        Image image4 = icon4.getImage().getScaledInstance(333, 433, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon4 = new ImageIcon(image4);
        ElCisneNegroB.setIcon(scaledIcon4);
        ElCisneNegroB.addActionListener(actionListener);
        mainContentPanel.add(ElCisneNegroB);
        
        JButton LosOdiosos8B = new JButton("6");
        ImageIcon icon5 = new ImageIcon("src/Imagenes/LosOdiosos8.jpeg");
        Image image5 = icon5.getImage().getScaledInstance(333, 433, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon5 = new ImageIcon(image5);
        LosOdiosos8B.setIcon(scaledIcon5);
        LosOdiosos8B.addActionListener(actionListener);
        mainContentPanel.add(LosOdiosos8B);
        
        JButton VenomB = new JButton("7");
        ImageIcon icon6 = new ImageIcon("src/Imagenes/Venom.jpeg");
        Image image6 = icon6.getImage().getScaledInstance(333, 433, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon6 = new ImageIcon(image6);
        VenomB.setIcon(scaledIcon6);
        VenomB.addActionListener(actionListener);
        mainContentPanel.add(VenomB);
        
        JButton OrigenB = new JButton("8");
        ImageIcon icon7 = new ImageIcon("src/Imagenes/Origen.jpeg");
        Image image7 = icon7.getImage().getScaledInstance(333, 433, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon7 = new ImageIcon(image7);
        OrigenB.setIcon(scaledIcon7);
        OrigenB.addActionListener(actionListener);
        mainContentPanel.add(OrigenB);
        
        JButton Sharknado6B = new JButton("9");
        ImageIcon icon8 = new ImageIcon("src/Imagenes/Sharknado6.jpeg");
        Image image8 = icon8.getImage().getScaledInstance(333, 433, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon8 = new ImageIcon(image8);
        Sharknado6B.setIcon(scaledIcon8);
        Sharknado6B.addActionListener(actionListener);
        mainContentPanel.add(Sharknado6B);
        
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
        		AtrapameSiPuedesB.setEnabled(true);
        		CadenaPerpetuaB.setEnabled(true);
        		BeauTieneMiedoB.setEnabled(true);
        		LosOdiosos8B.setEnabled(true);
        		ElCisneNegroB.setEnabled(true);
        		OrigenB.setEnabled(true);
        		Spiderman3B.setEnabled(true);
        		VenomB.setEnabled(true);
        		Sharknado6B.setEnabled(true);

        	}
        });
        QuitarFiltrosB.setBounds(600,60, 110, 25);
        contentPane.add(QuitarFiltrosB);
        QuitarFiltrosB.setHorizontalAlignment(SwingConstants.CENTER);
        
        JButton AplicarFiltrosB = new JButton("AplicarFiltros");
        AplicarFiltrosB.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		if(AccionRB.isSelected()) {
        			AtrapameSiPuedesB.setEnabled(false);
        			CadenaPerpetuaB.setEnabled(false);
        			BeauTieneMiedoB.setEnabled(false);
        			LosOdiosos8B.setEnabled(false);
        			ElCisneNegroB.setEnabled(false);
        			OrigenB.setEnabled(false);
        			
        			Sharknado6B.setEnabled(false);
        			
        		
        		} else if(DramaRB.isSelected()) {
        			Spiderman3B.setEnabled(false);
        			VenomB.setEnabled(false);
        			
        			Sharknado6B.setEnabled(false);
        			
        		} else if(ComediaRB.isSelected()) {
        			AtrapameSiPuedesB.setEnabled(false);
        			CadenaPerpetuaB.setEnabled(false);
        			BeauTieneMiedoB.setEnabled(false);
        			LosOdiosos8B.setEnabled(false);
        			ElCisneNegroB.setEnabled(false);
        			OrigenB.setEnabled(false);
        			
        			Spiderman3B.setEnabled(false);
        			VenomB.setEnabled(false);
        			
        			
        		}
        		
        		if (FechaAlta.isSelected()) {
        			Spiderman3B.setEnabled(false);
        			AtrapameSiPuedesB.setEnabled(false);
        			CadenaPerpetuaB.setEnabled(false);
        			
        		} else if(FechaBaja.isSelected()) {
        			VenomB.setEnabled(false);
        			BeauTieneMiedoB.setEnabled(false);
        			LosOdiosos8B.setEnabled(false);
        			ElCisneNegroB.setEnabled(false);
        			OrigenB.setEnabled(false);
        			Sharknado6B.setEnabled(false);
        		}
      
        	}
        });
        AplicarFiltrosB.setBounds(600,20, 110, 25);
        contentPane.add(AplicarFiltrosB);
        AplicarFiltrosB.setHorizontalAlignment(SwingConstants.CENTER);
        
        
        
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

        // Agregamos el JScrollPane al contentPane sin reemplazar componentes existentes
        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(scrollPane, BorderLayout.CENTER);
        getContentPane().revalidate();
        mainContentPanel.setPreferredSize(new Dimension(850, 1400));
        contentPane.add(scrollPane);
        

		
	}
}