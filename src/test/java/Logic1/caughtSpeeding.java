package Logic1;

public class caughtSpeeding {
    //    You are driving a little too fast, and a police officer stops you. Write code to compute the result,
//    encoded as an int value: 0=no ticket, 1=small ticket, 2=big ticket. If speed is 60 or less, the result is 0.
//    If speed is between 61 and 80 inclusive, the result is 1. If speed is 81 or more, the result is 2.
//    Unless it is your birthday -- on that day, your speed can be 5 higher in all cases.
//    caughtSpeeding(60, false) → 0
    public static void main(String[] args) {
        caughtSpeeding(60, false);
    }

    public static int caughtSpeeding(int speed, boolean isBirthday) {
        int ticket = 0;

        if (speed >= 81 && isBirthday == false || speed >= 86) {
            ticket = 2;
        } else if (speed >= 61 && isBirthday == false || speed >= 66) {
            ticket = 1;
        } else if (speed < 61 && isBirthday == false || speed < 66) {
            ticket = 0;
        }

        return ticket;
    }
}