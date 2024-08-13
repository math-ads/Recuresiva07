package view;
import controller.NumerosPares;
public class Principal {
public static void main(String[] args) {
	NumerosPares numPar = new NumerosPares();
		int soma = 0;
		int Vet[]= {1,6,7,8,9};
		int tamanho= Vet.length-1;
		int resp = numPar.Pares(soma, Vet,  tamanho);
		System.out.println(resp);
	}

}

