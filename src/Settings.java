public class Settings {
    private static final String FILENAMEIN = "vat-eu.csv";
    private static final String FILENAMEDEFAULTOUT = "vat-over-20.txt";
    private static final String DELIMITER = "\t";
    private static final double VATDEFAULTLIMIT = 20;


    public static String getFilenamein() { return FILENAMEIN; }
    public static String getFilenameout() { return FILENAMEDEFAULTOUT; }
    public static String getDelimiter() { return DELIMITER; }
    public static double getVatdefaultlimit() { return VATDEFAULTLIMIT; }
}
