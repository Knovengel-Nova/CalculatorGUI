package Calc;

import com.formdev.flatlaf.intellijthemes.FlatDarkPurpleIJTheme;

public class MainFrame extends javax.swing.JFrame implements java.awt.event.KeyListener {

    private static MainFrame instance;
    public static double lastAnswer, result, leftOperand, rightOperand;
    public static char operator;
    public String Res = null;

//    this.setFocusable(true);
//    this.addKeyListener(new KeyAdapter() {
//    public void keyPressed(KeyEvent e) {
//        switch (e.getKeyChar()) {
//            case '1': MainFrame.buttonListner(1); break;
//            case '+': MainFrame.buttonListner('+'); break;
//            // and so on...
//        }
//    }
//    });
    public static void buttonListner(int code) {
        if(instance.screen.getText().equals("NaN"))
            instance.screen.setText("0");
        switch (code) {
            case 1:
                if (instance.screen.getText().equals("0")) {
                    instance.screen.setText("1");
                } else {
                    instance.screen.setText(instance.screen.getText().concat("1"));
                }

                instance.logo.requestFocusInWindow();
                break;

            case 2:
                if (instance.screen.getText().equals("0")) {
                    instance.screen.setText("2");
                } else {
                    instance.screen.setText(instance.screen.getText().concat("2"));
                }

                instance.logo.requestFocusInWindow();
                break;

            case 3:
                if (instance.screen.getText().equals("0")) {
                    instance.screen.setText("3");
                } else {
                    instance.screen.setText(instance.screen.getText().concat("3"));
                }

                instance.logo.requestFocusInWindow();
                break;

            case 4:
                if (instance.screen.getText().equals("0")) {
                    instance.screen.setText("4");
                } else {
                    instance.screen.setText(instance.screen.getText().concat("4"));
                }

                instance.logo.requestFocusInWindow();
                break;

            case 5:
                if (instance.screen.getText().equals("0")) {
                    instance.screen.setText("5");
                } else {
                    instance.screen.setText(instance.screen.getText().concat("5"));
                }

                instance.logo.requestFocusInWindow();
                break;

            case 6:
                if (instance.screen.getText().equals("0")) {
                    instance.screen.setText("6");
                } else {
                    instance.screen.setText(instance.screen.getText().concat("6"));
                }

                instance.logo.requestFocusInWindow();
                break;

            case 7:
                if (instance.screen.getText().equals("0")) {
                    instance.screen.setText("7");
                } else {
                    instance.screen.setText(instance.screen.getText().concat("7"));
                }

                instance.logo.requestFocusInWindow();
                break;

            case 8:
                if (instance.screen.getText().equals("0")) {
                    instance.screen.setText("8");
                } else {
                    instance.screen.setText(instance.screen.getText().concat("8"));
                }

                instance.logo.requestFocusInWindow();
                break;

            case 9:
                if (instance.screen.getText().equals("0")) {
                    instance.screen.setText("9");
                } else {
                    instance.screen.setText(instance.screen.getText().concat("9"));
                }

                instance.logo.requestFocusInWindow();
                break;

            case 0:
                if (instance.screen.getText().equals("0")) {
                    instance.screen.setText("0");
                } else {
                    instance.screen.setText(instance.screen.getText().concat("0"));
                }

                instance.logo.requestFocusInWindow();
                break;

            case 10:
                if (instance.screen.getText().contains(".")) {
                    String a = instance.screen.getText();
                    instance.screen.setText(a);
                } else {
                    if (instance.screen.getText().equals("0")) {
                        instance.screen.setText("0.");
                    } else {
                        instance.screen.setText(instance.screen.getText().concat("."));
                    }
                }

                instance.logo.requestFocusInWindow();
                break;

            case 11:
                if (instance.screen.getText().equals("0")) {
                    instance.screen.setText("0");
                } else {
                    instance.screen.setText(instance.screen.getText().substring(0, instance.screen.getText().length() - 1));
                    instance.logo.requestFocusInWindow();
                }
                break;

            case 12:
                instance.screen.setText("0");
                instance.logo.requestFocusInWindow();
                break;

            case 13:
                operator = '+';
                leftOperand = Double.parseDouble(instance.screen.getText());
                instance.screen.setText("0");
                instance.Res = null;
                instance.logo.requestFocusInWindow();
                break;

            case 14:
                operator = '-';
                leftOperand = Double.parseDouble(instance.screen.getText());
                instance.screen.setText("0");
                instance.Res = null;
                instance.logo.requestFocusInWindow();
                break;

            case 15:
                operator = '*';
                leftOperand = Double.parseDouble(instance.screen.getText());
                instance.screen.setText("0");
                instance.Res = null;
                instance.logo.requestFocusInWindow();
                break;

            case 16:
                operator = '/';
                leftOperand = Double.parseDouble(instance.screen.getText());
                instance.screen.setText("0");
                instance.Res = null;
                instance.logo.requestFocusInWindow();
                break;

            case 17:
                if (instance.Res == null) {
                    rightOperand = Double.parseDouble(instance.screen.getText());
                } else {
                    leftOperand = result;
                }

                switch (operator) {
                    case '+':
                        result = leftOperand + rightOperand;
                        instance.Res = Double.toString(result);
                        instance.screen.setText(Double.toString(result));
                        instance.historyLabel.setText(leftOperand + " + " + rightOperand + " =");
                        break;

                    case '-':
                        result = leftOperand - rightOperand;
                        instance.Res = Double.toString(result);
                        instance.screen.setText(Double.toString(result));
                        instance.historyLabel.setText(leftOperand + " - " + rightOperand + " =");
                        break;

                    case '*':
                        result = leftOperand * rightOperand;
                        instance.Res = Double.toString(result);
                        instance.screen.setText(Double.toString(result));
                        instance.historyLabel.setText(leftOperand + " * " + rightOperand + " =");
                        break;

                    case '/':
                        result = leftOperand / rightOperand;
                        instance.Res = Double.toString(result);
                        instance.screen.setText(Double.toString(result));
                        instance.historyLabel.setText(leftOperand + " / " + rightOperand + " =");
                        break;

                    default:
                        throw new AssertionError();
                }
                instance.Res = Double.toString(result);
                instance.screen.setText(instance.Res);
                instance.historyLabel.setText(leftOperand + " " + operator + " " + rightOperand + " =");
                instance.logo.requestFocusInWindow();
                break;

            default:
                instance.logo.requestFocusInWindow();
                throw new AssertionError();
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

        screen = new javax.swing.JTextField();
        buttonsPanel2 = new JPanels.ButtonsPanel();
        logo = new javax.swing.JLabel();
        historyLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculator");
        setResizable(false);

        screen.setFont(new java.awt.Font("DejaVu Serif", 1, 36)); // NOI18N
        screen.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        screen.setText("0");
        screen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                screenActionPerformed(evt);
            }
        });

        logo.setFont(new java.awt.Font("DejaVu Serif", 1, 36)); // NOI18N
        logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/Logo_WonT_Solid_64px.png"))); // NOI18N
        logo.setText("ARTRIAN");
        logo.setToolTipText("ARTRIAN");

        historyLabel.setFont(new java.awt.Font("DejaVu Serif", 2, 18)); // NOI18N
        historyLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        historyLabel.setText("Welcome");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(historyLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(logo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(screen, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(buttonsPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(historyLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(screen, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonsPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void screenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_screenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_screenActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        FlatDarkPurpleIJTheme.setup();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    public MainFrame() {
        instance = this;
        initComponents();
        screen.setText("0");
        logo.addKeyListener(this);
        logo.setFocusable(true);
        logo.requestFocusInWindow();
    }

    @Override
    public void keyReleased(java.awt.event.KeyEvent e) {
    }

    @Override
    public void keyTyped(java.awt.event.KeyEvent e) {
    }

    @Override
    public void keyPressed(java.awt.event.KeyEvent e) {
        int keyCode = e.getKeyCode();
        char keyChar = e.getKeyChar();

        if (Character.isDigit(keyChar)) {
            buttonListner(Integer.parseInt(String.valueOf(keyChar)));
        }

        if (keyChar == '+') {
            buttonListner(13);
        }

        if (keyChar == '-') {
            buttonListner(14);
        }

        if (keyChar == '*') {
            buttonListner(15);
        }

        if (keyChar == '/') {
            buttonListner(16);
        }

        if (keyChar == 'c' || keyChar == 'C') {
            buttonListner(12);
        }

        if (keyChar == '.') {
            buttonListner(10);
        }

        if (keyCode == java.awt.event.KeyEvent.VK_ENTER || keyChar == '=') {
            buttonListner(17);
        }

        if (keyCode == java.awt.event.KeyEvent.VK_BACK_SPACE) {
            buttonListner(11);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JPanels.ButtonsPanel buttonsPanel2;
    private javax.swing.JLabel historyLabel;
    private javax.swing.JLabel logo;
    private javax.swing.JTextField screen;
    // End of variables declaration//GEN-END:variables
}
