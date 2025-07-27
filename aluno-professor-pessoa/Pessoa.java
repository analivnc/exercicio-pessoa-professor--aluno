public class Pessoa {
    private String nome;
    private int idade;
    private String corDecabelo;
    private String corDosOlhos;
    private double altura;

    Pessoa() {
        this.nome = "";
        this.idade = 0;
        this.corDecabelo = "";
        this.corDosOlhos = "";
        this.altura = 0.0;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCorDeCabelo() {
        return corDecabelo;
    }

    public void setCorDeCabelo(String corDecabelo) {
        this.corDecabelo = corDecabelo;
    }

    public String getCorDosOlhos() {
        return corDosOlhos;
    }

    public void setCorDosOlhos(String corDosOlhos) {
        this.corDosOlhos = corDosOlhos;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Cor de cabelo: " + corDecabelo);
        System.out.println("Cor dos olhos: " + corDosOlhos);
        System.out.println("Altura: " + altura);
    }
    
    

    }
