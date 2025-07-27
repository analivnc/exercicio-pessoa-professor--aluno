public class Principal {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        System.out.println("==== Pessoa ====\n");
        pessoa.setNome("Ana");
        pessoa.setIdade(17);
        pessoa.setCorDosOlhos("Castanhos");
        pessoa.setCorDeCabelo("Castanho claro");
        pessoa.setAltura(1.57);
     

        pessoa.exibirInformacoes();

        System.out.println("\n==== Aluno ====");
        Aluno aluno = new Aluno();
        aluno.setNome("Livia");
        aluno.setIdade(17);
        aluno.setCorDosOlhos("Castanho");
        aluno.setCorDeCabelo("Rosa");
        aluno.setAltura(1.57);
        aluno.setCurso("IOT");
        aluno.setMatricula(102989828); 
        aluno.setNotas(8.75);  
          

        aluno.exibirInformacoes();

      
        System.out.println("\n==== Professor ====");
        Professor professor = new Professor();
        professor.setNome("Mariana");
        professor.setIdade(35);
        professor.setCorDosOlhos("Azuis");
        professor.setCorDeCabelo("Loiro");
        professor.setAltura(1.65);
        professor.setDisciplina("Geografia");
        professor.setMateria("Relevo");

        professor.exibirInformacoes();
     
      }
}