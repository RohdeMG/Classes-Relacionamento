package app;


public class Lutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empate;



    public Lutador(String no, String na, int id, float al, float pe, int vi, int de, int em) {
        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.setAltura(al);
        this.setPeso(pe);
        this.vitorias = vi;
        this.derrotas = de;
        this.empate = em;
    }

    // *** métodos somente para mostrar alguma info
    public void apresentar(){
        System.out.println("================================");
        System.out.println("O lutador é: "+ this.getNome());
        System.out.println("Sua nacionalidade: "+ this.getNacionalidade());
        System.out.println("Idade: "+ this.getIdade());
        System.out.println("Altura: "+ this.getAltura());
        System.out.println("Peso: "+ this.getPeso() +"Kg");
        System.out.println("Vitórias: "+ this.getVitorias());
        System.out.println("Derrotas: "+ this.getDerrotas());
        System.out.println("Empates: "+ this.getEmpate());
        System.out.println("=================================");
    } 
    public void status(){
        System.out.println(this.getNome() +" é do peso ---> " + this.getCategoria() + " <---");
        System.out.println("Vitórias: " + this.getVitorias());
        System.out.println("Derrotas: " + this.getDerrotas());
        System.out.println("Empates: " + this.getEmpate());
    }
    // *** métodos somente para mostrar alguma info 
    public void ganharLuta(){
        this.setVitorias(this.getVitorias() + 1);
    }
    public void perderLuta(){
        this.setDerrotas(this.getDerrotas() + 1);
    }
    public void empatarLuta(){
        this.setEmpate(this.getEmpate() + 1);
    }
    



    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return this.nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return this.altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return this.peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }



    public String getCategoria() {
        return this.categoria;
    }

    private void setCategoria() {
        if(this.peso < 52.2){
            this.categoria = "Inválida";
        }else if (this.peso <= 70.3) {
            this.categoria = "Peso Leve";
        }else if(this.peso <= 83.9) {
            this.categoria = "Peso Médio";
        }else if(this.peso <= 120.2) {
            this.categoria = "Peso Pesado";
        }else{
            this.categoria = "Inválida";
        }
    }



    public int getVitorias() {
        return this.vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return this.derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpate() {
        return this.empate;
    }

    public void setEmpate(int empate) {
        this.empate = empate;
    }



    

   

}