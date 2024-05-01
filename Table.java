public class Table implements VisitorAccept {
    private double weight;

    Table(double weight) {
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
