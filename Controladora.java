package preorden;

/**
 *
 * @author luxor
 */
public class Controladora extends javax.swing.JFrame {
    public Controladora() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        Numero1 = new javax.swing.JTextField();
        Operador1 = new javax.swing.JTextField();
        Numero2 = new javax.swing.JTextField();
        Operador2 = new javax.swing.JTextField();
        Numero3 = new javax.swing.JTextField();
        Operador3 = new javax.swing.JTextField();
        Numero4 = new javax.swing.JTextField();
        Preorden = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Postorden = new javax.swing.JButton();
        Inorden = new javax.swing.JButton();
        ResultadoPre = new javax.swing.JTextField();
        ResultadoPost = new javax.swing.JTextField();
        ResultadoIn = new javax.swing.JTextField();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Preorden.setText("Preorden");
        Preorden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PreordenActionPerformed(evt);
            }
        });

        jLabel1.setText("Mult/Div");

        jLabel2.setText("Mult/Div");

        jLabel3.setText("Sum/Rest");

        Postorden.setText("Postorden");
        Postorden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PostordenActionPerformed(evt);
            }
        });

        Inorden.setText("Inorden");
        Inorden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InordenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Numero1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Operador1))
                        .addGap(12, 12, 12)
                        .addComponent(Numero2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Operador2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Numero3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Operador3)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Numero4, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Preorden, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Postorden, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Inorden, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ResultadoPre, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ResultadoPost, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ResultadoIn, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Numero1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Operador1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Numero2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Operador2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Numero3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Operador3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Numero4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Preorden)
                    .addComponent(ResultadoPre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ResultadoPost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Postorden))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ResultadoIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Inorden))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PreordenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PreordenActionPerformed
        String dato1, dato2, dato3, dato4, dato5, dato6, dato7;
        
        dato1=Numero1.getText();
        dato2=Operador1.getText();
        dato3=Numero2.getText();
        dato4=Operador2.getText();
        dato5=Numero3.getText();
        dato6=Operador3.getText();
        dato7=Numero4.getText();
        
        
        Nodo raiz = new Nodo(dato4);
        Nodo nodo2 = new Nodo(dato2);
        Nodo nodo3 = new Nodo(dato6);
        raiz.setNodoIzquierdo(nodo2);
        raiz.setNodoDerecho(nodo3);
        nodo2.setNodoDerecho(new Nodo(dato3));
        nodo2.setNodoIzquierdo(new Nodo(dato1));
        nodo3.setNodoIzquierdo(new Nodo(dato5));
        nodo3.setNodoDerecho(new Nodo(dato7));
        System.out.println(" ");
        System.out.println("Recorrido Preorden: ");
        Arbol.preOrden(raiz);
         
    }//GEN-LAST:event_PreordenActionPerformed

    private void PostordenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PostordenActionPerformed
        String dato1, dato2, dato3, dato4, dato5, dato6, dato7, resultado;
        
        dato1=Numero1.getText();
        dato2=Operador1.getText();
        dato3=Numero2.getText();
        dato4=Operador2.getText();
        dato5=Numero3.getText();
        dato6=Operador3.getText();
        dato7=Numero4.getText();
        
        Nodo raiz = new Nodo(dato4);
        Nodo nodo2 = new Nodo(dato2);
        Nodo nodo3 = new Nodo(dato6);
        raiz.setNodoIzquierdo(nodo2);
        raiz.setNodoDerecho(nodo3);
        nodo2.setNodoDerecho(new Nodo(dato3));
        nodo2.setNodoIzquierdo(new Nodo(dato1));
        nodo3.setNodoIzquierdo(new Nodo(dato5));
        nodo3.setNodoDerecho(new Nodo(dato7));
        System.out.println(" ");
        System.out.println("Recorrido Posorden:");
        Arbol.posOrden(raiz);
    }//GEN-LAST:event_PostordenActionPerformed

    private void InordenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InordenActionPerformed
        String resultadoin = null,dato1, dato2, dato3, dato4, dato5, dato6, dato7;
        
        dato1=Numero1.getText();
        dato2=Operador1.getText();
        dato3=Numero2.getText();
        dato4=Operador2.getText();
        dato5=Numero3.getText();
        dato6=Operador3.getText();
        dato7=Numero4.getText();
        
        
        Nodo raiz = new Nodo(dato4);
        Nodo nodo2 = new Nodo(dato2);
        Nodo nodo3 = new Nodo(dato6);
        raiz.setNodoIzquierdo(nodo2);
        raiz.setNodoDerecho(nodo3);
        nodo2.setNodoDerecho(new Nodo(dato3));
        nodo2.setNodoIzquierdo(new Nodo(dato1));
        nodo3.setNodoIzquierdo(new Nodo(dato5));
        nodo3.setNodoDerecho(new Nodo(dato7));
        System.out.println(" ");
        System.out.println("Recorrido Inorden");
        Arbol.inorden(raiz);
        
    }//GEN-LAST:event_InordenActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Controladora().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Inorden;
    private javax.swing.JTextField Numero1;
    private javax.swing.JTextField Numero2;
    private javax.swing.JTextField Numero3;
    private javax.swing.JTextField Numero4;
    private javax.swing.JTextField Operador1;
    private javax.swing.JTextField Operador2;
    private javax.swing.JTextField Operador3;
    private javax.swing.JButton Postorden;
    private javax.swing.JButton Preorden;
    private javax.swing.JTextField ResultadoIn;
    private javax.swing.JTextField ResultadoPost;
    private javax.swing.JTextField ResultadoPre;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
