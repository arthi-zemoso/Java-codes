package chapter4;

import java.util.ArrayList;

public class ArrayLIstFun {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        names.add("ari");
        names.add("john");
        names.add("jenny");
        names.add("wendy");
        names.add("kim");
        for(int i=0;i< names.size();i++)
        {
            System.out.println(names.get(i));
        }
      //  for(String name:names)
      //  {
       //     System.out.println(name);
       // }
    }
}
