package LeetCode;

public class LeetCode {
}

class Solution1 {
    public static int maximumWealth(int[][] accounts) {
        int maxwealth = 0;
        int k = -1;


        for (int i = 0; i < accounts.length; i++) {
            k++;
            for (int j = 0; j < accounts[k].length; j++) {
                int sum = accounts[i][j];
                System.out.println(sum);
            }
        }

        return maxwealth;
    }

    public static void main(String[] args) {

        int[][] accounts = {{1, 2, 3}, {3, 2, 1}};
        maximumWealth(accounts);
    }
}

// нужно посчитать сумму элементов в каждом массиве
// а потом её сравнить и найти максимальную
