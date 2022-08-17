package parte7.exercicioBonusList;

public class TestaGaragem {

	public static void main(String[] args) {
		Carro clio = new Carro("Clio Autenthic");
		Carro argo = new Carro("Argo");
		Carro ka = new Carro("Ka");
		
		Garagem gar = new Garagem("garagem legal", "rua deis! num 10", 5);
		gar.estaciona(clio);
		gar.estaciona(argo);
		gar.estaciona(ka);
		
		Carro estacionado = gar.retira(1);
		gar.estaciona(new Carro("Fusca"));
		System.out.println(estacionado.getNome());
	}

}
