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
	public JLabel lbltitulo;
	public JButton btnProfesores;
	public JButton btnEstudiantes;
	public JButton btnReportes;
	public JButton btnMatriculas;
	public JButton btnCursos;

	
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
		gbl_panel_1.rowHeights = new int[]{31, 65, 31, 65, 31, 65, 31, 65, 31, 65, 31, 0};
		gbl_panel_1.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);
		
		btnProfesores = new JButton("PROFESORES");
		btnProfesores.setMinimumSize(new Dimension(95, 25));
		btnProfesores.setMaximumSize(new Dimension(95, 25));
		btnProfesores.setOpaque(false);
		btnProfesores.setPreferredSize(new Dimension(95, 25));
		btnProfesores.setForeground(Color.WHITE);
		btnProfesores.setFont(new Font("Dialog", Font.PLAIN, 20));
		btnProfesores.setFocusPainted(false);
		btnProfesores.setBackground(new Color(0, 128, 0));
		GridBagConstraints gbc_btnProfesores = new GridBagConstraints();
		gbc_btnProfesores.fill = GridBagConstraints.BOTH;
		gbc_btnProfesores.insets = new Insets(0, 0, 5, 5);
		gbc_btnProfesores.gridx = 1;
		gbc_btnProfesores.gridy = 1;
		panel_1.add(btnProfesores, gbc_btnProfesores);
		
		btnEstudiantes = new JButton("ESTUDIANTES");
		btnEstudiantes.setPreferredSize(new Dimension(95, 25));
		btnEstudiantes.setMinimumSize(new Dimension(95, 25));
		btnEstudiantes.setMaximumSize(new Dimension(95, 25));
		btnEstudiantes.setOpaque(false);
		btnEstudiantes.setForeground(Color.WHITE);
		btnEstudiantes.setFont(new Font("Dialog", Font.PLAIN, 20));
		btnEstudiantes.setFocusPainted(false);
		btnEstudiantes.setBackground(new Color(0, 128, 0));
		GridBagConstraints gbc_btnEstudiantes = new GridBagConstraints();
		gbc_btnEstudiantes.fill = GridBagConstraints.BOTH;
		gbc_btnEstudiantes.insets = new Insets(0, 0, 5, 5);
		gbc_btnEstudiantes.gridx = 1;
		gbc_btnEstudiantes.gridy = 3;
		panel_1.add(btnEstudiantes, gbc_btnEstudiantes);
		
		btnCursos = new JButton("CURSOS");
		btnCursos.setMinimumSize(new Dimension(95, 25));
		btnCursos.setMaximumSize(new Dimension(95, 25));
		btnCursos.setPreferredSize(new Dimension(95, 25));
		btnCursos.setOpaque(false);
		btnCursos.setForeground(Color.WHITE);
		btnCursos.setFont(new Font("Dialog", Font.PLAIN, 20));
		btnCursos.setFocusPainted(false);
		btnCursos.setBackground(new Color(0, 128, 0));
		GridBagConstraints gbc_btnCursos = new GridBagConstraints();
		gbc_btnCursos.fill = GridBagConstraints.BOTH;
		gbc_btnCursos.insets = new Insets(0, 0, 5, 5);
		gbc_btnCursos.gridx = 1;
		gbc_btnCursos.gridy = 5;
		panel_1.add(btnCursos, gbc_btnCursos);
		
		btnMatriculas = new JButton("MATR\u00CDCULAS");
		btnMatriculas.setPreferredSize(new Dimension(95, 25));
		btnMatriculas.setMinimumSize(new Dimension(95, 25));
		btnMatriculas.setMaximumSize(new Dimension(95, 25));
		btnMatriculas.setOpaque(false);
		btnMatriculas.setForeground(Color.WHITE);
		btnMatriculas.setFont(new Font("Dialog", Font.PLAIN, 20));
		btnMatriculas.setFocusPainted(false);
		btnMatriculas.setBackground(new Color(0, 128, 0));
		GridBagConstraints gbc_btnMatriculas = new GridBagConstraints();
		gbc_btnMatriculas.fill = GridBagConstraints.BOTH;
		gbc_btnMatriculas.insets = new Insets(0, 0, 5, 5);
		gbc_btnMatriculas.gridx = 1;
		gbc_btnMatriculas.gridy = 7;
		panel_1.add(btnMatriculas, gbc_btnMatriculas);
		
		btnReportes = new JButton("REPORTES");
		btnReportes.setOpaque(false);
		btnReportes.setForeground(Color.WHITE);
		btnReportes.setFont(new Font("Dialog", Font.PLAIN, 20));
		btnReportes.setFocusPainted(false);
		btnReportes.setBackground(new Color(0, 128, 0));
		GridBagConstraints gbc_btnReportes = new GridBagConstraints();
		gbc_btnReportes.fill = GridBagConstraints.BOTH;
		gbc_btnReportes.insets = new Insets(0, 0, 5, 5);
		gbc_btnReportes.gridx = 1;
		gbc_btnReportes.gridy = 9;
		panel_1.add(btnReportes, gbc_btnReportes);
		
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
		
		lbltitulo = new JLabel("TITULO");
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
	//cambio para commit
}
