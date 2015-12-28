package com.sandy.jnmaker.ui.dialogs.comment;

import com.sandy.jnmaker.ui.dialogs.AbstractNotePanel;

public abstract class CommentPanelUI extends AbstractNotePanel {

    private static final long serialVersionUID = 1L;

    public CommentPanelUI() {
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

        javax.swing.JLabel label = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        commentTF = new javax.swing.JTextArea();

        setBackground(java.awt.Color.lightGray);

        label.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        label.setText("Enter / Edit comments");

        commentTF.setColumns(20);
        commentTF.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        commentTF.setLineWrap(true);
        commentTF.setRows(5);
        commentTF.setTabSize(4);
        commentTF.setWrapStyleWord(true);
        jScrollPane1.setViewportView(commentTF);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(label)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 576, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 355, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected javax.swing.JTextArea commentTF;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
