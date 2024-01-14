package io.rizwan.leadscrud.handler;

import io.rizwan.leadscrud.model.Response;
import io.rizwan.leadscrud.model.ResponseBodyError;
import jakarta.validation.ConstraintViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = ConstraintViolationException.class)
    public ResponseEntity<Response> constraintViolationExceptionHandler(ConstraintViolationException e) {
        return new ResponseEntity<>(new ResponseBodyError("error",
                new ResponseBodyError.ErrorResponse(String.valueOf(HttpStatus.BAD_REQUEST), e.getMessage())),
                HttpStatus.BAD_REQUEST);
    }

}
