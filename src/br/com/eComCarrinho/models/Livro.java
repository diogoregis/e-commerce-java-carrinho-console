package br.com.eComCarrinho.models;

public class Livro extends Produto{
    private String sinopse;
    public Livro(String nome, String marca, double preco, String sinopse) {
        super(nome, marca, preco);
        this.sinopse = sinopse;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public void resumo(){
        System.out.println("Essa obra conta: ");
        System.out.println(this.getSinopse());
    }

    @Override
    public String toString() {
        return "Livro{" + "nome= " + getNome() + " editora= " + getMarca() +
                " sinopse='" + sinopse + '\'' +
                '}';
    }
}
