package promobiles;

import java.util.HashSet;

public class Ashashset {
    void iproducts() {
        HashSet<iphone> imobiles = new HashSet<>();

        imobiles.add(new iphone(29042001, "iPhone 6s", 6499, "64GB", "12MP"));
        imobiles.add(new iphone(29042002, "iPhone 6", 7099, "128GB", "12MP"));
        imobiles.add(new iphone(29042003, "iPhone 8", 6499, "256GB", "12MP"));
        imobiles.add(new iphone(29042004, "iPhone X", 9999, "256GB", "12MP"));
        imobiles.add(new iphone(29042005, "iPhone XR", 16099, "256GB", "12MP"));
        imobiles.add(new iphone(29042006, "iPhone 11", 24990, "512GB", "12MP"));
        imobiles.add(new iphone(29042007, "iPhone 12", 33333, "512GB", "12MP"));
        imobiles.add(new iphone(29042008, "iPhone 13", 34099, "512GB", "12MP"));
        imobiles.add(new iphone(29042009, "iPhone 14", 66001, "1024GB", "48MP"));
        imobiles.add(new iphone(29042010, "iPhone 15", 100009, "1024GB", "48MP"));
        imobiles.add(new iphone(29042010, "iPhone 15", 100009, "1024GB", "48MP")); // duplicate

        System.out.println(" iPhone Products:");
        for (iphone i : imobiles) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Ashashset obj = new Ashashset();
        obj.iproducts();
    }
}
