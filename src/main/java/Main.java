public class Main {
    public static void main(String[] args) {
        int height = Integer.parseInt(args[0]);
        int width = Integer.parseInt(args[1]);
        printDiamond(height, width);
    }

    private static void printDiamond(int height, int width) {
        int k = 0;
        for (int i = 0; i < height * width; i++) {
            if ((i - (i / width) * width == width / 2 - k || i - (i / width) * width == width / 2 + k)) {
                System.out.print("#");
            } else {
                System.out.print(" ");
            }
            if ((i > 1) && (i + 1) % width == 0) {
                System.out.println();
                if (i / width < width / 2) {
                    k++;
                }
                if (i / width >= height - 1 - width / 2) {
                    k--;
                }
            }
        }
    }
}
