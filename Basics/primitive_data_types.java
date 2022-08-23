public class primitive_data_types {
    public static void main(String[] args){
        byte num = 10;
        short num2 = 20;
        int num3 = 50;
        long num4 = 50000L + 10L *(num+num2+num3) ; 
        System.out.println(num4);
        short num6 = (short)(1000 + 10 *(num+num2+num3)) ;
        System.out.println(num6);
    }
}
