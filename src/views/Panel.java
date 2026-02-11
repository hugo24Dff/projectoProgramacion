package views;

import java.awt.Color;
import java.awt.Font;
import java.awt.Label;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

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
		bienvenida.setBounds(10,60,500,100);
		add(bienvenida);
		//se crea el boton
		
		JButton boton = new JButton("Mi boton");
		boton.setBackground(Color.cyan);
		boton.setBounds(10,10,250,40);
		add(boton);
		
	}
	
}