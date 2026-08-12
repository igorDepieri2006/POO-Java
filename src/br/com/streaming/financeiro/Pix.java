package br.com.streaming.financeiro;

public class Pix {
    public class PagamentoPix implements iPagamento {
    @Override
        public void efetuarPagamento(double valor) {
        System.out.println("Gerando chave PIX Copia e Cola...");
        System.out.println("Aguardando transferência de R$ " + valor + ".");
        }
    }
}
