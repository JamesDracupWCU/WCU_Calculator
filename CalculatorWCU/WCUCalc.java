import java.awt.*;  
import java.awt.event.*; 
import javax.swing.*; 
import java.lang.Math;          
public class WCUCalc extends JFrame{
   private JLabel label;  //initialized
   private JPanel panel;
   private JTextField text;
   private JButton B1;
   private B2;
   private B3;
   private B4;
   private B5; 
   private B6;
   private B7;
   private B8;
   private B9;
   private B0;
   private BADD;
   private BSUB;
   private BDIVIDE;
   private BMULT;
   private BDOT;
   private BCLEAR;
   private BEQL;
   private BSIN;
   private BCOS;
   private BTAN;
   private BSQRT;
   private BFACT;
   private BREC;
   private BSQRD;
   private BLOG;
   String input1;
   String input2;
   String symbol;
   int w=390,l=530;
   public static void main(String[] args){   //Main
      new WCUCalc();
   }
   public WCUCalc(){ 
      setTitle("Project Calculator");          
      setSize(w,l);
      setLocationRelativeTo(null); 
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      Structure();
      setVisible(true);
      input1= "";
      input2= "";
      symbol= "";
   }
   public void Structure(){      //Structure method   
      panel = new JPanel();
      text=new JTextField(20);
      add(panel);
      panel.setBackground(Color.BLUE);         //All buttons visible on panel
      B1=new JButton("1");
      B2 = new JButton("2");
      B3 = new JButton("3");
      B4 = new JButton("4");
      B5 = new JButton("5");
      B6 = new JButton("6");
      B7 = new JButton("7");
      B8 = new JButton("8");
      B9 = new JButton("9");
      B0 = new JButton("0");
      BEQL = new JButton("=");
      BADD = new JButton("+");
      BSUB = new JButton("-");
      BDIVIDE = new JButton("/");
      BMULT = new JButton("*");
      BCLEAR = new JButton("clear");
      BDOT = new JButton(".");
      BSIN=new JButton("sin");
      BCOS= new JButton("cos");
      BTAN=new JButton("tan");
      BSQRT=new JButton("√");
      BFACT=new JButton("!");
      BREC=new JButton(" 1/x");
      BSQRD=new JButton("x^2");
      BLOG=new JButton("log");   
                //Allows clicking action of Buttons
      BMULT.addActionListener(new Calculate());
      BDIVIDE.addActionListener(new Calculate());
      BSUB.addActionListener(new Calculate());
      BADD.addActionListener(new Calculate());   
      B9.addActionListener(new Calculate());
      B8.addActionListener(new Calculate());
      B7.addActionListener(new Calculate());
      B6.addActionListener(new Calculate());
      B5.addActionListener(new Calculate());
      B4.addActionListener(new Calculate());
      B3.addActionListener(new Calculate());
      B2.addActionListener(new Calculate());
      B1.addActionListener(new Calculate());
      B0.addActionListener(new Calculate());
      BDOT.addActionListener(new Calculate());
      BCLEAR.addActionListener(new Calculate());
      BEQL.addActionListener(new Calculate());
      BSIN.addActionListener(new Calculate());
      BCOS.addActionListener(new Calculate());
      BTAN.addActionListener(new Calculate());
      BSQRT.addActionListener(new Calculate());
      BFACT.addActionListener(new Calculate());
      BREC.addActionListener(new Calculate());
      BSQRD.addActionListener(new Calculate());
      BLOG.addActionListener(new Calculate());
      
      panel.add(text);
      panel.add(BCLEAR);     //Buttons 
      panel.add(BDOT);
      panel.add(BADD);
      panel.add(BSUB);
      panel.add(BMULT);
      panel.add(BDIVIDE);
      panel.add(BEQL);
      panel.add(BSQRT);
      panel.add(B1);
      panel.add(B2);
      panel.add(B3);
      panel.add(B4);
      panel.add(B5);
      panel.add(B6);
      panel.add(B7);
      panel.add(B8);
      panel.add(B9);
      panel.add(B0);
      panel.add(BSIN);
      panel.add(BCOS);
      panel.add(BTAN);
      panel.add(BFACT);
      panel.add(BREC);
      panel.add(BSQRD);
      panel.add(BLOG);
      
      ImageIcon wcu=new ImageIcon("WCU.png");
      JLabel label2=new JLabel(wcu);
      label2.setIcon(wcu);
      panel.add(label2);
   }
   public class Calculate implements ActionListener{  //Calculation 
      public void actionPerformed(ActionEvent A){
         String s = A.getActionCommand(); 
         double sum;    
         if ((s.charAt(0) >= '0' && s.charAt(0) <= '9') || s.charAt(0) == '.') { //Buttons from 0-9
            if (!symbol.equals("")) //If their is an operand then add next clicked number to second input
               input2 = input2 + s; 
            else
               input1 = input1 + s; //else no operand then each number is added onto first input until an operand
            text.setText(input1 + symbol + input2);
         }
         else if (s.equals("clear")) { //If C is hit Everything in TextBox will disappear  
            input1 = symbol = input2 = ""; 
            text.setText(input1 + symbol + input2);
         }
         else if (s.equals("=")) { //If = is hit will go through calculation based on picked operation +,-,*,/         
            if (symbol.equals("+")){   //All this stores into first input1 if you wish to continue with calculating or if you don't it will...
               sum = (Double.parseDouble(input1) + Double.parseDouble(input2));  //Display value at end
            }
            else if (symbol.equals("-")){
               sum = (Double.parseDouble(input1) - Double.parseDouble(input2));
            }
            else if (symbol.equals("/")){
               sum = (Double.parseDouble(input1) / Double.parseDouble(input2));
            }
            else if (symbol.equals("√")){
               double a=Double.parseDouble(input2);
               sum=Math.sqrt(a);
            }
            else if (symbol.equals("*")){
               sum= (Double.parseDouble(input1) * Double.parseDouble(input2));
            }
            else if (symbol.equals("x^2")){
               sum = (Double.parseDouble(input1) * Double.parseDouble(input1));
            }
            else if (symbol.equals("!")){
               int num=Integer.parseInt(input1);
               long fac=num;
               for (int i=num; i>1; i--){
                  fac=fac*(i-1);
               }
               sum=fac;
            }
            else if (symbol.equals("sin")){
               double a = Double.parseDouble(input2);
               double b=Math.toRadians(a);
               sum=Math.sin(b);
            }
            else if (symbol.equals("cos")){
               double a = Double.parseDouble(input2);
               double b=Math.toRadians(a);
               sum=Math.cos(b);
            }
            else if (symbol.equals("tan")){
               double a = Double.parseDouble(input2);
               double b=Math.toRadians(a);
               sum=Math.tan(b);
            }
            else if (symbol.equals("log")){
               double a = Double.parseDouble(input2);
               sum=Math.log10(a);
            }
            else { 
               double a=Double.parseDouble(input2);
               sum=1/a;
            }  
            text.setText(input1 + symbol + input2 + "=" + sum); 
            input1 = Double.toString(sum); 
            symbol = input2 = "";   
         }
         else {                                          //Need in order to input operands after first click of a number or symbol
            if (symbol.equals("") || input2.equals("")) 
               symbol = s;
            else {    //If operand is clicked then it will evaluate by either equal sign or keep inputting operands and values 
               if (symbol.equals("+")){
                  sum = (Double.parseDouble(input1) + Double.parseDouble(input2));
               }
               else if (symbol.equals("-")){
                  sum = (Double.parseDouble(input1) - Double.parseDouble(input2));
               }
               else if (symbol.equals("/")){
                  sum = (Double.parseDouble(input1) / Double.parseDouble(input2));
               }
               else if (symbol.equals("√")){
                  double a=Double.parseDouble(input2);
                  sum=Math.sqrt(a);
               }
               else if (symbol.equals("*")){
                  sum=(Double.parseDouble(input1)*Double.parseDouble(input2));
               }
               else if (symbol.equals("x^2")){
                  sum = (Double.parseDouble(input1) * Double.parseDouble(input1));
               }
               else if (symbol.equals("!")){
                  int num=Integer.parseInt(input1);
                  long fac=num;
                  for (int i=num; i>1; i--){
                     fac=fac*(i-1);
                  }
                  sum=fac;
               }
               else if (symbol.equals("sin")){
                  double a = Double.parseDouble(input2);
                  double b=Math.toRadians(a);
                  sum=Math.sin(b);
               }
               else if (symbol.equals("cos")){
                  double a = Double.parseDouble(input2);
                  double b=Math.toRadians(a);
                  sum=Math.cos(b);
               }
               else if (symbol.equals("tan")){
                  double a = Double.parseDouble(input2);
                  double b=Math.toRadians(a);
                  sum=Math.tan(b);
               }
               else if (symbol.equals("log")){
                  double a = Double.parseDouble(input2);
                  sum=Math.log10(a);
               }
               else {
                  double a=Double.parseDouble(input2);
               sum=-1/a;
               }  
               input1 = Double.toString(sum); 
               symbol = s;
               input2 = "";
            } 
            text.setText(input1 + symbol + input2);
         }
      }
   }
}