package logic;

public class Euclidiana extends Unidade {

	@Override
	public String toString() {
		return "Euclidiana [id=" + id + ", video=" + video + ", termometro=" + termometro + ", co2=" + co2 + ", ch4=" + ch4
				+ ", abcissa=" + abcissa + ", ordenada=" + ordenada + ", distancia=" + getDistancia(50, 50) + "]";
	}

	public Euclidiana(String id, float abcissa, float ordenada, boolean video, boolean termometro, boolean co2,
			boolean ch4) {
		super(id, abcissa, ordenada, video, termometro, co2, ch4);
	}

	@Override
	public float getDistancia(float abcissa, float ordenada) {
		return (float) Math.sqrt(Math.pow(this.getAbcissa() - abcissa, 2) + Math.pow(this.getOrdenada() - ordenada, 2));
	}

}
