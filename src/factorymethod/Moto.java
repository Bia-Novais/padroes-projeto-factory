package factorymethod;

import javax.swing.JOptionPane;

public class Moto implements Veiculo {
    @Override
    public void exibirDetalhes() {
        JOptionPane.showMessageDialog(null, "Veículo: Moto | 2 Rodas | Alta Agilidade");
    }
}