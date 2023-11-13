/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author juanm
 */
import javax.swing.plaf.metal.MetalLookAndFeel;

public class App extends javax.swing.JFrame {
    /**
     * Creates new form App
     */
    public App() {
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

        panelPrincipal = new javax.swing.JPanel();
        panelSeparador = new javax.swing.JPanel();
        tituloPrincipal = new javax.swing.JLabel();
        panelMenus = new javax.swing.JPanel();
        menuPrincipal = new javax.swing.JMenuBar();
        menuCandidatos = new javax.swing.JMenu();
        menuInsertar = new javax.swing.JMenuItem();
        menuActualizar = new javax.swing.JMenuItem();
        menuBuscar = new javax.swing.JMenuItem();
        menuEliminar = new javax.swing.JMenuItem();
        menuListar = new javax.swing.JMenuItem();
        menuVotos = new javax.swing.JMenu();
        menuConteo = new javax.swing.JMenuItem();
        menuResultado = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Mini Proyecto 2");
        setPreferredSize(new java.awt.Dimension(700, 400));

        panelSeparador.setBackground(new java.awt.Color(0, 102, 204));

        javax.swing.GroupLayout panelSeparadorLayout = new javax.swing.GroupLayout(panelSeparador);
        panelSeparador.setLayout(panelSeparadorLayout);
        panelSeparadorLayout.setHorizontalGroup(
            panelSeparadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        panelSeparadorLayout.setVerticalGroup(
            panelSeparadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        tituloPrincipal.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tituloPrincipal.setText("Bienvenido, Ve al Menu de Candidatos para Iniciar La Aplicacion");

        javax.swing.GroupLayout panelMenusLayout = new javax.swing.GroupLayout(panelMenus);
        panelMenus.setLayout(panelMenusLayout);
        panelMenusLayout.setHorizontalGroup(
            panelMenusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelMenusLayout.setVerticalGroup(
            panelMenusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 318, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addComponent(tituloPrincipal)
                        .addGap(0, 62, Short.MAX_VALUE))
                    .addComponent(panelMenus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelSeparador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloPrincipal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelMenus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18))
            .addComponent(panelSeparador, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        menuCandidatos.setText("Candidatos");

        menuInsertar.setText("Insertar Candidatos");
        menuInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuInsertarActionPerformed(evt);
            }
        });
        menuCandidatos.add(menuInsertar);

        menuActualizar.setText("Actualizar Candidatos");
        menuActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuActualizarActionPerformed(evt);
            }
        });
        menuCandidatos.add(menuActualizar);

        menuBuscar.setText("Buscar Candidatos");
        menuBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBuscarActionPerformed(evt);
            }
        });
        menuCandidatos.add(menuBuscar);

        menuEliminar.setText("Eliminar Candidatos");
        menuEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuEliminarActionPerformed(evt);
            }
        });
        menuCandidatos.add(menuEliminar);

        menuListar.setText("Listar Candidatos");
        menuListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuListarActionPerformed(evt);
            }
        });
        menuCandidatos.add(menuListar);

        menuPrincipal.add(menuCandidatos);

        menuVotos.setText("Votos");

        menuConteo.setText("Conteo");
        menuConteo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuConteoActionPerformed(evt);
            }
        });
        menuVotos.add(menuConteo);

        menuResultado.setText("Resultados");
        menuResultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuResultadoActionPerformed(evt);
            }
        });
        menuVotos.add(menuResultado);

        menuPrincipal.add(menuVotos);

        setJMenuBar(menuPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void menuInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuInsertarActionPerformed
        PanelMenuInsertar panelMenuInsertar = new PanelMenuInsertar();
        panelMenuInsertar.setSize(panelMenus.getSize());
        
        tituloPrincipal.setText("Insertar Candidato");
        panelMenus.removeAll();
        panelMenus.add(panelMenuInsertar);
        panelMenus.revalidate();
        panelMenus.repaint();
    }//GEN-LAST:event_menuInsertarActionPerformed

    private void menuActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuActualizarActionPerformed
        PanelMenuActualizar panelMenuActualizar = new PanelMenuActualizar();
        panelMenuActualizar.setSize(panelMenus.getSize());
        
        tituloPrincipal.setText("Actualizar Candidato");
        panelMenus.removeAll();
        panelMenus.add(panelMenuActualizar);
        panelMenus.revalidate();
        panelMenus.repaint();
    }//GEN-LAST:event_menuActualizarActionPerformed

    private void menuBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBuscarActionPerformed
        PanelMenuBuscar panelMenuBuscar = new PanelMenuBuscar();
        panelMenuBuscar.setSize(panelMenus.getSize());
        
        tituloPrincipal.setText("Buscar Candidato");
        panelMenus.removeAll();
        panelMenus.add(panelMenuBuscar);
        panelMenus.revalidate();
        panelMenus.repaint();
    }//GEN-LAST:event_menuBuscarActionPerformed

    private void menuEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuEliminarActionPerformed
        PanelMenuEliminar panelMenuEliminar = new PanelMenuEliminar();
        panelMenuEliminar.setSize(panelMenus.getSize());
        
        tituloPrincipal.setText("Eliminar Candidato");
        panelMenus.removeAll();
        panelMenus.add(panelMenuEliminar);
        panelMenus.revalidate();
        panelMenus.repaint();
    }//GEN-LAST:event_menuEliminarActionPerformed

    private void menuListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuListarActionPerformed
        PanelMenuListar panelMenuListar = new PanelMenuListar();
        panelMenuListar.setSize(panelMenus.getSize());
        
        tituloPrincipal.setText("Listado de Candidatos");
        panelMenus.removeAll();
        panelMenus.add(panelMenuListar);
        panelMenus.revalidate();
        panelMenus.repaint();
    }//GEN-LAST:event_menuListarActionPerformed


    private void menuConteoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuConteoActionPerformed
        PanelMenuConteo panelMenuConteo = new PanelMenuConteo();
        panelMenuConteo.setSize(panelMenus.getSize());
        
        tituloPrincipal.setText("Conteo de Votos");
        panelMenus.removeAll();
        panelMenus.add(panelMenuConteo);
        panelMenus.revalidate();
        panelMenus.repaint();
    }//GEN-LAST:event_menuConteoActionPerformed

    private void menuResultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuResultadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuResultadoActionPerformed


    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    javax.swing.UIManager.setLookAndFeel(new MetalLookAndFeel());
                } catch(Exception e) {
                    System.out.println(e);
                }
                new App().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem menuActualizar;
    private javax.swing.JMenuItem menuBuscar;
    private javax.swing.JMenu menuCandidatos;
    private javax.swing.JMenuItem menuConteo;
    private javax.swing.JMenuItem menuEliminar;
    private javax.swing.JMenuItem menuInsertar;
    private javax.swing.JMenuItem menuListar;
    private javax.swing.JMenuBar menuPrincipal;
    private javax.swing.JMenuItem menuResultado;
    private javax.swing.JMenu menuVotos;
    private javax.swing.JPanel panelMenus;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JPanel panelSeparador;
    private javax.swing.JLabel tituloPrincipal;
    // End of variables declaration//GEN-END:variables
}
