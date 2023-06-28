import javax.swing.JOptionPane;

public class App {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {

        String Nome = JOptionPane.showInputDialog("Qual seu nome ?");
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Qual sua idade ?"));
        
        double temperatura = Double.parseDouble(JOptionPane.showInputDialog("Qual a temperatura em graus Celsius ?"));

        
        double fahrenheit = (temperatura * 9 / 5) + 32;

        
        JOptionPane.showMessageDialog(null, String.format("Seu nome é: %s\nVocê tem : %d anos\nTemperatura em fahrenheit é: %.2f", Nome, idade,fahrenheit));

    }
}