package polymorph10;

public class TryGeneric {
    public static < H > void printArray(H[] elements) {
        for ( H element : elements){
            System.out.println(element );
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Integer[] intArray = { 10, 20, 30, 40, 50 };
        Character[] charArray = { 'J', 'A', 'V', 'A', 'T','P','O','I','N','T' };

        System.out.println( "Printing Integer Array" );
        printArray( intArray  );

        System.out.println( "Printing Character Array" );
        printArray( charArray );
    }
}
