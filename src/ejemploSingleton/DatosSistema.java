package ejemploSingleton;

public class DatosSistema {

	private String sistemaOperativo;
	private String versionSistemaOperativo;
	private String modeloProcesador;
	private String grafica;
	private int ram;
	
	private static DatosSistema instance;
	
	private DatosSistema() throws InterruptedException {
		this.sistemaOperativo = "ubuntu";
		this.versionSistemaOperativo = "16.04";
		this.modeloProcesador = "i7";
		this.grafica = "nvidia 960m";
		this.ram = 16;
		Thread.sleep(3000);
	}
	
	public static DatosSistema getInstance() throws InterruptedException {
		if(instance==null) {
			instance = new DatosSistema();
		}
		return instance;
	}

	//ejemplo de lazy Singleton. privado el constructor, creamos el instance y luego el getInstance
	
	public String getSistemaOperativo() {
		return this.sistemaOperativo;
	}

	public void setSistemaOperativo(String _sistemaOperativo) {
		this.sistemaOperativo = _sistemaOperativo;
	}

	public String getVersionSistemaOperativo() {
		return this.versionSistemaOperativo;
	}

	public void setVersionSistemaOperativo(String _versionSistemaOperativo) {
		this.versionSistemaOperativo = _versionSistemaOperativo;
	}

	public String getModeloProcesador() {
		return this.modeloProcesador;
	}

	public void setModeloProcesador(String _modeloProcesador) {
		this.modeloProcesador = _modeloProcesador;
	}

	public String getGrafica() {
		return this.grafica;
	}

	public void setGrafica(String _grafica) {
		this.grafica = _grafica;
	}

	public int getRam() {
		return this.ram;
	}

	public void setRam(int _ram) {
		this.ram = _ram;
	}

}
