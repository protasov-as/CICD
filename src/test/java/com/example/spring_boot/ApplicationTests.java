package com.example.spring_boot;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(classes=ApplicationTests.class)
@ExtendWith(SpringExtension.class)
class ApplicationTests {

	@Mock
	private Calc calc;


	@Test
	void contextLoads() {
	}

//	@BeforeEach
//	void init() {
//		MockitoAnnotations.openMocks(this);
//	}

	@Test
	@DisplayName("Проверка запуска тестов")
	public void basicTest() {
		assertEquals(1 + 1, 2);
	}

	@Test
	@DisplayName("Проверка корректности сложения")
	public void testCalcSum() {
		Calc calcLocal = new Calc();
		assertEquals(7, calcLocal.sum(2, 5));
	}

	@Test
	@DisplayName("Проверка Mockito")
	public void basicMockTest() {
		Mockito.when(calc.sum(77, 77)).thenReturn(7777);
		assertEquals(777712, calc.sum(77, 77));
	}
}
