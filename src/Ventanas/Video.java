
package Ventanas;

import com.sun.javafx.application.PlatformImpl;
import java.awt.BorderLayout;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import javafx.application.Platform;
import javafx.collections.ObservableList;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public final class Video extends javax.swing.JFrame {
    
    private Stage stage;
    private WebView browser;
    private WebView browser1;
    private JFXPanel jfxPanel;
    private JButton swingButton;
    private WebEngine webEngine;
    private final String url = "";
    
     Contenidos Cn = new Contenidos();

    public Video() {
        initComponents();
        intComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/iconos/iconoframe.png")));
        this.setLocationRelativeTo(null);
    }
    
    public void video1() {
        browser = new WebView();
        webEngine = browser.getEngine();
        webEngine.load("https://drive.google.com/file/d/12AUPrBPAAWG2ZWHPadiC5FkHT7SGy0zH/view?usp=sharing");
    }

    public void video2() {
        browser = new WebView();
        webEngine = browser.getEngine();
        webEngine.load("https://drive.google.com/file/d/1JJtSBkiE9yd6RluEN44R9SfLneBEf7qR/view?usp=sharing");
    }

    public void video3() {
        browser = new WebView();
        webEngine = browser.getEngine();
        webEngine.load("https://drive.google.com/file/d/1-9-5SqQCgfjzaKz6m87AdLYZxcby1rra/view?usp=sharing");
    }

    public void video4() {
        browser = new WebView();
        webEngine = browser.getEngine();
        webEngine.load("https://drive.google.com/file/d/14goechDrW9gOorOpBqc1XzQDDWkxOxVf/view?usp=sharing");
    }

    public void video5() {
        browser = new WebView();
        webEngine = browser.getEngine();
        webEngine.load("https://drive.google.com/file/d/12QdQzzctzg7dRfSARszOro7MgDMDsJGq/view?usp=sharing");
    }

    public void video6() {
        browser = new WebView();
        webEngine = browser.getEngine();
        webEngine.load("https://drive.google.com/file/d/1-KukVFj2chcp8fNSeO0bn0o3Et6KgTdg/view?usp=sharing");
    }

    public void video7() {
        browser = new WebView();
        webEngine = browser.getEngine();
        webEngine.load("https://drive.google.com/file/d/1-KukVFj2chcp8fNSeO0bn0o3Et6KgTdg/view?usp=sharing");
    }

    public void video8() {
        browser = new WebView();
        webEngine = browser.getEngine();
        webEngine.load("https://drive.google.com/file/d/1RF7YvPKEw8PJBSGlLKz07a6UcWH0hCj_/view?usp=sharing");
    }

    public void video9() {
        browser = new WebView();
        webEngine = browser.getEngine();
        webEngine.load("https://drive.google.com/file/d/12WFqOelay7nJVMmqJ7-uIgo6ndJ6dilh/view?usp=sharing");
    }

    public void video10() {
        browser = new WebView();
        webEngine = browser.getEngine();
        webEngine.load("https://drive.google.com/file/d/1xsoMy-q8oWEdqpgdi_LT5u9X92A-jViJ/view?usp=sharing");
    }

    public void video11() {
        browser = new WebView();
        webEngine = browser.getEngine();
        webEngine.load("https://drive.google.com/file/d/1-VTE6ZtcsO7PZZ7AjTJpdPSQWa56NDUT/view?usp=sharing");
    }

    public void video12() {
        browser = new WebView();
        webEngine = browser.getEngine();
        webEngine.load("https://drive.google.com/file/d/1-Zr06uRiJk2vRWkHuPsGL4chF2URhNkx/view?usp=sharing");
    }

    public void video13() {
        browser = new WebView();
        webEngine = browser.getEngine();
        webEngine.load("https://drive.google.com/file/d/1-wAz6g_KKcjMvKi5fYW_V1sto1JuBy9W/view?usp=sharing");
    }
    
    public void video14() {
        browser = new WebView();
        webEngine = browser.getEngine();
        webEngine.load("https://drive.google.com/file/d/1-wAz6g_KKcjMvKi5fYW_V1sto1JuBy9W/view?usp=sharing");
    }

    private void intComponents() {
        jfxPanel = new JFXPanel();
        createScene();
        setLayout(new BorderLayout());
        add(jfxPanel, BorderLayout.CENTER);
        
        swingButton = new JButton();  
        swingButton.addActionListener((ActionEvent e) -> {
            Platform.runLater(() -> {
                webEngine.load(url);
                setVisible(false);
            });
        });
        swingButton.setText("Regresar");  
        add(swingButton, BorderLayout.SOUTH); 
    }

    public void createScene() {
        PlatformImpl.startup(() -> {
            stage = new Stage();
            
            stage.setTitle("Hello Java FX");
            stage.setResizable(true);
            
            Group root = new Group();
            Scene scene = new Scene(root, 700, 400);
            stage.setScene(scene);
            
            //llamando video
            try{
                switch (Contenidos.getI()) {
                case 1: {
                    video1();
                    break;
                }
                case 2: {
                    video2();
                    break;
                }
                case 3: {
                    video3();
                    break;
                }
                case 4: {
                    video4();
                    break;
                }
                case 5: {
                    video5();
                    break;
                }
                case 6: {
                    video6();
                    break;
                }
                case 7: {
                    video7();
                    break;
                }
                case 8: {
                    video8();
                    break;
                }
                case 9: {
                    video9();
                    break;
                }
                case 10: {
                    video10();
                    break;
                }
                case 11: {
                    video11();
                    break;
                }
                case 12: {
                    video12();
                    break;
                }
                case 13: {
                    video13();
                    break;
                }
                case 14:{
                    video14();
                    break;
                }
                default: {
                    JOptionPane.showMessageDialog(null, "elije un tema");
                    this.setVisible(false);
                    System.out.println(Contenidos.getI());
                }
            }
            }catch(HeadlessException e){
                System.out.println(e);
            }
            
            ObservableList<Node> children = root.getChildren();
            children.add(browser);
            
            jfxPanel.setScene(scene);
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("video");
        setUndecorated(true);
        setResizable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 765, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 485, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}