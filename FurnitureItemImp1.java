

class FurniturItemImp1 {
    public static void main(String[] args) {
        FurnitureItem fi = new FurnitureItem();
        fi.furnitureType="chairs";
        fi.usage="outdoor";
        fi.colour="red";
        fi.grade="Grade 1";
        fi.price=1500.85;
        System.out.println("the type of furniture is :" + fi.furnitureType);
        System.out.println("you want to use :" + fi.usage);
        System.out.println("the colour u want is :" + fi.colour);
        System.out.println("the grade u chose is :" + fi.grade);
       // System.out.println("if u have chosen outdoor u'll get discount.if outdoor, the discounted price is :" + fi.price + "rs");
        System.out.println("if u chose outdoor u get discount of "+ fi.furnitureItemDiscount() + "your previous bill was " + fi.price);
    }
}