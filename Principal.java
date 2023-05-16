import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Principal {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Leonardo",17,"valle","Leovalle2004");

        System.out.println("nome: "+usuario.getNome());
        System.out.println("Idade:"+usuario.getIdade());
        System.out.println("Usuário: "+usuario.getUsername());
        usuario.setSenha("Etec2023");

        if(usuario.verificaSenha("Etec2023")){
            System.out.println("senha válida");
        }else{
            System.out.println("senha inválida!");
        }

    }
    
}
