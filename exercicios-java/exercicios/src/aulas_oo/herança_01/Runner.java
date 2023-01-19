package aulas_oo.herança_01;

public class Runner {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();//instanciando "funcionario"
        //"Funcionario" será a classe mãe/superclasse das classes gerente, vendedor e faxineiro

        // Upcast - Facilita polimorfismo
        Funcionario gerente = new Gerente();
        Funcionario vendedor = new Vendedor();
        Funcionario faxineiro = new Faxineiro();

        // Downcast
        // É necessário explicitar parar quem será o downcast, evitar usar downcast
        Vendedor vendedor_ = (Vendedor) new Funcionario();
    }
}
