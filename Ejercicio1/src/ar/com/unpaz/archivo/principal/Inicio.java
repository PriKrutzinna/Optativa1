package ar.com.unpaz.archivo.principal;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import PATH.pathservice;
import ar.com.unpaz.archivo.model.Vial;

public class Inicio implements pathservice {

	public static void main(String[] args) throws IOException {
		File file = new File (path);
		FileReader fileReader = new FileReader (file);
		BufferedReader bufferedReader = new BufferedReader (fileReader);
		
		String linea = "";
		List<Vial> sList = new ArrayList<Vial>();
		while((linea= bufferedReader.readLine())!= null)
		{
			/*System.out.println(linea);*/
			String array[] = linea.split(",");
			Vial sVial = new Vial(Integer.parseInt(array[0]),array[1],Integer.parseInt(array[2]),array[3],Integer.parseInt(array[4]));
		    
			sList.add(sVial);
		}
	    for (Vial vial : sList) {
			System.out.println(vial.getNúmerodehoja()+ "\t" + vial.getTipoobjeto() + "\t" + vial.getIdentificadortramo() + "\t" + vial.getTipocamino() + "\t" + vial.getLongitud() + "\n" );
		}
	}

	

	

}
