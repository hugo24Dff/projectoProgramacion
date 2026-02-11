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
		setBackground(new Color(250, 128, 114));
		
		//se crea la etiqueta de bienvenida
		
		JLabel bienvenida = new JLabel("Bienvenido");
		bienvenida.setFont(new Font("Arial",Font.PLAIN,30));
		bienvenida.setBounds(160,0,250,100);
		add(bienvenida);
		
		//lbl de ingresar correo
		JLabel correo = new JLabel("Ingresa tu correo");
		correo.setFont(new Font("Arial",Font.PLAIN,20));
		correo.setBounds(160,175,200,50);
		add(correo);
		
		//txt ingresar correo
		JTextField txtCorreo = new JTextField();
		txtCorreo.setFont(new Font("Arial",Font.PLAIN,10) );	
		txtCorreo.setBounds(160,210,200 ,25);
		add(txtCorreo);
		
		
		//label de inicio de sesion incorrecto
		JLabel lblError = new JLabel("Contraseña o correo incorrecto");
		lblError.setFont(new Font("Arial",Font.PLAIN,12) );	
		lblError.setBounds(160,290,170 ,50);	
		lblError.setForeground(Color.red);
		add(lblError);
		
		//lbl de ingresar correo
		JLabel lblErrorCorreo = new JLabel("!");
		lblErrorCorreo.setFont(new Font("Arial",Font.PLAIN,20) );	
		lblErrorCorreo.setBounds(150,195,50 ,50);	
		lblErrorCorreo.setForeground(Color.red);
		add(lblErrorCorreo);
		
		//lbl de ingresar contraseña
		JLabel lblErrorPass = new JLabel("!");
		lblErrorPass.setFont(new Font("Arial",Font.PLAIN,20) );	
		lblErrorPass.setBounds(150,240,50 ,50);	
		lblErrorPass.setForeground(Color.red);
		add(lblErrorPass);
		
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