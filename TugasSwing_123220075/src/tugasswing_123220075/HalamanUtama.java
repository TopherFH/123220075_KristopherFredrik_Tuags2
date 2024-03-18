/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

//Kristopher Fredrik Hutapea
package tugasswing_123220075;

import BangunRuang.Balok;
import Bangundatar.Persegi;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class HalamanUtama extends JFrame implements ActionListener{
    
    JLabel header = new JLabel();
    JLabel tentukan = new JLabel("Tentukan panjang, lebar, dan tinggi untuk menghitung balok");
    
    JLabel txtPanjang = new JLabel ("Panjang");
    JTextField panjang = new JTextField();
    
    JLabel txtLebar = new JLabel ("Lebar");
    JTextField lebar = new JTextField();
    
    JLabel txtTinggi = new JLabel("Tinggi");
    JTextField tinggi = new JTextField();
    
    JButton hitung = new JButton("Hitung");
    JButton reset = new JButton("Reset");
    
    JLabel hasil = new JLabel("Hasil");
    JLabel luas = new JLabel("Luas Persegi");
    JLabel hasil1 = new JLabel("[Hasil berupa angka]");
    JLabel kel = new JLabel("Keliling Persegi");
    JLabel hasil2 = new JLabel("[Hasil berupa angka]");
    JLabel vol = new JLabel("Volume Balok");
    JLabel hasil3 = new JLabel("[Hasil berupa angka]");
    JLabel luasper = new JLabel("Luas Permukaan Balok");
    JLabel hasil4 = new JLabel("[Hasil berupa angka]");
    
    HalamanUtama(String username, String password, String jenisKelamin){
    String panggilan = (jenisKelamin == "L") ? "Mr. " : "Mrs ";
    setVisible(true);
    setSize(720,720);
    setTitle("Halaman Utama");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    setLayout(null);
    
    
    add(header);
    header.setBounds(10, 30, 500, 30);
    header.setText("Welcome, " + panggilan + username);
    header.setFont(new Font("Arial", Font.BOLD, 22));
        
    add(tentukan);
    tentukan.setBounds(10, 50, 500, 30);
        
    add(txtPanjang);
    txtPanjang.setBounds(10, 120, 100, 30);
        
    add(panjang);
    panjang.setBounds(150, 120, 500, 30);
        
    add(txtLebar);
    txtLebar.setBounds(10, 170, 100, 30);
        
    add(lebar);
    lebar.setBounds(150, 170, 500, 30);

    add(txtTinggi);
    txtTinggi.setBounds(10, 220, 100, 30);
        
    add(tinggi);
    tinggi.setBounds(150, 220, 500, 30);
        
    add(hitung);
    hitung.setBounds(10, 270, 685, 35);
    hitung.setBackground(Color.WHITE);
        
    add(reset);
    reset.setBounds(10, 320, 685, 35);
    reset.setBackground(Color.WHITE);
    
    add(hasil);
    hasil.setBounds(335, 380, 100, 30);
        
    add(luas);
    luas.setBounds(10, 420, 100, 30);
        
    add(hasil1);
    hasil1.setBounds(300, 420, 250, 30);

    add(kel);
    kel.setBounds(10, 450, 200, 30);
        
    add(hasil2);
    hasil2.setBounds(300, 450, 250, 30);
        
    add(vol);
    vol.setBounds(10, 480, 200, 30);
        
    add(hasil3);
    hasil3.setBounds(300, 480, 250, 30);
        
    add(luasper);
    luasper.setBounds(10, 510, 200, 30);
        
    add(hasil4);
    hasil4.setBounds(300, 510, 250, 30);
    
    hitung.addActionListener(this);
    reset.addActionListener(this);
    
    
    }
   
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == hitung) {
            double Panjang = Double.parseDouble(panjang.getText());
            double Lebar = Double.parseDouble(lebar.getText());
            double Tinggi = Double.parseDouble(tinggi.getText());
           
            Persegi bangun1 = new Persegi(Panjang, Lebar);
            Balok bangun2 = new Balok(Panjang,Lebar, Tinggi );
            
            String hasilLuas = String.valueOf(bangun1.Luas());
            String hasilKeliling = String.valueOf(bangun1.Keliling());

            String hasilVolume = String.valueOf(bangun2.volume());
            String hasilLuasPermukaan = String.valueOf(bangun2.luaspermukaan());
            
            hasil1.setText(hasilLuas);
            hasil2.setText(hasilKeliling);
            hasil3.setText(hasilVolume);
            hasil4.setText(hasilLuasPermukaan);
            
        } else if (e.getSource() == reset) {
            hasil1.setText("[Hasil berupa angka]");
            hasil2.setText("[Hasil berupa angka]");
            hasil3.setText("[Hasil berupa angka]");
            hasil4.setText("[Hasil berupa angka]");

        }
    }

//    @Override
//    public void actionPerformed(ActionEvent e) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }
}

