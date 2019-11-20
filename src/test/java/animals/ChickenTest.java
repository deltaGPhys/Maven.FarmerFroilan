package animals;

import com.zipcodewilmington.froilansfarm.animals.Animal;
import com.zipcodewilmington.froilansfarm.animals.Chicken;
import com.zipcodewilmington.froilansfarm.crops.Crop;
import com.zipcodewilmington.froilansfarm.interfaces.Produce;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ChickenTest {
    Chicken chicken;

    @Before
    public void setUp() throws Exception {
        chicken= new Chicken();
    }

    @Test
    public void constructorTest() {
        Assert.assertTrue(chicken instanceof Animal);
        Assert.assertEquals(chicken.);
    }
}
