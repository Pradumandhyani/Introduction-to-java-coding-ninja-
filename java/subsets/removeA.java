public class removeA {
    public static void main(String[] args) {
        keep("","bccadda");
        String returnAns=skip("bccaada");
        System.out.println(returnAns);
        String appAns=appNotApple("appbchanapple");
        System.out.println(appAns);
    }
    public static void keep(String ans,String old){
        if(old.isEmpty()){
            System.out.println(ans);
            return;
        }
        char ch=old.charAt(0);
        if(ch=='a'){
            keep(ans,old.substring(1));
        }else{
            keep(ans+ch,old.substring(1));
        }
    }
    public static String skip(String old){
        if(old.isEmpty()){
            
            return "";
        }
        char ch=old.charAt(0);
        if(ch=='a'){
            return skip(old.substring(1));
        }else{
            return ch+skip(old.substring(1));
        }
        
    }
    public static String appNotApple(String up){
        if(up.isEmpty()){
            return "";
        }
        // char ch=up.charAt(0);
        if(up.startsWith("app") && !up.startsWith("apple")){
            return appNotApple(up.substring(3));
        }
            return up.charAt(0)+appNotApple(up.substring(1));
        
    }
}
