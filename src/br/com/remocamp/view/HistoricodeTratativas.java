/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.remocamp.view;

import br.com.remocamp.controller.PlantaoController;
import br.com.remocamp.controller.RemocaoController;
import java.util.Date;

/**
 *
 * @author fabiano
 */
public class HistoricodeTratativas extends javax.swing.JInternalFrame {
    int numero;
    /**
     * Creates new form HistoricodeTratativas
     */
    public HistoricodeTratativas(Object obj,int numero) {
        initComponents();
        this.numero = numero;
        lbNumeroCampo.setText(this.numero+"");
        lbTipoCampo.setText(obj.getClass().getName().replace("br.com.remocamp.view.Formulario", ""));
        
        if(lbTipoCampo.getText().equals("Plantao")){
            PlantaoController clt = new PlantaoController();
            txtAreaHistorico.setText(clt.getHistorico(this.numero));
        }else if(lbTipoCampo.getText().equals("Remocao")){
            RemocaoController clt = new RemocaoController();
            txtAreaHistorico.setText(clt.getHistorico(this.numero));
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelTratativa = new javax.swing.JPanel();
        scrollPaneTratativa = new javax.swing.JScrollPane();
        txtAreaTratativa = new javax.swing.JTextArea();
        btnInserirTratativa = new javax.swing.JButton();
        lbTipo = new javax.swing.JLabel();
        lbNumero = new javax.swing.JLabel();
        lbNumeroCampo = new javax.swing.JLabel();
        lbTipoCampo = new javax.swing.JLabel();
        panelTXTArea = new javax.swing.JPanel();
        scrollPaneTxtArea = new javax.swing.JScrollPane();
        txtAreaHistorico = new javax.swing.JTextArea();
        btnAnexos = new javax.swing.JButton();

        setClosable(true);
        setTitle("Histórico de Tratativas");

        panelTratativa.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtAreaTratativa.setColumns(20);
        txtAreaTratativa.setRows(5);
        scrollPaneTratativa.setViewportView(txtAreaTratativa);

        btnInserirTratativa.setText("Inserir Tratativa");
        btnInserirTratativa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserirTratativaActionPerformed(evt);
            }
        });

        lbTipo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbTipo.setText("Tipo:");

        lbNumero.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbNumero.setText("Nº:");

        javax.swing.GroupLayout panelTratativaLayout = new javax.swing.GroupLayout(panelTratativa);
        panelTratativa.setLayout(panelTratativaLayout);
        panelTratativaLayout.setHorizontalGroup(
            panelTratativaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTratativaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelTratativaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollPaneTratativa, javax.swing.GroupLayout.DEFAULT_SIZE, 689, Short.MAX_VALUE)
                    .addGroup(panelTratativaLayout.createSequentialGroup()
                        .addGroup(panelTratativaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnInserirTratativa)
                            .addGroup(panelTratativaLayout.createSequentialGroup()
                                .addComponent(lbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(lbTipoCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lbNumero)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbNumeroCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelTratativaLayout.setVerticalGroup(
            panelTratativaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTratativaLayout.createSequentialGroup()
                .addGroup(panelTratativaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lbNumeroCampo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbNumero)
                    .addComponent(lbTipoCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbTipo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(scrollPaneTratativa, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnInserirTratativa)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        txtAreaHistorico.setColumns(20);
        txtAreaHistorico.setRows(5);
        scrollPaneTxtArea.setViewportView(txtAreaHistorico);

        javax.swing.GroupLayout panelTXTAreaLayout = new javax.swing.GroupLayout(panelTXTArea);
        panelTXTArea.setLayout(panelTXTAreaLayout);
        panelTXTAreaLayout.setHorizontalGroup(
            panelTXTAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollPaneTxtArea, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        panelTXTAreaLayout.setVerticalGroup(
            panelTXTAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTXTAreaLayout.createSequentialGroup()
                .addComponent(scrollPaneTxtArea, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        btnAnexos.setText("Anexos");
        btnAnexos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnexosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelTXTArea, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelTratativa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnAnexos)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelTratativa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelTXTArea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAnexos)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInserirTratativaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirTratativaActionPerformed
        txtAreaHistorico.append(" " + new Date()+ " : "+ txtAreaTratativa.getText()+"\n\n");
        
        if(lbTipoCampo.getText().equals("Plantao")){
            PlantaoController clt = new PlantaoController();
            clt.updateHistico(txtAreaHistorico.getText(), numero);
        }else if(lbTipoCampo.getText().equals("Remocao")){
            RemocaoController clt = new RemocaoController();
            clt.updateHistico(txtAreaHistorico.getText(), numero);
        }
    }//GEN-LAST:event_btnInserirTratativaActionPerformed

    private void btnAnexosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnexosActionPerformed
       FileView view = new FileView(lbTipoCampo.getText(),numero);
       Principal.desktopPane.add(view).setLocation(85, 0);
       view.setVisible(true);
    }//GEN-LAST:event_btnAnexosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnexos;
    private javax.swing.JButton btnInserirTratativa;
    private javax.swing.JLabel lbNumero;
    private javax.swing.JLabel lbNumeroCampo;
    private javax.swing.JLabel lbTipo;
    private javax.swing.JLabel lbTipoCampo;
    private javax.swing.JPanel panelTXTArea;
    private javax.swing.JPanel panelTratativa;
    private javax.swing.JScrollPane scrollPaneTratativa;
    private javax.swing.JScrollPane scrollPaneTxtArea;
    private javax.swing.JTextArea txtAreaHistorico;
    private javax.swing.JTextArea txtAreaTratativa;
    // End of variables declaration//GEN-END:variables
}
