public class JavaGeneric {

    public <T> void printArrayContent(T[] array){

        for (T element:array
             ) {
            System.out.println(element);

        }

    }


}
