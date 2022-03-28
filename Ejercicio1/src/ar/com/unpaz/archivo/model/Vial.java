package ar.com.unpaz.archivo.model;

public class Vial {
	int númerodehoja;
	String tipoobjeto;
	int identificadortramo;
	String tipocamino;
	int longitud;
	
	
	public Vial(int númerodehoja, String tipoobjeto, int identificadortramo, String tipocamino, int longitud) {
		super();
		this.númerodehoja = númerodehoja;
		this.tipoobjeto = tipoobjeto;
		this.identificadortramo = identificadortramo;
		this.tipocamino = tipocamino;
		this.longitud = longitud;
		
		
		
	}


	public int getNúmerodehoja() {
		return númerodehoja;
	}


	public void setNúmerodehoja(int númerodehoja) {
		this.númerodehoja = númerodehoja;
	}


	public String getTipoobjeto() {
		return tipoobjeto;
	}


	public void setTipoobjeto(String tipoobjeto) {
		this.tipoobjeto = tipoobjeto;
	}


	public int getIdentificadortramo() {
		return identificadortramo;
	}


	public void setIdentificadortramo(int identificadortramo) {
		this.identificadortramo = identificadortramo;
	}


	public String getTipocamino() {
		return tipocamino;
	}


	public void setTipocamino(String tipocamino) {
		this.tipocamino = tipocamino;
	}


	public int getLongitud() {
		return longitud;
	}


	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}
	
	
	
	

	 

}
