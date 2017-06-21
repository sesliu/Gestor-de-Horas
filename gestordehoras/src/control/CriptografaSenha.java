package control;

import org.jcommon.encryption.SimpleMD5;

import entity.Pessoa;

public class CriptografaSenha {

	public static void criptografar(Pessoa pessoa){
		
		SimpleMD5 md5 = new SimpleMD5(pessoa.getSenha(),"ticket@ticketgmail.com");
		pessoa.setSenha(md5.toHexString());
		
	}
	
}
