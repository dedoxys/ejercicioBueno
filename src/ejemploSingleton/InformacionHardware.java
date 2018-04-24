package ejemploSingleton;

public class InformacionHardware {
	
	private DatosSistema ds;
	
	public InformacionHardware() throws InterruptedException {
		
		this.ds = DatosSistema.getInstance();
	
	}
	
	public void imprimirInfo() {
		System.out.println(this.ds.getModeloProcesador()+" "+this.ds.getGrafica()+" "+this.ds.getRam());
	}
	
}
