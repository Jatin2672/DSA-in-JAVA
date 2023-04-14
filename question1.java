public class question1 {
    public static void main(String[] args) {
        int maxRevenue = 0, maxX = 0, maxY = 0, maxZ = 0;

        for (int x = 0; x <= 100; x++) {
            for (int y = 0; y <= 100; y++) {
                for (int z = 0; z <= 100; z++) {
                    if (x + y + z > 100) { 
                        continue;
                    }
                    int revenue = 8 * x * y * z * z - 200 * (x + y + z);
                    if (revenue > maxRevenue) { 
                        maxRevenue = revenue;
                        maxX = x;
                        maxY = y;
                        maxZ = z;
                    }
                    if (x + y + z == 100) {
                        break;
                    }
                }
            }
        }
        System.out.println("Distribution that maximizes revenue: X=" + maxX + ", Y=" + maxY + ", Z=" + maxZ);
        System.out.println("Maximized revenue: " + maxRevenue);
    }
}
