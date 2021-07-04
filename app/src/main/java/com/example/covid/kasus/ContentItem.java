package com.example.covid.kasus;

import com.google.gson.annotations.SerializedName;

public class ContentItem{

	@SerializedName("suspect_discarded")
	private int suspectDiscarded;

	@SerializedName("suspect_meninggal_harian")
	private int suspectMeninggalHarian;

	@SerializedName("closecontact_dikarantina")
	private int closecontactDikarantina;

	@SerializedName("CONFIRMATION")
	private int cONFIRMATION;

	@SerializedName("suspect_diisolasi")
	private int suspectDiisolasi;

	@SerializedName("confirmation_diisolasi")
	private int confirmationDiisolasi;

	@SerializedName("closecontact_meninggal_harian")
	private int closecontactMeninggalHarian;

	@SerializedName("confirmation_meninggal")
	private int confirmationMeninggal;

	@SerializedName("probable_meninggal")
	private int probableMeninggal;

	@SerializedName("confirmation_selesai")
	private int confirmationSelesai;

	@SerializedName("closecontact_discarded")
	private int closecontactDiscarded;

	@SerializedName("kode_prov")
	private String kodeProv;

	@SerializedName("nama_prov")
	private String namaProv;

	@SerializedName("CLOSECONTACT")
	private int cLOSECONTACT;

	@SerializedName("probable_discarded")
	private int probableDiscarded;

	@SerializedName("tanggal")
	private String tanggal;

	@SerializedName("probable_diisolasi")
	private int probableDiisolasi;

	@SerializedName("SUSPECT")
	private int sUSPECT;

	public void setSuspectDiscarded(int suspectDiscarded){
		this.suspectDiscarded = suspectDiscarded;
	}

	public int getSuspectDiscarded(){
		return suspectDiscarded;
	}

	public void setSuspectMeninggalHarian(int suspectMeninggalHarian){
		this.suspectMeninggalHarian = suspectMeninggalHarian;
	}

	public int getSuspectMeninggalHarian(){
		return suspectMeninggalHarian;
	}

	public void setClosecontactDikarantina(int closecontactDikarantina){
		this.closecontactDikarantina = closecontactDikarantina;
	}

	public int getClosecontactDikarantina(){
		return closecontactDikarantina;
	}

	public void setCONFIRMATION(int cONFIRMATION){
		this.cONFIRMATION = cONFIRMATION;
	}

	public int getCONFIRMATION(){
		return cONFIRMATION;
	}

	public void setSuspectDiisolasi(int suspectDiisolasi){
		this.suspectDiisolasi = suspectDiisolasi;
	}

	public int getSuspectDiisolasi(){
		return suspectDiisolasi;
	}

	public void setConfirmationDiisolasi(int confirmationDiisolasi){
		this.confirmationDiisolasi = confirmationDiisolasi;
	}

	public int getConfirmationDiisolasi(){
		return confirmationDiisolasi;
	}

	public void setClosecontactMeninggalHarian(int closecontactMeninggalHarian){
		this.closecontactMeninggalHarian = closecontactMeninggalHarian;
	}

	public int getClosecontactMeninggalHarian(){
		return closecontactMeninggalHarian;
	}

	public void setConfirmationMeninggal(int confirmationMeninggal){
		this.confirmationMeninggal = confirmationMeninggal;
	}

	public int getConfirmationMeninggal(){
		return confirmationMeninggal;
	}

	public void setProbableMeninggal(int probableMeninggal){
		this.probableMeninggal = probableMeninggal;
	}

	public int getProbableMeninggal(){
		return probableMeninggal;
	}

	public void setConfirmationSelesai(int confirmationSelesai){
		this.confirmationSelesai = confirmationSelesai;
	}

	public int getConfirmationSelesai(){
		return confirmationSelesai;
	}

	public void setClosecontactDiscarded(int closecontactDiscarded){
		this.closecontactDiscarded = closecontactDiscarded;
	}

	public int getClosecontactDiscarded(){
		return closecontactDiscarded;
	}

	public void setKodeProv(String kodeProv){
		this.kodeProv = kodeProv;
	}

	public String getKodeProv(){
		return kodeProv;
	}

	public void setNamaProv(String namaProv){
		this.namaProv = namaProv;
	}

	public String getNamaProv(){
		return namaProv;
	}

	public void setCLOSECONTACT(int cLOSECONTACT){
		this.cLOSECONTACT = cLOSECONTACT;
	}

	public int getCLOSECONTACT(){
		return cLOSECONTACT;
	}

	public void setProbableDiscarded(int probableDiscarded){
		this.probableDiscarded = probableDiscarded;
	}

	public int getProbableDiscarded(){
		return probableDiscarded;
	}

	public void setTanggal(String tanggal){
		this.tanggal = tanggal;
	}

	public String getTanggal(){
		return tanggal;
	}

	public void setProbableDiisolasi(int probableDiisolasi){
		this.probableDiisolasi = probableDiisolasi;
	}

	public int getProbableDiisolasi(){
		return probableDiisolasi;
	}

	public void setSUSPECT(int sUSPECT){
		this.sUSPECT = sUSPECT;
	}

	public int getSUSPECT(){
		return sUSPECT;
	}

	@Override
 	public String toString(){
		return 
			"ContentItem{" + 
			"suspect_discarded = '" + suspectDiscarded + '\'' + 
			",suspect_meninggal_harian = '" + suspectMeninggalHarian + '\'' + 
			",closecontact_dikarantina = '" + closecontactDikarantina + '\'' + 
			",cONFIRMATION = '" + cONFIRMATION + '\'' + 
			",suspect_diisolasi = '" + suspectDiisolasi + '\'' + 
			",confirmation_diisolasi = '" + confirmationDiisolasi + '\'' + 
			",closecontact_meninggal_harian = '" + closecontactMeninggalHarian + '\'' + 
			",confirmation_meninggal = '" + confirmationMeninggal + '\'' + 
			",probable_meninggal = '" + probableMeninggal + '\'' + 
			",confirmation_selesai = '" + confirmationSelesai + '\'' + 
			",closecontact_discarded = '" + closecontactDiscarded + '\'' + 
			",kode_prov = '" + kodeProv + '\'' + 
			",nama_prov = '" + namaProv + '\'' + 
			",cLOSECONTACT = '" + cLOSECONTACT + '\'' + 
			",probable_discarded = '" + probableDiscarded + '\'' + 
			",tanggal = '" + tanggal + '\'' + 
			",probable_diisolasi = '" + probableDiisolasi + '\'' + 
			",sUSPECT = '" + sUSPECT + '\'' + 
			"}";
		}
}