package factorymethod;

import javax.swing.JOptionPane;

public class Carro implements Veiculo {
    @Override
    public void exibirDetalhes() {
        JOptionPane.showMessageDialog(null, "Veículo: Carro | 4 Rodas | Motorização Padrão");
    }
}