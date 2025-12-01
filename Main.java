public class Main {
    public static void main(String[] args) {

        ProductDAO dao = new ProductDAO();

        System.out.println("Liste des produits :");

        for (Product p : dao.getAllProducts()) {
            System.out.println(
                p.getId() + " | " + p.getNom() + " | " + p.getPrix() + " Ar"
            );
        }
    }
}
