package com.efact.bean;

import java.io.Serializable;

public class NoteDebit implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private String contrato; 
	private String grupo;
	private String cupo;
	private String nombreAsociado;
	private String cuota;
	private String mesGrupo;
	private String descripcion;
	private String noAfecto;
	private String afecto;
	private String igv;
	private String subTotal;
	private String penalidad;
    private String resultado;
    
	private int queryGroup;
	private int queryCieId;
	
	public String getContrato() {
		return contrato;
	}
	public void setContrato(String contrato) {
		this.contrato = contrato;
	}
	public String getGrupo() {
		return grupo;
	}
	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}
	public String getCupo() {
		return cupo;
	}
	public void setCupo(String cupo) {
		this.cupo = cupo;
	}
	public String getNombreAsociado() {
		return nombreAsociado;
	}
	public void setNombreAsociado(String nombreAsociado) {
		this.nombreAsociado = nombreAsociado;
	}
	public String getCuota() {
		return cuota;
	}
	public void setCuota(String cuota) {
		this.cuota = cuota;
	}
	public String getMesGrupo() {
		return mesGrupo;
	}
	public void setMesGrupo(String mesGrupo) {
		this.mesGrupo = mesGrupo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getNoAfecto() {
		return noAfecto;
	}
	public void setNoAfecto(String noAfecto) {
		this.noAfecto = noAfecto;
	}
	public String getAfecto() {
		return afecto;
	}
	public void setAfecto(String afecto) {
		this.afecto = afecto;
	}
	public String getIgv() {
		return igv;
	}
	public void setIgv(String igv) {
		this.igv = igv;
	}
	public String getSubTotal() {
		return subTotal;
	}
	public void setSubTotal(String subTotal) {
		this.subTotal = subTotal;
	}
	public String getPenalidad() {
		return penalidad;
	}
	public void setPenalidad(String penalidad) {
		this.penalidad = penalidad;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public int getQueryGroup() {
		return queryGroup;
	}
	public void setQueryGroup(int queryGroup) {
		this.queryGroup = queryGroup;
	}
	public int getQueryCieId() {
		return queryCieId;
	}
	public void setQueryCieId(int queryCieId) {
		this.queryCieId = queryCieId;
	}
	public String getResultado() {
		return resultado;
	}
	public void setResultado(String resultado) {
		this.resultado = resultado;
	}
	
	
    
}