import javax.swing.JOptionPane;

public class ProgramacaoVisual {
    public static void main(String[] args) {
        String nome = null;
        int resposta;
        nome = JOptionPane.showInputDialog("Qual é o seu nome?");
        resposta = JOptionPane.showConfirmDialog(null,"Nome: " +nome);
        if (resposta == JOptionPane.YES_OPTION)
        {
            JOptionPane.showMessageDialog(null, "Nome correto!");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Nome incorreto!");
        }
    }
}
