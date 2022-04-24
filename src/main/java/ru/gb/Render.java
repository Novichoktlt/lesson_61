//package ru.gb;
//
//import lombok.SneakyThrows;
//import ru.gb.model.Product;
//
//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.util.ArrayList;
//import java.util.List;
//
//public class Render {
//    static List<Product> cart = new ArrayList<>();
//    static String id = null;
//    static BufferedReader reader = null;
//
//    @SneakyThrows
//    public static void main(String[] args) {
//        do {
//            System.out.println("Для выхода введите: exit");
//            System.out.println("Для вывода списка продуктов введите: list");
//            System.out.println("Для создания новой корзины введите: new");
//            System.out.println("Для добовления продукта в корзину введите номер продукта (для удаления введите повторно номер продукта)");
//            System.out.println("Введите номер продукта:");
//            reader = new BufferedReader(new InputStreamReader(System.in));
//            id = reader.readLine();
//
////            AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Configurations.class);
////            ProductRender productRender = context.getBean(ProductRender.class);
////            productRender.render();
////            System.out.println();
//
//        }while (!id.equals("exit"));
//        reader.close();
//    }
//
//
//}
