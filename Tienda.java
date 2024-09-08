import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.*;

public class Tienda {
    private ArrayList<Cliente> lista_clientes = new ArrayList<>();

    public void AgregarCliente(Cliente cliente){
        out.println("Cliente: "+cliente.getId()+" agregado!");
        lista_clientes.add(cliente);
    }

    public void ListaClientes(){
        for (Cliente cliente : lista_clientes){
            out.println(cliente);
        }
    }

    public Cliente BuscarCliente(int id_busqueda){
        Cliente cliente_encontrado = null;
        for (Cliente cliente : lista_clientes) {
            if (cliente.getId() == id_busqueda) {
                cliente_encontrado = cliente;
                break;
            }
        }
        return cliente_encontrado;
    }

    public void AgregarCliente(int cont, String nombre, String correo, int telefono){
        Cliente nuevo_cliente = new Cliente(cont, nombre, correo, telefono);
        lista_clientes.add(nuevo_cliente);
    }

    public void EditarCliente(int id_busqueda, int cont, String nombre, String correo, int telefono){
        for (Cliente cliente : lista_clientes) {
            if (cliente.getId() == id_busqueda) {
                Cliente cliente_editar = new Cliente(cont, nombre, correo, telefono);
                lista_clientes.set(lista_clientes.indexOf(cliente), cliente_editar);
                break;
            }
        }
    }

    public void EliminarCliente(int id_busqueda){
        Scanner scanner = new Scanner(in);
        for (Cliente cliente : lista_clientes) {
            if (cliente.getId() == id_busqueda) {
                out.println("Usuario encontrado: "+cliente);
                out.println("Confirmar eliminar: tipear 'y/Y'");
                String op = scanner.nextLine();
                op.toLowerCase();
                if (op.equals("y")){
                    lista_clientes.remove(cliente);
                } else {
                    break;
                }
                break;
            }
        }
    }

    public void Menu(){
        out.println("|1: Listar Clientes |");
        out.println("|2: Buscar Cliente por ID |");
        out.println("|3: Agregar Cliente |");
        out.println("|4: Eliminar Cliente |");
    }


}
