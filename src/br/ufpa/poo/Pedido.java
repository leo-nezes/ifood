package br.ufpa.poo;

import java.util.Date;

public class Pedido {

	private String nome;
	private double valorPedido;
	private double valorFrete;
	private Cliente cliente;
	private boolean chegou;
	private boolean pagou;
	private Date dataPedido;
	
	public Pedido (Cliente cliente, String nomeDoPedido) {
		this.nome = nomeDoPedido;
		this.cliente = cliente;
		this.chegou = false;
		this.pagou = false;
		this.dataPedido = new Date();
	}
	
	public String getNome() {
		return nome;
	}

	public double getValorTotal() {
		return valorPedido + valorFrete;
	}
	
	public double getValorPedido() {
		return valorPedido;
	}

	public double getValorFrete() {
		return valorPedido;
	}

	public void setValorFrete(double valorFrete) {
		this.valorFrete = valorFrete;
	}

	public Cliente getCliente() {
		return cliente;
	}
	
	public Date getDataPedido() {
		return dataPedido;
	}

	public void setDataPedido(Date dataPedido) {
		this.dataPedido = dataPedido;
	}
	
	public void definirValorPedido(double valorPedido) {
		this.valorPedido = valorPedido;
	}

	public boolean statusPagamento() {
		return this.pagou;
	}
	
	public void realizarPagamento() {
		this.pagou=true;
	}
	
	public boolean statusEntrega() {
		return this.chegou;
	}
	
	public void pedidoEntregue() {
		this.chegou = true;
	}
}
