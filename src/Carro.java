public class Carro {
    String modelo;
    int ano;
    String cor;

    void exibeFichaTecnicaCarro() {
        System.out.println("Modelo do carro: "+modelo);
        System.out.println("Ano do carro: "+ano);
        System.out.println("Cor do carro: "+cor);
    }

    int calculaIdadeCarro() {
        return 2024 - ano;
    }

}
