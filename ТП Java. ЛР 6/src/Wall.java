/**
 * @author artem
 * @version 1.0
 * @project ТП Java. ЛР 6
 * @date 20.03.2022 19:58
 * @class Wall
 */

/*
* 2. Створити клас, який наслідує клас Rectangle по варіанту
* Створити в ньому метод getPrice(), реалізацію придумати самостійно.
* За кожне поле 0.5 бали.
*/
public class Wall extends Rectangle{
    //7*0.5=3.5
    private double priceForSquareMeter;
    private double thicknessInCM;
    private String material;
    private boolean isSoundIsolated;
    private boolean isLoadBearing;
    private boolean isHeatInsulated;
    private String coverMaterial;

    public Wall() {
    }

    public Wall(double height, double width, double priceForSquareMeter, double thicknessInCM, String material,
                boolean isSoundIsolated, boolean isLoadBearing, boolean isHeatInsulated, String coverMaterial) {
        super(height, width);
        this.priceForSquareMeter = priceForSquareMeter;
        this.thicknessInCM = thicknessInCM;
        this.material = material;
        this.isSoundIsolated = isSoundIsolated;
        this.isLoadBearing = isLoadBearing;
        this.isHeatInsulated = isHeatInsulated;
        this.coverMaterial = coverMaterial;
    }

    public double getPrice(){
        double price = 0;
        double kForBase = 1;
        double kForCover = 1;
        switch (material){
            case "Wood":
                kForBase*=1.1;
                break;
            case "Brick":
                kForBase*=1.2;
                break;
            case "Foam block":
                kForBase*=1.3;
                break;
            case "Slag block":
                kForBase*=1.4;
                break;
            case "Drywall":
                kForBase*=1.5;
                break;
        }
        kForBase*=(super.getArea()/10000) * (thicknessInCM/10);
        price += priceForSquareMeter*kForBase;

        switch (coverMaterial){
            case "Plaster":
                kForCover*=1.1;
                break;
            case "Wallpapers":
                kForCover*=1.2;
                break;
        }

        if (kForCover!=1){
            price += kForCover*super.getArea()/1000;
        }
        if (isHeatInsulated){
            price+=1000;
        }
        if (isLoadBearing){
            price+=2000;
        }
        if (isSoundIsolated){
            price+=500;
        }
        return  price;
    }

}
