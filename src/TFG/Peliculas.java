package TFG;

import java.awt.*;
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
		setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(950, 600);
        setLocationRelativeTo(null);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(100, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setBounds(754, 14, 152, 64);
		contentPane.add(lblNewLabel_4);
        // Creamos un JPanel que representará el contenido principal
        JPanel mainContentPanel = new JPanel();
        mainContentPanel.setLayout(new GridLayout(3, 3, 0, 50));
        
        // Creamos un JScrollPane y le agregamos el JPanel principal como contenido
        JScrollPane scrollPane = new JScrollPane(mainContentPanel);
        scrollPane.setLocation(5, 4);
        scrollPane.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        
        JButton btnNewButton = new JButton("New button");
        ImageIcon icon = new ImageIcon("C:\\Users\\Usuario\\Documents\\GitHub\\TFG\\src\\Imagenes\\SpiderMan3.jpeg");
        Image image = icon.getImage().getScaledInstance(333, 433, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(image);
        btnNewButton.setIcon(scaledIcon);
        mainContentPanel.add(btnNewButton);
        
        
        JButton btnNewButton_1 = new JButton("New button");
        ImageIcon icon1 = new ImageIcon("C:\\Users\\Usuario\\Documents\\GitHub\\TFG\\src\\Imagenes\\AtrapameSiPuedes.jpeg");
        Image image1 = icon1.getImage().getScaledInstance(333, 433, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon1 = new ImageIcon(image1);
        btnNewButton_1.setIcon(scaledIcon1);
        mainContentPanel.add(btnNewButton_1);
        
        JButton btnNewButton_2 = new JButton("New button");
        ImageIcon icon2 = new ImageIcon("C:\\Users\\Usuario\\Documents\\GitHub\\TFG\\src\\Imagenes\\BeauTieneMiedojpeg.jpeg");
        Image image2 = icon2.getImage().getScaledInstance(333, 433, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon2 = new ImageIcon(image2);
        btnNewButton_2.setIcon(scaledIcon2);
        mainContentPanel.add(btnNewButton_2);
        
        JComboBox comboBox = new JComboBox();
        comboBox.setBounds(25, 36, 133, 20);
        contentPane.add(comboBox);
        
        JLabel lblNewLabel_3 = new JLabel("Filtros");
        lblNewLabel_3.setBounds(60, 11, 57, 20);
        contentPane.add(lblNewLabel_3);
        lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
        
        JButton btnNewButton_3 = new JButton("New button");
        mainContentPanel.add(btnNewButton_3);
        
        JButton btnNewButton_4 = new JButton("New button");
        mainContentPanel.add(btnNewButton_4);
        
        JButton btnNewButton_5 = new JButton("New button");
        mainContentPanel.add(btnNewButton_5);
        
        JButton btnNewButton_6 = new JButton("New button");
        mainContentPanel.add(btnNewButton_6);
        
        JButton btnNewButton_7 = new JButton("New button");
        mainContentPanel.add(btnNewButton_7);
        
        JButton btnNewButton_8 = new JButton("New button");
        mainContentPanel.add(btnNewButton_8);
        
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

        // Agregamos el JScrollPane al contentPane sin reemplazar componentes existentes
        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(scrollPane, BorderLayout.CENTER);
        getContentPane().revalidate();
        mainContentPanel.setPreferredSize(new Dimension(850, 1400));
        contentPane.add(scrollPane);
	}
}