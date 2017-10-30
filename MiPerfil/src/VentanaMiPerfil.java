import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;

//Declaramos nuestras cajas para rellenar
public class VentanaMiPerfil extends JFrame {
	private JTextField cajaNombre;
	private JTextField cajaApellidos;
	private JTextField cajaEdad;
	private JTextField cajaEmail;

	//Lanzar la app
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaMiPerfil frame = new VentanaMiPerfil();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	//Creamos strings y ventana
	public VentanaMiPerfil() {
		setTitle("PERFIL");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		//Creamos las etiquetas para los textfied
		JLabel EtiquetaNombre = new JLabel("NOMBRE");
		EtiquetaNombre.setFont(new Font("Lucida Console", Font.BOLD, 10));
		//Rellenamos la textfield nombre
		cajaNombre = new JTextField();
		cajaNombre.setHorizontalAlignment(SwingConstants.CENTER);
		cajaNombre.setText("FRANCISCO JOS\u00C9");
		cajaNombre.setColumns(15);
		
		//Etiqueta apellido
		JLabel EtiquetaApellidos = new JLabel("APELLIDOS");
		EtiquetaApellidos.setFont(new Font("Lucida Console", Font.BOLD, 10));
		//Relleno de apellidos
		cajaApellidos = new JTextField();
		cajaApellidos.setHorizontalAlignment(SwingConstants.CENTER);
		cajaApellidos.setText("ESCRIBANO ZACAR\u00C9S");
		cajaApellidos.setColumns(10);
		
		//Etiqueta edad
		JLabel EtiquetaEdad = new JLabel("EDAD");
		EtiquetaEdad.setFont(new Font("Lucida Console", Font.BOLD, 10));
		//Relleno textfield edad
		cajaEdad = new JTextField();
		cajaEdad.setHorizontalAlignment(SwingConstants.CENTER);
		cajaEdad.setText("33");
		cajaEdad.setColumns(10);
		
		//Etiqueta Mail
		JLabel EtiquetaMail = new JLabel("CORREO ELECTR\u00D3NICO");
		EtiquetaMail.setFont(new Font("Lucida Console", Font.BOLD, 10));
		//Relleno textfield mail
		cajaEmail = new JTextField();
		cajaEmail.setHorizontalAlignment(SwingConstants.CENTER);
		cajaEmail.setText("FRANESZA@GMAIL.COM");
		cajaEmail.setColumns(10);
		
		//Creación de la caja mostrada final.
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(22)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(EtiquetaEdad)
						.addComponent(EtiquetaApellidos)
						.addComponent(EtiquetaNombre, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
						.addComponent(cajaEmail, GroupLayout.PREFERRED_SIZE, 271, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addComponent(cajaNombre, Alignment.LEADING, 0, 0, Short.MAX_VALUE)
								.addComponent(EtiquetaMail, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(cajaApellidos, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE))
							.addGap(123))
						.addComponent(cajaEdad, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE))
					.addGap(141))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(23)
					.addComponent(EtiquetaNombre)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(cajaNombre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(EtiquetaApellidos)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(cajaApellidos, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(EtiquetaEdad)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(cajaEdad, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(EtiquetaMail)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(cajaEmail, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(41, Short.MAX_VALUE))
		);
		getContentPane().setLayout(groupLayout);
	}
}
