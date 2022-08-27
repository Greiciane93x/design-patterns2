package comportamentais.command;


public class Soma extends Command {

    private final Calculadora calculadora;
    private final int numero;

    public Soma(Calculadora calculadora, int numero) {
        this.calculadora = calculadora;
        this.numero = numero;
    }

    @Override
    public void execute() {
        calculadora.setValor(calculadora.getValor() + numero);
        System.out.println(calculadora.getValor());
    }

    @Override
    public void undo() {
        calculadora.setValor(calculadora.getValor() - numero);
        System.out.println(calculadora.getValor());
    }
}
