package br.ufrj.nce.util;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class GlobalUtil {
	public static String crypt(String texto) throws NoSuchAlgorithmException {

		MessageDigest md = MessageDigest.getInstance("MD5");
		BigInteger hash = new BigInteger(1, md.digest(texto.getBytes()));
		String stringCriptografada = hash.toString(16);

		return stringCriptografada;

	}
}
