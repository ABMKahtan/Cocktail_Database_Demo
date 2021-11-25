package com.tsi.kahtan.abubakr.cocktaildemo.cocktailDbDemo;

import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.List;

public class Equipment {

        private List<Equipment> equipmentList = new ArrayList<>();
        private int equipmentID;
        private String equipmentName;

        public Equipment(int equipmentID, String equipmentName){
            this.equipmentID = equipmentID;
            this.equipmentName = equipmentName;
        }

        public void populatingIngredientList(){
            this.equipmentList.add(new Equipment(0, "EQUIPMENT NAME"));
        }
        public List<Equipment> getEquipmentList(){
            return this.equipmentList;
        }
        public String toString(){
            String json = new Gson().toJson(equipmentList);
            return json;
        }

}