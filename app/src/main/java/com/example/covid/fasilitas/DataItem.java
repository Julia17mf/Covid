package com.example.covid.fasilitas;

import com.google.gson.annotations.SerializedName;

public class DataItem{

	@SerializedName("rujukan")
	private Object rujukan;

	@SerializedName("nama")
	private String nama;

	@SerializedName("tipe_faskes")
	private int tipeFaskes;

	@SerializedName("latitude")
	private double latitude;

	@SerializedName("telepon")
	private String telepon;

	@SerializedName("kode_kemkes")
	private Object kodeKemkes;

	@SerializedName("url")
	private Object url;

	@SerializedName("alamat")
	private String alamat;

	@SerializedName("longitude")
	private double longitude;

	@SerializedName("nomor_rujukan")
	private int nomorRujukan;

	public void setRujukan(Object rujukan){
		this.rujukan = rujukan;
	}

	public Object getRujukan(){
		return rujukan;
	}

	public void setNama(String nama){
		this.nama = nama;
	}

	public String getNama(){
		return nama;
	}

	public void setTipeFaskes(int tipeFaskes){
		this.tipeFaskes = tipeFaskes;
	}

	public int getTipeFaskes(){
		return tipeFaskes;
	}

	public void setLatitude(double latitude){
		this.latitude = latitude;
	}

	public double getLatitude(){
		return latitude;
	}

	public void setTelepon(String telepon){
		this.telepon = telepon;
	}

	public String getTelepon(){
		return telepon;
	}

	public void setKodeKemkes(Object kodeKemkes){
		this.kodeKemkes = kodeKemkes;
	}

	public Object getKodeKemkes(){
		return kodeKemkes;
	}

	public void setUrl(Object url){
		this.url = url;
	}

	public Object getUrl(){
		return url;
	}

	public void setAlamat(String alamat){
		this.alamat = alamat;
	}

	public String getAlamat(){
		return alamat;
	}

	public void setLongitude(double longitude){
		this.longitude = longitude;
	}

	public double getLongitude(){
		return longitude;
	}

	public void setNomorRujukan(int nomorRujukan){
		this.nomorRujukan = nomorRujukan;
	}

	public int getNomorRujukan(){
		return nomorRujukan;
	}

	@Override
 	public String toString(){
		return 
			"DataItem{" + 
			"rujukan = '" + rujukan + '\'' + 
			",nama = '" + nama + '\'' + 
			",tipe_faskes = '" + tipeFaskes + '\'' + 
			",latitude = '" + latitude + '\'' + 
			",telepon = '" + telepon + '\'' + 
			",kode_kemkes = '" + kodeKemkes + '\'' + 
			",url = '" + url + '\'' + 
			",alamat = '" + alamat + '\'' + 
			",longitude = '" + longitude + '\'' + 
			",nomor_rujukan = '" + nomorRujukan + '\'' + 
			"}";
		}
}