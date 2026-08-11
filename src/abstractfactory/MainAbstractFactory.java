package abstractfactory;

public class MainAbstractFactory {
    public static void main(String[] args) {
        System.out.println("=== TESTANDO FABRICA FIAT ===");
        MontadoraFactory fiatFactory = new FiatFactory();
        Sedan sedanFiat = fiatFactory.criarSedan();
        Hatch hatchFiat = fiatFactory.criarHatch();
        SUV suvFiat = fiatFactory.criarSUV();

        sedanFiat.exibirPortaMalas();
        hatchFiat.exibirConsumo();
        suvFiat.exibirTracao();

        System.out.println("\n=== TESTANDO FABRICA VOLKSWAGEN ===");
        MontadoraFactory volksFactory = new VolksFactory();
        Sedan sedanVolks = volksFactory.criarSedan();
        Hatch hatchVolks = volksFactory.criarHatch();
        SUV suvVolks = volksFactory.criarSUV();

        sedanVolks.exibirPortaMalas();
        hatchVolks.exibirConsumo();
        suvVolks.exibirTracao();
    }
}