 public class Sofa implements VisitorAccept {
    private double weight;

    Sofa(double weight) {
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
