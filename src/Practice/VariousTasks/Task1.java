package Practice.VariousTasks;

public class Task1 {
    public static void bar () {
        int[] nums = {1, 2, 3};

        int x = 0;

        for (int i = 0; i < nums.length; i++) {
            x += nums[i];
        }
        System.out.println(x);
    }
    public static void main (String[]args){
        bar();
        }

    }
