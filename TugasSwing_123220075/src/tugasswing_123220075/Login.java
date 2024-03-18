/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//Kristopher Fredrik Hutapea
package tugasswing_123220075;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame implements ActionListener {

    JLabel welcome = new JLabel("Selamat Datang!");
    JLabel masuk = new JLabel("Silakan Masuk untuk Melanjutkan");

    JLabel txtusername = new JLabel("Username");
    JTextField inputusername = new JTextField();

    JLabel txtpass = new JLabel("Password");
    JTextField inputpass = new JTextField();

    JLabel jenkel = new JLabel("Jenis Kelamin");
    JRadioButton cowo = new JRadioButton("Laki-Laki", true);
    JRadioButton cewe = new JRadioButton("Perempuan");

    JButton log1n = new JButton("Login");

    Login() {
        setVisible(true);
        setTitle("Login Page");
        setSize(720, 720);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        add(welcome);
        welcome.setBounds(5, 10, 500, 30);
        welcome.setFont(new Font("Arial", Font.BOLD, 25));

        add(masuk);
        masuk.setBounds(5, 50, 300, 20);

        add(txtusername);
        txtusername.setBounds(5, 110, 200, 20);

        add(inputusername);
        inputusername.setBounds(4, 130, 690, 35);

        add(txtpass);
        txtpass.setBounds(4, 180, 200, 25);

        add(inputpass);
        inputpass.setBounds(4, 200, 690, 35);

        add(jenkel);
        jenkel.setBounds(5, 250, 300, 20);

        ButtonGroup pilkel = new ButtonGroup();
        pilkel.add(cowo);
        pilkel.add(cewe);

        add(cowo);
        cowo.setBounds(10, 280, 100, 32);

        add(cewe);
        cewe.setBounds(210, 280, 160, 32);

        add(log1n);
        log1n.setBounds(10, 320, 680, 35);
        log1n.setBackground(Color.white);

        log1n.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            String username = inputusername.getText();
            String password = inputpass.getText();
            String jenisKelamin = cowo.isSelected() ? "L" : "P";

            if (username.isEmpty()) {
                throw new Exception("Username tidak boleh kosong!!");
            }
            if (password.isEmpty()) {
                throw new Exception("Password tidak boleh kosong!!");
            }
            
            new HalamanUtama(username,password,jenisKelamin);
            this.dispose();
        } catch (Exception error) {
            JOptionPane.showMessageDialog(this, error.getMessage());
        }
    }
}
