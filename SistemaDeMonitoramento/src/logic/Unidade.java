package logic;

public abstract class Unidade {
	

	protected String id;
	
	protected boolean video;
	protected boolean termometro;
	protected boolean co2;
	protected boolean ch4;
	
	protected float abcissa;
	protected float ordenada;
	
	public Unidade(String id, float abcissa, float ordenada, boolean video, boolean termometro,
			boolean co2,boolean ch4) {
		setId(id);
		setAbcissa(abcissa);
		setOrdenada(ordenada);
		setVideo(video);
		setTermometro(termometro);
		setCo2(co2);
		setCh4(ch4);
	}
	
// Initialization methods
	
	protected void setId(String id){
		this.id = id;
	}
	
	
	public void setVideo(boolean video) {
		this.video = video;
	}
	public void setTermometro(boolean termometro) {
		this.termometro = termometro;
	}
	public void setCo2(boolean co2) {
		this.co2 = co2;
	}
	public void setCh4(boolean ch4) {
		this.ch4 = ch4;
	}
	
	
	public void setAbcissa(float abcissa) {
		this.abcissa = abcissa;
	}
	public void setOrdenada(float ordenada) {
		this.ordenada = ordenada;
	}
	
// Return methods
	
	public String getId() {
		return this.id;
	}
	
	
	public boolean getVideo() {
		return this.video;
	}
	public boolean getTermometro() {
		return this.termometro;
	}
	public boolean getCo2() {
		return this.co2;
	}
	public boolean getCh4() {
		return this.ch4;
	}
	
	
	public float getAbcissa() {
		return this.abcissa;
	}
	public float getOrdenada() {
		return this.ordenada;
	}
	
	
	public abstract float getDistancia(float abcissa, float ordenada);
	
}
