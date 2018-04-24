package ejemploSingleton;

public class InformacionSoftware {
	
	private DatosSistema ds;

	public InformacionSoftware() throws InterruptedException {
		
		this.ds = DatosSistema.getInstance();
	
	}
	
	
	public void imprimirInfo() {
		System.out.println(this.ds.getSistemaOperativo()+" "+this.ds.getVersionSistemaOperativo());
	};
	
}
