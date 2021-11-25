package houses_ms.exceptions;

public class InmuebleNotFoundException extends RuntimeException {
    public InmuebleNotFoundException(String message) {
        super(message);
    }
}
