/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author admin
 */
public class LopTest extends  JFrame{
    public static void main(String[] args) {
        JFrame jf = new JFrame();
        JPanel pn = new JPanel();
        pn.add(new JButton("test"));
        pn.add(new JButton("test"));
        pn.add(new JButton("test"));
        pn.add(new JButton("test"));
        pn.add(new JButton("test"));
        pn.add(new JButton("test"));
        pn.add(new JButton("test"));
        pn.add(new JButton("test"));
        jf.add(pn);
        jf.setSize(300,300);
        jf.setVisible(true);
    }
}
