public class Atleta {

    public String nome;
    private String dataNascimento;
    private String cpf;
    private String melhorTempo;
    public int quantidadeParticipacoes;

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getMelhorTempo() {
        return melhorTempo;
    }

    public void setMelhorTempo(String melhorTempo) {
        this.melhorTempo = melhorTempo;
    }
}
