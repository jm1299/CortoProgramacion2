package corto;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.DefaultListModel;
import javax.swing.JTextField;

public class Ventana extends javax.swing.JFrame {

    final DefaultListModel model = new DefaultListModel();

    public Ventana() {

        initComponents();
        btnAccion.setEnabled(false);
        setLocationRelativeTo(null);
        rbtnAgregar.setSelected(true);

        txtNombre.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent event) {
                String content = txtApellido.getText();
                if (!content.equals("")) {
                    btnAccion.setEnabled(true);
                } else {
                    btnAccion.setEnabled(false);
                }
            }
        });

        txtApellido.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent event) {

                String content = txtNombre.getText();
                if (!content.equals("")) {
                    btnAccion.setEnabled(true);
                } else {
                    btnAccion.setEnabled(false);
                }
            }
        });

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rgbAcciones = new javax.swing.ButtonGroup();
        lblLogo = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblApellido = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        rbtnAgregar = new javax.swing.JRadioButton();
        rbtnEditar = new javax.swing.JRadioButton();
        rbtnEliminar = new javax.swing.JRadioButton();
        rbtnBuscar = new javax.swing.JRadioButton();
        btnAccion = new javax.swing.JButton();
        lblResultado = new javax.swing.JLabel();
        SUgerencia = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstEstudiantes = new javax.swing.JList<>();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(925, 750));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/2.png"))); // NOI18N
        getContentPane().add(lblLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 0, 230, 250));

        lblNombre.setBackground(new java.awt.Color(0, 0, 255));
        lblNombre.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(0, 0, 255));
        lblNombre.setText("NOMBRE:");
        getContentPane().add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 280, -1, -1));

        lblApellido.setBackground(new java.awt.Color(0, 0, 255));
        lblApellido.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblApellido.setForeground(new java.awt.Color(0, 0, 255));
        lblApellido.setText("APELLIDO:");
        getContentPane().add(lblApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 320, -1, -1));

        txtNombre.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 280, 260, -1));

        txtApellido.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoActionPerformed(evt);
            }
        });
        txtApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidoKeyTyped(evt);
            }
        });
        getContentPane().add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 320, 260, -1));

        rbtnAgregar.setBackground(new java.awt.Color(153, 153, 255));
        rgbAcciones.add(rbtnAgregar);
        rbtnAgregar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rbtnAgregar.setForeground(new java.awt.Color(0, 0, 255));
        rbtnAgregar.setText("AGREGAR");
        rbtnAgregar.setOpaque(false);
        getContentPane().add(rbtnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 370, -1, -1));

        rbtnEditar.setBackground(new java.awt.Color(153, 153, 255));
        rgbAcciones.add(rbtnEditar);
        rbtnEditar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rbtnEditar.setForeground(new java.awt.Color(255, 0, 0));
        rbtnEditar.setText("EDITAR");
        rbtnEditar.setOpaque(false);
        getContentPane().add(rbtnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 370, -1, -1));

        rbtnEliminar.setBackground(new java.awt.Color(153, 153, 255));
        rgbAcciones.add(rbtnEliminar);
        rbtnEliminar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rbtnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        rbtnEliminar.setText("ELIMINAR");
        rbtnEliminar.setOpaque(false);
        getContentPane().add(rbtnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 370, -1, -1));

        rbtnBuscar.setBackground(new java.awt.Color(153, 153, 255));
        rgbAcciones.add(rbtnBuscar);
        rbtnBuscar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rbtnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        rbtnBuscar.setText("BUSCAR");
        rbtnBuscar.setOpaque(false);
        getContentPane().add(rbtnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 370, -1, -1));

        btnAccion.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnAccion.setText("ACCION");
        btnAccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAccionActionPerformed(evt);
            }
        });
        getContentPane().add(btnAccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 410, -1, -1));

        lblResultado.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblResultado.setForeground(new java.awt.Color(255, 255, 255));
        lblResultado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 680, 490, 30));

        SUgerencia.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        SUgerencia.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(SUgerencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 280, 210, 40));

        jScrollPane1.setViewportView(lstEstudiantes);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 460, 370, 200));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Fnd.jpg"))); // NOI18N
        getContentPane().add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -450, 1070, 1210));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        if (txtNombre.getText().isEmpty()) {
            SUgerencia.setText("*Este campo no puede estar vacio");

        } else {
            SUgerencia.setText("");
            txtApellido.requestFocus();
        }
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoActionPerformed
        if (txtApellido.getText().isEmpty()) {
            SUgerencia.setText("*Este campo no puede estar vacio");
        } else {
            SUgerencia.setText("");
        }

        Estudiante primero = new Estudiante();
        Control uno = new Control();

        if (rbtnAgregar.isSelected()) {
            uno.agregar();
            primero.carnet();
            carnet();
            model.addElement(txtNombre.getText());
            model.addElement(txtApellido.getText());
            lblResultado.setText("Se ha agregado al estudiante: " + txtNombre.getText() + " " + txtApellido.getText());

        } else if (rbtnBuscar.isSelected()) {
            uno.buscar();
            model.contains(txtNombre.getText());
            model.contains(txtApellido.getText());
            lblResultado.setText("El estudiante: " + txtNombre.getText() + " " + txtApellido.getText() + " ya se encuentra registrado");

        } else if (rbtnEditar.isSelected()) {
            uno.editar();
            model.addElement(txtNombre.getText());
            model.addElement(txtApellido.getText());
            lblResultado.setText("Se ha agregado al estudiante: " + txtNombre.getText() + " " + txtApellido.getText());

        } else if (rbtnEliminar.isSelected()) {
            uno.eliminar();
            model.removeElement(txtNombre.getText());
            model.removeElement(txtApellido.getText());
            lblResultado.setText("Se ha eliminado al estudiante: " + txtNombre.getText() + " " + txtApellido.getText());
        } else {

        }
        lstEstudiantes.setModel(model);
    }//GEN-LAST:event_txtApellidoActionPerformed

    private void btnAccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAccionActionPerformed
        Estudiante primero = new Estudiante();
        Control uno = new Control();

        if (rbtnAgregar.isSelected()) {
            primero.carnet();
            uno.agregar();
            carnet();
            model.addElement(txtNombre.getText());
            model.addElement(txtApellido.getText());
            lblResultado.setText("Se ha agregado al estudiante: " + txtNombre.getText() + " " + txtApellido.getText());

        } else if (rbtnBuscar.isSelected()) {
            uno.buscar();
            model.contains(txtNombre.getText());
            model.contains(txtApellido.getText());
            lblResultado.setText("El estudiante: " + txtNombre.getText() + " " + txtApellido.getText() + " ya se encuentra registrado");

        } else if (rbtnEditar.isSelected()) {
            uno.editar();
            primero.carnet();
            model.addElement(txtNombre.getText());
            model.addElement(txtApellido.getText());
            lblResultado.setText("Se ha agregado al estudiante: " + txtNombre.getText() + " " + txtApellido.getText());

        } else if (rbtnEliminar.isSelected()) {
            uno.eliminar();
            model.removeElement(txtNombre.getText());
            model.removeElement(txtApellido.getText());
            lblResultado.setText("Se ha eliminado al estudiante: " + txtNombre.getText() + " " + txtApellido.getText());
        } else {

        }
        lstEstudiantes.setModel(model);
    }//GEN-LAST:event_btnAccionActionPerformed

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        char C = evt.getKeyChar();

        if (Character.isDigit(C)) {
            getToolkit().beep();
            evt.consume();
            SUgerencia.setText("*Ingrese solo letras");
            txtNombre.setCursor(null);
        } else if ((int) evt.getKeyChar() > 32 && (int) evt.getKeyChar() <= 47
                || (int) evt.getKeyChar() >= 58 && (int) evt.getKeyChar() <= 64
                || (int) evt.getKeyChar() >= 91 && (int) evt.getKeyChar() <= 96
                || (int) evt.getKeyChar() >= 123 && (int) evt.getKeyChar() <= 255) {
            getToolkit().beep();
            evt.consume();
            SUgerencia.setText("*Ingrese solo letras");
            txtNombre.setCursor(null);
        }
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoKeyTyped
        char C = evt.getKeyChar();

        if (Character.isDigit(C)) {
            getToolkit().beep();
            evt.consume();
            SUgerencia.setText("*Ingrese solo letras");
            txtApellido.setCursor(null);
        } else if ((int) evt.getKeyChar() > 32 && (int) evt.getKeyChar() <= 47
                || (int) evt.getKeyChar() >= 58 && (int) evt.getKeyChar() <= 64
                || (int) evt.getKeyChar() >= 91 && (int) evt.getKeyChar() <= 96
                || (int) evt.getKeyChar() >= 123 && (int) evt.getKeyChar() <= 255) {
            getToolkit().beep();
            evt.consume();
            SUgerencia.setText("*Ingrese solo letras");
            txtApellido.setCursor(null);
        }

    }//GEN-LAST:event_txtApellidoKeyTyped

//EN ESTE METODO GENERO UN CARNET ALEATORIO
    public void carnet() {

//Declaramos las variables que vamos a usar
        Estudiante generador = new Estudiante();
        String LetrasMay1, LetrasMay2, numeros1, numeros2, numeros3, numeros4, resultado = "";

        int numeroCaracteres = 1;//Esta variable indica el número de carácteres que vamos a usar para hacer unico al usuario

        LetrasMay1 = "ABCDEFGHIJQLMNÑOPQRTSUVWXYZ";//Declaramos el abecedario en minúscula

        LetrasMay2 = "ABCDEFGHIJQLMNÑOPQRTSUVWXYZ";//Declaramos el abecedario en mayúscula

        numeros1 = "1234567890";//Declaramos los números
        numeros2 = "1234567890";//Declaramos los números
        numeros3 = "1234567890";//Declaramos los números
        numeros4 = "1234567890";//Declaramos los números

        resultado = generador.aleatorio(resultado, LetrasMay1, numeroCaracteres);
        resultado = generador.aleatorio(resultado, LetrasMay2, numeroCaracteres);
        resultado = generador.aleatorio(resultado, numeros1, numeroCaracteres);
        resultado = generador.aleatorio(resultado, numeros2, numeroCaracteres);
        resultado = generador.aleatorio(resultado, numeros3, numeroCaracteres);
        resultado = generador.aleatorio(resultado, numeros4, numeroCaracteres);

        String arrayPalabras[] = resultado.split("");

        resultado = "";

        for (int i = 0; arrayPalabras.length > i; i++) {

            resultado = resultado + arrayPalabras[i];

        }
        model.addElement("" + resultado);

    }

//Este es el método generados de números y letras aleatorios
    public String aleatorio(String resultado, String palabras, int numero) {

        String[] arrayPalabra = palabras.split("");

        int numeroAleatorio = 0;

        for (int i = 0; i < numero; i++) {

            numeroAleatorio = (int) (Math.random() * (arrayPalabra.length - 1) + 0);

            resultado = resultado + arrayPalabra[numeroAleatorio];

        }

        return resultado;

    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel SUgerencia;
    private javax.swing.JButton btnAccion;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblResultado;
    private javax.swing.JList<String> lstEstudiantes;
    private javax.swing.JRadioButton rbtnAgregar;
    private javax.swing.JRadioButton rbtnBuscar;
    private javax.swing.JRadioButton rbtnEditar;
    private javax.swing.JRadioButton rbtnEliminar;
    private javax.swing.ButtonGroup rgbAcciones;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables

    public JTextField getTxtApellido() {
        return txtApellido;
    }

    public void setTxtApellido(JTextField txtApellido) {
        this.txtApellido = txtApellido;
    }

    public JTextField getTxtNombre() {
        return txtNombre;
    }

    public void setTxtNombre(JTextField txtNombre) {
        this.txtNombre = txtNombre;
    }

}
