package ar.edu.unlp.info.oo2.biblioteca;

import java.util.List;
import org.json.simple.*;

public class AdapterExporter extends VoorheesExporter {
	public  String exportar(List<Socio> socios) {
		
		JSONArray jsonArray = new JSONArray();
		
		socios.forEach(socio -> {
			JSONObject json = new JSONObject(); 
			json.put("nombre",socio.getNombre()); 
			json.put("email",socio.getEmail()); 
			json.put("legajo",socio.getLegajo()); 
			jsonArray.add(json); 
		}			
		); 		
		return jsonArray.toJSONString(); 
		
	}
	

}
