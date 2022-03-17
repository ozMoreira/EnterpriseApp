package br.com.fiap.jpa.entity;

import java.time.LocalDate;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.Transient;
import javax.persistence.TemporalType;

@Entity
@Table(name = "TB_ARTISTA")
@SequenceGenerator(name="artista", sequenceName = "SQ_TB_ARTISTA", allocationSize = 1)
public class Artista {
	
	public Artista() {}
	
	public Artista(String nome, LocalDate dataNascimento, byte[] foto, GeneroMusica genero, Boolean isCantor,
			Boolean isMusico, Integer qtdMusicas) {
		super();
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.foto = foto;
		this.genero = genero;
		this.isCantor = isCantor;
		this.isMusico = isMusico;
		this.qtdMusicas = qtdMusicas;
	}

	@Id
	@Column(name="cd_artista")
	@GeneratedValue(generator = "artista", strategy = GenerationType.SEQUENCE )
	private Integer codigo;
	
	@Column(name="nm_artista", length = 50, nullable = false, unique = true)
	private String nome;
	
	@Column(name="dt_nascimento")
	//@Temporal(TemporalType.DATE)
	private LocalDate dataNascimento;
	
	@Lob
	@Column(name="ft_artista")
	private byte[] foto;
	
	@Enumerated(EnumType.STRING)
	@Column(name="ds_genero_musical", length = 40, nullable=false)
	private GeneroMusica genero;
	
	@Column(name="st_cantor" , length = 50)
	private Boolean isCantor;
	
	@Column(name="st_musico")
	private Boolean isMusico;
	
	@Column(name="nr_musicas")
	private Integer qtdMusicas;
	
	@Transient
	private Integer idade;

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public byte[] getFoto() {
		return foto;
	}

	public void setFoto(byte[] foto) {
		this.foto = foto;
	}

	public GeneroMusica getGenero() {
		return genero;
	}

	public void setGenero(GeneroMusica genero) {
		this.genero = genero;
	}

	public Boolean getIsCantor() {
		return isCantor;
	}

	public void setIsCantor(Boolean isCantor) {
		this.isCantor = isCantor;
	}

	public Boolean getIsMusico() {
		return isMusico;
	}

	public void setIsMusico(Boolean isMusico) {
		this.isMusico = isMusico;
	}

	public Integer getQtdMusicas() {
		return qtdMusicas;
	}

	public void setQtdMusicas(Integer qtdMusicas) {
		this.qtdMusicas = qtdMusicas;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	
	
	

}
