package powerpackage;

public class powerFinder
{
    private final int num, pow;

    public powerFinder(int num, int pow) {
        this.num = num;
        this.pow=pow;
    }

    public static int powerOf(int num, int pow)
    {
        int p = 1;
        for (int i = 0; i<pow; i++) {
            p *= num;
        }
        return p;
    }

}