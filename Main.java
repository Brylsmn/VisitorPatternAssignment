public class Main {
    public static void main(String[] args) {
        Chair chair = new Chair(15);
        Sofa sofa = new Sofa(40);
        Table table = new Table(20);

        ShippingCostVisitor shippingCostVisitor = new ShippingCostVisitor();

        chair.accept(shippingCostVisitor);
        sofa.accept(shippingCostVisitor);
        table.accept(shippingCostVisitor);

        System.out.println("Total shipping cost: " + shippingCostVisitor.getTotalShippingCost());
    }
}