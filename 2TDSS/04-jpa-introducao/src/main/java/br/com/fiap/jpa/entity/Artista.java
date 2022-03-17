package br.com.fiap.jpa.entity;

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
	
	@Id
	@Column(name="cd_artista")
	@GeneratedValue(generator = "artista", strategy = GenerationType.SEQUENCE )
	private Integer codigo;
	
	@Column(name="nm_artista", length = 50, nullable = false, unique = true)
	private String nome;
	
	@Column(name="dt_nascimento")
	@Temporal(TemporalType.DATE)
	private Calendar dataNascimento;
	
	@Lob
	@Column(name="ft_artista")
	private byte[] foto;
	
	@Enumerated(EnumType.STRING)
	@Column(name="ds_genero_musical", nullable=false)
	private GeneroMusica genero;
	
	@Column(name="st_cantor" , length = 50)
	private Boolean isCantor;
	
	@Column(name="st_musico")
	private Boolean isMusico;
	
	@Column(name="nr_musicas")
	private Integer qtdMusicas;
	
	@Transient
	private Integer idade;
	

}
