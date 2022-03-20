package powerpackage;


import org.junit.jupiter.api.Test;

public class powertest {
    @Test
    public void one_raised_to_one_is_one() {
        assert powerFinder.powerOf(1,1) == 1;
    }

    @Test
    public void two_raised_to_one_is_two() {
        assert powerFinder.powerOf(2,1) == 2;
    }

    @Test
    public void two_power_two_is_four() {
        assert powerFinder.powerOf(2, 2) == 4;
    }

    @Test
    public void three_power_two_is_nine() {
        assert powerFinder.powerOf(3, 2) == 3*3;
    }
}
