public class Main {
    public static void main(String[] args) {
        //Putting a letter on the string will
        //produce an error when trying to parse it to an int
        String numberAsString = "2018";
        System.out.println("Number is = " + numberAsString);

        int number = Integer.parseInt(numberAsString);
        System.out.println("Number is = " + number);

        numberAsString += 1;
        number += 1;
        System.out.println(numberAsString);
        System.out.println(number);

        String numbaString = "420.69";
        System.out.println(numbaString);

        double numba = Double.parseDouble(numbaString);
        System.out.println(numba);

        numbaString += 1;
        numba += 1;
        System.out.println(numbaString);
        System.out.println(numba);
    }
}
