package com.zipcodewilmington.froilansfarm.farm;

import com.zipcodewilmington.froilansfarm.animals.Chicken;
import com.zipcodewilmington.froilansfarm.vehicles.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class Farm {

   private List<Field> fieldList;
   private List<Stable> stableList;
   private List<ChickenCoop> coopList;
   private List<Vehicle> vehicleList;
   private FarmHouse farmHouse;
   private Field field;

   public Farm(){
       this.stableList = new ArrayList<>();
       this.coopList = new ArrayList<>();
       this.vehicleList = new ArrayList<>();
       this.field = new Field();
   }

   public void setField(Field field){
       this.field = field;
   }

   public Field getField(){
       return field;
   }

   public void setFarmHouse(){
       this.farmHouse = farmHouse;
   }

   public FarmHouse getFarmHouse(){
       return farmHouse;
   }

    public void addStable(Stable stable){
       stableList.add(stable);
    }

    public void addChickenCoop(ChickenCoop chickenCoop){
       coopList.add(chickenCoop);
    }

    public void addVehicle(Vehicle vehicle){
        vehicleList.add(vehicle);
    }

    public List<Stable> getStableList(){
       return stableList;
    }

    public List<ChickenCoop> getCoopList(){
       return coopList;
    }

    public List<Vehicle> getVehicleList(){
       return vehicleList;
    }

}
