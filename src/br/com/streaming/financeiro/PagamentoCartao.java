package br.com.streaming.financeiro;

public class PagamentoCartao {
    public class PagamentoCarto implements iPagamento {
@Override
        public void efetuarPagamento(double valor) {
        System.out.println("Conectando com a adquirente...");
        System.out.println("Aprovando transação de R$ " + valor + " no Cartão de Crédito.");
        }
    }
}
