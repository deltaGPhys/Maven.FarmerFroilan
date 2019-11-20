package people;

import com.zipcodewilmington.froilansfarm.people.Farmer;
import com.zipcodewilmington.froilansfarm.people.Person;
import org.junit.Assert;
import org.junit.Test;

public class TestFarmer {
    @Test
    public void farmerTest1() {
        Farmer farmer = new Farmer();
        Assert.assertTrue(farmer instanceof Person);
    }
    @Test
    public void pilotTest2() {
        Farmer farmer = new Farmer();
        Assert.assertTrue(farmer instanceof Farmer);
    }
}
