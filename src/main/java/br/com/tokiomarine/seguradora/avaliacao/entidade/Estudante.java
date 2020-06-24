package br.com.tokiomarine.seguradora.avaliacao.entidade;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

public class Estudante {	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private long id;

	@NotNull(message = "Nome é obrigatório")
	@Column(name = "nome")
	private String nome;
	
	@NotNull(message = "Email é obrigatório")
	@Column(name = "email")
	private String email;

	@Column(name = "telefone")
	private String telefone;


	public Estudante () {}
	
	public Estudante (String nome, String email) {
		this.nome = nome;
		this.email = email;
	}
	
	public Estudante (String nome, String email, String telefone) {
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
	}
	
	
	
}
