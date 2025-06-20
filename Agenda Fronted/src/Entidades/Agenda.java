package Entidades;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe que representa uma agenda de contatos.
 * Permite adicionar, editar, remover e buscar contatos.
 * @author Maicon
 */
public class Agenda {
    private List<Contato> contatos;

    public Agenda() {
        contatos = new ArrayList<>();
    }
    
    /* Adiciona o contato à lista. */
    public void adicionarContato(Contato contato) {
        contatos.add(contato);
    }
    
    /* Edita o contato no índice informado. */  
    public void editarContato(int i, Contato contatoAtualizado) {
        contatos.set(i, contatoAtualizado);
    }
    
    /* Remove o contato no índice informado. */
    public void removerContato(int i) {
        contatos.remove(i);
    }
    
    /* Alterna o favorito de um contato pelo índice. */
    public void alternarFavorito(int i) {
        Contato contato = contatos.get(i);
        contato.setFavorito(!contato.isFavorito()); // Alterna o estado de favorito
    }
    
    
    /* Retorna todos os contatos. */
    public List<Contato> getContatos() {
        return contatos;
    }

    /* Retorna apenas favoritos */
    public List<Contato> getFavoritos() {
        List<Contato> favoritos = new ArrayList<>();
        for (Contato c : contatos) {
            if (c.isFavorito()) {
                favoritos.add(c);
            }
        }
        return favoritos;
    }
    
    /* Busca contatos por nome (parcial) */
    /* Retorna uma lista com os que contêm o texto no nome */
    public List<Contato> buscarContatos(String texto) {
        List<Contato> resultado = new ArrayList<>();
        for (Contato c : contatos) {
            if (c.getNome().toLowerCase().contains(texto.toLowerCase())) {
                resultado.add(c);
            }
        }
        return resultado;
    }
    
}
