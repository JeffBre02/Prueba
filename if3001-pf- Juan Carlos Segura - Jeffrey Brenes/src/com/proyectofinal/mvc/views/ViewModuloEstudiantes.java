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

public class ViewModuloEstudiantes extends JPanel {
	public JTable table;
	public JTextField txtNombre;
	public JButton btnGuardar;
	public JButton btnEliminar;

	/**
	 * Create the panel.
	 */
	public ViewModuloEstudiantes() {
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
		gbl_panel_4.rowHeights = new int[]{35, 60, 35, 60, 60, 0};
		gbl_panel_4.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_panel_4.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_4.setLayout(gbl_panel_4);
		
		JLabel lblNom = new JLabel("NOMBRE");
		lblNom.setFont(new Font("Dialog", Font.PLAIN, 20));
		GridBagConstraints gbc_lblNom = new GridBagConstraints();
		gbc_lblNom.anchor = GridBagConstraints.SOUTHWEST;
		gbc_lblNom.insets = new Insets(0, 0, 5, 0);
		gbc_lblNom.gridx = 0;
		gbc_lblNom.gridy = 0;
		panel_4.add(lblNom, gbc_lblNom);
		
		txtNombre = new JTextField();
		txtNombre.setPreferredSize(new Dimension(6, 30));
		GridBagConstraints gbc_txtNombre = new GridBagConstraints();
		gbc_txtNombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNombre.insets = new Insets(0, 0, 5, 0);
		gbc_txtNombre.gridx = 0;
		gbc_txtNombre.gridy = 1;
		panel_4.add(txtNombre, gbc_txtNombre);
		txtNombre.setColumns(10);
		
		JLabel lblCarnet = new JLabel("CARNET");
		lblCarnet.setFont(new Font("Dialog", Font.PLAIN, 20));
		GridBagConstraints gbc_lblCarnet = new GridBagConstraints();
		gbc_lblCarnet.anchor = GridBagConstraints.SOUTHWEST;
		gbc_lblCarnet.insets = new Insets(0, 0, 5, 0);
		gbc_lblCarnet.gridx = 0;
		gbc_lblCarnet.gridy = 2;
		panel_4.add(lblCarnet, gbc_lblCarnet);
		
		JTextField txtCarnet = new JTextField();
		txtCarnet.setPreferredSize(new Dimension(10, 30));
		GridBagConstraints gbc_txtCarnet = new GridBagConstraints();
		gbc_txtCarnet.insets = new Insets(0, 0, 5, 0);
		gbc_txtCarnet.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtCarnet.gridx = 0;
		gbc_txtCarnet.gridy = 3;
		panel_4.add(txtCarnet, gbc_txtCarnet);
		txtCarnet.setColumns(10);
		
		btnGuardar = new JButton("GUARDAR");
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
