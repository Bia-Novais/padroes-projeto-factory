package factorymethod;

import javax.swing.JOptionPane;

public class MainSwing {
    public static void main(String[] args) {
        String[] opcoes = {"CARRO", "MOTO"};
        
        String escolha = (String) JOptionPane.showInputDialog(
                null,
                "Selecione o veículo que deseja criar:",
                "Factory Method Demo",
                JOptionPane.QUESTION_MESSAGE,
                null,
                opcoes,
                opcoes[0]
        );

        if (escolha != null) {
            Veiculo veiculo = VeiculoFactory.criarVeiculo(escolha);
            veiculo.exibirDetalhes();
        }
    }
}