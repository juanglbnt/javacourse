package builders;

import com.juan.designPatterns.BuilderPatternHouseExample.product.House;

public class PrefabricatedHouse implements HouseBuilder{
    private House house;

    public PrefabricatedHouse(){
        this.house = new House();
    }

    @Override
    public void buildFoundation() {
        house.setFoundation("wood, laminate, pvc flooring");
        System.out.println("PrefabricatedHouseBuilder: foundation complete...");
    }

    @Override
    public void buildStructure() {
        house.setStructure("structural steels, wooden wall panels");
        System.out.println("PrefabricatedHouseBuilder: structure complete...");
    }

    @Override
    public void buildRoof() {
        house.setRoof("roofing sheets");
        System.out.println("PrefabricatedHouseBuilder: roof complete...");
    }

    @Override
    public void paintHouse() {
        house.setPainted(false);
        System.out.println("PrefabricatedHouseBuilder: painting not required...");
    }

    @Override
    public void furnishHouse() {
        house.setFurnished(false);
        System.out.println("PrefabricatedHouseBuilder: furnishing not required...");
    }

    @Override
    public House getHouse() {
        System.out.println("PrefabricatedHouseBuilder: prefabricated house complete...");
        return this.house;
    }
}
