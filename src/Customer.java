class CustomerPurchases {
int customerNo;
String firstName;
String surName;
float price;
int qty;
String product;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getCustomerNo() {
        return customerNo;
    }

    public void setCustomerNo(int customerNo) {
        this.customerNo = customerNo;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }
}
class Printing extends CustomerPurchases{
    void printDetails(){
        System.out.println(customerNo);
        System.out.println(firstName);
        System.out.println(surName);
        System.out.println(price);
        System.out.println(qty);
        System.out.println(product);
    }
    void customerPurchaseReport(){
        float tax=0.15f*price;
        float commission=0.085f*price;
        float discount=0.1f*price;
        var v = discount + commission;
        float TOTAL= price+tax-v;
        System.out.println(TOTAL);
    }
}
class Test{
    public static void main(String[] args) {
     Printing obj=new Printing();
      obj.setPrice(12000);
      obj.printDetails();
      obj.customerPurchaseReport();
    }
}

