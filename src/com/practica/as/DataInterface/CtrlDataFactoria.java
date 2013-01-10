package com.practica.as.DataInterface;

import com.practica.as.DataLayer.CtrlCiutat;
import com.practica.as.DataLayer.CtrlClient;
import com.practica.as.DataLayer.CtrlViatge;

public enum CtrlDataFactoria {
	// SINGLETON

	INSTANCE;
	
	public CtrlClient getCtrlClient() {
		// TODO
		return null;
	}
	
	public CtrlCiutat getCtrlCiutat() {
		// TODO
		return null;
	}
	
	public CtrlViatge getCtrlViatge() {
		// TODO
		return null;
	}
	
}
