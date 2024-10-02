package sistema;

public class usuario {
    private String nome;
    private int id;

    public usuario(String nome, int id) {
        this.nome = nome;
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Usuário: " + nome + " | ID: " + id;
    }
}

