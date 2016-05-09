/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.remocamp.view;

import br.com.remocamp.controller.PlantaoController;
import br.com.remocamp.model.Plantao;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author fabiano
 */
public class FormularioPlantao extends javax.swing.JInternalFrame {

    Plantao plantao = new Plantao();

    /**
     * Creates new form FormularioPlantao
     */
    public FormularioPlantao() {
        initComponents();
        btnEditar.setVisible(false);
    }
    
    public FormularioPlantao(Plantao plantao) {
        initComponents();
        statusAllTxtField(false);
        btnGravar.setVisible(false);
        this.plantao = plantao;
        setFormulario();
    }

    public void preecherFormulario(){
    
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelEquipe = new javax.swing.JPanel();
        lbMedico = new javax.swing.JLabel();
        lbEnfermeiro = new javax.swing.JLabel();
        lbMotorista = new javax.swing.JLabel();
        lbOperador = new javax.swing.JLabel();
        txtMedico = new javax.swing.JTextField();
        txtEnfermeiro = new javax.swing.JTextField();
        txtMotorista = new javax.swing.JTextField();
        txtOperador = new javax.swing.JTextField();
        panelAmbulancia = new javax.swing.JPanel();
        checkBoxUTI = new javax.swing.JCheckBox();
        checkBoxBasica = new javax.swing.JCheckBox();
        checkBoxSimples = new javax.swing.JCheckBox();
        panelObs = new javax.swing.JPanel();
        jScrollPaneObs = new javax.swing.JScrollPane();
        txtAreaObs = new javax.swing.JTextArea();
        panelDestino = new javax.swing.JPanel();
        lbComplemento = new javax.swing.JLabel();
        lbEndereco = new javax.swing.JLabel();
        lbEstado = new javax.swing.JLabel();
        txtCidade = new javax.swing.JTextField();
        txtEndereco = new javax.swing.JTextField();
        lbCidade = new javax.swing.JLabel();
        txtComplemento = new javax.swing.JTextField();
        txtEstado = new javax.swing.JTextField();
        panelEvento = new javax.swing.JPanel();
        lbNome = new javax.swing.JLabel();
        txtNomeEvento = new javax.swing.JTextField();
        lbResponsavel = new javax.swing.JLabel();
        txtResponsavel = new javax.swing.JTextField();
        panelDateInicio = new javax.swing.JPanel();
        dateChooserInicio = new com.toedter.calendar.JDateChooser();
        panelDateFinal = new javax.swing.JPanel();
        dateChooserFim = new com.toedter.calendar.JDateChooser();
        PanelControle = new javax.swing.JPanel();
        btnImpressao = new javax.swing.JButton();
        btnGravar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();

        setClosable(true);
        setTitle("Formulário plantão");

        panelEquipe.setBorder(javax.swing.BorderFactory.createTitledBorder("Equipe"));

        lbMedico.setText("Médico :");

        lbEnfermeiro.setText("Enfermeiro(a) :");

        lbMotorista.setText("Motorista :");

        lbOperador.setText("Operador(a) :");

        txtMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMedicoActionPerformed(evt);
            }
        });

        txtEnfermeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEnfermeiroActionPerformed(evt);
            }
        });

        txtMotorista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMotoristaActionPerformed(evt);
            }
        });

        txtOperador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOperadorActionPerformed(evt);
            }
        });

        panelAmbulancia.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Ambulancia"));

        checkBoxUTI.setText("UTI");
        checkBoxUTI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxUTIActionPerformed(evt);
            }
        });

        checkBoxBasica.setText("Básica");
        checkBoxBasica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxBasicaActionPerformed(evt);
            }
        });

        checkBoxSimples.setText("Simples");
        checkBoxSimples.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxSimplesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelAmbulanciaLayout = new javax.swing.GroupLayout(panelAmbulancia);
        panelAmbulancia.setLayout(panelAmbulanciaLayout);
        panelAmbulanciaLayout.setHorizontalGroup(
            panelAmbulanciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAmbulanciaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelAmbulanciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(checkBoxUTI)
                    .addComponent(checkBoxBasica)
                    .addComponent(checkBoxSimples))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        panelAmbulanciaLayout.setVerticalGroup(
            panelAmbulanciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAmbulanciaLayout.createSequentialGroup()
                .addComponent(checkBoxUTI)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(checkBoxBasica)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(checkBoxSimples)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelEquipeLayout = new javax.swing.GroupLayout(panelEquipe);
        panelEquipe.setLayout(panelEquipeLayout);
        panelEquipeLayout.setHorizontalGroup(
            panelEquipeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEquipeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelEquipeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbOperador)
                    .addComponent(lbMotorista)
                    .addComponent(lbEnfermeiro)
                    .addComponent(lbMedico))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelEquipeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMotorista, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEnfermeiro, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtOperador, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(panelAmbulancia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        panelEquipeLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtEnfermeiro, txtMedico, txtMotorista, txtOperador});

        panelEquipeLayout.setVerticalGroup(
            panelEquipeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEquipeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelEquipeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelEquipeLayout.createSequentialGroup()
                        .addGroup(panelEquipeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelEquipeLayout.createSequentialGroup()
                                .addComponent(lbMedico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbEnfermeiro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbMotorista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbOperador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(panelEquipeLayout.createSequentialGroup()
                                .addComponent(txtMedico)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtEnfermeiro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtMotorista)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtOperador)))
                        .addGap(18, 18, 18))
                    .addGroup(panelEquipeLayout.createSequentialGroup()
                        .addComponent(panelAmbulancia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))))
        );

        panelObs.setBorder(javax.swing.BorderFactory.createTitledBorder("Obs"));

        txtAreaObs.setColumns(20);
        txtAreaObs.setRows(5);
        jScrollPaneObs.setViewportView(txtAreaObs);

        javax.swing.GroupLayout panelObsLayout = new javax.swing.GroupLayout(panelObs);
        panelObs.setLayout(panelObsLayout);
        panelObsLayout.setHorizontalGroup(
            panelObsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelObsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPaneObs, javax.swing.GroupLayout.DEFAULT_SIZE, 555, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelObsLayout.setVerticalGroup(
            panelObsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelObsLayout.createSequentialGroup()
                .addComponent(jScrollPaneObs, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelDestino.setBorder(javax.swing.BorderFactory.createTitledBorder("Destino"));

        lbComplemento.setText("Complemento :");

        lbEndereco.setText("Endereço :");

        lbEstado.setText("Estado :");

        lbCidade.setText("Cidade :");

        txtEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEstadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelDestinoLayout = new javax.swing.GroupLayout(panelDestino);
        panelDestino.setLayout(panelDestinoLayout);
        panelDestinoLayout.setHorizontalGroup(
            panelDestinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDestinoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDestinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbEndereco)
                    .addComponent(lbCidade)
                    .addComponent(lbComplemento))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDestinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEndereco)
                    .addGroup(panelDestinoLayout.createSequentialGroup()
                        .addGroup(panelDestinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtComplemento, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
                            .addComponent(txtCidade, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(32, 32, 32)
                        .addComponent(lbEstado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 138, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelDestinoLayout.setVerticalGroup(
            panelDestinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDestinoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDestinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbEndereco)
                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDestinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCidade)
                    .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbEstado)
                    .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDestinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbComplemento)
                    .addComponent(txtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        panelEvento.setBorder(javax.swing.BorderFactory.createTitledBorder("Evento"));

        lbNome.setText("Nome :");

        lbResponsavel.setText("Responsável :");

        panelDateInicio.setBorder(javax.swing.BorderFactory.createTitledBorder("Início"));

        javax.swing.GroupLayout panelDateInicioLayout = new javax.swing.GroupLayout(panelDateInicio);
        panelDateInicio.setLayout(panelDateInicioLayout);
        panelDateInicioLayout.setHorizontalGroup(
            panelDateInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDateInicioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dateChooserInicio, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelDateInicioLayout.setVerticalGroup(
            panelDateInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDateInicioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dateChooserInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panelDateFinal.setBorder(javax.swing.BorderFactory.createTitledBorder("Final"));

        javax.swing.GroupLayout panelDateFinalLayout = new javax.swing.GroupLayout(panelDateFinal);
        panelDateFinal.setLayout(panelDateFinalLayout);
        panelDateFinalLayout.setHorizontalGroup(
            panelDateFinalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDateFinalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dateChooserFim, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelDateFinalLayout.setVerticalGroup(
            panelDateFinalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDateFinalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dateChooserFim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout panelEventoLayout = new javax.swing.GroupLayout(panelEvento);
        panelEvento.setLayout(panelEventoLayout);
        panelEventoLayout.setHorizontalGroup(
            panelEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEventoLayout.createSequentialGroup()
                .addGroup(panelEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelEventoLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lbNome)
                        .addGap(22, 22, 22)
                        .addComponent(txtNomeEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(panelEventoLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(lbResponsavel)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtResponsavel, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelEventoLayout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addComponent(panelDateInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(panelDateFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(190, Short.MAX_VALUE))
        );
        panelEventoLayout.setVerticalGroup(
            panelEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEventoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lbNome, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNomeEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(panelDateInicio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelDateFinal, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbResponsavel)
                    .addComponent(txtResponsavel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(105, 105, 105))
        );

        btnImpressao.setText("Vizualizar impressão");
        btnImpressao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImpressaoActionPerformed(evt);
            }
        });

        btnGravar.setText("Gravar");
        btnGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGravarActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelControleLayout = new javax.swing.GroupLayout(PanelControle);
        PanelControle.setLayout(PanelControleLayout);
        PanelControleLayout.setHorizontalGroup(
            PanelControleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelControleLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnImpressao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEditar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGravar)
                .addContainerGap())
        );
        PanelControleLayout.setVerticalGroup(
            PanelControleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelControleLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelControleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnImpressao)
                    .addComponent(btnGravar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditar))
                .addContainerGap())
        );

        PanelControleLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnEditar, btnGravar, btnImpressao});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(panelObs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panelDestino, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panelEquipe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(PanelControle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(panelEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {panelDestino, panelEquipe, panelEvento, panelObs});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(176, 176, 176)
                .addComponent(panelDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelEquipe, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelObs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PanelControle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(panelEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(437, Short.MAX_VALUE)))
        );

        getAccessibleContext().setAccessibleName("Formulário Plantão");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMedicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMedicoActionPerformed

    private void txtEnfermeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEnfermeiroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEnfermeiroActionPerformed

    private void txtMotoristaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMotoristaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMotoristaActionPerformed

    private void txtOperadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOperadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOperadorActionPerformed

    private void checkBoxUTIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxUTIActionPerformed
        if (checkBoxBasica.isSelected() || checkBoxSimples.isSelected()) {
            checkBoxBasica.setSelected(false);
            checkBoxSimples.setSelected(false);
        }
    }//GEN-LAST:event_checkBoxUTIActionPerformed

    private void checkBoxBasicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxBasicaActionPerformed
        if (checkBoxSimples.isSelected() || checkBoxUTI.isSelected()) {
            checkBoxSimples.setSelected(false);
            checkBoxUTI.setSelected(false);
        }
    }//GEN-LAST:event_checkBoxBasicaActionPerformed

    private void txtEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEstadoActionPerformed

    }//GEN-LAST:event_txtEstadoActionPerformed

    private void btnGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGravarActionPerformed
        setPlantao();
        PlantaoController controller = new PlantaoController(plantao);
        controller.gravarFormulario();

    }//GEN-LAST:event_btnGravarActionPerformed

    private void btnImpressaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImpressaoActionPerformed
            PlantaoController clt = new PlantaoController();
            clt.gerarFormulario(plantao);
            
    }//GEN-LAST:event_btnImpressaoActionPerformed

    private void checkBoxSimplesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxSimplesActionPerformed
        if (checkBoxBasica.isSelected() || checkBoxUTI.isSelected()) {
            checkBoxBasica.setSelected(false);
            checkBoxUTI.setSelected(false);
    }//GEN-LAST:event_checkBoxSimplesActionPerformed
    }
    
    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        statusAllTxtField(true);
    }//GEN-LAST:event_btnEditarActionPerformed
    

    private void setPlantao() {
        plantao.setNomeEvento(txtNomeEvento.getText());
        plantao.setInicio(date(dateChooserInicio));
        plantao.setFim(date(dateChooserFim));
        plantao.setResponsavel(txtResponsavel.getText());
        plantao.setEndereco(txtEndereco.getText());
        plantao.setCidade(txtCidade.getText());
        plantao.setEstado(txtEstado.getText());
        plantao.setComplemento(txtComplemento.getText());
        plantao.setMedico(txtMedico.getText());
        plantao.setEnfermeiro(txtEnfermeiro.getText());
        plantao.setMotorista(txtMotorista.getText());
        plantao.setOperador(txtOperador.getText());
        plantao.setObservacao(txtAreaObs.getText());
        
        if(checkBoxBasica.isSelected()){
        plantao.setAmbulancia("Basica");
        }else if(checkBoxSimples.isSelected()){
        plantao.setAmbulancia("Simples");
        }else if(checkBoxUTI.isSelected()){
        plantao.setAmbulancia("UTI");
        }else{
        plantao.setAmbulancia("Simples");
        }
        
    }
    
    private void setFormulario(){
        txtNomeEvento.setText(plantao.getNomeEvento());
        dateChooserInicio.setDate(plantao.getInicio());
        dateChooserFim.setDate(plantao.getFim());
        txtResponsavel.setText(plantao.getResponsavel());
        txtEndereco.setText(plantao.getEndereco());
        txtCidade.setText(plantao.getCidade());
        txtEstado.setText(plantao.getEstado());
        txtComplemento.setText(plantao.getComplemento());
        txtMedico.setText(plantao.getMedico());
        txtEnfermeiro.setText(plantao.getEnfermeiro());
        txtMotorista.setText(plantao.getMotorista());
        txtOperador.setText(plantao.getOperador());
        txtAreaObs.setText(plantao.getObservacao());
        setAmbulanciaFormulario(plantao);
    }
    
    private void setAmbulanciaFormulario(Plantao plantao){
    
        String tipo = plantao.getAmbulancia();
        
        if(tipo.equals("UTI")){
         checkBoxUTI.setSelected(true);
        }else if(tipo.equals("Basica")){
        checkBoxBasica.setSelected(true);
        }else{
        checkBoxSimples.setSelected(true);
        }
    }
    
    private void statusAllTxtField(boolean habilitar){
        txtNomeEvento.setEditable(habilitar);
        dateChooserInicio.setEnabled(habilitar);
        dateChooserFim.setEnabled(habilitar);
        txtResponsavel.setEditable(habilitar);
        txtEndereco.setEditable(habilitar);
        txtCidade.setEditable(habilitar);
        txtEstado.setEditable(habilitar);
        txtComplemento.setEditable(habilitar);
        txtMedico.setEditable(habilitar);
        txtEnfermeiro.setEditable(habilitar);
        txtMotorista.setEditable(habilitar);
        txtOperador.setEditable(habilitar);
        txtAreaObs.setEditable(habilitar);
    }

    public java.sql.Date date(com.toedter.calendar.JDateChooser dateChoser) {
        String strDate = DateFormat.getDateInstance().format(dateChoser.getDate());
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
    private javax.swing.JPanel PanelControle;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnGravar;
    private javax.swing.JButton btnImpressao;
    private javax.swing.JCheckBox checkBoxBasica;
    private javax.swing.JCheckBox checkBoxSimples;
    private javax.swing.JCheckBox checkBoxUTI;
    private com.toedter.calendar.JDateChooser dateChooserFim;
    private com.toedter.calendar.JDateChooser dateChooserInicio;
    private javax.swing.JScrollPane jScrollPaneObs;
    private javax.swing.JLabel lbCidade;
    private javax.swing.JLabel lbComplemento;
    private javax.swing.JLabel lbEndereco;
    private javax.swing.JLabel lbEnfermeiro;
    private javax.swing.JLabel lbEstado;
    private javax.swing.JLabel lbMedico;
    private javax.swing.JLabel lbMotorista;
    private javax.swing.JLabel lbNome;
    private javax.swing.JLabel lbOperador;
    private javax.swing.JLabel lbResponsavel;
    private javax.swing.JPanel panelAmbulancia;
    private javax.swing.JPanel panelDateFinal;
    private javax.swing.JPanel panelDateInicio;
    private javax.swing.JPanel panelDestino;
    private javax.swing.JPanel panelEquipe;
    private javax.swing.JPanel panelEvento;
    private javax.swing.JPanel panelObs;
    private javax.swing.JTextArea txtAreaObs;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtComplemento;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtEnfermeiro;
    private javax.swing.JTextField txtEstado;
    private javax.swing.JTextField txtMedico;
    private javax.swing.JTextField txtMotorista;
    private javax.swing.JTextField txtNomeEvento;
    private javax.swing.JTextField txtOperador;
    private javax.swing.JTextField txtResponsavel;
    // End of variables declaration//GEN-END:variables
}
