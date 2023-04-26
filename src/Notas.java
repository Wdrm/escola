import java.util.Stack;


public class Notas extends Pessoa{


    public void primeiroTrimeste (){
        Stack<Disciplina> d1 = new Stack<>();
       Disciplina disciplina = ( d1.push(new Disciplina(1.5,14.3,7.5,8.3,7.6,7.8)));
        System.out.println("Notas 1° Trimestre: "+d1);
       disciplina.mediaTrimestre();



    }
    public void segundoTrimeste(){
        Stack<Disciplina> d2 = new Stack<>();
        Disciplina disciplina = ( d2.push(new Disciplina(1.5,1.3,3.5,8.3,7.6,7.8)));
        System.out.println("Notas 2° Trimestre: "+d2);
        disciplina.mediaTrimestre();

            }

    public void terceiroTrimeste(){
        Stack<Disciplina> d3 = new Stack<>();
        Disciplina disciplina = ( d3.push(new Disciplina(1.1,2.3,3.5,8.3,7.6,5.8)));
        System.out.println("Notas 3° Trimestre: "+d3);
        disciplina.mediaTrimestre();

    }

}
