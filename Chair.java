public class Chair implements VisitorAccept {
    private double weight;

    Chair(double weight) {
        this.weight = weight;
    }

    double getWeight() {
        return weight;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
