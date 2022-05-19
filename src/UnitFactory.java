
import java.util.Random;

public class UnitFactory {

    UnitNames[] names = UnitNames.values();
    WeaponNames[] wnames = WeaponNames.values();
    ArmorNames[] anames = ArmorNames.values();
    AddNames[] addNames = AddNames.values();


    int un = names.length;
    int wn = wnames.length;
    int an = anames.length;
    int addn = addNames.length;


    public Unit create(){

        return switch (random(3) + 1) {
            case 1 -> create_junior();
            case 2 -> create_middle();
            case 3 -> create_senior();
            default -> null;
        };
    }


    public Unit create_junior(){
        return new Unit(name(),100,20,armor(),weapon());
    }

    public Unit create_middle(){
        return new Unit(name(),100,30,armor(),weapon());
    }

    public Unit create_senior(){
        return new Unit(name(),100,40,armor(),weapon());
    }




    public String name() {
        return addNames[random(addn-1)].toString().toUpperCase() + " " + names[random(un-1)];
    }

    public Armor armor() {
        return new ABuilder().
                setArmorName(anames[random(an-1)].toString()).
                setArmorResistance((11+random(9))/10).
                setArmorHealth(100).
                build();
    }

    public Weapon weapon() {
        return new WBuilder().
                setWeaponName(wnames[random(wn-1)].toString()).
                setWeaponAttack((11+random(9))/10).
                setWeaponHealth(100).
                build();
    }




    public static int random(int x){
        return new Random().nextInt(x);
    }



}
