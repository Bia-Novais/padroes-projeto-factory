package abstractfactory;

/**
 * Abstract Factory (Fábrica Abstrata)
 * Define a interface responsável por criar famílias de produtos relacionados
 * (Sedan, Hatch e SUV) sem especificar suas classes concretas.
 */
public interface MontadoraFactory {
    // Métodos para criação dos produtos da família
    Sedan criarSedan();
    Hatch criarHatch();

    /**
     * Adição do novo produto SUV.
     * A inclusão do SUV exige a alteração desta interface
     * e de todas as suas implementações concretas (FiatFactory, VolksFactory).
     */
    SUV criarSUV(); 
}
