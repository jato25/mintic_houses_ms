package houses_ms.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
@ResponseBody
public class BusyInmueblesAdvice {

    @ResponseBody
    @ExceptionHandler(BusyInmuebleException.class)
    @ResponseStatus(HttpStatus.CONFLICT)
    String BusyInmueblesAdvice(BusyInmuebleException ex) {
        return ex.getMessage();
    }
}
