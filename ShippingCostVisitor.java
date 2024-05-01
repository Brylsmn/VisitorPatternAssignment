public class ShippingCostVisitor implements Visitor {
    private double totalShippingCost = 0;

    @Override
    public void visit(Chair chair) {
        totalShippingCost += chair.getWeight() * 10;  // Flat rate per kg for chairs
    }

    @Override
    public void visit(Sofa sofa) {
        totalShippingCost += sofa.getWeight() * 20;  // Higher rate per kg for sofas
    }
    
    @Override
    public void visit(Table table) {
        totalShippingCost += table.getWeight() * 15;  // Some rate per kg for tables
    }

    double getTotalShippingCost() {
        return totalShippingCost;
    }
}
