import java.awt.EventQueue;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BailandoLetras extends JFrame {

	/**
	 * DECLARAMOS LAS VARIABLES PARA PODER COGER EL TEXTO DE LOS DOS TEXTFIELD QUE TENEMOS
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textoderecha;
	private JTextField textoizquierda;

	/**
	 * PRINCIPAL DEL PROGRAMA PARA EJECUTAR LA APLICACION POR PANTALLA.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BailandoLetras frame = new BailandoLetras();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * CREAMOS VENTANA CON DOS BOTONES Y DOS ENTRADAS DE TEXTO
	 */
	public BailandoLetras() {
		setTitle("\u00BFQUIERES QUE BAILEMOS?");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//Ya tenemos creados los dos campos para la introduccion de texto.
		textoizquierda = new JTextField();
		textoizquierda.setBounds(10, 116, 150, 30);
		contentPane.add(textoizquierda);
		textoizquierda.setColumns(10);
		
		textoderecha = new JTextField();
		textoderecha.setBounds(274, 116, 150, 30);
		contentPane.add(textoderecha);
		textoderecha.setColumns(10);
		
	    /**************************************
	     * Funcionamiento boton para pasar texto de izquierda a derecha
	     */
		JButton btnbailamos = new JButton("BAILAMOS --------->");
		btnbailamos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				//Seleccionamos el texto introducido en el textfield izquierdo y lo copiamos en el derecho.
				textoderecha.setText(textoizquierda.getText());
				
				//Comprobamos si el usuario ha metido el texto en su derecha y lanzamos aviso.
				String vacio = new String(textoizquierda.getText());
				if(vacio.length() == 0) {
					JOptionPane.showMessageDialog(null, "OJO! No se puede bailar sin texto");
					}
				
				//Vaciamos texto de la izquierda.
				textoizquierda.setText("");
				
			}
		});
		btnbailamos.setBounds(123, 187, 200, 50);
		contentPane.add(btnbailamos);
		 /**************************************
	     * Funcionamiento boton para pasar texto de derecha a izquierda
	     */
		JButton btnNewButton = new JButton("<--------- BAILAMOS");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//Ahora al contrario seleccionamos texto de derechas para "bailarlo" hacia la izquierda
				textoizquierda.setText(textoderecha.getText());
				
				//Comprobamos si el usuario ha metido el texto en su izquierda y lanzamos aviso.
				String vacio2 = new String(textoderecha.getText());
				if(vacio2.length() == 0) {
					JOptionPane.showMessageDialog(null, "OJO! No se puede bailar sin texto");
					}
				//Vaciamos texto de la derecha
				textoderecha.setText("");
			}
		});
		btnNewButton.setBounds(123, 32, 200, 50);
		contentPane.add(btnNewButton);
	}
}
