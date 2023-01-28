import com.example.Feline;
import org.junit.Test;
import java.util.List;
import static org.junit.Assert.assertEquals;
public class FelineTest {
    Feline feline = new Feline();

    @Test
    public void eatMeatReturnReturnCorrectResult() throws Exception{
        List<String> expectedResult = List.of("Животные", "Птицы", "Рыба");
        List<String> actualResult = feline.eatMeat();
        assertEquals (expectedResult, actualResult);
    }

    @Test
    public void getFamilyReturnCorrectResult(){
        String expectedResult = "Кошачьи";
        String actualResult = feline.getFamily();
        assertEquals (expectedResult, actualResult);
    }

    @Test
    public void getKittensWithOutParameterReturnCorrectResult(){
        int expectedResult = 1;
        int actualResult = feline.getKittens();
        assertEquals (expectedResult, actualResult);
    }

    @Test
    public void getKittensWithParameterReturnCorrectResult(){
        int expectedResult = 5;
        int actualResult = feline.getKittens(5);
        assertEquals (expectedResult, actualResult);
    }

}
