package Ques4;

public class HolidayTest {
    public static class HolidayDemo {
        public static void main(String[] args) {

            Holiday H1 = new Holiday("Independence Day", 4, "July");
            Holiday H2 = new Holiday("Fourth of July", 4, "July");

            System.out.println(H1.SameHolidayDate(H2));
            H2.setName("Christmas");
            H2.setDay(12);
            H2.setMonth("December");

            System.out.println(H1.isSameMonth(H2));

            Holiday H3 = new Holiday("New Year's Eve", 31, "December");
            System.out.println(H2.isSameMonth(H3));
        }
    }
}
