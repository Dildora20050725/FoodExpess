public class Food {
  String countryOfFood;
  String nameOfFood;
  double priceOfFood;

    public String getCountryOfFood() {
        return countryOfFood;
    }

    public void setCountryOfFood(String countryOfFood) {
        this.countryOfFood = countryOfFood;
    }

    public String getNameOfFood() {
        return nameOfFood;
    }

    public void setNameOfFood(String nameOfFood) {
        this.nameOfFood = nameOfFood;
    }

    public double getPriceOfFood() {
        return priceOfFood;
    }

    public void setPriceOfFood(double priceOfFood) {
        this.priceOfFood = priceOfFood;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    int quantity;

    public void updateFood(String name, double price){
        this.nameOfFood = name;
        this.priceOfFood = price;
    }

    public Food(String countryOfFood, String nameOfFood, double priceOfFood, int quantity) {
        this.countryOfFood = countryOfFood;
        this.nameOfFood = nameOfFood;
        this.priceOfFood = priceOfFood;
        this.quantity = quantity;
    }
    public void showFoodData(){
        System.out.printf("Country: %s\nName: %s\nPrice: %s\nQuantity: %s", countryOfFood, nameOfFood, priceOfFood, quantity);

    }
}
