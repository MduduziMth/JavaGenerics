public class JavaGenericMain extends GenericClass {

    public static void main(String[] args) {

        JavaGeneric Test = new JavaGeneric();
        Test.printArrayContent(new Object[]{1,2,3,4,5});



        StringInstance = new GenericClass<>();
        StringInstance.Set("Test");
        StringInstance.get();

        IntegerInstance = new GenericClass<>();
        IntegerInstance.Set(1000);
        IntegerInstance.get();


    }
}
