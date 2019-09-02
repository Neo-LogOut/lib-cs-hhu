import javax.swing.JOptionPane;
public class AdditionTest 
{
/** Main method */
public static void main(String[] args) 
{
     //产生两个随机数（int类型）
     int n1 = (int) (System.currentTimeMillis() % 100);
     int n2 = (int) (System.currentTimeMillis() * 7 % 10);
     //提示用户输入结果
     String answerString = JOptionPane.showInputDialog(
                       "What is " + n1 + " + " + n2 + "?");
     int answer = Integer.parseInt(answerString);
     //计算结果
     String result = n1 + " + " + n2 + " = " + answer + " is " 
                       + (n1 + n2 == answer);
     JOptionPane.showMessageDialog(null, result);
}
}

