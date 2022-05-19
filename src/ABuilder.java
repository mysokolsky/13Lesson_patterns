public class ABuilder {

    public String name;   // название брони
    public double parameter;  // коэффициент сопротивления брони
    public int iznos;    // долговечность брони

    public ABuilder setArmorName(String name) {
        this.name = name;
        return this;
    }

    public ABuilder setArmorResistance(double parameter){
        this.parameter = parameter;
        return this;
    }

    public ABuilder setArmorHealth(int iznos){
        this.iznos = iznos;
        return this;
    }

    public Armor build() {
        return new Armor(name, parameter, iznos);
    }

}
