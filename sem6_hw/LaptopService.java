package sem6_hw;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LaptopService {

    private static Set<Laptop> laptops = new HashSet<>();
    private static List<String> searchAnser = new ArrayList<>();


    public static Set<Laptop> getLaptops() {
        return laptops;
    }

    public void createLaptopSet( int sizeOfLaptopSet){
            for (int i = 0; i <= sizeOfLaptopSet; i++) {
            laptops.add(new Laptop());
        }
    }

    public static List<String> SearchByRAM(int paramSearch) {
        searchAnser.clear();
        for (Laptop laptop : laptops) {
            if (laptop.getRamNumber() == paramSearch ) {
                searchAnser.add(laptop.toString());
            }
        }
        return searchAnser;
    }

    public static List<String> SearchByHardDriveCapasity(int paramSearch) {
        searchAnser.clear();
        for (Laptop laptop : laptops) {
            if (laptop.getHardDriveCapacity() == paramSearch ) {
                searchAnser.add(laptop.toString());
            }
        }
        return searchAnser;
    }

    public static List<String> SearchByOS(String paramSearch) {
        searchAnser.clear();
        for (Laptop laptop : laptops) {
            if (laptop.getSysType() == paramSearch ) {
                searchAnser.add(laptop.toString());
            }
        }
        return searchAnser;
    }

    public static void ClearSet() {
        laptops.clear();
    }

  
    
}
