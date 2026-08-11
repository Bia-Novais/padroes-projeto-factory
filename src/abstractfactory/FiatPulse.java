package abstractfactory;

public class FiatPulse implements SUV {
    @Override
    public void exibirTracao() {
        System.out.println("Fiat Pulse: Tração Dianteira com controle TC+.");
    }
}