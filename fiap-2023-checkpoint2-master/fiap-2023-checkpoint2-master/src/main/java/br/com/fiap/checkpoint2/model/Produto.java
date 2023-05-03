package br.com.fiap.checkpoint2.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table (name = "produtos")
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column (name = "codigo_produto")
	private Long codigo_produto;
	
	@Column (name = "nome")
	private String nome;
	
	@Column (name = "preco")
	private double preco;
	
	@Column (name = "data_validade")
	private Date data_validade;
	
	@Column (name = "data_garantia")
	private Date data_garantia;
	
	@Column (name = "em_estoque")
	private boolean em_estoque;

	public Long getCodigo_produto() {
		return codigo_produto;
	}

	public void setCodigo_produto(Long codigo_produto) {
		this.codigo_produto = codigo_produto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public Date getData_validade() {
		return data_validade;
	}

	public void setData_validade(Date data_validade) {
		this.data_validade = data_validade;
	}

	public Date getData_garantia() {
		return data_garantia;
	}

	public void setData_garantia(Date data_garantia) {
		this.data_garantia = data_garantia;
	}

	public boolean isEm_estoque() {
		return em_estoque;
	}

	public void setEm_estoque(boolean em_estoque) {
		this.em_estoque = em_estoque;
	}

	

}
