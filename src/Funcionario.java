public class Funcionario extends Pessoa{

   private String nomeFuncionario, usuarioFuncionario,  emailFuncionario,cpfFuncionario;
   private int   rgFuncionario, senhaFuncionario;


    public Funcionario(String nomeFuncionario, String cpfFuncionario, int rgFuncionario, String usuarioFuncionario, int senhaFuncionario, String emailFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
        this.cpfFuncionario = cpfFuncionario;
        this.rgFuncionario = rgFuncionario;
        this.usuarioFuncionario = usuarioFuncionario;
        this.senhaFuncionario = senhaFuncionario;
        this.emailFuncionario = emailFuncionario;
    }

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

    public String getCpfFuncionario() {
        return cpfFuncionario;
    }

    public void setCpfFuncionario(String cpfFuncionario) {
        this.cpfFuncionario = cpfFuncionario;
    }

    public int getRgFuncionario() {
        return rgFuncionario;
    }

    public void setRgFuncionario(int rgFuncionario) {
        this.rgFuncionario = rgFuncionario;
    }

    public String getUsuarioFuncionario() {
        return usuarioFuncionario;
    }

    public void setUsurioFuncionario(String usuarioFuncionario) {
        this.usuarioFuncionario = usuarioFuncionario;
    }

    public int getSenhaFuncionario() {
        return senhaFuncionario;
    }

    public void setSenhaFuncionario(int senhaFuncionario) {
        this.senhaFuncionario = senhaFuncionario;
    }

    public String getEmailFuncionario() {
        return emailFuncionario;
    }

    public void setEmailFuncionario(String emailFuncionario) {
        this.emailFuncionario = emailFuncionario;
    }


    @Override
    public String toString() {
        return "Funcionario{" +
                "Nome = '" + nomeFuncionario + '\'' +
                ", CPF = '" + cpfFuncionario + '\'' +
                ", RG ='" + rgFuncionario + '\'' +
                ", Usuário ='" + usuarioFuncionario + '\'' +
                ", Senha ='" + senhaFuncionario + '\'' +
                ", Email ='" + emailFuncionario + '\'' +
                '}';
    }
}
