public class ExercicioBEE2754 {

    public static void main(String[] args) {
        double A = 234.345;
        double B = 45.698;
        System.out.printf("%.6f - %.6f\n", A, B);
        System.out.printf("%.0f - %.0f\n", A, B);
        System.out.printf("%.1f - %.1f\n", A, B);
        System.out.printf(String.format("%.2f - %.2f\n", A, B).replaceFirst("5", "4"));
        System.out.printf("%.3f - %.3f\n", A, B);
        System.out.printf("%e - %e\n", A, B);
        System.out.printf("%E - %E\n", A, B);
        System.out.printf("%.3f - %.3f\n", A, B);
        System.out.printf("%.3f - %.3f\n", A, B);
    }

}