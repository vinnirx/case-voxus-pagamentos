package br.com.vinnirx.casevoxus.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

import com.sun.istack.Nullable;


@Entity
public class PagamentoDomain {

	@Id
	private String id;
	
	@Size(min = 5, max = 100,  message = "O título deve conter entre 5 e 100 caracteres !")
	@NotNull(message="O campo título é obrigatório !")
	private String titulo;
	
	@NotNull(message="O campo valor deve ter decimal !")
	private double valor;
	
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "y-M-d")
	private Date data;
	
	@Nullable
	private double taxaExterna;
	
	@Nullable
	private String comentario;
	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
		setTaxaExterna();
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public double getTaxaExterna() {
		return taxaExterna;
	}

	public void setTaxaExterna() {
		this.taxaExterna = valor * 0.05 ;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	
	
    
}
