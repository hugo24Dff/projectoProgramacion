package views;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Label;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;



public class Login extends JPanel{
	

	public Login() {
		
		setLayout(null);
		setBackground(new Color(250, 128, 114));
		setLayout(new BorderLayout());
		
		
		
		//lbl de ingresar correo
		JLabel correo = new JLabel("Ingresa tu correo");
		correo.setFont(new Font("Arial",Font.PLAIN,20));
		
		add(correo);
		
		//txt ingresar correo
		JTextField txtCorreo = new JTextField();
		txtCorreo.setFont(new Font("Arial",Font.PLAIN,10) );	
		
		add(txtCorreo);
		
		
		//label de inicio de sesion incorrecto
		JLabel lblError = new JLabel("Contraseña o correo incorrecto");
		lblError.setFont(new Font("Arial",Font.PLAIN,12) );	
	
		lblError.setForeground(Color.red);
		add(lblError);
		
		//lbl de ingresar correo
		JLabel lblErrorCorreo = new JLabel("!");
		lblErrorCorreo.setFont(new Font("Arial",Font.PLAIN,20) );	
		
		lblErrorCorreo.setForeground(Color.red);
		add(lblErrorCorreo);
		
		//lbl de ingresar contraseña
		JLabel lblErrorPass = new JLabel("!");
		lblErrorPass.setFont(new Font("Arial",Font.PLAIN,20) );	
		
		lblErrorPass.setForeground(Color.red);
		add(lblErrorPass);
		
		JLabel contrasena = new JLabel("Ingresa tu Contrasena");
		contrasena.setFont(new Font("Arial",Font.PLAIN,20));
		
		add(contrasena);
		
		JPasswordField txtContrasena = new JPasswordField();
		txtContrasena.setFont(new Font("Arial",Font.PLAIN,20) );	
		
		add(txtContrasena);
		
		JButton boton = new JButton("Registrarte");
		boton.setBackground(Color.cyan);
		boton.setFont(new Font("Arial",Font.PLAIN,10) );
		
		add(boton);
		
		
		
		crearPanelCentro();
	}
	
	public void crearPanelCentro() {
		
		
		
		JPanel panelCentro = new JPanel(new BorderLayout());
		panelCentro.setBackground(Color.RED);
		
		//centro cent
		JPanel panelCentroCentro = new JPanel();
		panelCentroCentro.setLayout(new BoxLayout(panelCentroCentro,BoxLayout.X_AXIS));

		panelCentro.add(panelCentroCentro,BorderLayout.CENTER);
		
		
		JLabel bienvenida = new JLabel("Bienvenido");
		bienvenida.setFont(new Font("Arial",Font.PLAIN,30));
		bienvenida.setAlignmentX(Component.CENTER_ALIGNMENT);
		
		
		JLabel contrasena = new JLabel("Ingresa tu Contrasena");
		contrasena.setFont(new Font("Arial",Font.PLAIN,20));
		contrasena.setAlignmentX(Component.CENTER_ALIGNMENT);
		
		panelCentroCentro.add(bienvenida);
		panelCentroCentro.add(contrasena);
		
		add(panelCentro, BorderLayout.CENTER);
	   
		
		
		
		
		//centro sur
		JPanel panelCentroSur = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		panelCentro.add(panelCentroSur, BorderLayout.SOUTH);
		panelCentroSur.setBackground(Color.ORANGE);
		
		JButton btnInicio = new JButton("Iniciar sesión");
		panelCentroSur.add(btnInicio);
		
		JButton btnCancelar = new JButton("Cancelar");
		panelCentroSur.add(btnCancelar);
		
		add(panelCentro, BorderLayout.CENTER);
	
	}
	
	
	
	
	
	
	
}