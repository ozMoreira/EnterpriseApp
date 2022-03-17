package br.com.fiap.jpa.entity;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name="TB_MUSICA")
		//name-> nome no Java (@GeneratedValue), sequenceName -> nome no banco, incremento 
@SequenceGenerator(name="musica", sequenceName = "SQ_TB_MUSICA", allocationSize = 1)
public class Musica {

	@Id //Define que o atributo é PK
	@Column(name="cd_musica")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "musica")
	private Integer codigo;
	
	@Column(name="nm_musica", length = 50, nullable = false, unique = true) //nullable -> pode ser nulo?
	private String nome;
	
	@Temporal(TemporalType.DATE) //Define que será gravado somente a data no banco
	@Column(name="dt_lancamento", nullable = false)
	private Calendar dataLancamento;
	
	@Column(name="vl_duracao")
	private Float duracao;
	
	@Column(name="nm_album", nullable = false, length = 40)
	private String album;
	
	@Column(name="st_instrumental")
	private Boolean instrumental;
	
	@Column(name="dt_cadastro", updatable = false) //updatable -> será atualizado?
	private LocalDate dataCadastro;
	
	@Column(name="vl_faturamento", precision = 11, scale = 2)
	private BigDecimal faturamento;
	
	@Transient //Idade não será um campo na tabela
	private Integer idade;
	
	@Lob //Define um campo do tipo blob, para arquivos
	@Column(name="fl_capa_album")
	private byte[] capaAlbum;
	
	//@Enumerated(EnumType.STRING) //Será gravado o texto ao invés da posição da constante
	@Column(name="ds_genero", length = 20)
	private GeneroMusica genero;

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

	public Calendar getDataLancamento() {
		return dataLancamento;
	}

	public void setDataLancamento(Calendar dataLancamento) {
		this.dataLancamento = dataLancamento;
	}

	public Float getDuracao() {
		return duracao;
	}

	public void setDuracao(Float duracao) {
		this.duracao = duracao;
	}

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	public Boolean getInstrumental() {
		return instrumental;
	}

	public void setInstrumental(Boolean instrumental) {
		this.instrumental = instrumental;
	}

	public LocalDate getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(LocalDate dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public BigDecimal getFaturamento() {
		return faturamento;
	}

	public void setFaturamento(BigDecimal faturamento) {
		this.faturamento = faturamento;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public byte[] getCapaAlbum() {
		return capaAlbum;
	}

	public void setCapaAlbum(byte[] capaAlbum) {
		this.capaAlbum = capaAlbum;
	}

	public GeneroMusica getGenero() {
		return genero;
	}

	public void setGenero(GeneroMusica genero) {
		this.genero = genero;
	}
	
}