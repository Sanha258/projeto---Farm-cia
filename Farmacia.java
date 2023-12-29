package farmacia;

public class Farmacia extends Empresa{

	private Estoque estoque;
	
	public Farmacia(String nome, String cnpj, Endereco endereco, Estoque estoque) {
		super(nome, cnpj, endereco);
		this.estoque = estoque;
	}

	public Farmacia() {
		super();
	}
	
	public Estoque getEstoque() {
		return estoque;
	}

	public void setEstoque(Estoque estoque) {
		this.estoque = estoque;
	}

	public void informarNomeDoResponsavelPeloEstoque() {
		System.out.println("O responsável pelo estoque é: " + this.getEstoque().getResponsavel());
	}

	public void calcularTotalEstoque() {
		double total = this.getEstoque().calcularTotalEstoque();
		System.out.println("Total do estoque: " + total);
	}

	public void calcularTotalEstoquePorLaboratorio(String lab) {
		this.getEstoque().calcularTotalEstoquePorLaboratorio(lab);
	}

	public void buscarInformacoesDoLaboratorio(String lab) {
		Laboratorio laboratorio = this.getEstoque().buscarInformacoesDoLaboratorio(lab);
		String mensagem = "Informações do laboratório " + lab + ": \n";
		System.out.println(laboratorio != null ? mensagem + laboratorio : mensagem + "Laboratório não encontrado!");
	}
	
	public void buscarInformacoesDoLaboratorio2(String lab) {
		Laboratorio laboratorio = null;
		for(int i = 0; i < this.getEstoque().getRemedios().length; i++) {
			if(this.getEstoque().getRemedios()[i].getLaboratorio().getNome().equalsIgnoreCase(lab)) {
				laboratorio = this.getEstoque().getRemedios()[i].getLaboratorio();
			}
		}
		String mensagem = "Informações do laboratório " + lab + ": \n";
		System.out.println(laboratorio != null ? mensagem + laboratorio : mensagem + "Laboratório não encontrado!");
	}
	
}
