package com.sandy.jnmaker.ui.dialogs.qa ;

import com.sandy.jnmaker.ui.dialogs.AbstractNotePanel;

/**
 * This file has been generated by NetBeans. If you have to add logic, please
 * do so in derived classes.
 * 
 * @author sandeep
 */
public abstract class QAPanelUI extends AbstractNotePanel {

    private static final long serialVersionUID = 1L;
    
    public QAPanelUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.JLabel enterQLabel = new javax.swing.JLabel();
        javax.swing.JScrollPane enterQTextAreaSP = new javax.swing.JScrollPane();
        questionTextArea = new javax.swing.JTextArea();
        javax.swing.JSeparator separator = new javax.swing.JSeparator();
        javax.swing.JLabel enterALabel = new javax.swing.JLabel();
        javax.swing.JScrollPane enterAnswerTextAreaSP = new javax.swing.JScrollPane();
        answerTextArea = new javax.swing.JTextArea();

        setBackground(java.awt.Color.lightGray);
        setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        setPreferredSize(new java.awt.Dimension(600, 400));

        enterQLabel.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        enterQLabel.setText("Enter question :");

        questionTextArea.setColumns(20);
        questionTextArea.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        questionTextArea.setLineWrap(true);
        questionTextArea.setRows(5);
        questionTextArea.setTabSize(4);
        questionTextArea.setWrapStyleWord(true);
        questionTextArea.setMargin(new java.awt.Insets(2, 2, 2, 2));
        enterQTextAreaSP.setViewportView(questionTextArea);

        enterALabel.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        enterALabel.setText("Enter answer :");

        answerTextArea.setColumns(20);
        answerTextArea.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        answerTextArea.setLineWrap(true);
        answerTextArea.setRows(5);
        answerTextArea.setTabSize(4);
        answerTextArea.setWrapStyleWord(true);
        answerTextArea.setMargin(new java.awt.Insets(2, 2, 2, 2));
        enterAnswerTextAreaSP.setViewportView(answerTextArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(enterAnswerTextAreaSP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 576, Short.MAX_VALUE)
                    .addComponent(enterQTextAreaSP)
                    .addComponent(separator)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(enterQLabel)
                            .addComponent(enterALabel))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(enterQLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(enterQTextAreaSP, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(enterALabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(enterAnswerTextAreaSP, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected javax.swing.JTextArea answerTextArea;
    protected javax.swing.JTextArea questionTextArea;
    // End of variables declaration//GEN-END:variables
}
