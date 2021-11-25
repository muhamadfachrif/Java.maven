package com.sample.app;

import javax.swing.JOptionPane;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class App {

	public static void main(String[] args) {
		String inputTextbox = JOptionPane.showInputDialog(null,"Masukan Nama");
		
		App myExam = new App();
		
		while (inputTextbox.isEmpty()) {
			JOptionPane.showMessageDialog(null, "Error!! Field tidak boleh kosong");
			inputTextbox = JOptionPane.showInputDialog(null,"Masukan Nama");
		}

		int btnValue =JOptionPane.showConfirmDialog(null, "Apakah Kamu Suka Burger","Confirm",
				JOptionPane.YES_NO_CANCEL_OPTION);
		double price = 38000;
		inputTextbox = inputTextbox.toUpperCase();
		String label="";
		
		if (btnValue == 0) {
			String inputJmlbox = JOptionPane.showInputDialog(null,"Masukan Jumlah Burger");
			
			while (myExam.isNumber(inputJmlbox) == false) {
				JOptionPane.showMessageDialog(null, "Field tidak boleh kosong dan harus angka");
				inputJmlbox = JOptionPane.showInputDialog(null,"Masukan Jumlah Burger");
			}
			
			double quantity = price*Double.parseDouble(inputJmlbox);
			label = inputTextbox + " mau beli burger MCD\n" 
			+"Jumlah yg dipesan sebanyak " + inputJmlbox
			+ " burger\n Dengan Total bayar "+ new App().formatRupiah(quantity);
		
		} else if (btnValue == 1){
			
			int btnValue2 =JOptionPane.showConfirmDialog(null, "Apakah Kamu Yakin?","Confirm",
					JOptionPane.YES_NO_OPTION);
			
			if (btnValue2 == 0) {
				
				label = inputTextbox + " tidak suka burger";
			} else {
				
				String inputJmlbox = JOptionPane.showInputDialog(null,"Masukan Jumlah Burger");
				double quantity = price*Double.parseDouble(inputJmlbox);
				label = inputTextbox + " mau beli burger MCD\n" 
				+"Jumlah yg dipesan sebanyak " + inputJmlbox
				+ " burger\n Dengan Total bayar "+ new App().formatRupiah(quantity);
	
				}
		
		} else {
			
			int btnValue2 =JOptionPane.showConfirmDialog(null, "Apakah Kamu Yakin?","Confirm",
					JOptionPane.YES_NO_OPTION);
			
			if (btnValue2 == 0) {
				
				label = inputTextbox + " Tidak memilih";
			} else {
				
				String inputJmlbox = JOptionPane.showInputDialog(null,"Masukan Jumlah Burger");
				double quantity = price*Double.parseDouble(inputJmlbox);
				label = inputTextbox + " mau beli burger MCD\n" 
				+"Jumlah yg dipesan sebanyak " + inputJmlbox
				+ " burger\n Dengan Total bayar "+ new App().formatRupiah(quantity);
	
				}
			
		}
		
		JOptionPane.showMessageDialog(null, label);

	}
	
	public boolean isNumber(String input) {
		
		try {
			Double x = Double.parseDouble(input);
			return true;
		} catch (Exception e) {
			return false;
		}
		
	}
	
	public String formatRupiah(double nominal){		
		
		DecimalFormat kursIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();
        formatRp.setCurrencySymbol("Rp. ");
        formatRp.setMonetaryDecimalSeparator(',');
        formatRp.setGroupingSeparator('.');
        kursIndonesia.setDecimalFormatSymbols(formatRp);
        
		return kursIndonesia.format(nominal);
	
	}
	
}
