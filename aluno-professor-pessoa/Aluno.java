public class Aluno extends Pessoa {

    private String curso;
    private int matricula;
    private double notas;

    public Aluno() {}

    
    public Aluno(String nome,
                 int idade,
                 String corDosOlhos,
                 String corDecabelo,
                 double altura,
                 String curso,
                 double notas,
                 int matricula) {

        setNome(nome);
        setIdade(idade);
        setCorDosOlhos(corDosOlhos);
        setCorDeCabelo(corDecabelo);
        setAltura(altura);
        this.curso = curso;
        this.notas = notas;
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double getNotas() {
        return notas;
    }

    public void setNotas(double notas) {
        this.notas = notas;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Curso: " + curso);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Notas: " + notas);
    }
    
    
}