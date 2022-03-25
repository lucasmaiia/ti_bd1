import java.util.Scanner;
public class principal {
	public static Scanner sc= new Scanner (System.in);
	public static void main(String[] args) {
		
		DAO dao = new DAO();
		
		dao.conectar();

		int resp;
		System.out.println("=-=-=-=-=-= Menu =-=-=-=-=-=");
		System.out.println("1 >> Listar");
		System.out.println("2 >> Inserir");
		System.out.println("3 >> Excluir");
		System.out.println("4 >> Atualizar");
		System.out.println("5 >> Sair");
		resp = sc.nextInt();
		Usuario[] usuarios = dao.getUsuariosMasculinos();
		Usuario usuario = new Usuario(11, "pablo", "pablo",'M');
		
		
	while(true){
		
		switch (resp){
		case 1: 
			
			usuarios = dao.getUsuarios();
			System.out.println("Veja a lista dos Usuários do Banco de Dados:\n");		
			for(int i = 0; i < usuarios.length; i++) {
				System.out.println(usuarios[i].toString());
			}
			break;
			
		case 2: 
			
			System.out.println("Inserindo um usuário em nosso BD...\n");	
			if(dao.inserirUsuario(usuario) == true) {
				System.out.println("Inserção efetuada com sucesso -> " + usuario.toString());
			}
			break;
			
		case 3:
			System.out.println("Excluindo um usuário de nosso BD...\n");	
			dao.excluirUsuario(usuario.getCodigo());
			break;
			
		case 4: 
			System.out.println("Atualizando um usuário em nosso BD...\n");	
			usuario.setSenha("nova senha");
			dao.atualizarUsuario(usuario);
			break;
			
		default: 
		
			dao.close();
			
		}
		resp=sc.nextInt();
		if(resp==5) {
			System.out.println("Fim!");
			break;
		}
	}
	

	}
}