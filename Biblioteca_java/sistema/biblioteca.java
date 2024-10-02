package sistema;

import java.util.ArrayList;

public class biblioteca {
    private ArrayList<livro> livros;
    private ArrayList<usuario> usuarios;

    public biblioteca() {
        this.livros = new ArrayList<>();
        this.usuarios = new ArrayList<>();
    }

    public void adicionarLivro(livro livro) {
        livros.add(livro);
        System.out.println("Livro adicionado: " + livro.getTitulo());
    }

    public void cadastrarUsuario(usuario usuario) {
        usuarios.add(usuario);
        System.out.println("Usuário cadastrado: " + usuario.getNome());
    }

    public void emprestarLivro(String tituloLivro, int idUsuario) {
        livro livro = buscarLivro(tituloLivro);
        usuario usuario = buscarUsuario(idUsuario);

        if (livro != null && usuario != null && livro.isDisponivel()) {
            livro.setDisponivel(false);
            System.out.println("Livro " + tituloLivro + " emprestado para " + usuario.getNome());
        } else if (livro == null) {
            System.out.println("Livro não encontrado.");
        } else if (usuario == null) {
            System.out.println("Usuário não encontrado.");
        } else {
            System.out.println("Livro não está disponível.");
        }
    }

    private livro buscarLivro(String titulo) {
        for (livro livro : livros) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                return livro;
            }
        }
        return null;
    }

    private usuario buscarUsuario(int id) {
        for (usuario usuario : usuarios) {
            if (usuario.getId() == id) {
                return usuario;
            }
        }
        return null;
    }

    public void listarLivros() {
        for (livro livro : livros) {
            System.out.println(livro);
        }
    }
}

