package parte10.interfaces;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class TestaTela {
	public static void main(String[] args) {
		
		//cria um Frame com o título
		JFrame janela = new JFrame("Exemplo figuras geométricas");
		
		//configura tamanho
		janela.setSize(1000, 400);
		
		//deixa ela visivel (mostra)
		janela.setVisible(true);
		
		//para fechar a janela
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
//		//janela esta vazia, necessitamos colocar conteúdo
		Desenhavel[] elementos = {new Quadrado(120), new Quadrado(150), 
				new Retangulo(150,100), new Retangulo(250,150)};
//		
		Tela painel = new Tela(elementos);
//		
		janela.add(painel);
		
	}
}
