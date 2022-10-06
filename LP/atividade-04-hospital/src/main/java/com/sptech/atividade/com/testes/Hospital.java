package com.sptech.atividade.com.testes;

/**
 *
 * @author rafae
 */
public class Hospital {

    private String nome;
    private Integer quantidadeDePagamentos;
    private Integer quantidadeDeHoraExtra;

    public Hospital(String nome) {
        this.nome = nome;
        this.quantidadeDePagamentos = 0;
        this.quantidadeDeHoraExtra = 0;
    }

    public String getNome() {
        return nome;
    }

    public Integer getQuantidadeDePagamentos() {
        return quantidadeDePagamentos;
    }

    public Integer getQuantidadeDeHoraExtra() {
        return quantidadeDeHoraExtra;
    }

    public void realizarPagamento(Medico medico, Double valorPago) {
        if (medico == null || valorPago == null) {
            System.out.println("#ERRO: MEDICO OU VALOR SAO NULOS");
        } else if (!medico.getAtivo()) {
            System.out.println("#ERRO: O MÉDICO PRECISA ESTAR ATIVO PARA FUNCIONAR");
        } else if (valorPago <= 0) {
            System.out.println("#ERRO: O VALOR PAGO DEVE SER MAIOR QUE 0");
        } else {
            System.out.println("Pagamento realizado com sucesso");
            medico.setSalario(valorPago);
            quantidadeDePagamentos++;
        }

    }

    public void realizarPagamento(Medico medico, Double valorPago, Double horaExtra) {
        if (medico == null || valorPago == null) {
            System.out.println("#ERRO: MEDICO OU VALOR SAO NULOS");
        } else if (!medico.getAtivo()) {
            System.out.println("#ERRO: O MÉDICO PRECISA ESTAR ATIVO PARA FUNCIONAR");
        } else if (valorPago <= 0) {
            System.out.println("#ERRO: O VALOR PAGO DEVE SER MAIOR QUE 0");
        } else if (horaExtra == null || horaExtra <= 0) {
            System.out.println("#ERRO: HORA EXTRA NÃO DEVE SER NULL E DEVE SER MAIOR QUE 0");
        } else {
            System.out.println("Pagamento realizado com sucesso");
            medico.setSalario(valorPago + horaExtra);
            quantidadeDePagamentos++;
            quantidadeDeHoraExtra++;
        }
    }

    public void desligarMedico(Medico medico) {
        if (medico == null) {
            System.out.println("#ERRO: MEDICO NÃO PODE SER NULL");
        } else if (!medico.getAtivo()) {
            System.out.println("#ERRO: O MÉDICO PRECISA ESTAR ATIVO PARA SER DESLIGADO");
        } else {
            medico.setAtivo(false);
            System.out.println("Médico desativado com sucesso");
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Hospital{");
        sb.append("nome=").append(nome);
        sb.append(", quantidadeDePagamentos=").append(quantidadeDePagamentos);
        sb.append(", quantidadeDeHoraExtra=").append(quantidadeDeHoraExtra);
        sb.append('}');
        return sb.toString();
    }

}
