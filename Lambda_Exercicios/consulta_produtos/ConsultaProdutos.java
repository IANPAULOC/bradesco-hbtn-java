

public class ConsultaProdutos {

    public static List<Produto> filtrar (List<Produto> produtos , CriterioFiltro criterioFiltro){
        List<Produto> filtrados = new ArrayList<>();
        for (Produto produto : produtos){
            if (criterioFiltro.testar(produto)){
                filtrados.add(produto);
            }
        }
        return filtrados;
    }
}
