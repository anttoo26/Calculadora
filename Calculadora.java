import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class Calculadora extends JFrame
{
   JTextField texto1, texto2;
   JPanel panel;
   JButton boton [];
   JLabel num1, num2, respuesta;
   public Calculadora()
   {
      initComponents();
   }
   private void initComponents()
   {
      setSize(300,400);
      setTitle("Calculadora");
      texto1 = new JTextField(10);
      num1 = new JLabel("N° 1: ");
      texto2 = new JTextField(10);
      num2 = new JLabel("N° 2: ");
      JButton div = new JButton("÷");
      JButton mul = new JButton("x");
      JButton res = new JButton("-");
      JButton sum = new JButton("+");
      respuesta = new JLabel();
      boton = new JButton[11];
      boton[0]=new JButton("9");
      boton[1]=new JButton("8");
      boton[2]=new JButton("7");
      boton[3]=new JButton("CE");
      boton[4]=new JButton("6");
      boton[5]=new JButton("5");
      boton[6]=new JButton("4");
      boton[7]=new JButton("3");
      boton[8]=new JButton("2");
      boton[9]=new JButton("1");
      boton[10]=new JButton("0");
      panel = new JPanel();
      GridLayout gl = new GridLayout(5, 4);
      panel.setLayout(gl);
      sum.addMouseListener(new Suma());
      res.addMouseListener(new Resta());
      div.addMouseListener(new Division());
      mul.addMouseListener(new Multiplica());
      boton[0].addMouseListener(new Nueve());
      boton[10].addMouseListener(new Cero());
      boton[9].addMouseListener(new Uno());
      boton[8].addMouseListener(new Dos());
      boton[7].addMouseListener(new Tres());
      boton[6].addMouseListener(new Cuatro());
      boton[5].addMouseListener(new Cinco());
      boton[4].addMouseListener(new Seis());
      boton[3].addMouseListener(new Ce());
      boton[2].addMouseListener(new Siete());
      boton[1].addMouseListener(new Ocho());
      panel.add(num1);
      panel.add(texto1);
      panel.add(num2);
      panel.add(texto2);
      panel.add(res);
      panel.add(mul);
      panel.add(div);
      panel.add(res);
      panel.add(sum);
      for(int i=0;i<11;i++)
      {
        panel.add(boton[i]);
      }
      panel.add(respuesta);
      setContentPane(panel);
      setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
      setVisible(true);
   }
   private class Suma extends MouseAdapter
   {
      double  num1,num2,resu;
      public void mouseClicked(MouseEvent event)
      {
         num1 = Double.parseDouble(texto1.getText());
         num2 = Double.parseDouble(texto2.getText());
         resu = num1 + num2;
         respuesta.setText("= "+String.valueOf(resu));
      }
   }
   private class Resta extends MouseAdapter
   {
      double  num1,num2,resu;
      public void mouseClicked(MouseEvent event)
      {
         num1 = Double.parseDouble(texto1.getText());
         num2 = Double.parseDouble(texto2.getText());
         resu = num1 - num2;
         respuesta.setText("= "+String.valueOf(resu));
      }
   }
   private class  Division extends MouseAdapter
   {
      double  num1,num2,resu;
      public void mouseClicked(MouseEvent event)
      {
         num1 = Double.parseDouble(texto1.getText());
         num2 = Double.parseDouble(texto2.getText());
         resu = num1 / num2;
         respuesta.setText("= "+String.valueOf(resu));
      }
   }
   private class  Multiplica extends MouseAdapter
   {
      double  num1,num2,resu;
      public void mouseClicked(MouseEvent event)
      {
         num1 = Double.parseDouble(texto1.getText());
         num2 = Double.parseDouble(texto2.getText());
         resu = num1 * num2;
         respuesta.setText("= "+String.valueOf(resu));
      }
   }
   private class  Ce extends MouseAdapter
   {
      public void mouseClicked(MouseEvent event)
      {
         texto1.setText("");
         texto2.setText("");
      }
   }
   private class  Uno extends MouseAdapter
   {
      public void mouseClicked(MouseEvent event)
      {
         texto1.setText("1");
         texto2.setText("1");
      }
   }
   private class  Dos extends MouseAdapter
   {
      public void mouseClicked(MouseEvent event)
      {
         texto1.setText("2");
         texto2.setText("2");
      }
   }
   private class  Tres extends MouseAdapter
   {
      public void mouseClicked(MouseEvent event)
      {
         texto1.setText("3");
         texto2.setText("3");
      }
   }
   private class  Cuatro extends MouseAdapter
   {
      public void mouseClicked(MouseEvent event)
      {
         texto1.setText("4");
         texto2.setText("4");
      }
   }
   private class  Cinco extends MouseAdapter
   {
      public void mouseClicked(MouseEvent event)
      {
         texto1.setText("5");
         texto2.setText("5");
      }
   }
   private class  Seis extends MouseAdapter
   {
      public void mouseClicked(MouseEvent event)
      {
         texto1.setText("6");
         texto2.setText("6");
      }
   }
   private class  Siete extends MouseAdapter
   {
      public void mouseClicked(MouseEvent event)
      {
         texto1.setText("7");
         texto2.setText("7");
      }
   }
   private class  Ocho extends MouseAdapter
   {
      public void mouseClicked(MouseEvent event)
      {
         texto1.setText("8");
         texto2.setText("8");
      }
   }
   private class  Nueve extends MouseAdapter
   {
      public void mouseClicked(MouseEvent event)
      {
         texto1.setText("9");
         texto2.setText("9");
      }
   }
   private class  Cero extends MouseAdapter
   {
      public void mouseClicked(MouseEvent event)
      {
         texto1.setText("0");
         texto2.setText("0");
      }
   }
}