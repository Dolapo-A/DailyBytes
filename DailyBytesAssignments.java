public class DailyBytesAssignments {
    public static void main(String[] args) {
        String[] myTextonearr = { "Cat", "The Daily Byte ,", "civic ," };
        String myTextone = "Cat";
        String myTexttwo = "The Daily Byte ,";
        String myTextthree = "civic ,";

        StringBuilder buildArr = new StringBuilder();

        buildArr.append(myTextonearr);

        buildArr.reverse();

        System.out.println("Reversed String " + buildArr);

        char[] arrayone = myTextone.toCharArray();
        char[] arraytwo = myTexttwo.toCharArray();
        char[] arraythree = myTextthree.toCharArray();

        for (int i = arrayone.length - 1; i >= 0; i--) {
            System.out.print(arrayone[i]);
        }
        for (int i = arraytwo.length - 1; i >= 0; i--) {
            System.out.print(arraytwo[i]);
        }
        for (int i = arraythree.length - 1; i >= 0; i--) {
            System.out.print(arraythree[i]);
        }
    }
}
