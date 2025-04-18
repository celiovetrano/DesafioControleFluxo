package application;

public class ParametrosInvalidosException extends Exception {
    
    public ParametrosInvalidosException(String mensagem) {
        super(mensagem); // Passa a mensagem para a classe Exception
    }
}
