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

public class ViewModuloCursos extends JPanel {
	public JTable table;
	public JTextField txtSigla;
	public JButton btnGuardar;
	public JButton btnEliminar;

	/**
	 * Create the panel.
	 */
	public ViewModuloCursos() {
		setPreferredSize(new Dimension(732, 438));
		setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setAlignmentY(0.9f);
		panel.setAlignmentX(0.1f);
		panel.setPreferredSize(new Dimension(300, 10));
		add(panel, BorderLayout.WEST);
		panel.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_2 = new JPanel();
		panel_2.setMinimumSize(new Dimension(15, 10));
		panel_2.setBackground(Color.WHITE);
		panel.add(panel_2, BorderLayout.WEST);
		
		JPanel panel_3 = new JPanel();
		panel_3.setMinimumSize(new Dimension(15, 10));
		panel_3.setBackground(Color.WHITE);
		panel.add(panel_3, BorderLayout.EAST);
		
		JPanel panel_4 = new JPanel();
		panel_4.setPreferredSize(new Dimension(10, 40));
		panel_4.setBackground(Color.WHITE);
		panel.add(panel_4, BorderLayout.CENTER);
		GridBagLayout gbl_panel_4 = new GridBagLayout();
		gbl_panel_4.columnWidths = new int[]{280, 0};
		gbl_panel_4.rowHeights = new int[]{35, 60, 35, 60, 35, 60, 86, 0};
		gbl_panel_4.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_panel_4.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_4.setLayout(gbl_panel_4);
		
		JLabel lblNom = new JLabel("SIGLA");
		lblNom.setFont(new Font("Dialog", Font.PLAIN, 20));
		GridBagConstraints gbc_lblNom = new GridBagConstraints();
		gbc_lblNom.anchor = GridBagConstraints.SOUTHWEST;
		gbc_lblNom.insets = new Insets(0, 0, 5, 0);
		gbc_lblNom.gridx = 0;
		gbc_lblNom.gridy = 0;
		panel_4.add(lblNom, gbc_lblNom);
		
		txtSigla = new JTextField();
		txtSigla.setPreferredSize(new Dimension(6, 30));
		GridBagConstraints gbc_txtSigla = new GridBagConstraints();
		gbc_txtSigla.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtSigla.insets = new Insets(0, 0, 5, 0);
		gbc_txtSigla.gridx = 0;
		gbc_txtSigla.gridy = 1;
		panel_4.add(txtSigla, gbc_txtSigla);
		txtSigla.setColumns(10);
		
		JLabel lblCarnet = new JLabel("NOMBRE");
		lblCarnet.setFont(new Font("Dialog", Font.PLAIN, 20));
		GridBagConstraints gbc_lblCarnet = new GridBagConstraints();
		gbc_lblCarnet.anchor = GridBagConstraints.SOUTHWEST;
		gbc_lblCarnet.insets = new Insets(0, 0, 5, 0);
		gbc_lblCarnet.gridx = 0;
		gbc_lblCarnet.gridy = 2;
		panel_4.add(lblCarnet, gbc_lblCarnet);
		
		JTextField txtNombre = new JTextField();
		txtNombre.setPreferredSize(new Dimension(10, 30));
		GridBagConstraints gbc_txtNombre = new GridBagConstraints();
		gbc_txtNombre.insets = new Insets(0, 0, 5, 0);
		gbc_txtNombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNombre.gridx = 0;
		gbc_txtNombre.gridy = 3;
		panel_4.add(txtNombre, gbc_txtNombre);
		txtNombre.setColumns(10);
		
		JLabel lblCurso = new JLabel("CURSO");
		lblCurso.setFont(new Font("Dialog", Font.PLAIN, 20));
		GridBagConstraints gbc_lblCurso = new GridBagConstraints();
		gbc_lblCurso.anchor = GridBagConstraints.WEST;
		gbc_lblCurso.insets = new Insets(0, 0, 5, 0);
		gbc_lblCurso.gridx = 0;
		gbc_lblCurso.gridy = 4;
		panel_4.add(lblCurso, gbc_lblCurso);
		
		JComboBox cBCurso = new JComboBox();
		cBCurso.setPreferredSize(new Dimension(31, 30));
		GridBagConstraints gbc_cBCurso = new GridBagConstraints();
		gbc_cBCurso.insets = new Insets(0, 0, 5, 0);
		gbc_cBCurso.fill = GridBagConstraints.HORIZONTAL;
		gbc_cBCurso.gridx = 0;
		gbc_cBCurso.gridy = 5;
		panel_4.add(cBCurso, gbc_cBCurso);
		
		btnGuardar = new JButton("GUARDAR");
		btnGuardar.setForeground(Color.WHITE);
		btnGuardar.setFocusPainted(false);
		btnGuardar.setBorderPainted(false);
		btnGuardar.setBackground(new Color(0, 128, 0));
		btnGuardar.setFont(new Font("Dialog", Font.PLAIN, 20));
		GridBagConstraints gbc_btnGuardar = new GridBagConstraints();
		gbc_btnGuardar.anchor = GridBagConstraints.EAST;
		gbc_btnGuardar.gridx = 0;
		gbc_btnGuardar.gridy = 6;
		panel_4.add(btnGuardar, gbc_btnGuardar);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBackground(Color.WHITE);
		panel_1.add(scrollPane, BorderLayout.CENTER);
		
		table = new JTable();
		table.setBackground(Color.WHITE);
		scrollPane.setViewportView(table);
		
		JPanel panel_5 = new JPanel();
		panel_5.setPreferredSize(new Dimension(10, 120));
		panel_1.add(panel_5, BorderLayout.SOUTH);
		panel_5.setLayout(new BorderLayout(0, 0));
		
		btnEliminar = new JButton("ELIMINAR");
		btnEliminar.setForeground(Color.WHITE);
		btnEliminar.setFont(new Font("Dialog", Font.PLAIN, 20));
		btnEliminar.setFocusPainted(false);
		btnEliminar.setBorderPainted(false);
		btnEliminar.setBackground(new Color(255, 0, 0));
		panel_5.add(btnEliminar, BorderLayout.EAST);
		
		JPanel panel_6 = new JPanel();
		panel_6.setPreferredSize(new Dimension(10, 75));
		panel_5.add(panel_6, BorderLayout.SOUTH);
		
		JPanel panel_7 = new JPanel();
		panel_5.add(panel_7, BorderLayout.NORTH);

	}
}
