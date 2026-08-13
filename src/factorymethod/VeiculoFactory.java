package factorymethod;

/**
 * Classe Factory (Factory Method)
 * Responsável pela criação centralizada de instâncias de Veiculo.
 * Desacopla o cliente (MainSwing) do conhecimento direto das classes concretas (Carro, Moto).
 */
public class VeiculoFactory {
    /**
     * Método fábrica que instancia e retorna o veículo correspondente ao parâmetro.
     * 
     * @param  Tipo do veículo desejado ("CARRO" ou "MOTO")
     * @return Instância da interface Veiculo
     * @throws IllegalArgumentException se o tipo informado não for suportado
     */
    public static Veiculo criarVeiculo(String tipo) {
        if (tipo == null) return null;
        
        if (tipo.equalsIgnoreCase("CARRO")) {
            return new Carro();
        } else if (tipo.equalsIgnoreCase("MOTO")) {
            return new Moto();
        }
        
        throw new IllegalArgumentException("Tipo de veículo inválido: " + tipo);
    }
}