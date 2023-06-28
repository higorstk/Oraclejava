   import javax.swing.JOptionPane;

public class problema02 {
    public static void main(String[] args) {
        String nomeCompleto = JOptionPane.showInputDialog("Digite um nome:");
        String[] letraNome = nomeCompleto.split(" ");
        String primeiroNome = letraNome[0];
        String ultimoNome = letraNome[letraNome.length - 1];

        String nomeFinal = String.format("%s , %c.", ultimoNome, primeiroNome.charAt(0));

        JOptionPane.showMessageDialog(null, "O nome digitado é : "+ nomeFinal);
    }
}