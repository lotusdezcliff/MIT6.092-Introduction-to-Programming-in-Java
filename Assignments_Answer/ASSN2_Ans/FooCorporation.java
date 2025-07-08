class FooCorporation {
    public static void main(String[] arguments) {
        System.out.println("Employee 1: $" + calculateSalary(7.50, 35));
        System.out.println("Employee 2: $" + calculateSalary(8.20, 47));
        System.out.println("Employee 3: $" + calculateSalary(10.00, 73));
    }

    public static double calculateSalary(double basePay, int hoursWorked){
        double salary; // Salary
        if(hoursWorked <= 40 && hoursWorked >= 0){ // Without OT
            salary = hoursWorked * basePay;
            return salary;
        }
        else if(hoursWorked > 40){
            salary = 40 * basePay + (hoursWorked - 40) * basePay * 1.5;
            return salary;
        }
        else{
            System.out.println("Invaild Hours Worked");
            return 0.0;
        }
    }
}