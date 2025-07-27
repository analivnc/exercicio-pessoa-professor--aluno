public class Professor extends Pessoa {
 
    private String disciplina;
    private String materia;

    public String getDisciplina(){
        return disciplina;
    }

    public void setDisciplina(String disciplina){
        this.disciplina = disciplina;
    }

    public String getMateria(){
        return materia;
    }
    
    public void setMateria(String materia){
        this.materia = materia;
    
    }

     @Override
    public void exibirInformacoes(){
        super.exibirInformacoes(); 
        System.out.println("Disciplina: " + disciplina);
        System.out.println("Materia: " + materia);

    }

}