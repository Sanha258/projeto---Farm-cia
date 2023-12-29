package farmacia;

public class ProgramaFarmacia {

	public static void main(String[] args) {

		Endereco endLegrand = new Endereco("Rua dos Remédios", 100, "Centro", "Palhoça", "Santa Catarina");
		Laboratorio legrand = new Laboratorio("Legrand", "12,345,678/0001-11", endLegrand);
		
		Endereco endMedley = new Endereco("Rua da Medicação", 200, "Estreito", "Florianópolis", "Santa Catarina");
		Laboratorio medley = new Laboratorio("Medley", "12,345,678/0001-22", endMedley);
		
		Remedio rosuvas = new Remedio("Rosuvas", 55.00, legrand);
		Remedio glifage = new Remedio("Glifage", 35.00, legrand);
		Remedio araDois = new Remedio("Aradois H", 50.00, legrand);
		Remedio trandilax = new Remedio("Trandilax", 10.00, legrand);
		
		Remedio rosuvastatina = new Remedio("Rosuvastatina", 50.00, medley);
		Remedio lexotan = new Remedio("Lexotan", 40.00, medley);
		Remedio losartana = new Remedio("Losartana", 45.00, medley);
		Remedio torsilax = new Remedio("Torsilax", 15.00, medley);

		Remedio[] listaRemedios = {rosuvas, rosuvas, rosuvas, rosuvas, glifage, glifage, glifage, araDois, araDois, trandilax, 
				rosuvastatina, lexotan, lexotan, losartana, losartana, losartana, torsilax, torsilax, torsilax, torsilax};
		
		Estoque estoque = new Estoque("Luciano", listaRemedios);
		
		Endereco endFarmacia = new Endereco("Rua Jardim Silva", 360, "Centro", "Florianópolis", "Santa Catarina");
		Farmacia farmacia = new Farmacia("Farmácia do Senac", "12,345,678/0001-33", endFarmacia, estoque);
		
		//3-A
		farmacia.informarNomeDoResponsavelPeloEstoque();
		
		//3-B
		farmacia.calcularTotalEstoque();
		
		//3-C
		farmacia.calcularTotalEstoquePorLaboratorio("Legrand");
		
		//3-D
		farmacia.buscarInformacoesDoLaboratorio("Medley");
		farmacia.buscarInformacoesDoLaboratorio2("Cimed");
	}

}
