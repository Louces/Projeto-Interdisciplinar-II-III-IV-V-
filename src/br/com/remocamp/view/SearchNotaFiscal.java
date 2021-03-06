/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.remocamp.view;

import br.com.remocamp.controller.NotaFiscalController;
import br.com.remocamp.model.CellRenderer;
import br.com.remocamp.model.NotaFiscal;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;

/**
 *
 * @author fabiano
 */
public class SearchNotaFiscal extends javax.swing.JInternalFrame {

    /**
     * Creates new form SearchNotaFiscal
     */
    private NotaFiscalController controller = new NotaFiscalController();
    private DefaultTableModel tabelaModelo;
    private  TableCellRenderer tcr;
    
    public SearchNotaFiscal() {
        initComponents();
        dateChooserInicio.setEnabled(false);
        dateChooserFim.setEnabled(false);
        configTable();
        tabelaInicial();
        lbnumeroNotas.setText("Nº notas fiscais cadastradas : " + tabelaConsultaNotaFiscal.getRowCount());
    }

    public final void tabelaInicial(){
         tabelaModelo = controller.selectNotaFiscalAll(tabelaModelo);
     }
    
    public void eraseTable() {
        if (tabelaModelo.getRowCount() > 0) {
            for (int i = tabelaModelo.getRowCount() - 1; i > -1; i--) {
                tabelaModelo.removeRow(i);
            }
        }
    }
    
    private void configTable(){
    
        tabelaConsultaNotaFiscal.setModel(new DefaultTableModel(new Object[][]{}, new String[]{"Nº Nota", "Razão Social", "Data de Emissão"}) {

            @Override
            public boolean isCellEditable(int row, int col) {
                return false;
            }

        });
        tabelaModelo = (DefaultTableModel) tabelaConsultaNotaFiscal.getModel();
        tcr = new CellRenderer();
        
        for(int i=0; i< tabelaConsultaNotaFiscal.getColumnCount() ; i++){
            TableColumn column =  tabelaConsultaNotaFiscal.getColumnModel().getColumn(i);
            column.setCellRenderer(tcr);
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

        panelPesquisa = new javax.swing.JPanel();
        btnPesquisar = new javax.swing.JButton();
        txtPesquisa = new javax.swing.JTextField();
        lbRazaoSocial = new javax.swing.JLabel();
        dateChooserInicio = new com.toedter.calendar.JDateChooser();
        dateChooserFim = new com.toedter.calendar.JDateChooser();
        checkBoxHabilitar = new javax.swing.JCheckBox();
        panelTable = new javax.swing.JPanel();
        scrollPaneTable = new javax.swing.JScrollPane();
        tabelaConsultaNotaFiscal = new javax.swing.JTable();
        lbnumeroNotas = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Consulta Nota Fiscal");

        panelPesquisa.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Pesquisa"));

        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        lbRazaoSocial.setText("Razão Social :");

        dateChooserInicio.setBorder(javax.swing.BorderFactory.createTitledBorder("Inicio"));

        dateChooserFim.setBorder(javax.swing.BorderFactory.createTitledBorder("Fim"));

        checkBoxHabilitar.setText("Habilitar");
        checkBoxHabilitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxHabilitarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelPesquisaLayout = new javax.swing.GroupLayout(panelPesquisa);
        panelPesquisa.setLayout(panelPesquisaLayout);
        panelPesquisaLayout.setHorizontalGroup(
            panelPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPesquisaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPesquisaLayout.createSequentialGroup()
                        .addComponent(dateChooserInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(dateChooserFim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(checkBoxHabilitar))
                    .addGroup(panelPesquisaLayout.createSequentialGroup()
                        .addComponent(lbRazaoSocial)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(156, Short.MAX_VALUE))
        );
        panelPesquisaLayout.setVerticalGroup(
            panelPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPesquisaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbRazaoSocial, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(panelPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(checkBoxHabilitar)
                    .addComponent(dateChooserInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateChooserFim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        panelTable.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tabelaConsultaNotaFiscal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabelaConsultaNotaFiscal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaConsultaNotaFiscalMouseClicked(evt);
            }
        });
        scrollPaneTable.setViewportView(tabelaConsultaNotaFiscal);

        javax.swing.GroupLayout panelTableLayout = new javax.swing.GroupLayout(panelTable);
        panelTable.setLayout(panelTableLayout);
        panelTableLayout.setHorizontalGroup(
            panelTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollPaneTable)
        );
        panelTableLayout.setVerticalGroup(
            panelTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollPaneTable, javax.swing.GroupLayout.DEFAULT_SIZE, 475, Short.MAX_VALUE)
        );

        lbnumeroNotas.setText("Nº notas fiscais cadastradas : ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(lbnumeroNotas)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(panelPesquisa, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(panelTable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbnumeroNotas)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tabelaConsultaNotaFiscalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaConsultaNotaFiscalMouseClicked

        if(evt.getClickCount()==2){
            int i = tabelaConsultaNotaFiscal.getSelectedRow();
            String numeroNota = tabelaConsultaNotaFiscal.getValueAt(i, 0)+"";
            NotaFiscalController controller = new NotaFiscalController();
            NotaFiscal nota = controller.getNota(Integer.parseInt(numeroNota.trim()));
            
            NotaFiscalFrame notaFrame = new NotaFiscalFrame(nota);
            Principal.desktopPane.add(notaFrame).setLocation(85,0);
            notaFrame.setVisible(true);
            
        }
        
    }//GEN-LAST:event_tabelaConsultaNotaFiscalMouseClicked

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
         eraseTable();
        
         if (checkBoxHabilitar.isSelected() && !txtPesquisa.getText().equals("")) {
            //pesquisa por nome e data
            tabelaModelo = controller.select_NFSE_DataNomeRazaoSocial(tabelaModelo, date(dateChooserInicio), date(dateChooserFim), txtPesquisa.getText());
        } else if (!txtPesquisa.getText().equals("")) {
            //pesquisa por nome
            tabelaModelo = controller.select_NFSE_RazaoSocial(tabelaModelo, txtPesquisa.getText());
        } else if (checkBoxHabilitar.isSelected() && txtPesquisa.getText().equals("")) {
            //pesquisa por data
            tabelaModelo = controller.select_NFSE_Data(tabelaModelo, date(dateChooserInicio), date(dateChooserFim));
        } else {
            //pesquisa tudo
            tabelaModelo = controller.selectNotaFiscalAll(tabelaModelo);
        }
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void checkBoxHabilitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxHabilitarActionPerformed
    
        if (checkBoxHabilitar.isSelected()) {
            dateChooserInicio.setEnabled(true);
            dateChooserFim.setEnabled(true);
        } else {
            dateChooserInicio.setEnabled(false);
            dateChooserFim.setEnabled(false);
        }
        
    }//GEN-LAST:event_checkBoxHabilitarActionPerformed

    public java.sql.Date date(com.toedter.calendar.JDateChooser dateChooser) {
        String strDate = DateFormat.getDateInstance().format(dateChooser.getDate());
        java.sql.Date sqlDate = null;
        try {
            Date utilDate = new SimpleDateFormat("dd/MM/yyyy").parse(strDate);
            sqlDate = new java.sql.Date(utilDate.getTime());
            return sqlDate;
        } catch (ParseException ex) {
            Logger.getLogger(FormularioPlantao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return sqlDate;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JCheckBox checkBoxHabilitar;
    private com.toedter.calendar.JDateChooser dateChooserFim;
    private com.toedter.calendar.JDateChooser dateChooserInicio;
    private javax.swing.JLabel lbRazaoSocial;
    private javax.swing.JLabel lbnumeroNotas;
    private javax.swing.JPanel panelPesquisa;
    private javax.swing.JPanel panelTable;
    private javax.swing.JScrollPane scrollPaneTable;
    private javax.swing.JTable tabelaConsultaNotaFiscal;
    private javax.swing.JTextField txtPesquisa;
    // End of variables declaration//GEN-END:variables
}
