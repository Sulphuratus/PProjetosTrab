public class teste {
    
        public static void main(String[] args) {

        ListaContato lista = new ProxyListaContato("de Morrinhos - GO");

        //carregará o arquivo para impressão
        lista.imprimirListaCompleta();

        System.out.println("");
        
        //só mostrará na tela
        lista.mostrar();
        }
        
}
