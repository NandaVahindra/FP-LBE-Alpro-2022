package telephone;

import java.util.ArrayList;

public class Contact extends Phone{
    private ArrayList<String> name = new ArrayList<String>();
    private ArrayList<String> number = new ArrayList<String>();
    
    public void save(String nama, String num)
    {
        name.add(nama);
        number.add(num);
    }
    
    @Override
    public void call (String nama)
    {
        int i = name.indexOf(nama);
        if(i == -1)
        {
            System.out.println("Kontak tidak tersimpan");
            System.exit(0);
        }
        System.out.println("Calling " + name.get(i));
        System.out.println("Number: " + number.get(i));
    }
    
    public String getNumber(String nama)
    {
        int i = name.indexOf(nama);
        if(i == -1)
        {
            System.out.println("Kontak tidak tersimpan");
            System.exit(0);
        }
        return number.get(i);
    }
    
    public void editNumber(String nama, String num)
    {
        int i = name.indexOf(nama);
        if(i == -1)
        {
            System.out.println("Kontak tidak tersimpan");
            System.exit(0);
        }
        number.set(i,num);
    }
}
