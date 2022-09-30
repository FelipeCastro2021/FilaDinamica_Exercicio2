package View;

import java.util.Random;

import Controller.Cliente;
import Controller.OperacaoController;
import br.edu.fateczl.filaobj.Fila;

public class Principal {

	public static void main(String[] args) {
		Fila filaObjetos = new Fila();
		Random random = new Random();
		OperacaoController OC = new OperacaoController();
		
		for (int i = 0; i <= 20; i++) {
			filaObjetos.insert(new Cliente("cliente" + i, Math.abs(random.nextInt(30)) + 20, (float) Math.abs(random.nextInt(95)) + 5));
		}
		
		while (!filaObjetos.isEmpty()) {
			OC.caixa(filaObjetos);
		}
	}

}
