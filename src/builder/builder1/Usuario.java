package builder.builder1;

import java.util.Date;

public class Usuario {

	// atributos obrigatórios
    private String nome;
    private String cpf; 
    
    // atributos opcionais
    private Date dataNascimento;
    private String endereco;
    private String bairro;
    private String cidade;
    private String estado;
    private String informacoes;
    
    private Usuario(UsuarioBuilder builder) {
    	this.setNome(builder.nome);
    	this.setCpf(builder.cpf);
    	this.setDataNascimento(builder.dataNascimento);
    	this.setEndereco(builder.endereco);
    	this.setBairro(builder.bairro);
    	this.setCidade(builder.cidade);
    	this.setEstado(builder.estado);
    	this.setInformacoes(builder.informacoes);
    }

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getInformacoes() {
		return informacoes;
	}

	public void setInformacoes(String informacoes) {
		this.informacoes = informacoes;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public static class UsuarioBuilder{
		
	    private String nome;
	    private String cpf; 
	    private Date dataNascimento;
	    private String endereco;
	    private String bairro;
	    private String cidade;
	    private String estado;
	    private String informacoes;
		
		public UsuarioBuilder(String nome, String cpf) {
			this.nome = nome;
			this.cpf = cpf;
		}

		public UsuarioBuilder setDataNascimento(Date dataNascimento) {
			this.dataNascimento = dataNascimento;
			return this;
		}

		public UsuarioBuilder setEndereco(String endereco) {
			this.endereco = endereco;
			return this;
		}

		public UsuarioBuilder setBairro(String bairro) {
			this.bairro = bairro;
			return this;
		}

		public UsuarioBuilder setCidade(String cidade) {
			this.cidade = cidade;
			return this;
		}

		public UsuarioBuilder setEstado(String estado) {
			this.estado = estado;
			return this;
		}

		public UsuarioBuilder setInformacoes(String informacoes) {
			this.informacoes = informacoes;
			return this;
		}
		
		public Usuario build() {
			return new Usuario(this);
		}
	}
}
