import com.example.Cat;
import com.example.Feline;
import com.example.Lion;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionTest {

    @Before
    public void init() {
        MockitoAnnotations.openMocks(this);
    }

    @Mock
    Feline feline;

    private final String sex;
    private final boolean hasMane;
    private final String exceptionError = "Используйте допустимые значения пола животного - самец или самка";

    public LionTest(String sex, boolean hasMane){
        this.sex = sex;
        this.hasMane = hasMane;
    }

    @Parameterized.Parameters
    public static Object[][] getData() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false},
                {"Неопределенно", false},
        };
    }

    @Test
    public void getKittensReturnCorrectResult() {
        try {
            Lion lion = new Lion(sex, feline);
            int expectedResult = 1;
            Mockito.when(feline.getKittens()).thenReturn(expectedResult);
            int actualResult = lion.getKittens();
            assertEquals(expectedResult, actualResult);
        } catch (Exception exception){
            assertEquals(exceptionError, exception.getMessage());
        }
    }

    @Test
    public void getFoodReturnCorrectResult() {
        try {
            Lion lion = new Lion(sex, feline);
            List<String> expectedResult = List.of("Животные", "Птицы", "Рыба");
            Mockito.when(feline.getFood(Mockito.anyString())).thenReturn(expectedResult);
            List<String> actualResult = lion.getFood();
            assertEquals(expectedResult, actualResult);
        } catch (Exception exception){
            assertEquals(exceptionError, exception.getMessage());
        }
    }

    @Test
    public void doesHaveManeReturnCorrectBoolResult() {
        try {
            Lion lion = new Lion(sex, feline);
            boolean actualResult = lion.doesHaveMane();
            assertEquals(hasMane, actualResult);
        } catch (Exception exception){
            assertEquals(exceptionError, exception.getMessage());
        }
    }
}
