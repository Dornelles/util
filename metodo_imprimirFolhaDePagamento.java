public static void imprimirFolhaDePagamento(FolhaDePagamento folha){
	   //System.out.println("------------------------ FOLHA DE PAGAMENTO ------------------------");
	System.out.println(" ___________________________________________________________");
	System.out.println("|                                        FOLHA DE PAGAMENTO|");

	System.out.println("|\tFuncionário: " + folha.cartaoPonto.funcionario.nome+" \t\t\t\t   |");
	System.out.println("|\t-------------------------------------------\t   |");

	System.out.println("|\tSalário base: \t\t\t R$ " + folha.cartaoPonto.funcionario.salarioBase + "\t   |");
	System.out.println("|\t-------------------------------------------\t   |");

	System.out.println("|\tHoras extras: " + folha.horasExtras + " \t\t R$  " + folha.acrescimoHorasExtras+"\t   |");
	System.out.println("|\t-------------------------------------------\t   |");

	System.out.println("|\tHoras faltantes: " + folha.horasFaltantes + " \t\t-R$  " + folha.descontoHorasFaltantes+"\t   |");
	System.out.println("|\t-------------------------------------------\t   |");

	System.out.println("|\tDesconto INSS:  \t\t-R$  " + folha.descontoInss+"\t   |");
	System.out.println("|\t-------------------------------------------\t   |");

	System.out.println("|\tSalário bruto: \t\t\t R$ " + folha.salarioBruto+"\t   |");
	System.out.println("|\t-------------------------------------------\t   |");

	System.out.println("|\tSalário líquido: \t\t R$ " + folha.salarioLiquido+"\t   |");        
	//System.out.println("------------------------------------------------------------\n");
	System.out.println("|__________________________________________________________|\n");
	//System.out.println("**********************************************************************\n");
}