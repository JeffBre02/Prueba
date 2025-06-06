package com.proyectofinal.mvc.views;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Dimension;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.BoxLayout;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.SystemColor;
import javax.swing.UIManager;
import javax.swing.JButton;

public class ViewPrincipal extends JFrame {

	private JPanel contentPane;
	public JPanel panel_0;
	public JPanel pnlPrincipal;

	
	public ViewPrincipal() {
		setPreferredSize(new Dimension(1100, 700));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1100, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		panel_0 = new JPanel();
		contentPane.add(panel_0, BorderLayout.CENTER);
		panel_0.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.textHighlight);
		panel.setPreferredSize(new Dimension(10, 125));
		panel_0.add(panel, BorderLayout.NORTH);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{44, 499, 70, 0};
		gbl_panel.rowHeights = new int[]{38, 0, 26, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JLabel lblTituloGestion = new JLabel("SISTEMA DE GESTI\u00D3N DE MATR\u00CDCULAS");
		lblTituloGestion.setForeground(SystemColor.activeCaption);
		lblTituloGestion.setFont(new Font("Dialog", Font.PLAIN, 40));
		lblTituloGestion.setAlignmentX(10.0f);
		GridBagConstraints gbc_lblTituloGestion = new GridBagConstraints();
		gbc_lblTituloGestion.insets = new Insets(0, 0, 5, 5);
		gbc_lblTituloGestion.anchor = GridBagConstraints.SOUTHWEST;
		gbc_lblTituloGestion.gridx = 1;
		gbc_lblTituloGestion.gridy = 1;
		panel.add(lblTituloGestion, gbc_lblTituloGestion);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.DARK_GRAY);
		panel_1.setPreferredSize(new Dimension(340, 10));
		panel_0.add(panel_1, BorderLayout.WEST);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[]{41, 266, 30, 0};
		gbl_panel_1.rowHeights = new int[]{29, 68, 31, 68, 31, 68, 31, 68, 31, 68, 0};
		gbl_panel_1.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);
		
		JButton button = new JButton("GUARDAR");
		button.setOpaque(false);
		button.setPreferredSize(new Dimension(107, 40));
		button.setForeground(Color.WHITE);
		button.setFont(new Font("Dialog", Font.PLAIN, 20));
		button.setFocusPainted(false);
		button.setBackground(new Color(0, 128, 0));
		GridBagConstraints gbc_button = new GridBagConstraints();
		gbc_button.fill = GridBagConstraints.BOTH;
		gbc_button.insets = new Insets(0, 0, 5, 5);
		gbc_button.gridx = 1;
		gbc_button.gridy = 1;
		panel_1.add(button, gbc_button);
		
		JButton button_1 = new JButton("GUARDAR");
		button_1.setOpaque(false);
		button_1.setForeground(Color.WHITE);
		button_1.setFont(new Font("Dialog", Font.PLAIN, 20));
		button_1.setFocusPainted(false);
		button_1.setBackground(new Color(0, 128, 0));
		GridBagConstraints gbc_button_1 = new GridBagConstraints();
		gbc_button_1.fill = GridBagConstraints.BOTH;
		gbc_button_1.insets = new Insets(0, 0, 5, 5);
		gbc_button_1.gridx = 1;
		gbc_button_1.gridy = 3;
		panel_1.add(button_1, gbc_button_1);
		
		JButton button_2 = new JButton("GUARDAR");
		button_2.setOpaque(false);
		button_2.setForeground(Color.WHITE);
		button_2.setFont(new Font("Dialog", Font.PLAIN, 20));
		button_2.setFocusPainted(false);
		button_2.setBackground(new Color(0, 128, 0));
		GridBagConstraints gbc_button_2 = new GridBagConstraints();
		gbc_button_2.fill = GridBagConstraints.BOTH;
		gbc_button_2.insets = new Insets(0, 0, 5, 5);
		gbc_button_2.gridx = 1;
		gbc_button_2.gridy = 5;
		panel_1.add(button_2, gbc_button_2);
		
		JButton button_3 = new JButton("GUARDAR");
		button_3.setOpaque(false);
		button_3.setForeground(Color.WHITE);
		button_3.setFont(new Font("Dialog", Font.PLAIN, 20));
		button_3.setFocusPainted(false);
		button_3.setBackground(new Color(0, 128, 0));
		GridBagConstraints gbc_button_3 = new GridBagConstraints();
		gbc_button_3.fill = GridBagConstraints.BOTH;
		gbc_button_3.insets = new Insets(0, 0, 5, 5);
		gbc_button_3.gridx = 1;
		gbc_button_3.gridy = 7;
		panel_1.add(button_3, gbc_button_3);
		
		JButton button_4 = new JButton("GUARDAR");
		button_4.setOpaque(false);
		button_4.setForeground(Color.WHITE);
		button_4.setFont(new Font("Dialog", Font.PLAIN, 20));
		button_4.setFocusPainted(false);
		button_4.setBackground(new Color(0, 128, 0));
		GridBagConstraints gbc_button_4 = new GridBagConstraints();
		gbc_button_4.fill = GridBagConstraints.BOTH;
		gbc_button_4.insets = new Insets(0, 0, 0, 5);
		gbc_button_4.gridx = 1;
		gbc_button_4.gridy = 9;
		panel_1.add(button_4, gbc_button_4);
		
		JPanel panel_2 = new JPanel();
		panel_0.add(panel_2, BorderLayout.CENTER);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_3 = new JPanel();
		panel_3.setAlignmentX(10.0f);
		panel_3.setBackground(Color.LIGHT_GRAY);
		panel_3.setPreferredSize(new Dimension(10, 80));
		panel_2.add(panel_3, BorderLayout.NORTH);
		GridBagLayout gbl_panel_3 = new GridBagLayout();
		gbl_panel_3.columnWidths = new int[]{21, 331, 0};
		gbl_panel_3.rowHeights = new int[]{37, 0, 26, 0};
		gbl_panel_3.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_3.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_3.setLayout(gbl_panel_3);
		
		JLabel lbltitulo = new JLabel("TITULO");
		lbltitulo.setAlignmentX(10.0f);
		lbltitulo.setFont(new Font("Dialog", Font.PLAIN, 20));
		GridBagConstraints gbc_lbltitulo = new GridBagConstraints();
		gbc_lbltitulo.anchor = GridBagConstraints.SOUTHWEST;
		gbc_lbltitulo.insets = new Insets(0, 0, 5, 0);
		gbc_lbltitulo.gridx = 1;
		gbc_lbltitulo.gridy = 1;
		panel_3.add(lbltitulo, gbc_lbltitulo);
		
		pnlPrincipal = new JPanel();
		panel_2.add(pnlPrincipal, BorderLayout.CENTER);
		pnlPrincipal.setLayout(new BorderLayout(20, 0));
	}
	
	public void init() {
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
	
	public void setContenido(JPanel p) {
		pnlPrincipal.removeAll();
		pnlPrincipal.add(p,BorderLayout.CENTER);
		pnlPrincipal.repaint();
		pnlPrincipal.revalidate();
	}


}
