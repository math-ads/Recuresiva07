package controller;

public class NumerosPares {

	public NumerosPares() {
		super();}
	
	public int Pares(int soma, int Vet[],int tamanho) {
		if(tamanho<0) {
			return soma;
		} else {
			if ((Vet[tamanho]%2)== 0 ) {
				return Pares(soma + 1, Vet, tamanho-1);

			}else { 
				
				return Pares(soma, Vet, tamanho-1);

			}
		}
	}
}
