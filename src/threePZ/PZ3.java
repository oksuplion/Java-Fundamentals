package threePZ;
public class PZ3 {
    public static void main(String[] args) {
        S1 s = new S1("Practical", "Work");
        System.out.println (s.add());
        S2 s2 = new S2();
        System.out.println (s2.piece());
        S3 s3 = new S3();
        System.out.println (s3.transference());
        S4 s4 = new S4();
        System.out.println (s4.repetition());
        S5 s5 = new S5();
        s5.occurrences();
        S6 s6 = new S6();
        s6.delete();
        S7 c2 = new S7();
        c2.count();
        S8 c3 = new S8();
        c3.change();
    }
}