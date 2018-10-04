package ws;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import metier.Compte;

@WebService(serviceName="banqueService")
public class BanquService {
	@WebMethod(operationName="convertEuroToDT")
public double conversation(@WebParam(name="Montant")double mnt) {
	return mnt*3.1;
}
	@WebMethod
public Compte getCompte(@WebParam(name="codeCompte")Long code) {
	return new Compte(code,Math.random()*80000,new Date());
}
	@WebMethod
public List<Compte> getComptes(){
	List<Compte> comptes = new ArrayList<>();
	comptes.add(new Compte(1L,Math.random()*20000,new Date()));
	comptes.add(new Compte(2L,Math.random()*30000,new Date()));
	return comptes;
}
}
