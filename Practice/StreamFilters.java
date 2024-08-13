import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StreamFilters {


    public static void main(String[] args) {


        List<Customer>  existingCustomer=new ArrayList<>();

        existingCustomer.add(new Customer("subbu",1));
        existingCustomer.add(new Customer("lokesh",2));

        List<Integer>  ids=existingCustomer.stream().map(Customer::getId).toList();

        List<Customer> updatedCustomers = new ArrayList<>();

        updatedCustomers.add(new Customer("lokesh",2));
        updatedCustomers.add(new Customer("mahesh2",1));




        for( Customer customers: existingCustomer){

            Optional<Customer>  updatedCustomerOpt=updatedCustomers.stream().filter(c->c.getId()==customers.getId()).findFirst();

            if(updatedCustomerOpt.isPresent()){
                Customer updatedCustomer=updatedCustomerOpt.get();

                customers.setName(updatedCustomer.getName());

            }
        }

        System.out.println(existingCustomer);

    }
}
