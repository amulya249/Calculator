import java.awt.*;
import java.awt.event.*;
public class calculator implements ActionListener
{
int c,n;
String s1,s2,s3,s4,s5;
Frame f;
Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17;
Panel p;
TextField tf;
GridLayout g;
calculator()
{
f = new Frame(&quot;My calculator&quot;);
p = new Panel();
f.setLayout(new FlowLayout());
b1 = new Button(&quot;0&quot;);
b1.addActionListener(this);
b2 = new Button(&quot;1&quot;);
b2.addActionListener(this);
b3 = new Button(&quot;2&quot;);
b3.addActionListener(this);
b4 = new Button(&quot;3&quot;);
b4.addActionListener(this);
b5 = new Button(&quot;4&quot;);
b5.addActionListener(this);
b6 = new Button(&quot;5&quot;);
b6.addActionListener(this);
b7 = new Button(&quot;6&quot;);
b7.addActionListener(this);
b8 = new Button(&quot;7&quot;);
b8.addActionListener(this);
b9 = new Button(&quot;8&quot;);
b9.addActionListener(this);
b10 = new Button(&quot;9&quot;);
b10.addActionListener(this);
b11 = new Button(&quot;+&quot;);
b11.addActionListener(this);
b12 = new Button(&quot;-&quot;);
b12.addActionListener(this);
b13 = new Button(&quot;*&quot;);
b13.addActionListener(this);
b14 = new Button(&quot;/&quot;);
b14.addActionListener(this);
b15 = new Button(&quot;%&quot;);
b15.addActionListener(this);
b16 = new Button(&quot;=&quot;);
b16.addActionListener(this);

b17 = new Button(&quot;C&quot;);
b17.addActionListener(this);
tf = new TextField(20);
f.add(tf);
g = new GridLayout(4,4,10,20);
p.setLayout(g);
p.add(b1);p.add(b2);p.add(b3);p.add(b4);p.add(b5);p.add(b6);p.add(b7);p.add(b8);p.add(b9);
p.add(b10);p.add(b11);p.add(b12);p.add(b13);p.add(b14);p.add(b15);p.add(b16);p.add(b17);
f.add(p);
f.setSize(300,300);
f.setVisible(true);
}
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==b1)
{
s3 = tf.getText();
s4 = &quot;0&quot;;
s5 = s3+s4;
tf.setText(s5);
}
if(e.getSource()==b2)
{
s3 = tf.getText();
s4 = &quot;1&quot;;
s5 = s3+s4;
tf.setText(s5);
}
if(e.getSource()==b3)
{
s3 = tf.getText();
s4 = &quot;2&quot;;
s5 = s3+s4;
tf.setText(s5);
}if(e.getSource()==b4)
{
s3 = tf.getText();
s4 = &quot;3&quot;;
s5 = s3+s4;
tf.setText(s5);
}
if(e.getSource()==b5)
{
s3 = tf.getText();
s4 = &quot;4&quot;;
s5 = s3+s4;
tf.setText(s5);
}
if(e.getSource()==b6)
{
s3 = tf.getText();
s4 = &quot;5&quot;;
s5 = s3+s4;
tf.setText(s5);
}
if(e.getSource()==b7)
{
s3 = tf.getText();
s4 = &quot;6&quot;;
s5 = s3+s4;
tf.setText(s5);
}
if(e.getSource()==b8)
{
s3 = tf.getText();
s4 = &quot;7&quot;;
s5 = s3+s4;
tf.setText(s5);
}
if(e.getSource()==b9)
{
s3 = tf.getText();

s4 = &quot;8&quot;;
s5 = s3+s4;
tf.setText(s5);
}
if(e.getSource()==b10)
{
s3 = tf.getText();
s4 = &quot;9&quot;;
s5 = s3+s4;
tf.setText(s5);
}
if(e.getSource()==b11)
{
s1 = tf.getText();
tf.setText(&quot;&quot;);
c=1;
}
if(e.getSource()==b12)
{
s1 = tf.getText();
tf.setText(&quot;&quot;);
c=2;
}
if(e.getSource()==b13)
{
s1 = tf.getText();
tf.setText(&quot;&quot;);
c=3;
}
if(e.getSource()==b14)
{
s1 = tf.getText();
tf.setText(&quot;&quot;);
c=4;
}
if(e.getSource()==b15)
{
s1 = tf.getText();
tf.setText(&quot;&quot;);
c=5;
}
if(e.getSource()==b16)
{
s2 = tf.getText();
if(c==1)
{
n = Integer.parseInt(s1)+Integer.parseInt(s2);
tf.setText(String.valueOf(n));
}
else
if(c==2)
{
n = Integer.parseInt(s1)-Integer.parseInt(s2);
tf.setText(String.valueOf(n));
}
else
if(c==3)
{
n = Integer.parseInt(s1)*Integer.parseInt(s2);
tf.setText(String.valueOf(n));
}
if(c==4)
{
try
{
int p=Integer.parseInt(s2);
if(p!=0)

{
n = Integer.parseInt(s1)/Integer.parseInt(s2);
tf.setText(String.valueOf(n));
}
else
tf.setText(&quot;infinite&quot;);
}
catch(Exception i){}
}
if(c==5)
{
n = Integer.parseInt(s1)%Integer.parseInt(s2);
tf.setText(String.valueOf(n));
}
}
if(e.getSource()==b17)
{
tf.setText(&quot;&quot;);
}
}
public static void main(String[] abc)
{
calculator v = new calculator();
}
}
