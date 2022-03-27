public class SchoolKids {
    public static void main(String[] args){

        int id1 = 202291501, id2 = 202291502, id3 = 202291503, id4 = 202291504, id5 = 202291505;

        String name1 = "Ivancho", name2 = "Ani", name3 = "Mariyka", name4 = "Pencho", name5 = "Borislavcho";

        double note1 = 2.00, note2 = 5.00, note3 = 6.00, note4 = 4.00, note5 = 5.00;

        System.out.printf("%-20s%-20s%6s\n", "IDs", "Names", "Notes");
        System.out.printf("%-20s%-20s%6.2f\n", id1,name1,note1);
        System.out.printf("%-20s%-20s%6.2f\n", id2,name2,note2);
        System.out.printf("%-20s%-20s%6.2f\n", id3,name3,note3);
        System.out.printf("%-20s%-20s%6.2f\n", id4,name4,note4);
        System.out.printf("%-20s%-20s%6.2f\n", id5,name5,note5);

    }
}
