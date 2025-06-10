package com.proyectofinal.mvc.views;

import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;

import com.sun.java.swing.plaf.motif.MotifBorders.BevelBorder;

import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.CardLayout;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;

public class ViewModuloMatriculas extends JPanel {
	
	public JButton btnGuardar;
	public JButton btnEliminar;
	public JComboBox cBCursos;

	/**
	 * Create the panel.
	 */
	public ViewModuloMatriculas() {
		setBackground(Color.WHITE);
		setPreferredSize(new Dimension(732, 438));
		setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setAlignmentY(0.9f);
		panel.setAlignmentX(0.1f);
		panel.setPreferredSize(new Dimension(500, 10));
		add(panel, BorderLayout.WEST);
		panel.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_2 = new JPanel();
		panel_2.setMinimumSize(new Dimension(15, 10));
		panel_2.setBackground(Color.WHITE);
		panel.add(panel_2, BorderLayout.WEST);
		
		JPanel panel_4 = new JPanel();
		panel.add(panel_4, BorderLayout.CENTER);
		panel_4.setPreferredSize(new Dimension(300, 10));
		panel_4.setBackground(Color.WHITE);
		GridBagLayout gbl_panel_4 = new GridBagLayout();
		gbl_panel_4.columnWidths = new int[]{280, 0};
		gbl_panel_4.rowHeights = new int[]{35, 60, 35, 60, 41, 0};
		gbl_panel_4.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_panel_4.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		panel_4.setLayout(gbl_panel_4);
		
		JLabel lblCarnet = new JLabel("CURSO");
		lblCarnet.setFont(new Font("Dialog", Font.PLAIN, 20));
		GridBagConstraints gbc_lblCarnet = new GridBagConstraints();
		gbc_lblCarnet.anchor = GridBagConstraints.SOUTHWEST;
		gbc_lblCarnet.insets = new Insets(0, 0, 5, 0);
		gbc_lblCarnet.gridx = 0;
		gbc_lblCarnet.gridy = 0;
		panel_4.add(lblCarnet, gbc_lblCarnet);
		
		cBCursos = new JComboBox();
		cBCursos.setPreferredSize(new Dimension(31, 30));
		GridBagConstraints gbc_cBCursos = new GridBagConstraints();
		gbc_cBCursos.insets = new Insets(0, 0, 5, 0);
		gbc_cBCursos.fill = GridBagConstraints.HORIZONTAL;
		gbc_cBCursos.gridx = 0;
		gbc_cBCursos.gridy = 1;
		panel_4.add(cBCursos, gbc_cBCursos);
		
		JLabel lblEstudiante = new JLabel("ESTUDIANTE");
		lblEstudiante.setFont(new Font("Dialog", Font.PLAIN, 20));
		GridBagConstraints gbc_lblEstudiante = new GridBagConstraints();
		gbc_lblEstudiante.anchor = GridBagConstraints.WEST;
		gbc_lblEstudiante.insets = new Insets(0, 0, 5, 0);
		gbc_lblEstudiante.gridx = 0;
		gbc_lblEstudiante.gridy = 2;
		panel_4.add(lblEstudiante, gbc_lblEstudiante);
		
		JComboBox cBEstudiantes = new JComboBox();
		cBEstudiantes.setPreferredSize(new Dimension(31, 30));
		GridBagConstraints gbc_cBEstudiantes = new GridBagConstraints();
		gbc_cBEstudiantes.insets = new Insets(0, 0, 5, 0);
		gbc_cBEstudiantes.fill = GridBagConstraints.HORIZONTAL;
		gbc_cBEstudiantes.gridx = 0;
		gbc_cBEstudiantes.gridy = 3;
		panel_4.add(cBEstudiantes, gbc_cBEstudiantes);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(Color.WHITE);
		panel_5.setLayout(null);
		GridBagConstraints gbc_panel_5 = new GridBagConstraints();
		gbc_panel_5.fill = GridBagConstraints.BOTH;
		gbc_panel_5.gridx = 0;
		gbc_panel_5.gridy = 4;
		panel_4.add(panel_5, gbc_panel_5);
		
		btnGuardar = new JButton("+MATRICULAR");
		btnGuardar.setBounds(0, 0, 170, 34);
		panel_5.add(btnGuardar);
		btnGuardar.setForeground(Color.WHITE);
		btnGuardar.setFocusPainted(false);
		btnGuardar.setBorderPainted(false);
		btnGuardar.setBackground(new Color(0, 128, 0));
		btnGuardar.setFont(new Font("Dialog", Font.PLAIN, 15));
		
		btnEliminar = new JButton("-DESMATRICULAR");
		btnEliminar.setBounds(320, 0, 170, 34);
		panel_5.add(btnEliminar);
		btnEliminar.setForeground(Color.WHITE);
		btnEliminar.setFont(new Font("Dialog", Font.PLAIN, 15));
		btnEliminar.setFocusPainted(false);
		btnEliminar.setBorderPainted(false);
		btnEliminar.setBackground(new Color(255, 0, 0));
		
		JPanel panel_1 = new JPanel();
		panel_1.setPreferredSize(new Dimension(10, 150));
		add(panel_1, BorderLayout.SOUTH);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.WHITE);
		add(panel_3, BorderLayout.EAST);

	}
}
