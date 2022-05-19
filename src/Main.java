public class Main {


    public static void main(String[] args) {



        Unit[] units = new Unit[20];

        for (int i=0; i<units.length; i++) {

            units[i] = new UnitFactory().create();
        }



        System.out.println();
        System.out.println("БИТВА НАЧАЛАСЬ!!!!");
        System.out.println();




        int k=0,l=0;

        while (true) {
            if (k != l){
                units[k].napadenie(units[l]);
            }
            k = random(units.length-1);
            l = random(units.length-1);
        }



    }

    public static int random(int i){
        int x = ( int )Math.round(i*Math.random());
        // System.out.println(x);
        return x;
    }

}


enum ArmorNames{
    КОЛЬЧУГА,
    СТАЛЬНОЙ_ДОСПЕХ,
    КОЖАНЫЙ_ЖИЛЕТ,
    КОСУХА,
    КОНОПЛЯНАЯ_РУБАХА,
    ЗАЩИТНОЕ_ПОЛЕ,
    ЧЁРНАЯ_МАНТИЯ,
    ЧЕШУЯ_ДРАКОНА,
    МЕДВЕЖЬЯ_ШКУРА

}

enum WeaponNames{
    ТОПОР,
    МЕЧ_КЛАДИНЕЦ,
    АВТОМАТ_УЗИ,
    САБЛЯ,
    ЗАКЛИНАНИЕ,
    ОГОНЬ,
    ФИНКА,
    КОПЬЁ,
    ЛУК_И_СТРЕЛЫ
}

enum UnitNames{
    ЛАНСЕЛОТ,
    МАРК,
    КУРТ,
    РИЧАРД,
    МЕРЛИН,
    ЕМЕЛЯ,
    ИВАН,
    ВАСИЛИЙ,
    КВАЗИМОДО
}


enum AddNames{
    великолепный,
    орк,
    гном,
    десантник,
    чудак,
    неимоверный,
    непоколебимый,
    сантехник,
    царь,
    менеджер,
    танкист,
    курьер
}
