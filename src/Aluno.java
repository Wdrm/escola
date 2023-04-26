
import java.util.Date;

public class Aluno extends Pessoa {
   private String  nomeAluno,  cpfAluno, rgAluno;
    public String matriculaAluno;
    Date dataNasAluno;

    public Aluno(String nomeAluno, String cpfAluno, String rgAluno, String matriculaAluno, Date dataNasAluno) {
        this.nomeAluno = nomeAluno;
        this.cpfAluno = cpfAluno;
        this.rgAluno = rgAluno;
        this.matriculaAluno = matriculaAluno;
        this.dataNasAluno = dataNasAluno;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public String getCpfAluno() {
        return cpfAluno;
    }

    public void setCpfAluno(String cpfAluno) {
        this.cpfAluno = cpfAluno;
    }

    public String getRgAluno() {
        return rgAluno;
    }

    public void setRgAluno(String rgAluno) {
        this.rgAluno = rgAluno;
    }

    public String getMatriculaAluno() {
        return matriculaAluno;
    }

    public void setMatriculaAluno(String matriculaAluno) {
        this.matriculaAluno = matriculaAluno;
    }

    public Date getDataNasAluno() {
        return dataNasAluno;
    }

    public void setDataNasAluno(Date dataNasAluno) {
        this.dataNasAluno = dataNasAluno;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "Aluno = '" + nomeAluno + '\'' +
                ", CPF = '" + cpfAluno + '\'' +
                ", RG = '" + rgAluno + '\'' +
                ", Matricula = '" + matriculaAluno + '\'' +
                ", Data Nascimento = " + dataNasAluno +
                '}';
    }
}
