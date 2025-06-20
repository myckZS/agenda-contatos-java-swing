package Fronted;

import Entidades.Contato;
import Entidades.Agenda;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * Classe Principal
 * Responsável por gerenciar a interface gráfica da agenda de contatos.
 * Permite adicionar, editar, remover e visualizar contatos, além de buscar por nome.
 * Também possui funcionalidades para marcar contatos como favoritos e visualizar apenas os favoritos.
 * @author Maicon
 */
public class Principal extends javax.swing.JFrame {
    
    private Agenda agenda;
    private DefaultTableModel tableModel;
    
    public Principal() {
        initComponents();
        agenda = new Agenda();
        tableModel = (DefaultTableModel)tableContatos.getModel();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_Principal = new javax.swing.JPanel();
        jScrollPane_ListaContatos = new javax.swing.JScrollPane();
        tableContatos = new javax.swing.JTable();
        jPanel_Botoes = new javax.swing.JPanel();
        botaoAdicionar = new javax.swing.JButton();
        botaoEditar = new javax.swing.JButton();
        botaoRemover = new javax.swing.JButton();
        botaoFavorito = new javax.swing.JButton();
        botaoVerFavoritos = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        labelTotalContatos = new javax.swing.JLabel();
        jPanel_Busca = new javax.swing.JPanel();
        txtBusca = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        botaoBuscar = new javax.swing.JButton();
        botaoVoltar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuArquivo = new javax.swing.JMenu();
        itemSair = new javax.swing.JMenuItem();
        menuAjuda = new javax.swing.JMenu();
        itemSobre = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Agenda de Contatos");
        setSize(new java.awt.Dimension(800, 600));

        jPanel_Principal.setBorder(javax.swing.BorderFactory.createTitledBorder("CONTATOS"));

        jScrollPane_ListaContatos.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane_ListaContatos.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        tableContatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Telefone", "Email", "Favorito"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane_ListaContatos.setViewportView(tableContatos);

        jPanel_Botoes.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel_Botoes.setPreferredSize(new java.awt.Dimension(97, 258));

        botaoAdicionar.setText("Adicionar");
        botaoAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAdicionarActionPerformed(evt);
            }
        });

        botaoEditar.setText("Editar");
        botaoEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoEditarActionPerformed(evt);
            }
        });

        botaoRemover.setText("Remover");
        botaoRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoRemoverActionPerformed(evt);
            }
        });

        botaoFavorito.setText("★");
        botaoFavorito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoFavoritoActionPerformed(evt);
            }
        });

        botaoVerFavoritos.setText("Favoritos");
        botaoVerFavoritos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVerFavoritosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_BotoesLayout = new javax.swing.GroupLayout(jPanel_Botoes);
        jPanel_Botoes.setLayout(jPanel_BotoesLayout);
        jPanel_BotoesLayout.setHorizontalGroup(
            jPanel_BotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_BotoesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_BotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_BotoesLayout.createSequentialGroup()
                        .addGroup(jPanel_BotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator2)
                            .addComponent(botaoAdicionar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botaoRemover, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botaoEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botaoFavorito, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(botaoVerFavoritos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel_BotoesLayout.setVerticalGroup(
            jPanel_BotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_BotoesLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(botaoVerFavoritos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botaoAdicionar)
                .addGap(18, 18, 18)
                .addComponent(botaoEditar)
                .addGap(18, 18, 18)
                .addComponent(botaoRemover)
                .addGap(18, 18, 18)
                .addComponent(botaoFavorito)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        labelTotalContatos.setText("Total: 0 Contatos");

        jPanel_Busca.setBorder(javax.swing.BorderFactory.createTitledBorder("🔎 Busca"));

        jLabel1.setText("Nome:");

        botaoBuscar.setText("Buscar");
        botaoBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoBuscarActionPerformed(evt);
            }
        });

        botaoVoltar.setText("Voltar");
        botaoVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_BuscaLayout = new javax.swing.GroupLayout(jPanel_Busca);
        jPanel_Busca.setLayout(jPanel_BuscaLayout);
        jPanel_BuscaLayout.setHorizontalGroup(
            jPanel_BuscaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_BuscaLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtBusca)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botaoBuscar)
                .addGap(12, 12, 12)
                .addComponent(botaoVoltar)
                .addContainerGap())
        );
        jPanel_BuscaLayout.setVerticalGroup(
            jPanel_BuscaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_BuscaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_BuscaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(botaoVoltar)
                    .addComponent(botaoBuscar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel_PrincipalLayout = new javax.swing.GroupLayout(jPanel_Principal);
        jPanel_Principal.setLayout(jPanel_PrincipalLayout);
        jPanel_PrincipalLayout.setHorizontalGroup(
            jPanel_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_PrincipalLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jPanel_Botoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_PrincipalLayout.createSequentialGroup()
                        .addComponent(labelTotalContatos, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel_Busca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane_ListaContatos, javax.swing.GroupLayout.DEFAULT_SIZE, 651, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel_PrincipalLayout.setVerticalGroup(
            jPanel_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_PrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_PrincipalLayout.createSequentialGroup()
                        .addComponent(jPanel_Busca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane_ListaContatos, javax.swing.GroupLayout.DEFAULT_SIZE, 438, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(labelTotalContatos))
                    .addGroup(jPanel_PrincipalLayout.createSequentialGroup()
                        .addComponent(jPanel_Botoes, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        menuArquivo.setText("Arquivo");

        itemSair.setText("Sair");
        itemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemSairActionPerformed(evt);
            }
        });
        menuArquivo.add(itemSair);

        jMenuBar1.add(menuArquivo);

        menuAjuda.setText("Ajuda");

        itemSobre.setText("Sobre");
        itemSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemSobreActionPerformed(evt);
            }
        });
        menuAjuda.add(itemSobre);

        jMenuBar1.add(menuAjuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel_Principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel_Principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // Ações do Menu 
    
    private void itemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemSairActionPerformed
        int opcao = JOptionPane.showConfirmDialog(this,
                "Deseja realmente sair da aplicação?",
                "Confirmação",
                JOptionPane.YES_NO_OPTION
        );

        if (opcao == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_itemSairActionPerformed

    private void itemSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemSobreActionPerformed
        JOptionPane.showMessageDialog(this,
                "Agenda de Contatos v1.0\n\nDesenvolvido por: Maicon\nDisciplina: Programação I",
                "Sobre o Sistema",
                JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_itemSobreActionPerformed

    // Ações dos Botões 

    private void botaoVerFavoritosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVerFavoritosActionPerformed
        /* Abre a janela DialogFavoritos para visualizar os contatos favoritos. */
        
        List<Contato> favoritos = agenda.getFavoritos();
        
        if (favoritos.isEmpty()) {
            JOptionPane.showMessageDialog(this,
                    "Nenhum contato marcado como favorito.",
                    "Aviso",
                    JOptionPane.INFORMATION_MESSAGE
            );
            return;
        }
        
        DialogFavoritos dialogFavoritos = new DialogFavoritos(this, favoritos, agenda.getFavoritos().size());
        dialogFavoritos.setVisible(true);
    }//GEN-LAST:event_botaoVerFavoritosActionPerformed

    private void botaoAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAdicionarActionPerformed
        /* Abre a janela DialogContato para criar um novo contato. */
        
        DialogContato dialogContato = new DialogContato(this, null); 
        dialogContato.setVisible(true);

        if (dialogContato.isContatoSalvo()) {
            Contato novo = dialogContato.getContato();
            agenda.adicionarContato(novo);
            atualizarTabela(agenda.getContatos());
        }
    }//GEN-LAST:event_botaoAdicionarActionPerformed
    
    private void botaoRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoRemoverActionPerformed
        /* Remove o contato selecionado da tabela. */
        
        int linha = obterLinhaSelecionada();
        
        if (linha > -1) {
            int opcao = JOptionPane.showConfirmDialog(this,
                    "Deseja realmente remover este contato?",
                    "Confirmação",
                    JOptionPane.YES_NO_OPTION
            );

            if (opcao == JOptionPane.YES_OPTION) {
                agenda.removerContato(linha);
                atualizarTabela(agenda.getContatos());
            }
        }
    }//GEN-LAST:event_botaoRemoverActionPerformed

    private void botaoEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEditarActionPerformed
        /* Abre a janela DialogContato para editar um contato existente. */

        int linha = obterLinhaSelecionada();
        
        if (linha > -1) {
            Contato contatoSelecionado = agenda.getContatos().get(linha);

            DialogContato dialogContato = new DialogContato(this, contatoSelecionado); 
            dialogContato.setVisible(true);

            if (dialogContato.isContatoSalvo()) {
                agenda.editarContato(linha, dialogContato.getContato());
                atualizarTabela(agenda.getContatos());
            }
        }
    }//GEN-LAST:event_botaoEditarActionPerformed

    private void botaoFavoritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoFavoritoActionPerformed
        /* Adiciona ou remove o contato selecionado dos favoritos. */
        
        int linha = obterLinhaSelecionada();
        
        if (linha > -1) {
            agenda.alternarFavorito(linha); 
            atualizarTabela(agenda.getContatos());
        }
    }//GEN-LAST:event_botaoFavoritoActionPerformed

    private void botaoBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoBuscarActionPerformed
        /* Mostra na tabela principal apenas os contatos que atendem ao critério de busca. */
        
        String textoBusca = txtBusca.getText().trim();

        if (textoBusca.isEmpty()) {
            JOptionPane.showMessageDialog(this,
                    "Digite um nome para buscar.",
                    "Aviso",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        List<Contato> resultado = agenda.buscarContatos(textoBusca);

        if (resultado.isEmpty()) {
            JOptionPane.showMessageDialog(this,
                    "Nenhum contato encontrado com este nome.",
                    "Resultado da busca",
                    JOptionPane.INFORMATION_MESSAGE);
        }

        atualizarTabela(resultado);
        
        bloquearBotoesEdicao(true);
    }//GEN-LAST:event_botaoBuscarActionPerformed

    private void botaoVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVoltarActionPerformed
        /* Volta a exibir todos os contatos na tabela principal */
 
        atualizarTabela(agenda.getContatos());
        txtBusca.setText(""); // Apaga o texto do campo de busca.
        bloquearBotoesEdicao(false);
    }//GEN-LAST:event_botaoVoltarActionPerformed

    // Métodos Auxiliares 
    
    /* Preenche a tabela de contatos com as informações de cada contato */
    /* e atualiza o label com o total de contatos. */
    private void atualizarTabela(List<Contato> lista) {
        tableModel.setRowCount(0); // Limpa a tabela
        
        for (Contato c : lista) {
            Object[] linha = {
                c.getNome(), 
                c.getTelefone(), 
                c.getEmail(), 
                c.isFavorito() ? "★" : ""
            };
            tableModel.addRow(linha);
        }
        
        labelTotalContatos.setText("Total: " + lista.size() + " Contatos"); 
    }
    
    /* Retorna o contato da linha selecionada na tabela */
    /* ou -1 se nenhuma linha estiver selecionada. */
    private int obterLinhaSelecionada() {
        int linha = tableContatos.getSelectedRow();
        
        if (linha == -1) {
            JOptionPane.showMessageDialog(this,
                    "Selecione um contato",
                    "Aviso",
                    JOptionPane.WARNING_MESSAGE
            );
        }
        return linha;
    }
    
    /* Bloqueia/Desbloqueia os botões editar, remover e favoritar. */
    private void bloquearBotoesEdicao(boolean bloquear) {
        botaoEditar.setEnabled(!bloquear);
        botaoRemover.setEnabled(!bloquear);
        botaoFavorito.setEnabled(!bloquear);
    }


    // main
    public static void main(String args[]) {
      
        try {
            javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Principal().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoAdicionar;
    private javax.swing.JButton botaoBuscar;
    private javax.swing.JButton botaoEditar;
    private javax.swing.JButton botaoFavorito;
    private javax.swing.JButton botaoRemover;
    private javax.swing.JButton botaoVerFavoritos;
    private javax.swing.JButton botaoVoltar;
    private javax.swing.JMenuItem itemSair;
    private javax.swing.JMenuItem itemSobre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel_Botoes;
    private javax.swing.JPanel jPanel_Busca;
    private javax.swing.JPanel jPanel_Principal;
    private javax.swing.JScrollPane jScrollPane_ListaContatos;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel labelTotalContatos;
    private javax.swing.JMenu menuAjuda;
    private javax.swing.JMenu menuArquivo;
    private javax.swing.JTable tableContatos;
    private javax.swing.JTextField txtBusca;
    // End of variables declaration//GEN-END:variables
}
