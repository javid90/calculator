package az.rabitabank.calculator.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.Nullable;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.context.request.ServletWebRequest;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import az.rabitabank.calculator.dto.response.ErrorResponseDto;

@ControllerAdvice
public class CalculatorExceptionHandler extends ResponseEntityExceptionHandler {

	@Override
	protected ResponseEntity<Object> handleExceptionInternal(Exception ex, @Nullable Object body, HttpHeaders headers,
			HttpStatus status, WebRequest request) {

		ErrorResponseDto errorResponseDto = ErrorResponseDto.builder().status(status.value()).error(status.name())
				.message(ex.getMessage()).errorDetail(ex.getCause() != null ? ex.getCause().getMessage() : null)
				.path(((ServletWebRequest) request).getRequest().getRequestURI())
				.timestamp(LocalDateTime.now().toString()).build();

		return new ResponseEntity<>(errorResponseDto, status);

	}

}
