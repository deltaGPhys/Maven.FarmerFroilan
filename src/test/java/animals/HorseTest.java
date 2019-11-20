package animals;

import com.zipcodewilmington.froilansfarm.animals.Animal;

import com.zipcodewilmington.froilansfarm.animals.Horse;
import com.zipcodewilmington.froilansfarm.edibles.EarCorn;
import com.zipcodewilmington.froilansfarm.interfaces.Rideable;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class HorseTest {
    Horse horse;
    EarCorn corn;

    @Before
    public void setUp() throws Exception {
        horse = new Horse();
    }

    @Test
    public void constructorTest() {
        Assert.assertTrue(horse instanceof Animal);
        Assert.assertTrue(horse instanceof Rideable);
    }

    @Test
    public void noiseTest(){
        Assert.assertEquals("Neigh!", horse.makeNoise());
    }

    @Test
    public void eatTest() {Assert.assertEquals("Yum! Corn! I'm a happy horse yeehaw", horse.eat(corn));}

}
