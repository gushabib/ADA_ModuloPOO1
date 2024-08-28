class Produto {

    public String codigo;
    public double precoUnitario;
    public int quantidade;

    public Produto(String codigo, double precoUnitario, int quantidade) {
        if(quantidade < 0){
            this.codigo = codigo;
            this.precoUnitario = precoUnitario;
            this.quantidade = 0;
        }else{
            this.codigo = codigo;
            this.precoUnitario = precoUnitario;
            this.quantidade = quantidade;
        }
    }
}
