public class GenericClass<T>   {


    public static GenericClass<String> StringInstance;
    public static GenericClass<Integer> IntegerInstance;

        private T t;


        public  void Set(T t){
            this.t = t;
        }

        public void get(){
            System.out.println(t);
        }
}
