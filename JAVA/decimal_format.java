import java.text.DecimalFormat;

public class decimal_format {
    public static void main(String[] args) {
       float num = 123.45f;
       DecimalFormat format = new DecimalFormat("0000.000");
       System.out.println(format.format(num));

    }
}
