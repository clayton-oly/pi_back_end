package com.nsg.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_produtos")
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotNull(message = "O campo nome deve ser preenchido")
	@Size(min = 3, max = 255, message = "O nome deve ter no mínimo 3 e no máximo 255 caracteres")
	private String nome;

	@NotNull(message = "O campo descrição deve ser preenchido")
	@Size(min = 10, max = 500, message = "A descrição deve ter no mínimo 10 e no máximo 500 caracteres")
	private String descricao;

	@JsonFormat(shape = JsonFormat.Shape.STRING)
	@NotNull(message = "Preço é obrigatório!")
	@Positive(message = "O preço deve ser maior do que zero!")
	private BigDecimal preco;

	@NotNull(message = "O campo tipo deve ser preenchido como mídia física ou digital")
	@Size(min = 6, max = 255, message = "O tipo deve ter no mínimo 6 e no máximo 255 caracteres")
	private String tipo;

	@NotNull(message = "O campo classificação indicativa deve ser preenchido")
	@Size(min = 2, max = 255, message = "A classificação indicativa deve ter no mínimo 2 e no máximo 255 caracteres")
	private String classInd;

	@NotNull(message = "O campo console deve ser preenchido")
	@Size(min = 2, max = 255, message = "O console deve ter no mínimo 2 e no máximo 255 caracteres")
	private String console;

	private String foto;

	@UpdateTimestamp
	private LocalDateTime dataProduto;

	@ManyToOne
	@JsonIgnoreProperties("produto")
	private Categoria categoria;
	
	@ManyToOne
	@JsonIgnoreProperties("produto")
	private Usuario usuario;
	
	
	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getClassInd() {
		return classInd;
	}

	public void setClassInd(String classInd) {
		this.classInd = classInd;
	}

	public String getConsole() {
		return console;
	}

	public void setConsole(String console) {
		this.console = console;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public LocalDateTime getDataProduto() {
		return dataProduto;
	}

	public void setDataProduto(LocalDateTime dataProduto) {
		this.dataProduto = dataProduto;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

}
