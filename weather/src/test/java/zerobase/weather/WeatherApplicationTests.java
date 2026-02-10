package zerobase.weather;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class WeatherApplicationTests {


    @Test
    void equalTest(){
        assertEquals(1,1);

    }

    @Test
    void nullTest(){
        assertNull(null);
    }

    @Test
    void trueTest(){
        assertTrue(1==1);
    }

}



// assertSame(a,b) 같은 객체임을 확인, 객체 자체를 비교한다.
// aasertEquals(a,b) 객체가 일치함을 확인, 객체에 정의된 equals를 통해 비교
// assertArrayEquals(a,b) 배열 a,b가 일치함을 확인
// assertTrue(a) a가 참인지 확인
// assertNotNull(a) a가 널인지 확인