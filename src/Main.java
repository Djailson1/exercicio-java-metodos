

public class Main {

    public static void main(String[] args) {
        //Calculadora
        // calcule as 4 operações básicas. sempre 2 valores devem ser passados
        System.out.println("Exercício calculadora");
        Calculadora.soma(4,9);
        Calculadora.subtracao(6,16.1);
        Calculadora.divisao(3,9);
        Calculadora.multiplicacao(3,15.3);


        // Mensagem
        // a partir da hora do dia, informe a hora do dia adequada: Bom dia, boa tarde e boa noite.
        System.out.println("Exercício mensagem");
        Mensagem.obterMensagem(9);
        Mensagem.obterMensagem(14);
        Mensagem.obterMensagem(1);

        //Empréstimo
        // calcule o valor final de um empréstimo, a partir do valor slicitado. Taxas e parcelas
        //influenciam arbitrariamente as faixas que influenciam nos valores.
        System.out.println("Exercício empréstimo");
        Emprestimo.calcular(1000,Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000,Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000,5);



    }



}
