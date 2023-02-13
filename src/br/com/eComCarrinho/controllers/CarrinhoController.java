    package br.com.eComCarrinho.controllers;

    import br.com.eComCarrinho.models.Item;
    import br.com.eComCarrinho.models.Produto;
    import br.com.eComCarrinho.repository.ICarrinhoRepository;
    import br.com.eComCarrinho.tools.Tools;

    import java.util.ArrayList;
    import java.util.List;

    public class CarrinhoController implements ICarrinhoRepository {
        private static final CarrinhoController CARRINHO = new CarrinhoController();
        private CarrinhoController(){};
        public static CarrinhoController getInstance(){
            return CARRINHO;
        }
        private static List<Item> items = new ArrayList<Item>();

        @Override
        public void colocarProdutoCarrinho(Item item) {

            if(verificarSeExisteItemCarrinho(item)){
                int index = procurarItemPorNome(item);
                items.get(index).setQuantidade(items.get(index).getQuantidade() + item.getQuantidade());
                System.out.println("Carrinho atualizado");
            } else {
                if(items.add(item)){
                    System.out.println("Produto ADD carrinho");
                } else {
                    System.out.println("Erro ao add no carrinho");
                }
            }

        }

        @Override
        public void retirarProdutoCarrinho(Item item) {
            if(items.remove(item)){
                System.out.println(item.getNomeProduto() + " Foi removido do carrinho");
            } else {
                System.out.println("Erro ao remover item");
            }
        }

        @Override
        public void esvaziarCarrinho() {
            items.clear();
            System.out.println("Carrinho vazio");
        }

        @Override
        public int totalItensCarrinho() {
            int totalitens = 0;
            for (Item it: items) {
                totalitens++;
            }
            return totalitens;
        }
        @Override
        public double totalValorCarrinho() {
            double totalCarrinho = 0.0;

            for(Item it: items){
                totalCarrinho += it.getValorTotal();
            }
            return totalCarrinho;
        }
        @Override
        public Item criarItem(Produto produto, int quantidade) {
            return new Item(produto, quantidade);
        }

        @Override
        public void verCarrinhoAtual() {

            if(verificaCarrinhoVazio()){
                System.out.println(">>> O CARRINHO ESTÁ VAZIO <<<");
            } else {
                System.out.println(">>> COMO ESTÁ SEU CARRINHO AGORA <<<");
                System.out.println(" -------------------------------------- ");
                for(Item it : items){
                    System.out.print("[ " + it + " ]");
                    System.out.println(" ");
                }
                System.out.println("                        [ TOTAL " + Tools.precoFormata(totalValorCarrinho()) + " ]");
            }

        }

        @Override
        public boolean verificaCarrinhoVazio() {
            if(items.isEmpty()){
                return true;
            } else {
                return false;
            }
        }

        @Override
        public int procurarItemPorNome(Item item) {
            int encontrado = 0, cont = 0;
            if(item != null){
                for(Item it : items){
                    if(it.getNomeProduto().toUpperCase().equals(item.getNomeProduto().toUpperCase())){
                        encontrado = cont;
                        break;
                    }
                    cont++;
                }
                return encontrado;
            } else {
                return encontrado;
            }
        }

        @Override
        public boolean verificarSeExisteItemCarrinho(Item item) {
            if(procurarItemPorNome(item) == 0){
                return false;
            } else {
                return true;
            }

        }
    }
