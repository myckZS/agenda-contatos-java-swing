package Entidades;

/**
 * Classe que representa um contato na agenda.
 * Contém as informações: nome, telefone, email e se é favorito.
 * @author Maicon
 */
public class Contato {
    private String nome;
    private String telefone;
    private String email;
    private boolean favorito;

    public Contato(String nome, String telefone, String email, boolean favorito) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.favorito = favorito;
    }
    
    // Getters e Setters
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isFavorito() {
        return favorito;
    }

    public void setFavorito(boolean favorito) {
        this.favorito = favorito;
    }

    @Override
    public String toString() {
        return nome;
    }
    
}
