package br.com.streaming.financeiro;

public class Boleto {
    public class PagamentoBoleto implements iPagamento {
    @Override
        public void efetuarPagamento(double valor) {
        System.out.println("Registrando boleto no banco...");
        System.out.println("Boleto gerado no valor de R$ " + valor + ". Vencimento em 3 dias.");
        }
    }
}
