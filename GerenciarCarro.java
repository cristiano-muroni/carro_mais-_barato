package com.fatec;

public class GerenciarCarro {

    public static void main(String[] args) {
        Carro carro = new Carro();
        Carro produto[] = new Carro[7];
        produto[0] = new Carro("chassi", 800.00);
        produto[1] = new Carro("Lamborguini", 1000000.00);
        produto[2] = new Carro("Jipe", 46000.00);
        produto[3] = new Carro("Opala comodoro", 19500.00);
        produto[4] = new Carro("Smart", 4500000.00);
        produto[5] = new Carro("Fusca", 17000.00);
        produto[6] = new Carro("ferrari", 2000000.00);

        int maisBarato = 0;
        for (int atual = 0; atual <= 6; atual++){
            if (produto[atual].getPreco() < produto[maisBarato].getPreco()){
                maisBarato = atual;
                System.out.println("mais barato até o momento= " + produto[maisBarato].getNome());

            }

    }

        System.out.println("O carro = " + produto[maisBarato].getNome()+" é o mais barato e custa: "+ produto[maisBarato].getPreco());
    }
}
