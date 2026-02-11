package views;

import java.awt.Color;
import java.awt.Font;
import java.awt.Label;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;



public class Panel extends JPanel{
	
	public Panel() {
		setLayout(null);
		//Esta opción utiliza un color predefinido
		//setBackground(Color.BLUE);
		
		//Esta opción genera un color a partir de RGB
		setBackground(new Color(210,165,35));
		
		//se crea la etiqueta de bienvenida
		
		JLabel bienvenida = new JLabel("Bienvenido");
		bienvenida.setFont(new Font("Arial",Font.PLAIN,30));
		bienvenida.setBounds(160,0,250,100);
		add(bienvenida);
		//se crea el boton
		
		JLabel correo = new JLabel("Ingresa tu correo");
		correo.setFont(new Font("Arial",Font.PLAIN,20));
		correo.setBounds(160,175,200,50);
		add(correo);
		
		JTextField txtCorreo = new JTextField();
		txtCorreo.setFont(new Font("Arial",Font.PLAIN,20) );	
		txtCorreo.setBounds(160,210,200 ,25);
		add(txtCorreo);
		
		JLabel contrasena = new JLabel("Ingresa tu Contrasena");
		contrasena.setFont(new Font("Arial",Font.PLAIN,20));
		contrasena.setBounds(160,220,200,50);
		add(contrasena);
		
		JPasswordField txtContrasena = new JPasswordField();
		txtContrasena.setFont(new Font("Arial",Font.PLAIN,20) );	
		txtContrasena.setBounds(160,255,200 ,25);
		add(txtContrasena);
		
		JButton boton = new JButton("Registrarte");
		boton.setBackground(Color.cyan);
		boton.setFont(new Font("Arial",Font.PLAIN,10) );
		boton.setBounds(160,280,100,25);
		add(boton);
		
	}
	
}