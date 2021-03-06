/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.remocamp.view;

import br.com.remocamp.controller.PlantaoController;
import br.com.remocamp.model.CellRenderer;
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
public class SearchPlantao extends javax.swing.JInternalFrame {

    private PlantaoController controller = new PlantaoController();
   // private ArrayList<Plantao> plantoes;
    private DefaultTableModel tabelaModelo;
    private  TableCellRenderer tcr;

    
    public SearchPlantao() {
        initComponents();
        dateChooserInicio.setEnabled(false);
        dateChooserFim.setEnabled(false);
        configTable();
        tabelaInicial();
        lbNumeroPlantoes.setText("Nº de plantões cadastrados : "+tableConsultaPlantao.getRowCount());
    }
    private void configTable(){
    
        tableConsultaPlantao.setModel(new DefaultTableModel(new Object[][]{}, new String[]{"Nº", "Evento", "Data Inicio", "Data Final",}) {

            @Override
            public boolean isCellEditable(int row, int col) {
                return false;
            }

        });
        tabelaModelo = (DefaultTableModel) tableConsultaPlantao.getModel();
        tcr = new CellRenderer();
        
        for(int i=0; i< tableConsultaPlantao.getColumnCount() ; i++){
            TableColumn column =  tableConsultaPlantao.getColumnModel().getColumn(i);
            column.setCellRenderer(tcr);
        }
    
    }
//    public final void tabelaInicial(){
//        Plantao plantao;
//        plantoes = controller.selectPlantoesAll();
//        
//        for(int i=0; i < plantoes.size();i++){
//            plantao = plantoes.get(i);
//            Object row[] = new Object[4];
//            row[0] = plantao.getIdPlantao();
//            row[1] = plantao.getNomeEvento();
//            row[2] = plantao.getInicio();
//            row[3] = plantao.getFim();
//            
//            tabelaModelo.addRow(row);
//        }
//    }
    
     public final void tabelaInicial(){
         tabelaModelo = controller.selectPlantoesAll(tabelaModelo);
     }
     
   
    public void eraseTable() {
        if (tabelaModelo.getRowCount() > 0) {
            for (int i = tabelaModelo.getRowCount() - 1; i > -1; i--) {
                tabelaModelo.removeRow(i);
            }
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
        txtNomeEvento = new javax.swing.JTextField();
        lbNomeEvento = new javax.swing.JLabel();
        dateChooserInicio = new com.toedter.calendar.JDateChooser();
        dateChooserFim = new com.toedter.calendar.JDateChooser();
        btnPesquisar = new javax.swing.JButton();
        checkBoxEnableDate = new javax.swing.JCheckBox();
        panelTable = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableConsultaPlantao = new javax.swing.JTable();
        lbNumeroPlantoes = new javax.swing.JLabel();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Consulta plantão");

        panelPesquisa.setBorder(javax.swing.BorderFactory.createTitledBorder("Pesquisa"));

        lbNomeEvento.setText("Nome do envento :");

        dateChooserInicio.setBorder(javax.swing.BorderFactory.createTitledBorder("Inicio"));

        dateChooserFim.setBorder(javax.swing.BorderFactory.createTitledBorder("Fim"));

        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        checkBoxEnableDate.setText("Habilitar");
        checkBoxEnableDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxEnableDateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelPesquisaLayout = new javax.swing.GroupLayout(panelPesquisa);
        panelPesquisa.setLayout(panelPesquisaLayout);
        panelPesquisaLayout.setHorizontalGroup(
            panelPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPesquisaLayout.createSequentialGroup()
                .addGroup(panelPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPesquisaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbNomeEvento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNomeEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelPesquisaLayout.createSequentialGroup()
                        .addComponent(dateChooserInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(dateChooserFim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(checkBoxEnableDate)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnPesquisar)
                .addContainerGap(387, Short.MAX_VALUE))
        );
        panelPesquisaLayout.setVerticalGroup(
            panelPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPesquisaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lbNomeEvento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtNomeEvento)
                    .addComponent(btnPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(panelPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(dateChooserInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(dateChooserFim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(checkBoxEnableDate, javax.swing.GroupLayout.Alignment.TRAILING)))
        );

        panelTable.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tableConsultaPlantao.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tableConsultaPlantao.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tableConsultaPlantao.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tableConsultaPlantao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableConsultaPlantaoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableConsultaPlantao);

        javax.swing.GroupLayout panelTableLayout = new javax.swing.GroupLayout(panelTable);
        panelTable.setLayout(panelTableLayout);
        panelTableLayout.setHorizontalGroup(
            panelTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 824, Short.MAX_VALUE)
        );
        panelTableLayout.setVerticalGroup(
            panelTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        lbNumeroPlantoes.setText("Nº de plantões cadastrados :  ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelPesquisa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbNumeroPlantoes)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(panelTable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbNumeroPlantoes)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tableConsultaPlantaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableConsultaPlantaoMouseClicked
        if(evt.getClickCount()==2){
            int i = tableConsultaPlantao.getSelectedRow();
            int numeroPlantao = (int) tableConsultaPlantao.getValueAt(i, 0);

            PlantaoController controller = new PlantaoController();
            FormularioPlantao plantaoFormulario = controller.selectPlantao(numeroPlantao);
            plantaoFormulario.getDateChoserInicio().setDate(plantaoFormulario.getInicio());
            plantaoFormulario.getDateChoserFim().setDate(plantaoFormulario.getFim());
            Principal.desktopPane.add(plantaoFormulario).setLocation(85,0);
            plantaoFormulario.setVisible(true);
        }
    }//GEN-LAST:event_tableConsultaPlantaoMouseClicked

    private void checkBoxEnableDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxEnableDateActionPerformed
        if(checkBoxEnableDate.isSelected()){
            dateChooserInicio.setEnabled(true);
            dateChooserFim.setEnabled(true);
        }else{
            dateChooserInicio.setEnabled(false);
            dateChooserFim.setEnabled(false);
        }
    }//GEN-LAST:event_checkBoxEnableDateActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        eraseTable();

        if (checkBoxEnableDate.isSelected() && !txtNomeEvento.getText().equals("")) {
            //pesquisa por nome e data
            tabelaModelo = controller.selectPlantaoDataNome(tabelaModelo, date(dateChooserInicio), date(dateChooserFim), txtNomeEvento.getText());
        } else if (!txtNomeEvento.getText().equals("")) {
            //pesquisa por nome
            tabelaModelo = controller.selectPlantaoNome(tabelaModelo, txtNomeEvento.getText());
        } else if (checkBoxEnableDate.isSelected() && txtNomeEvento.getText().equals("")) {
            //pesquisa por data
            tabelaModelo = controller.selectPlantaoData(tabelaModelo, date(dateChooserInicio), date(dateChooserFim));
        } else {
            //pesquisa tudo
            tabelaModelo = controller.selectPlantoesAll(tabelaModelo);
        }

    }//GEN-LAST:event_btnPesquisarActionPerformed

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
    private javax.swing.JCheckBox checkBoxEnableDate;
    private com.toedter.calendar.JDateChooser dateChooserFim;
    private com.toedter.calendar.JDateChooser dateChooserInicio;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbNomeEvento;
    private javax.swing.JLabel lbNumeroPlantoes;
    private javax.swing.JPanel panelPesquisa;
    private javax.swing.JPanel panelTable;
    private javax.swing.JTable tableConsultaPlantao;
    private javax.swing.JTextField txtNomeEvento;
    // End of variables declaration//GEN-END:variables
}
