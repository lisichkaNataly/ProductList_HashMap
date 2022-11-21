public class Main {
    public static void main(String[] args) {

        Product potato = new Product("Картошка", 19);
        Product tomato = new Product("Помидоры", 129);
        Product cucumbers = new Product("Огурцы", 69);
        Product oil = new Product("Масло подсолнечное", 109);
        Product mayonnaise = new Product("Майонез", 159);
        Product greenery = new Product("Зелень", 59);

        Recipe garnish = new Recipe("Гарнир из картошки");
        garnish.addProduct(potato, 5);
        garnish.addProduct(oil, 1);
        garnish.addProduct(greenery, 1);

        System.out.println("Стоимость продуктов " + garnish +
                " cоставляет " + garnish.makeRecipePrice() + " рублей.");

        Recipe salad = new Recipe("Салат Летний");
        salad.addProduct(tomato, 3);
        salad.addProduct(cucumbers, 3);
        salad.addProduct(mayonnaise, 1);
        salad.addProduct(greenery, 1);

        System.out.println("Стоимость продуктов " + salad +
                " cоставляет " + salad.makeRecipePrice() + " рублей.");


//        ProductService service = new ProductService();
//        service.add(potato);
//        service.add(tomato);
//        service.add(cucumbers);
//        service.add(oil);
//        service.add(mayonnaise);
//        service.add(greenery);
//
//        System.out.println(service);
//
//        System.out.println("Список продуктов: " + service.getProducts());
//        service.delete(mayonnaise);
//        System.out.println("Список продуктов: " + service.getProducts());













    }
}