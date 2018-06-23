package sample;

public class Product {

    String Meal;
    String ExtraMeal;
    Double  Ammount;
    Double quantity;


    public Double getQuantity() {
        return quantity;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    Product()
    {
        this.quantity = 0.0;
        this.Meal = "";
        this.ExtraMeal = "";
        this.Ammount = 0.0;
    }
    public Product(String Meal,String ExtraMeal, Double Ammount,Double quantity)
    {
        this.quantity = quantity;
        this.Meal = Meal;
        this.ExtraMeal = ExtraMeal;
        this.Ammount = Ammount;
    }

    public String getMeal() {
        return Meal;
    }

    public void setMeal(String meal) {
        Meal = meal;
    }

    public String getExtraMeal() {
        return ExtraMeal;
    }

    public void setExtraMeal(String extraMeal) {
        ExtraMeal = extraMeal;
    }

    public Double getAmmount() {
        return Ammount;
    }

    public void setAmmount(Double ammount) {
        Ammount = ammount;
    }
}
