public class Main {
    public static void main(String[] args) throws Exception {

        // Criando os herois
        Heroi Superman = new Heroi("Superman", "DC comics", 100, 70, "Clark Kent");

        // testando heroi criado
        System.out.printf("O heroi chamado %s da editora %s possui o real nome de %s", Superman.getNome(),
                Superman.getEditora(), Superman.getNomeReal());

        // Adicionadno Poderes

        Poder fSuperman = new Poder("Força", 10, 8);
        Poder Visao_Superman = new Poder("Visão de Raios", 5, 5);
        Poder Sopro_Superman = new Poder("SuperSopro", 4, 4);

        Superman.AdicionarPoder(fSuperman);
        Superman.AdicionarPoder(Sopro_Superman);
        Superman.AdicionarPoder(Visao_Superman);

        Heroi Homem_Aranha = new Heroi("Homem-Aranha", "Marvel Comics", 80, 50, "Peter Parker");

        Poder fHomem_aranha = new Poder("Força", 7, 5);
        Poder SoltarTeia = new Poder("Soltar Teia", 5, 5);

        Homem_Aranha.AdicionarPoder(fHomem_aranha);
        Homem_Aranha.AdicionarPoder(SoltarTeia);

        Heroi Fenix = new Heroi("Fênix", "Marvel Comics", 150, 100, "Jean Grey");

        Poder fFenix = new Poder("Força", 12, 10);

        Fenix.AdicionarPoder(fFenix);

        // Adicionando Viões

        Vilao Superbizarro = new Vilao("Superbizarro", "DC Comics", 95, 65, 50);

        Poder fSuperbizarro = new Poder("Força", 10, 8);
        Poder Visao_Bizzaro = new Poder("Visao de Raios", 5, 5);
        Poder Sopro_Bizzaro = new Poder("Supersopro", 4, 4);

        Superbizarro.AdicionarPoder(fSuperbizarro);
        Superbizarro.AdicionarPoder(Sopro_Bizzaro);
        Superbizarro.AdicionarPoder(Visao_Bizzaro);

        Vilao Duende_Verde = new Vilao("Duende Verde", "Marvel Comics", 80, 60, 70);

        Poder fDuende = new Poder("Força", 7, 5);
        Poder Granada = new Poder("Granada de Abóbora", 5, 5);

        Duende_Verde.AdicionarPoder(fDuende);
        Duende_Verde.AdicionarPoder(Granada);

        Vilao Doutor_Octopus = new Vilao("Doutor Octopus", "Marvel Comics", 40, 40, 40);

        Poder Tentaculos = new Poder("Tentáculos", 6, 4);

        Doutor_Octopus.AdicionarPoder(Tentaculos);
    }
}
