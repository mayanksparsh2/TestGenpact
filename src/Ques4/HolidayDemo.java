package Ques4;

public class HolidayDemo {
    public static void main(String[] args) {

        Holiday H1 = new Holiday("Independence Day", 4, "July");
        Holiday H2 = new Holiday("Fourth of July", 4, "July");

        if (H2.SameHolidayDate(H1)) {
            System.out.print(H1.getName() + " and " + H2.getName() + " are ");
            System.out.println("same holidays");
        } else {
            System.out.print(H1.getName() + " and " + H2.getName() + " are ");
            System.out.println("different holidays");
        }

        H2.setName("Christmas");
        H2.setDay(12);
        H2.setMonth("December");

        if (H2.isSameMonth(H1)) {
            System.out.print(H1.getName() + " and " + H2.getName() + " fall in ");
            System.out.println("same month");
        } else {
            System.out.print(H1.getName() + " and " + H2.getName() + " fall in ");
            System.out.println("different months");
        }

        Holiday H3 = new Holiday("New Year's Eve", 31, "December");

        if (H3.isSameMonth(H2)) {
            System.out.print(H2.getName() + " and " + H3.getName() + " fall in ");
            System.out.println("same month");
        } else {
            System.out.print(H2.getName() + " and " + H3.getName() + " fall in ");
            System.out.println("different months");
        }
    }
}
