package app;
//CLASSE QUE AGREGA outra classe

import java.util.Random;

//um objeto tem outro objeto (AGREGAÇÃO ^) ligação de losango
//                                      v

public class Luta {
    private Lutador desafiante;
    private Lutador desafiado;
    private int rounds;
    private boolean aprovada;

    public void marcarLuta(Lutador l1, Lutador l2) {
        if (l1.getCategoria() == l2.getCategoria() && l1 != l2) {
            this.aprovada = true;
            desafiante = l2;
            desafiado = l1;
        } else {
            this.aprovada = false;
            desafiante = null;
            desafiado = null;
        }
    }

    public void lutar() {
        if(this.getAprovada()){
            System.out.println("### VS ###");
            this.desafiado.apresentar();
            this.desafiante.apresentar();
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3); // aqui gera 3 resultados (0,1 ou 2) 
            System.out.println("O resultado é:");
            switch(vencedor){
                case 0: //Empate
                    System.out.println("*Empate*");
                    desafiado.empatarLuta();
                    desafiante.empatarLuta();
                    break;
                case 1: //Vitória do desafiado
                    System.out.println(desafiado.getNome() +" *Ganhou*");
                    desafiado.ganharLuta();
                    desafiante.perderLuta();
                    break;
                case 2: //Derrota do desafiante
                    System.out.println(desafiante.getNome() +" *Ganhou*");
                    desafiante.ganharLuta();
                    desafiado.perderLuta();
                    break;
            }   
            System.out.println("\n\n");
        }else{
            System.out.println("Essa luta não pode acontecer!");
        }
    }

    // métodos Especiais
    public Lutador getDesafiante() {
        return this.desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public Lutador getDesafiado() {
        return this.desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public int getRounds() {
        return this.rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean getAprovada() {
        return this.aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
}
