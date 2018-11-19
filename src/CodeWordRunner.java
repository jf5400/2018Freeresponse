public class CodeWordRunner {
    public static void main(String[] args){
        StringChecker sc1= new  CodeWordChecker(5, 6, "$");
        StringChecker sc2= new  CodeWordChecker("pass");

        System.out.println(sc1.isValid(""));
        System.out.println(sc1.isValid(""));
        System.out.println(sc1.isValid(""));
        System.out.println(sc1.isValid(""));

        System.out.println(sc1.isValid(""));
        System.out.println(sc1.isValid(""));
        System.out.println(sc1.isValid(""));
        System.out.println(sc1.isValid(""));
    }
}
