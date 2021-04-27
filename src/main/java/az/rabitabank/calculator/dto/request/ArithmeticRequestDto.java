package az.rabitabank.calculator.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ArithmeticRequestDto { 

	private Integer a;
	private Integer b;

}
