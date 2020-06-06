public class Cup {
    private String liquidType;
    private double percentFull;

    public Cup(String liquidType, double percentFull) {
        this.liquidType = liquidType;
        this.percentFull = percentFull;
    }

    public String getLiquidType() {
        return this.liquidType;
    }

    public void setLiquidType(String liquidType) {
        this.liquidType = liquidType;
    }

    public double getPercentFull() {
        return this.percentFull;
    }

    public void setPercentFull(double percentFull) {
        this.percentFull = percentFull;
    }

    public static void main(String[] args) {
        Cup cup = new Cup("solid",40.30);
        cup.setLiquidType("glass");
        System.out.println(cup.getLiquidType());
    }
    
}
