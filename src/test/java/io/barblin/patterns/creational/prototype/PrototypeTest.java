package io.barblin.patterns.creational.prototype;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PrototypeTest {

    @Test
    void cloneShouldCreateZombieArmyFromPrototypes(){
        VillainPrototypes prototypeCache = new VillainPrototypes();

        List<Villain> villains = new ArrayList<>();

        for(int i = 0; i < 1000; i++){
            villains.add(prototypeCache.get(Villain.VillainType.ZOMBIE));
        }

        for(Villain zombie : villains){
            assertTrue(zombie instanceof Zombie);
        }

        prototypeCache.put(Villain.VillainType.CREEPER, Creeper.create());
        assertEquals(Creeper.create(), prototypeCache.get(Villain.VillainType.CREEPER));
    }
}