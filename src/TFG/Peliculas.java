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
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setBounds(754, 14, 152, 64);
		contentPane.add(lblNewLabel_4);
        // Creamos un JPanel que representará el contenido principal
        JPanel mainContentPanel = new JPanel();
        mainContentPanel.setLayout(new GridLayout(3, 3, 15, 15));
        mainContentPanel.setBounds(50, 50, 800, 400);// Establecemos un tamaño preferido para el JPanel

        // Creamos un JScrollPane y le agregamos el JPanel principal como contenido
        JScrollPane scrollPane = new JScrollPane(mainContentPanel);
        
        JButton btnNewButton = new JButton("New button");
        btnNewButton.setBounds(25, 180, 251, 252);
        mainContentPanel.add(btnNewButton);
        
        JButton btnNewButton_1 = new JButton("New button");
        btnNewButton_1.setBounds(325, 180, 251, 252);
        mainContentPanel.add(btnNewButton_1);
        
        JButton btnNewButton_2 = new JButton("New button");
        btnNewButton_2.setBounds(625, 180, 251, 252);
        mainContentPanel.add(btnNewButton_2);
        
        JComboBox comboBox = new JComboBox();
        comboBox.setBounds(25, 36, 133, 20);
        contentPane.add(comboBox);
        
        JLabel lblNewLabel_3 = new JLabel("Filtros");
        lblNewLabel_3.setBounds(60, 11, 57, 20);
        contentPane.add(lblNewLabel_3);
        lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
        
        JButton btnNewButton_3 = new JButton("New button");
        btnNewButton_3.setBounds(25, 480, 251, 252);
        mainContentPanel.add(btnNewButton_3);
        
        JButton btnNewButton_4 = new JButton("New button");
        btnNewButton_4.setBounds(325, 480, 251, 252);
        mainContentPanel.add(btnNewButton_4);
        
        JButton btnNewButton_5 = new JButton("New button");
        btnNewButton_5.setBounds(625, 480, 251, 252);
        mainContentPanel.add(btnNewButton_5);
        
        JButton btnNewButton_6 = new JButton("New button");
        btnNewButton_6.setBounds(25, 780, 251, 252);
        mainContentPanel.add(btnNewButton_6);
        
        JButton btnNewButton_7 = new JButton("New button");
        btnNewButton_7.setBounds(325, 780, 251, 252);
        mainContentPanel.add(btnNewButton_7);
        
        JButton btnNewButton_8 = new JButton("New button");
        btnNewButton_8.setBounds(625, 780, 251, 252);
        mainContentPanel.add(btnNewButton_8);
        
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setBounds(0, 5, 950, 600); // Establecemos el tamaño y posición del JScrollPane

        // Agregamos el JScrollPane al contentPane sin reemplazar componentes existentes
        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(scrollPane, BorderLayout.CENTER);
        getContentPane().revalidate();
        mainContentPanel.setPreferredSize(new Dimension(950, 1100));
        contentPane.add(scrollPane);
	}
}
