package composite;



public class Graphics {
	public static void main(String[] args) {
		
		
		Imagem imagem = new Imagem();
		imagem.adicionarGrafico(new Retangulo(2, new Linha(3)));
		imagem.adicionarGrafico(new Texto("Olha o tiririca!!!!\n"));
		imagem.adicionarGrafico(new Linha(5));
		imagem.adicionarGrafico(new Linha(15));
		
		
		System.out.println(imagem.desenhar());
	}
}
