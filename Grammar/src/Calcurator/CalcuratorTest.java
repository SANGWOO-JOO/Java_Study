package Calcurator;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calculator; // 클래스 인스턴스화

    @BeforeEach
    public void SetUp(){
        calculator = new Calculator(); // 새로운 객체 생성
    }


//    @Test
//    @CsvSource(value = {"2 + 3 * 4 / 2:10"}, delimiter = ':')
//    void true_false(String num, boolean bool) {
//
//        String [] result = calculator.seperate(num); // 문자열 분리
//
//        assertThat(calculator.calculateString(result)).isEqualTo(bool);
//    }

    @Test
    void setCalculator(){
        String str = "2 + 3 * 4 / 2";

//        calculator.calculateString(seperate)
        assertThat(10).isEqualTo(calculator.calculateString(str));

    }


//    @Test
//    void setCalculator(){
//        String str = "2 + 3 * 4 / 2";
//        int ten = 10;
//
//        calculator.calculateString(str);
//        assertEquals(ten, calculator.calculateString(str));
//
//    }


//    @Test
//    public void testPlus() {
//        int result = calculator.plus(4,19);
//        int a =23;
//        assertEquals(a, result);
//    }

}