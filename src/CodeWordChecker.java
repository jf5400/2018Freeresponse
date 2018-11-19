public class CodeWordChecker implements StringChecker{
    private int min;
    private int max;
    private String not;
    public CodeWordChecker(int min, int max, String not){
        this.min=min;
        this.max=max;
        this.not=not;
    }
    public CodeWordChecker(String not){
        this.min=6;
        this.max=20;
        this.not=not;
    }
    public boolean isValid(String str){
        if(str.length()>=this.min && str.length()<=this.max){
            if(str.indexOf(this.not)>=0){
                return true;
            }
            else{
                return false;
            }
        }
        else{
            return false;
        }
    }

}
