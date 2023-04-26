public class Disciplina extends Notas{

    public double portugues,matematica,historia,geografia,ingles,edFisica;


    public Disciplina(double portugues, double matematica, double historia, double geografia, double ingles, double edFisica) {
        this.portugues = portugues;
        this.matematica = matematica;
        this.historia = historia;
        this.geografia = geografia;
        this.ingles = ingles;
        this.edFisica = edFisica;
    }



    public double getPortugues() { return portugues; }
   public void setPortugues(double portugues) { this.portugues = portugues;}
    public double getMatematica() { return matematica;}
    public void setMatematica(double matematica) {this.matematica = matematica;}
    public double getHistoria() { return historia;}
    public void setHistoria(double historia) { this.historia = historia;}
    public double getGeografia() { return geografia;}
    public void setGeografia(double geografia) {this.geografia = geografia;}
    public double getIngles() { return ingles;}
    public void setIngles(double ingles) {this.ingles = ingles;}
    public double getEdFisica() { return edFisica;}
    public void setEdFisica(double edFisica) {this.edFisica = edFisica;}

    @Override
    public String toString() {
        return "Disciplina{" +
              "Portugues = " + portugues +
              ", Matemática = " + matematica +
              ", Historia = " + historia +
              ", Geografia = " + geografia + ", Ingles = " + ingles +
               ", Educação Física = " + edFisica +
            '}';

    }

    public void mediaTrimestre(){

        double media =  (portugues+matematica+historia+geografia+ingles+edFisica)/6;
        System.out.printf("%.2f",media);
        if(media>=7){
            System.out.println(" Aprovado ");
        }else{
            System.out.println(" Reprovado ");
        }
    }
}




