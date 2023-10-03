 public static void print_pattern()
    {
        // Outer loop to control the number of rows
        for (int i = 0; i < 5; i++) {
            // Inner loop to print stars in each row
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            // Inner loop to print spaces between the stars
            for (int k = 1; k < 5-i; k++) {
                System.out.print(" ");
            }
            // Inner loop to print stars on the right side of the spaces
            for (int l = 0; l <=i; l++) {
                System.out.print("*");
            }
            System.out.println(); // Move to the next line after each row
        } }
