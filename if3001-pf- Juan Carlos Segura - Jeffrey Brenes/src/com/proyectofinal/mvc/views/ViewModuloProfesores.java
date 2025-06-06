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

public class ViewModuloProfesores extends JPanel {
	private JTable table;
	private JTextField txtCodigo;
	private JTextField lblNombre;

	/**
	 * Create the panel.
	 */
	public ViewModuloProfesores() {
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
		gbl_panel_4.rowHeights = new int[]{91, 60, 55, 52, 58, 0};
		gbl_panel_4.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_panel_4.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_4.setLayout(gbl_panel_4);
		
		JLabel lblCodigo = new JLabel("C\u00D3DIGO");
		lblCodigo.setFont(new Font("Dialog", Font.PLAIN, 20));
		GridBagConstraints gbc_lblCodigo = new GridBagConstraints();
		gbc_lblCodigo.anchor = GridBagConstraints.SOUTHWEST;
		gbc_lblCodigo.insets = new Insets(0, 0, 5, 0);
		gbc_lblCodigo.gridx = 0;
		gbc_lblCodigo.gridy = 0;
		panel_4.add(lblCodigo, gbc_lblCodigo);
		
		txtCodigo = new JTextField();
		txtCodigo.setPreferredSize(new Dimension(6, 30));
		GridBagConstraints gbc_txtCodigo = new GridBagConstraints();
		gbc_txtCodigo.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtCodigo.insets = new Insets(0, 0, 5, 0);
		gbc_txtCodigo.gridx = 0;
		gbc_txtCodigo.gridy = 1;
		panel_4.add(txtCodigo, gbc_txtCodigo);
		txtCodigo.setColumns(10);
		
		JLabel txtNombre = new JLabel("NOMBRE");
		txtNombre.setFont(new Font("Dialog", Font.PLAIN, 20));
		GridBagConstraints gbc_txtNombre = new GridBagConstraints();
		gbc_txtNombre.anchor = GridBagConstraints.SOUTHWEST;
		gbc_txtNombre.insets = new Insets(0, 0, 5, 0);
		gbc_txtNombre.gridx = 0;
		gbc_txtNombre.gridy = 2;
		panel_4.add(txtNombre, gbc_txtNombre);
		
		lblNombre = new JTextField();
		lblNombre.setPreferredSize(new Dimension(10, 30));
		GridBagConstraints gbc_lblNombre = new GridBagConstraints();
		gbc_lblNombre.insets = new Insets(0, 0, 5, 0);
		gbc_lblNombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblNombre.gridx = 0;
		gbc_lblNombre.gridy = 3;
		panel_4.add(lblNombre, gbc_lblNombre);
		lblNombre.setColumns(10);
		
		JButton btnGuardar = new JButton("GUARDAR");
		btnGuardar.setForeground(Color.WHITE);
		btnGuardar.setFocusPainted(false);
		btnGuardar.setBorderPainted(false);
		btnGuardar.setBackground(new Color(0, 128, 0));
		btnGuardar.setFont(new Font("Dialog", Font.PLAIN, 20));
		GridBagConstraints gbc_btnGuardar = new GridBagConstraints();
		gbc_btnGuardar.anchor = GridBagConstraints.EAST;
		gbc_btnGuardar.gridx = 0;
		gbc_btnGuardar.gridy = 4;
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
		
		JButton btnEliminar = new JButton("ELIMINAR");
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
