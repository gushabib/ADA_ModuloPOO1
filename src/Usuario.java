class Usuario {
    private String senha;
    protected static String[] ultimasSenhas = new String[3];

    public Usuario(String senha) {
        alterarSenha(senha);
    }

    public String alterarSenha(String senha) {
        if (ultimasSenhas[0] == null && ultimasSenhas[1] == null && ultimasSenhas[2] == null) {
            this.senha = senha;
            ultimasSenhas[0] = senha;
            return "Senha alterada com sucesso";
        }else if (ultimasSenhas[0] == null || ultimasSenhas[1] == null || ultimasSenhas[2] == null) {
            for (int i = 0; i < ultimasSenhas.length; i++) {
                if (ultimasSenhas[i] != null) {
                    if (ultimasSenhas[i].equals(senha)) {
                        return "Senha não pode ser igual as três últimas utilizadas";
                    }
                }else{
                    this.senha = senha;
                    ultimasSenhas[i] = senha;
                    return "Senha alterada com sucesso";
                }
            }
        }else{
            for (int i = 0; i < ultimasSenhas.length; i++) {
                if (ultimasSenhas[i].equals(senha)) {
                    return "Senha não pode ser igual as três últimas utilizadas";
                }
            }
            for (int i = 0; i < ultimasSenhas.length -1; i++) {
                ultimasSenhas[i] = ultimasSenhas[i+1];
            }
        }
        ultimasSenhas[2] = senha;
        this.senha = senha;
        return "Senha alterada com sucesso";
    }
}