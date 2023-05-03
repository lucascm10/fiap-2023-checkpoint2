package br.com.fiap.checkpoint2.model;

import java.text.DateFormat;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pedidos")
public class Pedido {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "numero_pedido")
	private Long numero_pedido;
	
	@Column(name = "codigo_cliente")
	private Long codigo_cliente;
	
	@Column(name = "data_pedido")
	private Date  data_pedido;

	public Long getCodido_pedido() {
		return numero_pedido;
	}

	public void setCodido_pedido(Long codido_pedido) {
		this.numero_pedido = codido_pedido;
	}

	public Long getCodigo_cliente() {
		return codigo_cliente;
	}

	public void setCodigo_cliente(Long codigo_cliente) {
		this.codigo_cliente = codigo_cliente;
	}

	public Long getNumero_pedido() {
		return numero_pedido;
	}

	public void setNumero_pedido(Long numero_pedido) {
		this.numero_pedido = numero_pedido;
	}

	public Date getData_pedido() {
		return data_pedido;
	}

	public void setData_pedido(Date data_pedido) {
		this.data_pedido = data_pedido;
	}


	
	
}
