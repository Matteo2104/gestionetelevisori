package it.gestionetelevisori.utility;

import org.eclipse.jdt.internal.compiler.batch.Main;

import it.gestionetelevisori.model.Televisore;

public class MyUtility {
	
	public static Integer myParseInt(String stringaDaConvertire) {
		Integer result = null;
		
		try {
			result = Integer.parseInt(stringaDaConvertire);
		} catch (NumberFormatException e) {
			result = null;
		} 
		
		return result;
		
		
	}
}
