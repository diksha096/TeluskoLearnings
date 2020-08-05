public class AssignmentIteration1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
                //System.out.print("* ");//comment the top statement and uncomment this to see stars.
            }
            System.out.println(" ");
        }
        System.out.println("//////////////////////////");

        for (char a = 65; a <= 70; a++) {
            for (char b = 65; b <= a; b++) {
                System.out.print(" " + b);
            }
            System.out.println(" ");
        }

        System.out.println("//////////////////////////////");

        for (int row = 1; row <= 4; row++) {
            for (int col = 1; col <= 4; col++) {
                if (row > 1 && row < 4 && col > 1 && col < 4 ) {
                    System.out.print("  ");
                }
                else {
                        System.out.print("$ ");
                    }
            }
            System.out.println(" ");
        }
    }
}

