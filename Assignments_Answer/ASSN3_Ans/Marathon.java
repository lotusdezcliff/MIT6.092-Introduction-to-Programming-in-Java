class Marathon {
    public static void main (String[] arguments) {
        String[] names = {
            "Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex",
            "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda",
            "Aaron", "Kate"
        };

        int[] times = {
            341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299,
            343, 317, 265
        };

        System.out.println("Fastest Runner - " + names[searchIndex(times, minValue(times))] + ": " + minValue(times));
        System.out.println("Second Fastest Runner - " + names[searchIndex(times, secondMinValue(times))] + ": " + secondMinValue(times));
    }

    public static int searchIndex (int[] num_arry, int num) {
        for (int i = 0; i < num_arry.length; i++) {
            if (num_arry[i] == num) {
                return i;
            }
        }
        return -1;
    }

    public static int minValue (int[] num_arry) {
        int currMin = num_arry[0];
        for (int i = 1; i < num_arry.length; i++) {
            if (num_arry[i] < currMin) {
                currMin = num_arry[i];
            }
        }
        return currMin;
    }

    public static int secondMinValue (int[] num_arry) {
        int currMin = num_arry[0];
        for (int i = 1; i < num_arry.length; i++) {
            if (num_arry[i] < currMin && num_arry[i] != minValue(num_arry)) {
                currMin = num_arry[i];
            }
        }
        return currMin;
    }
} 