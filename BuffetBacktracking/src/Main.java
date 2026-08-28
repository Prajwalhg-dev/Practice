public class Main {
    static String [] food = {"Burger"};
     static int [] calories = {100};
        static int calorieslimit = 200;
        public static void findcombinations(int index, int currentCalories, String currentPlate) {

            if (currentCalories > calorieslimit) {
                return;
            }
            if (index == food.length) {
                if (currentPlate.isEmpty() ) {
                    System.out.println(currentPlate + "-> Total:" + currentCalories + "cal" );
                }
                return;
            }
            findcombinations(index + 1,
                    currentCalories + calories[index],
                    currentPlate + calories[index] + " ");
            findcombinations(index + 1,
                    currentCalories,
                    currentPlate);
    }
    public static void main(String[] args) {
            System.out.println("Possible Buffet Combinations under" + calorieslimit + "calories:\n");
            findcombinations(0,0," ");
    }
}