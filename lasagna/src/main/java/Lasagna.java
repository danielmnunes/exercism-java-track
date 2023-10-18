public class Lasagna {
    // TODO: define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven() {
        return 40;
    }

    public int remainingMinutesInOven(int time) {
        return 40 - time;
    }

    // TODO: define the 'remainingMinutesInOven()' method

    // TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int a) {
        return a * 2;
    }

    public int totalTimeInMinutes(int a, int b) {
        return b + preparationTimeInMinutes(a);
    }

    // TODO: define the 'totalTimeInMinutes()' method
}
