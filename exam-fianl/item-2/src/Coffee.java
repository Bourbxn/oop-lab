public class Coffee extends Beverage implements Time{
    private String roast;
    private String coffeeBean;

    public Coffee(){
        this.roast = "null";
        this.coffeeBean = "null";
    }

    public Coffee(int price, String name, String roast, String coffeeBean) {
        super(price, name);
        this.roast = roast;
        this.coffeeBean = coffeeBean;
    }

    public void setRoast(String roast){
        this.roast = roast;
    }

    public void setCoffeeBean(String coffeeBean){
        this.coffeeBean = coffeeBean;
    }

    public String getRoast(){
        return roast;
    }

    public String getCoffeeBean(){
        return coffeeBean;
    }
    
    public String toString(){
        return super.toString() + "Roast :" + roast + "\n" +
             "Coffee bean :" + coffeeBean + "\n";
    }

    @Override
    public int getCost() {
        return (int)(super.getPrice()*0.75);
    }

    @Override
    public String timeToSell() {
        return "10.00-20.00";
    }
}