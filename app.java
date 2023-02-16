import javax.swing.JOptionPane;

public class app {
    public static void main(String[] args) {
        
        String f = "";
        int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Type the number to be used in your calculator", "Simple calc", 1));
        int p = Integer.parseInt(JOptionPane.showInputDialog(null, "1-Add \n 2- Subtraction \n 3-Multiply \n 4- Divide", "Simple calc", 1));

        for (int r = 1; r < 11; r++) {
            switch (p) { 
                case 1:
                f += n + " + " + r + " = " + (n + r + "\n");
                    break;
                case 2:
                f += n + " - " + r + " = " + (n - r + "\n");
                    break;
                case 3:
                f += n + " x " + r + " = " + (n * r + "\n");
                    break;
                case 4:
                double result = (double) n / r;
                f += (n + " / " + r + " = " + result + "\n");
                    break;
            }
    
        }
        JOptionPane.showMessageDialog(null, "The result is: \n" + f);
    }
}