package day6;
// multiple inheritance
public class Kar extends MinOfTourism implements MinOfRailways,MinOfRoadWays {
    public void metro() {
        System.out.println("Namma Metro");
    }

    public void stateHighway() {
        System.out.println("State highwasy");
    }

    public static void main(String[] args) {
        Kar kar = new Kar();
        kar.metro();
        kar.stateHighway();
        kar.zoo();
    }
}

/*
        Extend: Can be used with normal class and abstract classes
        Implement: Can be used with only interface
 */
