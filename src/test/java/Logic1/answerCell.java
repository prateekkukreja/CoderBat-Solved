package Logic1;

public class answerCell {
    //    Your cell phone rings. Return true if you should answer it. Normally you answer, except in the morning you only
//        answer if it is your mom calling. In all cases, if you are asleep, you do not answer.
//    answerCell(false, false, false) → true
    public static void main(String[] args) {
        answerCell(false, true, false);
    }

    public static boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
        if (!isMorning && !isMom && !isAsleep
                || isMom && !isAsleep) {
            return true;
        }
        return false;
    }
}