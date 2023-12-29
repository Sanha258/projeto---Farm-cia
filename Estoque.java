package farmacia;

public class Estoque {
	
	private String responsavel;
	private Remedio[] remedios;
	
	public Estoque(String responsavel, Remedio[] remedios) {
		super();
		this.responsavel = responsavel;
		this.remedios = remedios;
	}

	public Estoque() {
		super();
	}

	public String getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(String responsavel) {
		this.responsavel = responsavel;
	}

	public Remedio[] getRemedios() {
		return remedios;
	}

	public void setRemedios(Remedio[] remedios) {
		this.remedios = remedios;
	}

	public double calcularTotalEstoque() {
		double total = 0;
		for(Remedio remedio: this.getRemedios()) {
			total += remedio.getPreco();
		}
		return total;
	}

	public void calcularTotalEstoquePorLaboratorio(String lab) {
		double total = 0;
		for(int i = 0; i < this.getRemedios().length; i++) {
			if(this.getRemedios()[i].getLaboratorio().getNome().equalsIgnoreCase(lab)) {
				total += this.getRemedios()[i].getPreco();
			}
		}
		System.out.println("Total do estoque do laboratório " + lab + ": " + total);
	}

	public Laboratorio buscarInformacoesDoLaboratorio(String lab) {
		Laboratorio laboratorio = null;
		for(Remedio remedio: this.getRemedios()) {
			if(remedio.getLaboratorio().getNome().equalsIgnoreCase(lab)) {
				laboratorio = remedio.getLaboratorio();
			}
		}
		return laboratorio;
	}
	
}
