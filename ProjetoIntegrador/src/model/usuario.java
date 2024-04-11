package model;

public class usuario {
    public String usuario;
    public String senha;
    public String funcao;

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
    
    public String getUsuario() 
    {return usuario;}
    
    public void setUsuario(String usuario) 
    {this.usuario = usuario;}
    
    public String getSenha() 
    {return senha;}
    
    public void setSenha(String senha) 
    {this.senha = senha;}
}
