package parte7.exercicioBonusVet;

public class Garagem {
	//Atributos: 
	private final String nome;
	private final String endereco;
	private final int qtdeVagas;
	private final Carro[] carrosEstacionados; //associacao entre classes
	private int qtdeCarros;
	// Construtor:
	// -com nome, endereco e qtdeVagas recebidos por parâmetro;
	public Garagem(String nome, String endereco, int qtdeVagas) {
		this.qtdeVagas = qtdeVagas;
		this.endereco = endereco;
		this.nome=nome;
		this.carrosEstacionados = new Carro[this.qtdeVagas];
		this.qtdeCarros = 0;
	}
	public String getNome() {
		return this.nome;
	}
	public String getEndereco() {
		return this.endereco;
	}
	public int getQtdeVagas() {
		return this.getQtdeVagas();
	}
	//-estaciona(Carro c): estaciona um carro, desde que parado e desligado, adicionando na próxima
//posicao do vetor vaga (pode ser necessário uma variável para controlar quantos carros estão
//estacionados - assim como você utilizou a quantidade de notas de um Estudante, em exercício
//anterior); Retorna true se conseguiu estacionar e false caso não tenha conseguido estacionar o carro
//(por exemplo quando a garagem está cheia ou o carro não está parado e desligado)
	public boolean estaciona(Carro c) {
		if(this.qtdeCarros<this.qtdeVagas &&
				c.getVelocidade()==0 &&
				c.isLigado()==false) {
		
			this.carrosEstacionados[this.qtdeCarros] = c;
			this.qtdeCarros++;
			return true;
		} else {
			return false;
		}
	}
//-retira(int pos): retira um carro do estacionamento na posição (do vetor) passada por parâmetro.
//Deve retornar o carro retirado do vetor ou null caso não tenha carro na posiao passada por
//parâmetro.
	public Carro retira(int pos) {
		Carro retorno =null;
		if(pos<0 || pos>= this.qtdeCarros) {
			throw new IllegalArgumentException("posição inválida");
		}
		retorno = this.carrosEstacionados[pos];
		for(int i=pos+1;i<this.qtdeCarros; i++) {
			this.carrosEstacionados[i-1] = this.carrosEstacionados[i];
		}
		this.qtdeCarros--;
		return retorno;
	}
//-getVagas(): retorna quantas vagas ainda existem disponíveis no estacionamento 
	public int getVagas() {
		return this.qtdeVagas- this.qtdeCarros;
	}	
}