package bluemarble.entity.tile;

import bluemarble.entity.construct.Building;
import bluemarble.entity.construct.Hotel;
import bluemarble.entity.construct.Villa;
import bluemarble.ifs.Tile;

public class City extends Tile {
    private int price;
    private Villa villa;
    private Building building;
    private Hotel hotel;


    public Villa getVilla() {
        return villa;
    }

    public Building getBuilding() {
        return building;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public City() {
    }

    public City(String name) {
        super.name = name;
    }
}
