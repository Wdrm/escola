
public class FiliacaoAluno extends Pessoa{
String nomePai, nomeMae,contatoPai,contatoMae,cpfPai, cpfMae, rgPai,rgMae;

    public FiliacaoAluno(String nomePai, String nomeMae, String contatoPai, String contatoMae, String cpfPai,
                         String cpfMae, String rgPai, String rgMae) {
        this.nomePai = nomePai;
        this.nomeMae = nomeMae;
        this.contatoPai = contatoPai;
        this.contatoMae = contatoMae;
        this.cpfPai = cpfPai;
        this.cpfMae = cpfMae;
        this.rgPai = rgPai;
        this.rgMae = rgMae;
    }

    public String getNomePai() { return nomePai; }
    public void setNomePai(String nomePai) { this.nomePai = nomePai; }
    public String getNomeMae() { return nomeMae;}
    public void setNomeMae(String nomeMae) { this.nomeMae = nomeMae;}
    public String getContatoPai() { return contatoPai;}
    public void setContatoPai(String contatoPai) { this.contatoPai = contatoPai;}
    public String getContatoMae() { return contatoMae;}
    public void setContatoMae(String contatoMae) { this.contatoMae = contatoMae;}
    public String getCpfPai() { return cpfPai;}
    public void setCpfPai(String cpfPai) { this.cpfPai = cpfPai;}
    public String getCpfMae() { return cpfMae;}
    public void setCpfMae(String cpfMae) { this.cpfMae = cpfMae;}
    public String getRgPai() { return rgPai;}
    public void setRgPai(String rgPai) { this.rgPai = rgPai;}

    public String getRgMae() { return rgMae;}
    public void setRgMae(String rgMae) { this.rgMae = rgMae;}

    @Override
    public String toString() {
        return "FiliacaoAluno{" +
                "Pai = '" + nomePai + '\'' +
                ", Mae = '" + nomeMae + '\'' +
                ", Contato Pai = '" + contatoPai + '\'' +
                ", Contato Mae = '" + contatoMae + '\'' +
                ", CPF Pai = '" + cpfPai + '\'' +
                ", CPF Mae = '" + cpfMae + '\'' +
                ", RG Pai = '" + rgPai + '\'' +
                ", RG Mae = '" + rgMae + '\'' +
                '}';
    }
}
