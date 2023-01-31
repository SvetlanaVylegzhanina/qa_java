import com.example.Feline;
import org.junit.Test;
import java.util.List;
import static org.junit.Assert.assertEquals;
public class FelineTest {


    @Test
    public void eatMeatReturnReturnCorrectResult() throws Exception{
        Feline feline = new Feline();
        List<String> expectedResult = List.of("Животные", "Птицы", "Рыба");
        List<String> actualResult = feline.eatMeat();
        assertEquals (expectedResult, actualResult);
    }

    @Test
    public void getFamilyReturnCorrectResult(){
        Feline feline = new Feline();
        String expectedResult = "Кошачьи";
        String actualResult = feline.getFamily();
        assertEquals (expectedResult, actualResult);
    }

    @Test
    public void getKittensWithOutParameterReturnCorrectResult(){
        Feline feline = new Feline();
        int expectedResult = 1;
        int actualResult = feline.getKittens();
        assertEquals (expectedResult, actualResult);
    }

    @Test
    public void getKittensWithParameterReturnCorrectResult(){
        Feline feline = new Feline();
        int expectedResult = 5;
        int actualResult = feline.getKittens(5);
        assertEquals (expectedResult, actualResult);
    }

}
