import java.util.ArrayList;
import java.util.List;

public class PythagoreanTriplet {

    private int a;
    private int b;
    private int c;

    PythagoreanTriplet(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final PythagoreanTriplet other = (PythagoreanTriplet) obj;
        if (this.a != other.a) {
            return false;
        }
        if (this.b != other.b) {
            return false;
        }
        if (this.c != other.c) {
            return false;
        }
        return true;
    }

    public static TripletListBuilder makeTripletsList(){
        return new TripletListBuilder();
    }

    public static class TripletListBuilder{
        private int maxFactor;
        private int sum;
        public TripletListBuilder withFactorsLessThanOrEqualTo(int maxFactor){
            this.maxFactor = maxFactor;
            return this;
        }
        public TripletListBuilder thatSumTo(int sum){
            this.sum = sum;
            return this;
        }

        public List<PythagoreanTriplet> build(){
            List<PythagoreanTriplet> triplets = new ArrayList<>();
            for (int a = 1; a < sum; a++) {
                for (int b = a + 1; b < sum; b++) {
                    double sqrt = Math.sqrt(a * a + b * b);
                    int c = (int) sqrt;
                    if (c == sqrt && a + b + c == sum) {
                        triplets.add(new PythagoreanTriplet(a, b, c));
                    }
                }
            }

            return triplets;
        }
    }
}
