package telephone;

abstract class Phone {
    abstract void save(String name, String nomor);
    
    void call(String name){
        System.out.println("Please call the appropriate number or saved contacts");
    }
}
