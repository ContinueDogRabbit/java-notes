package 包装;

public class IntegerClass {
    public static void main(String[] args){
        IntegerClass integerClass = new IntegerClass();
        integerClass.test();
    }
    public void test(){
        Integer i=new Integer(1);
        Integer j=new Integer(1);
        System.out.println(i==j);

        Integer m=1;
        Integer n=1;
        System.out.println(m==n);

        Integer x=128;
        Integer y=128;
        System.out.println(x==y);
    }
}
