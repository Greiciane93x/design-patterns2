package comportamentais.command;

public class Test {
    public static void main(String[] args) {
            Calculadora calculadora = new Calculadora();

            Invoker invoker = new Invoker();

            invoker.compute(new Soma(calculadora ,10));
            invoker.compute(new Soma(calculadora,20));
            invoker.compute(new Soma(calculadora,30));
            invoker.compute(new Soma(calculadora,30));
            invoker.compute(new Soma(calculadora,30));

            // desfaz as duas últimas operações
            invoker.undo(2);
    }
}
