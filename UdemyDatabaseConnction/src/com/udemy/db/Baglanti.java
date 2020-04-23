package com.udemy.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Baglanti {

//	private String kullanici_adi = "root";
//	private String parola = "";
//	
//	private String db_ismi= "demo";
//	private String host = "localhost";
//	private int port = 3306;	
	
	private Connection connection = null;
	
	public void calisan_ekle() {
		try {
			Statement statement = connection.createStatement();
			String sorgu = "Insert Into calisanlar (ad,soyad,email) VALUES ('Galip','Sipahi','galipsipahi@gmail.com')";
			statement.executeUpdate(sorgu);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void calisanSil() {
		try {
			Statement statement = connection.createStatement();
			String sorgu = "Delete from calisanlar where id>6";
			statement.executeUpdate(sorgu);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void calisanGuncelle() {
		try {
			Statement statement = connection.createStatement();
			String sourgu = "Update calisanlar Set email = 'mustafamurat@gmail.com' where id = 1";
			statement.executeUpdate(sourgu);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void calisanlariGetir() {
		String sorgu = "select * from calisanlar";
		
		try {
			Statement statement = connection.createStatement();
			statement = connection.createStatement();
			ResultSet rs = statement.executeQuery(sorgu);
			
			while(rs.next()) {
				int id = rs.getInt("id");
				String ad = rs.getString("ad");
				String soyad = rs.getString("soyad");
				String email = rs.getString("email");
				
				System.out.println("id : " + id);
				System.out.println("Ad : " + ad);
				System.out.println("Soyad : " + soyad);
				System.out.println("Email : " + email);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public Baglanti() {
		
		String url = "jdbc:mysql://localhost:3306/demo";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("Driver Bulunamadı");
		}
		
		try {
			connection = DriverManager.getConnection(url, "root", "");
			System.out.println("Bağlantı Başarılı1");
		} catch (SQLException e) {
			System.out.println("Bağlantı Başarısız");
		}
	}
	
	public static void main(String[] args) {
		Baglanti baglanti = new Baglanti();
		
		baglanti.calisanlariGetir();		
		baglanti.calisan_ekle();
		System.out.println("***********");
		baglanti.calisanlariGetir();		
		baglanti.calisanSil();
		System.out.println("***********");
		baglanti.calisanlariGetir();
		baglanti.calisanGuncelle();
		System.out.println("***********");
		baglanti.calisanlariGetir();
	}
}
