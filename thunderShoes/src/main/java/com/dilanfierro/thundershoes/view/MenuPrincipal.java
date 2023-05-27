package main.java.com.dilanfierro.thundershoes.view;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import com.formdev.flatlaf.themes.FlatMacDarkLaf;

public class MenuPrincipal extends javax.swing.JFrame {
    // Se utiliza Look and Feel para mejorar la experiencia de usuario
    static {
        try {
            UIManager.setLookAndFeel(new FlatMacDarkLaf());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Se otorga una nueva fuente de texto con la que se trabajará
    static {
        Font arialFuente = new Font("Arial", Font.PLAIN, 12); // Ejemplo: Arial, tamaño 12
        UIManager.put("Label.font", arialFuente);
        UIManager.put("Button.font", arialFuente);
        UIManager.put("TextField.font", arialFuente);
    }

    public MenuPrincipal() {
        // Se llaman los componentes generados por el IDE
        initComponents();
        setLocationRelativeTo(null); // Se define la locación predeterminada en el centro de la pantalla

        // Se pone un icono a la ventana actual
        ImageIcon icono = new ImageIcon(getClass().getResource("/main/resources/icon/favicon.png"));
        setIconImage(icono.getImage());

        // Obtiene el tamaño de la pantalla
        Dimension tamañoPantalla = Toolkit.getDefaultToolkit().getScreenSize();
        int anchoPantalla = (int) tamañoPantalla.getWidth();
        int altoPantalla = (int) tamañoPantalla.getHeight();

        // Establece el tamaño del JFrame
        setSize(new Dimension(anchoPantalla, altoPantalla));
        setPreferredSize(new Dimension(anchoPantalla, altoPantalla));

        // Ajusta el tamaño del JDesktopPane para llenar el JFrame
        pnlInterno.setPreferredSize(new Dimension(anchoPantalla, altoPantalla));

        // Se otorga un titulo a la ventana y se configura en forma maximizada
        setTitle("thunderShoes");
        setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH);

        // Se proclaman los textos para cada uno de los elementos
        menu00.setText("Archivo");
        menu01.setText("Edición");
        menu02.setText("Ayuda");
        itemMenuCliente.setText("Menu Cliente");
        itemMenuEmpleado.setText("Menu Empleado");
        itemMenuProducto.setText("Menu Producto");
        itemMenuProvedor.setText("Menu Provedor");

        // Creación de variables para los marcos internos
        marcoCliente = new menuCliente();
        marcoProducto = new menuProducto();
        marcoLogin = new Login();

        // Se llaman las funciones necesarias
        mostrarMarcoLogin(); // Lamamos el marco interno de Login

        // Escuchadores de eventos atentos a la interacciones con los botones para
        // realizar la función asignada
        itemMenuCliente.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mostrarMarcoCliente();
            }
        });
        itemMenuEmpleado.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mostrarMarcoEmpleado();
            }
        });
        itemMenuProducto.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mostrarMarcoProducto();
            }
        });
        itemMenuProvedor.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mostrarMarcoProvedor();
            }
        });
    }

    // Funciones para llamar los marcos internos en la ventana actual
    private void mostrarMarcoLogin() {
        Dimension desktopSize = pnlInterno.getSize();
        Dimension frameSize = marcoLogin.getSize();
        int x = (desktopSize.width - frameSize.width) / 2;
        int y = (desktopSize.height - frameSize.height) / 2;
        // marcoLogin.setModal(true);
        pnlInterno.add(marcoLogin); // Agrega el JInternalFrame al JDesktopPane
        marcoLogin.setVisible(true); // Hace visible el JInternalFrame
        marcoLogin.setLocation(x, y);
    }

    private void mostrarMarcoCliente() {
        Dimension desktopSize = pnlInterno.getSize();
        int desktopWidth = (int) desktopSize.getWidth();
        int desktopHeight = (int) desktopSize.getHeight();
        marcoCliente.setSize(desktopWidth / 2, desktopHeight / 2);

        Dimension frameSize = marcoCliente.getSize();
        int x = (desktopSize.width - frameSize.width) / 2;
        int y = (desktopSize.height - frameSize.height) / 2;
        marcoCliente.setLocation(x, y);

        setTitle("La Zapatería de la Retribución");
        pnlInterno.add(marcoCliente); // Agrega el JInternalFrame al JDesktopPane
        marcoCliente.setVisible(true); // Hace visible el JInternalFrame
    }

    private void mostrarMarcoEmpleado() {
        Dimension desktopSize = pnlInterno.getSize();
        int desktopWidth = (int) desktopSize.getWidth();
        int desktopHeight = (int) desktopSize.getHeight();
        marcoEmpleado.setSize(desktopWidth / 2, desktopHeight / 2);

        Dimension frameSize = marcoEmpleado.getSize();
        int x = (desktopSize.width - frameSize.width) / 2;
        int y = (desktopSize.height - frameSize.height) / 2;
        marcoEmpleado.setLocation(x, y);

        setTitle("La Zapatería de la Retribución");
        pnlInterno.add(marcoCliente); // Agrega el JInternalFrame al JDesktopPane
        marcoCliente.setVisible(true); // Hace visible el JInternalFrame
    }

    private void mostrarMarcoProducto() {
        pnlInterno.add(marcoProducto); // Agrega el JInternalFrame al JDesktopPane
        marcoProducto.setVisible(true); // Hace visible el JInternalFrame
        maximizarInternalFrame(marcoProducto); // Hace que el marco se maximize
    }

    private void mostrarMarcoProvedor() {
        Dimension desktopSize = pnlInterno.getSize();
        int desktopWidth = (int) desktopSize.getWidth();
        int desktopHeight = (int) desktopSize.getHeight();
        marcoProvedor.setSize(desktopWidth / 2, desktopHeight / 2);

        Dimension frameSize = marcoProvedor.getSize();
        int x = (desktopSize.width - frameSize.width) / 2;
        int y = (desktopSize.height - frameSize.height) / 2;
        marcoProvedor.setLocation(x, y);

        setTitle("La Zapatería de la Retribución");
        pnlInterno.add(marcoProvedor); // Agrega el JInternalFrame al JDesktopPane
        marcoProvedor.setVisible(true); // Hace visible el JInternalFrame
    }

    // Función para la maximization de los marcos internos
    public void maximizarInternalFrame(JInternalFrame internalFrame) {
        try {
            internalFrame.setMaximum(true);
        } catch (java.beans.PropertyVetoException e) {
            e.printStackTrace();
        }
    }

    // Hilo principal para la creación de la venta y apreciación de la aplicación
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlBg = new javax.swing.JPanel();
        pnlInterno = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        menu00 = new javax.swing.JMenu();
        itemMenuCliente = new javax.swing.JMenuItem();
        itemMenuEmpleado = new javax.swing.JMenuItem();
        itemMenuProducto = new javax.swing.JMenuItem();
        itemMenuProvedor = new javax.swing.JMenuItem();
        menu01 = new javax.swing.JMenu();
        menu02 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1366, 737));

        pnlBg.setPreferredSize(new java.awt.Dimension(1366, 737));

        pnlInterno.setPreferredSize(new java.awt.Dimension(1366, 768));

        javax.swing.GroupLayout pnlInternoLayout = new javax.swing.GroupLayout(pnlInterno);
        pnlInterno.setLayout(pnlInternoLayout);
        pnlInternoLayout.setHorizontalGroup(
                pnlInternoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 1366, Short.MAX_VALUE));
        pnlInternoLayout.setVerticalGroup(
                pnlInternoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 737, Short.MAX_VALUE));

        javax.swing.GroupLayout pnlBgLayout = new javax.swing.GroupLayout(pnlBg);
        pnlBg.setLayout(pnlBgLayout);
        pnlBgLayout.setHorizontalGroup(
                pnlBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(pnlInterno, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
        pnlBgLayout.setVerticalGroup(
                pnlBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(pnlInterno, javax.swing.GroupLayout.DEFAULT_SIZE, 737, Short.MAX_VALUE));

        menu00.setText("File");

        itemMenuCliente.setText("jMenuItem1");
        menu00.add(itemMenuCliente);

        itemMenuEmpleado.setText("jMenuItem1");
        menu00.add(itemMenuEmpleado);

        itemMenuProducto.setText("jMenuItem2");
        menu00.add(itemMenuProducto);

        itemMenuProvedor.setText("jMenuItem2");
        menu00.add(itemMenuProvedor);

        menuBar.add(menu00);

        menu01.setText("Edit");
        menuBar.add(menu01);

        menu02.setText("jMenu1");
        menuBar.add(menu02);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(pnlBg, javax.swing.GroupLayout.PREFERRED_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(pnlBg, javax.swing.GroupLayout.PREFERRED_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE));

        pack();
    }// </editor-fold>//GEN-END:initComponents
     // Variables declaration - do not modify//GEN-BEGIN:variables

    private javax.swing.JMenuItem itemMenuCliente;
    private javax.swing.JMenuItem itemMenuEmpleado;
    private javax.swing.JMenuItem itemMenuProducto;
    private javax.swing.JMenuItem itemMenuProvedor;
    private javax.swing.JMenu menu00;
    private javax.swing.JMenu menu01;
    private javax.swing.JMenu menu02;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JPanel pnlBg;
    private javax.swing.JDesktopPane pnlInterno;
    // End of variables declaration//GEN-END:variables

    // Declaración de variables (manual)
    private Login marcoLogin;
    private menuCliente marcoCliente;
    private menuEmpleado marcoEmpleado;
    private menuProducto marcoProducto;
    private menuProvedor marcoProvedor;

}