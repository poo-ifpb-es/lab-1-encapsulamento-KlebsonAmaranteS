public class Estudante {
    private String nome;
    private int matricula;

    public int Estudante(String nome, int matricula){
        this.nome = nome;
        this.matricula = matricula;
        return matricula;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public int getMatricula(){
        return this.matricula;
    }
    public void setMatricula(int matricula){
        this.matricula = matricula; 
    }
}