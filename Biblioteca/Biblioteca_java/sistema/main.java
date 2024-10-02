package sistema;
public class main {
    public static void Main(String[] args) {
        biblioteca biblioteca = new biblioteca();

        // Criando alguns livros e usuários
        livro livro1 = new livro("Dom Quixote", "Miguel de Cervantes");
        livro livro2 = new livro("1984", "George Orwell");

        usuario usuario1 = new usuario("Alice", 1);
        usuario usuario2 = new usuario("Bob", 2);

        // Adicionando livros à biblioteca
        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);

        // Cadastrando usuários
        biblioteca.cadastrarUsuario(usuario1);
        biblioteca.cadastrarUsuario(usuario2);

        // Listando livros disponíveis
        System.out.println("\nLista de Livros:");
        biblioteca.listarLivros();

        // Emprestando um livro
        System.out.println("\nEmprestando Livros:");
        biblioteca.emprestarLivro("1984", 1);

        // Tentando emprestar o mesmo livro novamente
        biblioteca.emprestarLivro("1984", 2);

        // Listando livros após empréstimo
        System.out.println("\nLista de Livros Atualizada:");
        biblioteca.listarLivros();
    }
    
    
}

