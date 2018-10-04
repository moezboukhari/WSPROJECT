package metier;

import java.io.Serializable;
import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
@XmlRootElement(name="compte")
@XmlAccessorType(XmlAccessType.FIELD)//pour utliser les annotaions de jaxb sur les champs 
//et non pas sur les getters
public class Compte implements Serializable{
	public Compte() {
		super();
		// TODO Auto-generated constructor stub
	}
	private Long code;
	public Compte(Long code, double solde, Date datCreation) {
		super();
		this.code = code;
		this.solde = solde;
		this.datCreation = datCreation;
	}
	public Long getCode() {
		return code;
	}
	public void setCode(Long code) {
		this.code = code;
	}
	public double getSolde() {
		return solde;
	}
	public void setSolde(double solde) {
		this.solde = solde;
	}
	
	public Date getDatCreation() {
		return datCreation;
	}
	public void setDatCreation(Date datCreation) {
		this.datCreation = datCreation;
	}
	private double solde;
	@XmlTransient//ignor
	private Date datCreation;

}
