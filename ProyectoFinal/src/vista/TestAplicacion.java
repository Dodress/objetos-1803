/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.PersistenciaPregunta;
import modelo.*;

/**
 *
 * @author T-101
 */
public class TestAplicacion extends javax.swing.JFrame {

    int numero = 0;
    int tiempo = 0;
    float correctas=0;

    /**
     * Creates new form TestAplicacion
     */
    public TestAplicacion() {
        initComponents();
        setLocationRelativeTo(this);
        setSize(550, 300);
        try {
            PersistenciaPregunta.desordenar();
        } catch (Exception ex) {
            Logger.getLogger(TestAplicacion.class.getName()).log(Level.SEVERE, null, ex);
        }
        mostrarPregunta(numero++);
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                while (numero<9) {
                    tiempo++;
                    try {
                        Thread.sleep(1000);
                        etiquetaTiempo.setText("" + tiempo);
                        if (tiempo >= 20) {
                            if(numero==8){
                                correctas=correctas+mostrarPregunta(numero++);
                                rb1.setVisible(false);
                                rb2.setVisible(false);
                                rb3.setVisible(false);
                                rb4.setVisible(false);
                                etiquetaTiempo.setVisible(false);
                                jButton1.setVisible(false);
                                jLabel1.setText("Tus preguntas correctas son: "+correctas);
                                etiquetaPregunta.setText("Tu calificacion es: "+(correctas*10)/8);
                            }else{
                                
                            correctas=correctas+mostrarPregunta(numero++);}
                            
                        }

                    } catch (InterruptedException ex) {
                    }
                }
            }
        });
        t1.start();
    }

    public int mostrarPregunta(int numero) {
        tiempo = 0;
        int j=0;
        try {
            
            //primero sacamos la pregunta del numero dado
            ArrayList<Pregunta> preguntas = PersistenciaPregunta.leer();
            Pregunta p = preguntas.get(numero);
            
            //ajustams los valores
            //primero va el titulo
            etiquetaPregunta.setText(p.getTitulo());
            //ahora las opciones
            ArrayList<Opcion> opciones = p.getOpcion();
            //Aplicamos el algoritmo
            /////////////////////////
            
            
            
            ArrayList<String> tituloCorrectas= new ArrayList<>();
            for(Pregunta pe:preguntas){
                tituloCorrectas.add(pe.getOpcion().get(0).getTitulo());
            }
                 for(String s:tituloCorrectas){
            if(s.equals(rb1.getText())){
            if(rb1.isSelected()){
                j++;
            }
            }
            if(s.equals(rb2.getText())){
            if(rb2.isSelected()){
                j++;
            }
            }if(s.equals(rb3.getText())){
            if(rb3.isSelected()){
                j++;
            }
            }if(s.equals(rb4.getText())){
            if(rb4.isSelected()){
                j++;
            }
            }
            }
            //////////////////////
            
              /* 
              if(rb1.isSelected()&&opciones.get(0).isCorrecta()){
            j++;
            }else if(rb2.isSelected()&&opciones.get(1).isCorrecta()){
            j++;
            }else if(rb3.isSelected()&&opciones.get(2).isCorrecta()){
            j++;
            }else if(rb4.isSelected()&&opciones.get(3).isCorrecta()){
            j++;
            }else{
            }
            */
            
            ////////////////
            buttonGroup1.clearSelection();
            opciones = PersistenciaPregunta.opcionesAleatorias(opciones);
            rb1.setText(opciones.get(0).getTitulo());
            rb2.setText(opciones.get(1).getTitulo());
            rb3.setText(opciones.get(2).getTitulo());
            rb4.setText(opciones.get(3).getTitulo());
            //
       
            
            
            
            //
            
        } catch (Exception ex) {

        }
        return j;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        etiquetaTiempo = new javax.swing.JLabel();
        etiquetaPregunta = new javax.swing.JLabel();
        rb1 = new javax.swing.JRadioButton();
        rb2 = new javax.swing.JRadioButton();
        rb3 = new javax.swing.JRadioButton();
        rb4 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.Y_AXIS));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Contestar pregunta");
        getContentPane().add(jLabel1);

        etiquetaTiempo.setText("TIEMPO");
        getContentPane().add(etiquetaTiempo);

        etiquetaPregunta.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        etiquetaPregunta.setText("Aqui ira la pregunta");
        getContentPane().add(etiquetaPregunta);

        buttonGroup1.add(rb1);
        rb1.setText("jRadioButton1");
        rb1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rb1MouseClicked(evt);
            }
        });
        getContentPane().add(rb1);

        buttonGroup1.add(rb2);
        rb2.setText("jRadioButton2");
        rb2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rb2MouseClicked(evt);
            }
        });
        getContentPane().add(rb2);

        buttonGroup1.add(rb3);
        rb3.setText("jRadioButton3");
        rb3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rb3MouseClicked(evt);
            }
        });
        getContentPane().add(rb3);

        buttonGroup1.add(rb4);
        rb4.setText("jRadioButton4");
        rb4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rb4MouseClicked(evt);
            }
        });
        rb4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb4ActionPerformed(evt);
            }
        });
        getContentPane().add(rb4);

        jButton1.setText("Siguiente pregunta >>");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rb4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rb4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(numero<8){
        correctas=correctas+mostrarPregunta(numero++);
        }else{
        correctas=correctas+mostrarPregunta(numero++);
        rb1.setVisible(false);
        rb2.setVisible(false);
        rb3.setVisible(false);
        rb4.setVisible(false);
        etiquetaTiempo.setVisible(false);
        jButton1.setVisible(false);
        jLabel1.setText("Tus preguntas correctas son: "+correctas);
        etiquetaPregunta.setText("Tu calificacion es: "+(correctas*10)/8);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void rb4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rb4MouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_rb4MouseClicked

    private void rb1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rb1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_rb1MouseClicked

    private void rb2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rb2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_rb2MouseClicked

    private void rb3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rb3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_rb3MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TestAplicacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TestAplicacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TestAplicacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TestAplicacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TestAplicacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel etiquetaPregunta;
    private javax.swing.JLabel etiquetaTiempo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton rb1;
    private javax.swing.JRadioButton rb2;
    private javax.swing.JRadioButton rb3;
    private javax.swing.JRadioButton rb4;
    // End of variables declaration//GEN-END:variables
}
