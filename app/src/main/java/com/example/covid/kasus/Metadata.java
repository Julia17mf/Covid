package com.example.covid.kasus;

import com.google.gson.annotations.SerializedName;

public class Metadata{

	@SerializedName("last_update")
	private Object lastUpdate;

	public void setLastUpdate(Object lastUpdate){
		this.lastUpdate = lastUpdate;
	}

	public Object getLastUpdate(){
		return lastUpdate;
	}

	@Override
 	public String toString(){
		return 
			"Metadata{" + 
			"last_update = '" + lastUpdate + '\'' + 
			"}";
		}
}