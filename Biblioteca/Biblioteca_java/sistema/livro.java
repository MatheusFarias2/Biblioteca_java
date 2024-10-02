package sistema;

public class livro {
    private String titulo;
    private String autor;
    private boolean disponivel;

    public livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponivel = true; // Livro começa como disponível
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    @Override
    public String toString() {
        return "Livro: " + titulo + " | Autor: " + autor + " | Disponível: " + (disponivel ? "Sim" : "Não");
    }
}
