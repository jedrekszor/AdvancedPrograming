public class Exercise7 {
    int array[][];

    Exercise7(int m, int n) {
        array = new int[m][n];
        fill();
    }

    void fill() {
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[i].length; j++) {
                int rand = (int)(Math.random() * 20) - 9;
                array[i][j] = rand;
            }
        }
    }

    void changeElement(int m, int n, int value) {
        if(m < array.length && n < array[0].length && m >= 0 && n >= 0)
            array[m][n] = value;
        else
            System.out.println("No such index");
    }

    void calculateRows() {
        System.out.println("Sum of rows: ");
        for(int i = 0; i < array.length; i++) {
            int result = 0;
            for(int j = 0; j < array[i].length; j++) {
                result += array[i][j];
            }
            System.out.println(result);
        }
        System.out.print("\n");
    }

    void calculateTotal() {
        int result = 0;
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[i].length; j++) {
                result += array[i][j];
            }
        }
        System.out.println("Total: " + result);
        System.out.print("\n");
    }

    @Override
    public String toString() {
        String result = "";
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[i].length; j++) {
                result += array[i][j] + "\t";
            }
            result += "\n";
        }
        result += "\n";
        return result;
    }
}
