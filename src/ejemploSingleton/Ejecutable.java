package ejemploSingleton;

public class Ejecutable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		InformacionHardware ih1 = new InformacionHardware();
		InformacionSoftware is2 = new InformacionSoftware();
		InformacionHardware ih3 = new InformacionHardware();
		InformacionSoftware is4 = new InformacionSoftware();
		InformacionHardware ih5 = new InformacionHardware();
		InformacionSoftware is6 = new InformacionSoftware();
		
		ih1.imprimirInfo();
		is2.imprimirInfo();
		ih3.imprimirInfo();
		is4.imprimirInfo();
		ih5.imprimirInfo();
		is6.imprimirInfo();
	}

}
