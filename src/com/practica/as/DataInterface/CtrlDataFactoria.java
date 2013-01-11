package com.practica.as.DataInterface;

import com.practica.as.DataLayer.CtrlCiutat;
import com.practica.as.DataLayer.CtrlClient;
import com.practica.as.DataLayer.CtrlViatge;

public enum CtrlDataFactoria {
	// SINGLETON

	INSTANCE;
	private ICtrlCiutat iCtrlCiutat;
	private ICtrlClient iCtrlClient;
	private ICtrlViatge iCtrlViatge;
	
	public CtrlClient getCtrlClient() {
		// TODO
		// return iCtrlClient;
		return null;
	}
	
	public CtrlCiutat getCtrlCiutat() {
		// TODO
		// return iCtrlCiutat;
		return null;
	}
	
	public CtrlViatge getCtrlViatge() {
		// TODO
		// return iCtrlViatge;
		return null;
	}
	
}
