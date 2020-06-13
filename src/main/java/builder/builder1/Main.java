package builder.builder1;

import java.util.Date;

import builder.builder1.Usuario.UsuarioBuilder;

/**
 * https://goo.gl/S87PK4
 */
public class Main {
	public static void main(String[] args) {
		UsuarioBuilder builder1 = new UsuarioBuilder("José", "123.456.789-88");
		printUsuario(builder1.build());
		
		UsuarioBuilder builder2 = new UsuarioBuilder("Maria", "222.456.789-88");
		builder2.setEstado("MG");
		builder2.setCidade("Belo Horizonte");
		printUsuario(builder2.build());

		UsuarioBuilder builder3 = new UsuarioBuilder("Pedro", "222.555.789-88");
		builder3.setEstado("SP");
		builder3.setCidade("Campinas");
		builder3.setDataNascimento(new Date());
		builder3.setEndereco("Rua Raul Ferrari");
		builder3.setBairro("Santa Marcelina");
		builder3.setInformacoes("Encontra-se em casa de manhã.");
		printUsuario(builder3.build());
	}

	private static void printUsuario(Usuario usuario) {
		System.out.println();
		System.out.println("nome: " + usuario.getNome());
		System.out.println("cpf: " + usuario.getCpf()); 
		System.out.println("dataNascimento: " + usuario.getDataNascimento());
		System.out.println("endereco: " + usuario.getEndereco());
		System.out.println("bairro: " + usuario.getBairro());
		System.out.println("cidade: " + usuario.getCidade());
		System.out.println("estado: " + usuario.getEstado());
		System.out.println("informacoes: " + usuario.getInformacoes());
		System.out.println();
		
	}
}
