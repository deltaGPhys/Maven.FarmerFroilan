package farm;

import com.sun.scenario.effect.Crop;

import java.util.ArrayList;
import java.util.List;

public class CropRow {
    //List of Crop
    private List<Crop> cropRowList = new ArrayList<>();

    //add
    public void add(Crop crop){
        cropRowList.add(crop);
    }

}
