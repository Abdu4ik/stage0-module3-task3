package lang.print.gaps.task3;

public class ReassigningValues {
    public static void main(String[] args) {
        int first = 1;
        int second = 10;
        int third = 100;
        
        System.err.println(first);
        System.err.println(second);
        System.err.println(third);
        
        int linkToFirst = first;
        int linkToSecond = second;
        int linkToThird = third;
        
        first = 15;
        second = 6;
        third = 4;
        
        System.err.println(first);
        System.err.println(second);
        System.err.println(third);
        System.err.println(linkToFirst);
        System.err.println(linkToSecond);
        System.err.println(linkToThird);
    }
}
