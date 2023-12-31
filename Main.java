public class Main {
    public static void main(String[] args) {
        RoadController road = new RoadController();

        for (int i = 1; i < 5; i++) {
            /* thread creation for each village */
            Thread eastVillager = new Thread(new East_village(road, "EastVillager" + i));
            Thread westVillager = new Thread(new West_village(road, "WestVillager" + i));

            /* start threads */
            eastVillager.start();
            westVillager.start();
        }

    }
}