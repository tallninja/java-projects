package application.test;

import java.util.Date;

public class Main {

    public static void main(String[] args) {

        Date startSemDate = new Date();
        Date semEndDate = new Date();

        User user1 = new User("Greg", "JKUAT", "3rd Year", "ENE...", startSemDate, semEndDate);

        Unit unit1 = new Unit("PDE", "25", "William", 20);

        unit1.getName();

        Cat pdeCat = new Cat(unit1, new Date(), 0);

        Test pdeTest = new Test();

        pdeCat.setReminder("Greg", new Date());

        System.out.println(pdeCat.toString());

    }

}
