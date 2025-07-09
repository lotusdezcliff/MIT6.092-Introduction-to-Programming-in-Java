class FooCorporation {
    public static void main(String[] arguments) {
        System.out.println("Employee 1: " + calculateSalary(7.50, 35));
        System.out.println("Employee 2: " + calculateSalary(8.20, 47));
        System.out.println("Employee 3: " + calculateSalary(10.00, 73));
    }

    public static String calculateSalary(double basePay, int hoursWorked){
        double salary; // Salary
        
        if(basePay < 8.00){ // The base pay must not be less than the minimum wage ($8.00 an hour)
            return "Invalid basePay"; 
        }

        if(hoursWorked < 0 || hoursWorked >= 60){ // If the number of hours is greater than 60 or less than 0, print an error message.
            return "Invalid hoursWorked";
        }
        else if(hoursWorked <= 40){
            salary = 40 * basePay;
        }
        else{ 
            salary = 40 * basePay + (hoursWorked - 40) * basePay * 1.5; // Hours over 40 get paid 1.5 the base pay
        }

        return String.format("%.2f", salary); //Use String as output
    }
}