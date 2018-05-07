
import mockitotest.CalcService;
import mockitotest.ICalculator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class CalcServiceTest {
CalcService calcService=new CalcService();
    @Before
public void setup(){
   ICalculator cal=mock(ICalculator.class);
    when(cal.add(3,3)).thenReturn(6);
    calcService=new CalcService();
    calcService.setCal(cal);
}
@Test 
public void testAddTwoNumbers(){
    
    Assert.assertEquals(6,calcService.add(3, 3));
}

    
}
