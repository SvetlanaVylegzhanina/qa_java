import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {
    @Mock
    Feline feline;

    @Test
    public void getKittensReturnCorrectResult() throws Exception {
            Lion lion = new Lion("Самец", feline);
            int expectedResult = 1;
            Mockito.when(feline.getKittens()).thenReturn(expectedResult);
            int actualResult = lion.getKittens();
            assertEquals(expectedResult, actualResult);
    }

    @Test
    public void getFoodReturnCorrectResult() throws Exception {
            Lion lion = new Lion("Самец", feline);
            List<String> expectedResult = List.of("Животные", "Птицы", "Рыба");
            Mockito.when(feline.getFood(Mockito.anyString())).thenReturn(expectedResult);
            List<String> actualResult = lion.getFood();
            assertEquals(expectedResult, actualResult);
    }

}
