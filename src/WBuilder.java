public class WBuilder {

    public String name;   // название оружия
    public double parameter;  // коэффициент оружия, увеличивающий силу атаки персонажа
    public int iznos;    // долговечность оружия

    public WBuilder setWeaponName(String name) {
        this.name = name;
        return this;
    }

    public WBuilder setWeaponAttack(double parameter){
        this.parameter = parameter;
        return this;
    }

    public WBuilder setWeaponHealth(int iznos){
        this.iznos = iznos;
        return this;
    }

    public Weapon build() {
        return new Weapon(name, parameter,iznos);
    }

}
