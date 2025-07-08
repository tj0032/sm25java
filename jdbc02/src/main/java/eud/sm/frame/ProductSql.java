package eud.sm.frame;

public class ProductSql {
    public static String insert =
            "INSERT INTO product (product_name, product_price, discount_rate, product_img, cate_id, product_regdate, product_update) " +
                    "VALUES (?, ?, ?, ?, ?, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP)";

    public static String select =
            "SELECT * FROM product WHERE product_id = ?";

    public static String selectAll =
            "SELECT * FROM product ORDER BY product_id";

    public static String update =
            "UPDATE product SET product_name = ?, product_price = ?, discount_rate = ?, product_img = ?, cate_id = ?, product_update = CURRENT_TIMESTAMP " +
                    "WHERE product_id = ?";

    public static String delete =
            "DELETE FROM product WHERE product_id = ?";
}
