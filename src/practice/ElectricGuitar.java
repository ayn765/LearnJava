package practice;

public class ElectricGuitar {
    String brand;
    int numOfPickups;
    boolean rockStarUsesIt;

    String getBrand(){
        return brand;
    }

    void setBrand(String aBand){
        brand = aBand;
    }

    int getNumOfPickups(){
        return numOfPickups;
    }

    boolean getRockStarUseIt(){
        return rockStarUsesIt;
    }

    void setRockStarUsesIt(boolean yesOrNo){
        rockStarUsesIt = yesOrNo;
    }

}
