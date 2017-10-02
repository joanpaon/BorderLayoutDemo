/*
 * Copyright 2017 José A. Pacheco Ondoño - joanpaon@gmail.com.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.forms;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.util.Properties;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import org.japo.java.libraries.UtilesSwing;

/**
 *
 * @author José A. Pacheco Ondoño - joanpaon@gmail.com
 */
public class GUI extends JFrame {

    // Propiedades App
    public static final String PRP_LOOK_AND_FEEL = "look_and_feel";
    public static final String PRP_FAVICON = "favicon";

    // Valores por Defecto
    public static final String DEF_LOOK_AND_FEEL = UtilesSwing.LNF_NIMBUS;
    public static final String DEF_FAVICON = "img/favicon.png";

    // Referencias
    private Properties prp;
    private JLabel lblNorth;
    private JLabel lblSouth;
    private JLabel lblEast;
    private JLabel lblWest;
    private JLabel lblCenter;

    // Constructor
    public GUI(Properties prp) {
        // Inicialización Anterior
        initBefore(prp);

        // Creación Interfaz
        initComponents();

        // Inicializacion Posterior
        initAfter();
    }

    // Construcción - GUI
    private void initComponents() {
        // Etiqueta Norte
        lblNorth = new JLabel("Norte");
        lblNorth.setHorizontalAlignment(JLabel.CENTER);
        lblNorth.setFont(new Font("Beatnik SF", Font.PLAIN, 60));
        lblNorth.setOpaque(true);
        lblNorth.setForeground(Color.WHITE);
        lblNorth.setBackground(Color.BLUE);
        
        // Etiqueta Sur
        lblSouth = new JLabel("Sur");
        lblSouth.setHorizontalAlignment(JLabel.CENTER);
        lblSouth.setFont(new Font("Beatnik SF", Font.PLAIN, 60));
        lblSouth.setOpaque(true);
        lblSouth.setForeground(Color.WHITE);
        lblSouth.setBackground(Color.RED);
        
        // Etiqueta Este
        lblEast = new JLabel("Este");
        lblEast.setHorizontalAlignment(JLabel.CENTER);
        lblEast.setFont(new Font("Beatnik SF", Font.PLAIN, 60));
        lblEast.setOpaque(true);
        lblEast.setForeground(Color.WHITE);
        lblEast.setBackground(Color.MAGENTA);
        
        // Etiqueta Oeste
        lblWest = new JLabel("Oeste");
        lblWest.setHorizontalAlignment(JLabel.CENTER);
        lblWest.setFont(new Font("Beatnik SF", Font.PLAIN, 60));
        lblWest.setOpaque(true);
        lblWest.setForeground(Color.WHITE);
        lblWest.setBackground(Color.ORANGE);
        
        // Etiqueta Centro
        lblCenter = new JLabel("Centro");
        lblCenter.setHorizontalAlignment(JLabel.CENTER);
        lblCenter.setFont(new Font("Beatnik SF", Font.PLAIN, 60));
        lblCenter.setOpaque(true);
        lblCenter.setForeground(Color.WHITE);
        lblCenter.setBackground(Color.PINK);
        
        // Panel Principal
        JPanel pnlPpal = new JPanel();
        pnlPpal.setLayout(new BorderLayout());
        pnlPpal.add(lblSouth, BorderLayout.SOUTH);
        pnlPpal.add(lblNorth, BorderLayout.NORTH);
        pnlPpal.add(lblWest, BorderLayout.WEST);
        pnlPpal.add(lblEast, BorderLayout.EAST);
        pnlPpal.add(lblCenter, BorderLayout.CENTER);

        // Ventana Principal
        setContentPane(pnlPpal);
        setTitle("BorderLayout Demo");
//        setResizable(false);
        setSize(600, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    // Inicialización Anterior    
    private void initBefore(Properties prp) {
        // Memorizar Referencia
        this.prp = prp;

        // Establecer LnF
        UtilesSwing.establecerLnF(prp.getProperty(PRP_LOOK_AND_FEEL, DEF_LOOK_AND_FEEL));
    }

    // Inicialización Anterior
    private void initAfter() {
        // Establecer Favicon
        UtilesSwing.establecerFavicon(this, prp.getProperty(PRP_FAVICON, DEF_FAVICON));
    }
}
