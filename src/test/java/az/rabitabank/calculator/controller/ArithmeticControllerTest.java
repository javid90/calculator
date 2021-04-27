package az.rabitabank.calculator.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import az.rabitabank.calculator.dto.request.ArithmeticRequestDto;
import az.rabitabank.calculator.util.Utility;

@AutoConfigureMockMvc
@SpringBootTest
public class ArithmeticControllerTest {
	
    private String addEndpoint = "/arithmetic/add";
    private String subtractEndpoint = "/arithmetic/subtract";
    private String multiplyEndpoint = "/arithmetic/multiply";
    private String divideEndpoint = "/arithmetic/divide";

    @Autowired
    private MockMvc mockMvc;
    
    private ArithmeticRequestDto requestDto;

    @BeforeEach
    public void setUp() {
    	
    	requestDto = ArithmeticRequestDto.builder().a(4).b(2).build();
    	
    }

    @Test
    public void addTest() throws Exception {
        mockMvc.perform(post(addEndpoint).content(Utility.convertToJsonString(requestDto))
                .contentType("application/json"))
                .andExpect(MockMvcResultMatchers.status().is(HttpStatus.OK.value()));
    }
    
    @Test
    public void subtractTest() throws Exception {
        mockMvc.perform(post(subtractEndpoint).content(Utility.convertToJsonString(requestDto))
                .contentType("application/json"))
                .andExpect(MockMvcResultMatchers.status().is(HttpStatus.OK.value()));
    }
    
    @Test
    public void multiplyTest() throws Exception {
        mockMvc.perform(post(multiplyEndpoint).content(Utility.convertToJsonString(requestDto))
                .contentType("application/json"))
                .andExpect(MockMvcResultMatchers.status().is(HttpStatus.OK.value()));
    }
    
    @Test
    public void divideTest() throws Exception {
        mockMvc.perform(post(divideEndpoint).content(Utility.convertToJsonString(requestDto))
                .contentType("application/json"))
                .andExpect(MockMvcResultMatchers.status().is(HttpStatus.OK.value()));
    }


}
