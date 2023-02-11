public class Main {
    public static void main(String[] args) throws ItemException {

        Items items = new Items("CZ","ČESKO", 21.0, 15.0, false);

    //    items.setVatHigher(-20.0);
    //    items.setVatLower(-10.0);

        System.out.println(items.getShortcut());
        System.out.println(items.getStateName());
        System.out.println(items.getVatHigher());
        System.out.println(items.getVatLower());
        System.out.println(items.isVatSpecial());

    }
}