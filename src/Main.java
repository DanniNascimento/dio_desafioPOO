public class Main {
    public static void main(String[] args) {
        iPhone meuIphone = new iPhone();

        // Testando o reprodutor musical
        meuIphone.selecionarMusica("A cera");
        meuIphone.tocar();
        meuIphone.pausar();

        // Testando o aparelho telefônico
        meuIphone.ligar("x xxxx-xxxx");
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();

        // Testando o navegador
        meuIphone.exibirPagina("www.google.com");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();
    }
}