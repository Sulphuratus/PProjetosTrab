
public class ProxyListaContato implements ListaContato {

    private ListaCompleta listaCompleta;
    private String lista;

    public ProxyListaContato(String lista){
        this.lista = lista;
    }


    @Override
    public void mostrar(){
        if(listaCompleta == null){
            listaCompleta = new ListaCompleta(lista);
        }
        listaCompleta.mostrar();
    }


    @Override
    public void imprimirListaCompleta() {        
    }

    }
