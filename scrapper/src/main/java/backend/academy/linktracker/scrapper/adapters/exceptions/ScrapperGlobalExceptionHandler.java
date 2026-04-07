package backend.academy.linktracker.scrapper.adapters.exceptions;

import backend.academy.linktracker.scrapper.usecases.dtos.models.ApiErrorResponse;
import backend.academy.linktracker.scrapper.usecases.exceptions.ConflictException;
import backend.academy.linktracker.scrapper.usecases.exceptions.DomainException;
import backend.academy.linktracker.scrapper.usecases.exceptions.NotFoundException;
import backend.academy.linktracker.scrapper.usecases.exceptions.ValidationException;
import java.util.Arrays;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ScrapperGlobalExceptionHandler {
    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<ApiErrorResponse> handle(NotFoundException ex) {
        return handleDomainException(ex, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(ValidationException.class)
    public ResponseEntity<ApiErrorResponse> handle(ValidationException ex) {
        return handleDomainException(ex, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(ConflictException.class)
    public ResponseEntity<ApiErrorResponse> handle(DomainException ex) {
        return handleDomainException(ex, HttpStatus.CONFLICT);
    }

    private ResponseEntity<ApiErrorResponse> handleDomainException(DomainException ex, HttpStatus status) {
        return ResponseEntity.status(status)
                .body(new ApiErrorResponse()
                        .description(ex.getUserDescription())
                        .code(String.valueOf(
                                status.value())) // Not use name cause codes are global, but names are lib specified
                        // (another
                        // good lib - apache)
                        .exceptionMessage(ex.getMessage())
                        .stacktrace(Arrays.stream(ex.getStackTrace())
                                .map(StackTraceElement::toString)
                                .toList()));
    }
}
