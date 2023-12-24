public class subSeqAscii {
    public static void main(String[] args) {
        subAscii("", "abc");
    }
    static void subAscii(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return ;
        }
        char ch=up.charAt(0);
        subAscii(p+ch, up.substring(1));
        subAscii(p, up.substring(1));
        subAscii(p+(ch+0), up.substring(1));
    }
}
