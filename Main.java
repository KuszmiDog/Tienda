import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tienda tienda = new Tienda();
        Cliente cliente1 = new Cliente(1, "German", "german°gmail.com", 36241122);
        Cliente cliente2 = new Cliente(2, "Mateo", "MAteo°gmail.com", 36241234);
        Cliente cliente3 = new Cliente(3, "Tiago", "Tiago°gmail.com", 362414523);
        Cliente cliente4 = new Cliente(4, "Patricio", "PatoAlv°hotmail.com", 362402020);
        Cliente cliente5 = new Cliente(5, "Gabriel", "Gabriel°gmail.com", 36243456);

        //main
        tienda.AgregarCliente(cliente1);
        tienda.AgregarCliente(cliente2);
        tienda.AgregarCliente(cliente3);
        tienda.AgregarCliente(cliente4);
        tienda.AgregarCliente(cliente5);
        System.out.println(" ");

        int clientes_cont = 5;
        while(true){

            System.out.println("");
            tienda.Menu();
            int op = scanner.nextInt();
            int id = 0;
            switch (op){
                case 1:
                    tienda.ListaClientes();
                    break;
                case 2:
                    System.out.println("Ingrese numero ID del empleado a buscar: ");
                    id = scanner.nextInt();
                    System.out.println(tienda.BuscarCliente(id));
                    break;
                case 3:
                    scanner.nextLine();
                    System.out.println("Ingrese nombre para el nuevo cliente:");
                    String nombre = scanner.nextLine();
                    System.out.println("Ingrese correo/mail del nuevo cliente:");
                    String correo = scanner.nextLine();
                    System.out.println("Ingrese el telefono del cliente:");
                    int telefono = scanner.nextInt();

                    clientes_cont++;
                    tienda.AgregarCliente(clientes_cont, nombre, correo, telefono);
                    System.out.println("Cliente agregado!");
                    break;
                case 4:
                    System.out.println("Ingrese numero ID del empleado a buscar: ");
                    id = scanner.nextInt();
                    tienda.EliminarCliente(id);
                    break;
                case 5:
                    System.out.println("Ingrese numero ID del empleado a editar: ");
                    id = scanner.nextInt();
                    System.out.println(tienda.BuscarCliente(id));
                    System.out.println("-- -- -- -- -- -- -- -- -- -- --");
                    scanner.nextLine();
                    System.out.println("Ingrese nombre para el nuevo cliente:");
                    String e_nombre = scanner.nextLine();
                    System.out.println("Ingrese correo/mail del nuevo cliente:");
                    String e_correo = scanner.nextLine();
                    System.out.println("Ingrese el telefono del cliente:");
                    int e_telefono = scanner.nextInt();

                    clientes_cont++;
                    tienda.EditarCliente(id, clientes_cont, e_nombre, e_correo, e_telefono);
                    System.out.println("Cliente agregado!");
                    break;
            }
        }
    }
}
