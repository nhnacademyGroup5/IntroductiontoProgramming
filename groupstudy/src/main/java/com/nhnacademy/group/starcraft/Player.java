package com.nhnacademy.group.starcraft;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private final List<Unit> units = new ArrayList<>();
    public List<Unit> getUnits() {
        return units;
    }

    public Player(String tribe){
        switch (tribe) {
            case "terran":
                for (int i = 0; i < 5; i++) {
                    Unit[] terran = {new Marine(), new Tank(), new Goliath(), new Wraith(), new Valkyrie()};
                    units.add(terran[(int) (Math.random() * 5)]);
                }
                break;
            case "protoss":
                for (int i = 0; i < 4; i++) {
                    Unit[] protoss = {new Zealot(), new Dragoon(), new HighTempler(), new Scout(), new Corsair()};
                    units.add(protoss[(int) (Math.random() * 5)]);
                }
                break;
            case "zerg":
                for (int i = 0; i < 8; i++) {
                    Unit[] zerg =
                            {new Zergling(), new Hydralisk(), new Ultralisk(), new Mutalisk(), new Guardian()};
                    units.add(zerg[(int) (Math.random() * 5)]);
                }
                break;
        }
    }
    public void arrange(Unit change, int index){
        if(change != null){
            units.set(index, change);
            units.removeIf(unit -> unit.def <= 0);
        }
    }
}
