public class Items {

    private String shortcut;
    private String stateName;
    private double vatHigher;
    private double vatLower;
    private boolean vatSpecial;

    public Items(String shortcut, String stateName, double vatHigher, double vatLower, boolean vatSpecial) {
        this.shortcut = shortcut;
        this.stateName = stateName;
        this.vatHigher = vatHigher;
        this.vatLower = vatLower;
        this.vatSpecial = vatSpecial;
    }

    public String getShortcut() {
        return shortcut;
    }

    public void setShortcut(String shortcut) {
        this.shortcut = shortcut;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public double getVatHigher() {
        return vatHigher;
    }

    public void setVatHigher(double vatHigher) throws ItemException {
        if (vatHigher < 0) {
            throw new ItemException("Balím a stěhuju se. Záporná horní daň (zadal jsi: " + vatHigher + ")");
        }
        this.vatHigher = vatHigher;
    }

    public double getVatLower() {
        return vatLower;
    }

    public void setVatLower(double vatLower) throws ItemException {
        if (vatLower < 0) {
            throw new ItemException("Přemýšlím o stěhování. Záporná dolní daň (zadal jsi: " + vatLower + ")");
        }
        this.vatLower = vatLower;
    }

    public boolean isVatSpecial() {
        return vatSpecial;
    }

    public void setVatSpecial(boolean vatSpecial) {
        this.vatSpecial = vatSpecial;
    }
}
