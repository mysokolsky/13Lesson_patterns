public class Weapon{


    public String name;   // название оружия
    public double parameter;  // коэффициент оружия, увеличивающий силу атаки персонажа
    public int iznos;    // долговечность оружия


    public Weapon(String nameweapon, double paramweapon, int healthweapon){
        this.name = nameweapon;
        this.parameter = paramweapon;
        this.iznos = healthweapon;

        System.out.println("Объект " + this.name + " создан!");

    }

    public void damageWeapon(){
        if (iznos>0){

            iznos -= 5;
            parameter *= .95;
            System.out.println("Износ оружия "+ name + " " + (100-iznos) + "%");
        }
        else parameter = 1;


    }

}