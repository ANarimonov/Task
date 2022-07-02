public class Main {
    public static void main(String[] args) {
        int[][] nums = new int[7][7];
        nums[0][4] = 1;
        System.out.println(task1(nums));

        int n = 10;
        System.out.println(task2(n));

        String str = "hello";
        System.out.println(task3(str));
    }

    private static String task3(String str) {
        return "";
    }

    private static int task2(int n) {
        int sum = 1;
        while (n > 1) {
            boolean flag = false;
            for (int i = 2; i <= n/2; i++) {
                if (n%i==0) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                sum *= n;
            }
            n--;
        }
        int count = 0;
        while (sum != 0) {
            if (sum % 10 == 0) {
                count++;
                sum /= 10;
            }else break;
        }
        return count;
    }

    private static int task1(int[][] nums) {
        int horizontalLength = nums.length;
        int verticalLength = nums[0].length;
        int horizontalLocation = 0;
        int verticalLocation = 0;
        for (int i = 0; i < horizontalLength; i++) {
            for (int j = 0; j < verticalLength; j++) {
                if (nums[i][j] == 1) {
                    horizontalLocation = i;
                    verticalLocation = j;
                }
            }
        }
        int a = Math.abs(horizontalLength / 2 - horizontalLocation);
        int b = Math.abs(verticalLength / 2 - verticalLocation);
        return a + b;
    }


}
