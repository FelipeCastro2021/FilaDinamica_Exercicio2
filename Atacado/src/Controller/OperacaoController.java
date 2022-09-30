package Controller;

import java.text.DecimalFormat;

import br.edu.fateczl.filaobj.Fila;

public class OperacaoController {

	public OperacaoController() {
	}

	public void caixa(Fila fila) {
		try {
			Cliente cliente = (Cliente) fila.remove();
			cliente.valorPecas = (float) (cliente.QuantidadePecas * cliente.valorPecas);
			
			System.out.println("Nome do cliente: " + cliente.nome + 
					"\nValor total do cliente: " + new DecimalFormat("####.00").format(cliente.valorPecas));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
