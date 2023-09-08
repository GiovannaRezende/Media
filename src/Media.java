import javax.swing.JOptionPane;

public class Media {

    public static void main(String[] args) {
        
        String nomeCompleto, disciplina;
        double nota1, nota2, media;
        
        nomeCompleto = JOptionPane.showInputDialog("Qual o seu nome completo?");
        disciplina = JOptionPane.showInputDialog("Qual a disciplina que você está estudando?");
        nota1 = Double.parseDouble(JOptionPane.showInputDialog("Qual a sua nota da primeira avaliação?"));
        nota2 = Double.parseDouble(JOptionPane.showInputDialog("Qual a sua nota da segunda avaliação?"));
        media = (nota1 + nota2) / 2;
        
        if (media > 6) {
            JOptionPane.showMessageDialog(null, "Parabéns, " + nomeCompleto + "! Você foi aprovado(a) em " + disciplina + " com média " + media + ".");
        } else {
            JOptionPane.showMessageDialog(null, "Que pena, " + nomeCompleto + "! Você foi reprovado(a) em " + disciplina + " com média " + media + ".");
        }
        
    }
    
}
