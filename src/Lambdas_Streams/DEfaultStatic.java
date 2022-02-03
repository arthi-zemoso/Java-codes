package Lambdas_Streams;

interface Employee{
    Employee find(int i);
    default boolean isExec(int id)
    {
        return true;
    }
    static String getCountry(){
        return "UK";
    }
}
public class DEfaultStatic {
    public static void main(String[] args) {
        class EmployeeIMpl implements Employee{
            public Employee find(int id)
            {
                boolean exec=isExec(id);
                return null;
            }
            public Employee printid(int id)
            {
                System.out.println(id);
                return null;
            }
            String getemp=Employee.getCountry();
        }
    }
}
