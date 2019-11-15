package personPackage;

import com.zipcodewilmington.froilansfarm.interfaces.Eater;
import com.zipcodewilmington.froilansfarm.interfaces.NoiseMaker;
import com.zipcodewilmington.froilansfarm.interfaces.Rideable;
import com.zipcodewilmington.froilansfarm.interfaces.Rider;

public class Person implements Rider, Eater, NoiseMaker {

    public void eat(Edible edible) {

    }

    public String makeNoise() {
        return null;
    }

    public void mount(Rideable rideable) {

    }

    public void dismount() {

    }
}
