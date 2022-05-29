package entreprise;

import java.util.ArrayList;
import java.util.List;

import connexion.Connexion;
import service.SalarieService;

public class SalData {
	private List<Salarie> importSal;
	private List<Salarie> exportSal;

    SalarieService ss = new SalarieService();

		public SalData() {
			 Connexion.getCon();

			 importSal= new ArrayList<Salarie>();
			 for(Salarie s :ss.findAll())
				 importSal.add(new Salarie(s.getMatricule(),s.getNom(),s.getEmail(),s.getDateEmbauche(),s.getSalaire(),s.getCategorie()));
		
			 exportSal = new ArrayList<Salarie>(); 
		} 
		public List<Salarie> getImportList() {
			return importSal;
		} 
		public List<Salarie> getExportList() {
			return exportSal; 
		} public void setExportList(List<Salarie> exportSal) {
	
			this.exportSal.addAll(exportSal);
			for(Salarie p :this.exportSal)
				System.out.println(p); 
		} 
		

}
