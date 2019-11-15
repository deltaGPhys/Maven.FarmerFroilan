package farm;

import java.util.ArrayList;
import java.util.List;

public class Field {
    //List of CropRow
    List<CropRow> cropRowList = new ArrayList<>();
    //add
    //remove
    //size
    public void add(CropRow cropRow){
        cropRowList.add(cropRow);
    }
}
