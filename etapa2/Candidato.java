package etapa2;

public class Candidato {
    private String nome;
    private String partido;
    private int intencoesVotos;

    // construtor
    public Candidato(String nome, String partido, int intencoesVotos) {
        this.nome = nome;
        this.partido = partido;
        this.intencoesVotos = intencoesVotos;
    }

    // getters
    public String getNome() {
        return nome;
    }

    public String getPartido() {
        return partido;
    }

    public int getIntencoesVotos() {
        return intencoesVotos;
    }

    // setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPartido(String partido) {
        this.partido = partido;
    }

    public void setIntencoesVotos(int intencoesVotos) {
        this.intencoesVotos = intencoesVotos;
    }

    // toString
    @Override
    public String toString() {
        return "Candidato [nome=" + nome + ", partido=" + partido + ", intencoesVotos=" + intencoesVotos + "]";
    }

}