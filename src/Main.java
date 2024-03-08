public class Main {

    public static void main(String[] args) {

        // [] -> Array  0, 1, 2
        int[] numbers = {5,10,4};


        int[] nums = new int[4];
        nums[0] = 5;
        nums[1] = 10;
        nums[2] = 4;

        printNumbers(nums);

    }

    public static void printNumbers(int[] currywurst){
        // Zähler;      Läufts solange x;   Mache nach jedem Durchlauf!
        for (int i = 0; i<currywurst.length; i++){
            System.out.println(currywurst[i]);
        }
        System.out.println("=====================");
        //Erstelle ein x für jeden Eintrag in : Datensammlung
        for (int num : currywurst) {
            System.out.println(num);
        }
    }
}