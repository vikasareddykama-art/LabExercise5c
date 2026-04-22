package demo;

//5c. AWT program demonstrating BorderLayout

import java.awt.*;
import java.awt.event.*;

public class BorderLayout5c extends Frame {

 public BorderLayout5c() {

     // Set layout
     setLayout(new BorderLayout());

     // Add components in regions
     add(new Button("NORTH"), BorderLayout.NORTH);
     add(new Button("SOUTH"), BorderLayout.SOUTH);
     add(new Button("EAST"), BorderLayout.EAST);
     add(new Button("WEST"), BorderLayout.WEST);
     add(new Button("CENTER"), BorderLayout.CENTER);

     // Frame settings
     setSize(400, 300);
     setTitle("BorderLayout Example");
     setVisible(true);

     // Close window
     addWindowListener(new WindowAdapter() {
         public void windowClosing(WindowEvent we) {
             dispose();
         }
     });
 }

 public static void main(String[] args) {
     new BorderLayout5c();
 }
}