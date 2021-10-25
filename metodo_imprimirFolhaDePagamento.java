public void imprimirFolhaDePagamento() {

        //System.out.println("------------------------ FOLHA DE PAGAMENTO ------------------------");
        System.out.println(" ___________________________________________________________");
        System.out.println("|                                        FOLHA DE PAGAMENTO|");

        System.out.println("|\tFuncionário: " + cartaoPonto.funcionario.nome+" \t\t\t\t   |");
        System.out.println("|\t-------------------------------------------\t   |");

        System.out.println("|\tSalário base: \t\t\t R$ " + cartaoPonto.funcionario.salarioBase + "\t   |");
        System.out.println("|\t-------------------------------------------\t   |");

        System.out.println("|\tHoras extras: " + horasExtras + " \t\t R$  " + acrescimoHorasExtras+"\t   |");
        System.out.println("|\t-------------------------------------------\t   |");

        System.out.println("|\tHoras faltantes: " + horasFaltantes + " \t\t-R$  " + descontoHorasFaltantes+"\t   |");
        System.out.println("|\t-------------------------------------------\t   |");

        System.out.println("|\tDesconto INSS:  \t\t-R$  " + descontoInss+"\t   |");
        System.out.println("|\t-------------------------------------------\t   |");

        System.out.println("|\tSalário bruto: \t\t\t R$ " + salarioBruto+"\t   |");
        System.out.println("|\t-------------------------------------------\t   |");

        System.out.println("|\tSalário líquido: \t\t R$ " + salarioLiquido+"\t   |");        
        //System.out.println("------------------------------------------------------------\n");
        System.out.println("|__________________________________________________________|\n");
        //System.out.println("**********************************************************************\n");
    }
