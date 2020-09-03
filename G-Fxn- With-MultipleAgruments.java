#This Program is based on MultipeType Agruments...


package testgeneric;

public class Gfxn_MAT {
    public static void main(String[] args) {
        Integer i=12;Float f=12.5f; Character c='Q';
        printType(i,f,c);
    }

    private static<J ,K, L> void printType(J i,K f, L c) {
        System.out.printf("Integer= %s\nFloat= %s\nCharacter= %s ",i,f,c);
    }
}
